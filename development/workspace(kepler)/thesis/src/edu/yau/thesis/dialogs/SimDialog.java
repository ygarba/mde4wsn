package edu.yau.thesis.dialogs;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import org.jgap.FitnessFunction;

import edu.yau.thesis.ThesisMain;
import edu.yau.thesis.ga.OptFitnessFunction;
import edu.yau.thesis.ga.OptimizationControl;

public class SimDialog extends JPanel {
	
	ThesisMain mainObj = null;
	FitnessFunction fitFunc = null;	//needed here because of the observers of the fitness function
	int populationSize;	//obtain value from sim diaglog
	int maxEvol;	//as above
	JSpinner spinnerPop = null;
	JSpinner spinnerEvol = null;
	        
	public SimDialog(ThesisMain _mainObj)
	{
		mainObj = _mainObj;
		fitFunc = new OptFitnessFunction();	//for observer pattern
		
		setSize(200,100); 
		setVisible(true);
		setName("Sim Panel");
				
		JLabel labelPop = new JLabel("Population Size");
		JLabel labelEvol = new JLabel("Maximum Generations");
	    
		SpinnerNumberModel spinModelPop =
				new SpinnerNumberModel(10, 2, 100, 1);	//initval, minval, maxval, step		
		SpinnerNumberModel spinModelEvol =
				new SpinnerNumberModel(10, 2, 100, 1);	//initval, minval, maxval, step
				
		/*JSpinner*/ spinnerPop = new JSpinner(spinModelPop);		
		/*JSpinner*/ spinnerEvol = new JSpinner(spinModelEvol);
				
		add(labelPop);
		add(spinnerPop);
		add(labelEvol);
		add(spinnerEvol);
		
		JButton simStartBtn = new JButton("Start");
		JButton simPauseBtn = new JButton("Pause");
		JButton simCancelBtn = new JButton("Cancel");
		add(simStartBtn);
		add(simPauseBtn);
		add(simCancelBtn);
		
		simStartBtn.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	//simStartBtn.setEnabled(false);
		    	StartSimulation();
		    }
		});
		
		simPauseBtn.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	
		    }
		});
		
		simCancelBtn.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	
		    }
		});
	}
	
	private void StartSimulation() {
				
		populationSize = (Integer) spinnerPop.getValue();
		maxEvol = (Integer) spinnerEvol.getValue();
		//After checking all stuff are okay, the optimization process will start now!
    	OptimizationControl optControl = new OptimizationControl(fitFunc, populationSize, maxEvol);				//we already have our fitness func duh! send it!
    	
    	//register observers here
 //   	optControl.registerObserver(mainObj.getFitnessChartObj());	//the main class created the sim dialog, so has the obj
 //   	((OptFitnessFunction)fitFunc).registerObserver(mainObj.getFitnessChartObj2());
    	((OptFitnessFunction)fitFunc).registerObserver(mainObj.getFitnessChartObj());
    	((OptFitnessFunction)fitFunc).registerObserver(mainObj.getpacketlossChartObj());
    	((OptFitnessFunction)fitFunc).registerObserver(mainObj.getpowerChartObj());
    	((OptFitnessFunction)fitFunc).registerObserver(mainObj.getSleepChartObj());
    	
    	optControl.start();
	}

}
