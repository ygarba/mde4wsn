package edu.yau.thesis;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

import edu.yau.thesis.dialogs.FitnessChart;
import edu.yau.thesis.dialogs.MemoryChart;
import edu.yau.thesis.dialogs.PacketLossChart;
import edu.yau.thesis.dialogs.PowerChart;
import edu.yau.thesis.dialogs.SimDialog;

//import edu.yau.thesis.dialogs.MyJPanel;

public class ThesisMain extends JFrame {
	    
	private JDesktopPane mainDesktop;
	
	public ThesisMain() {
	        
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);    
		setTitle("Yau's Thesis Tools");
	    setSize(865, 700);
	    setLocation(150, 10);
	        
        // JFrame Menu
        JMenuBar menuBar = new JMenuBar();
        
        // Adding menubar to the frame
        setJMenuBar(menuBar);
        
        // Define and add two drop down menu to the menubar
        JMenu fileMenu = new JMenu("File");
        JMenu editorMenu = new JMenu("Editor");
        JMenu simMenu = new JMenu("Simulation");
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(editorMenu);
        menuBar.add(simMenu);
        menuBar.add(helpMenu);
	        
        // Create and add simple menu item to one of the drop down menu
        /*JMenuItem newAction = new JMenuItem("New");
        JMenuItem openAction = new JMenuItem("Open");
        JMenuItem exitAction = new JMenuItem("Exit");
        JMenuItem cutAction = new JMenuItem("Cut");
        JMenuItem copyAction = new JMenuItem("Copy");
        JMenuItem pasteAction = new JMenuItem("Paste");*/
        JMenuItem exitFile = new JMenuItem("Exit");
        JMenuItem startEditor = new JMenuItem("Start Editor");
        JMenuItem createSim = new JMenuItem("Create Simulation Template");
        JMenuItem initSim = new JMenuItem("Initiate Simulation");
        
        // Create and add CheckButton as a menu item to one of the drop down
        // menu
        //JCheckBoxMenuItem checkAction = new JCheckBoxMenuItem("Check Action");
        // Create and add Radio Buttons as simple menu items to one of the drop
        // down menu
        //JRadioButtonMenuItem radioAction1 = new JRadioButtonMenuItem(
        //        "Radio Button1");
        //JRadioButtonMenuItem radioAction2 = new JRadioButtonMenuItem(
        //        "Radio Button2");
        // Create a ButtonGroup and add both radio Button to it. Only one radio
        // button in a ButtonGroup can be selected at a time.
        //ButtonGroup bg = new ButtonGroup();
        //bg.add(radioAction1);
        //bg.add(radioAction2);
        /*fileMenu.add(newAction);
        fileMenu.add(openAction);
        fileMenu.add(checkAction);
        fileMenu.addSeparator();
        fileMenu.add(exitAction);
        simMenu.add(cutAction);
        simMenu.add(copyAction);
        simMenu.add(pasteAction);
        simMenu.addSeparator();
        simMenu.add(radioAction1);
        simMenu.add(radioAction2);*/
        fileMenu.add(exitFile);
        simMenu.add(createSim);
        simMenu.add(initSim);
        editorMenu.add(startEditor);
	        
	        // Add a listener to the New menu item. actionPerformed() method will
	        // invoked, if user triggred this menu item    
        createSim.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                CreateSimulation createSimThread = new CreateSimulation();
                createSimThread.start();	                
            }
        });
        
        initSim.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent arg0) {
	                System.out.println("Initiating simulation ....");
	                
	             // create internal frame
	             /*   JInternalFrame jIntframe = new JInternalFrame( 
	                   "Simulation Control", true, true, true, true );
	                jIntframe.setSize(450, 170);
	                jIntframe.setLocation(140, 120);

	                SimDialog simDialog = new  SimDialog(); // create new panel
	                jIntframe.add( simDialog, BorderLayout.CENTER ); // add panel
	                //jIntframe.pack(); // set internal frame to size of contents

	                mainDesktop.add( jIntframe ); // attach internal frame
	                jIntframe.setVisible( true ); // show internal frame 	*/
	                CreateSimulationControlDlg();
	                CreateFitnessChart();
	                CreatePacketLossChart();
	                CreatePowerChart();
	                CreateSleepChart();
	            }
	        });
        
        	      
	        startEditor.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent arg0) {
	                System.out.println("You have clicked on start editor");
	                
	             //here is java starts java
	                StartEditor startEdThread = new StartEditor();
	                startEdThread.start();	                
	            }
	        });
	        
	        
	        exitFile.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent arg0) {
	                
	                //KILL the whole app here	 
	            	System.exit(0);
	            }
	        });
	    
	        mainDesktop = new JDesktopPane(); // create desktop pane
	        add( mainDesktop ); // add desktop pane to frame
	}
	
	FitnessChart fitnessChartObj = null;
	public FitnessChart getFitnessChartObj() {					//this is for the observer pattern purpose
		return fitnessChartObj;
	}
	
	PacketLossChart packetlossChartObj = null;
	public PacketLossChart getpacketlossChartObj() {			//this is for the observer pattern purpose
		return packetlossChartObj;
	}
	
	PowerChart powerChartObj = null;
	public PowerChart getpowerChartObj() {						//this is for the observer pattern purpose
		return powerChartObj;
	}
	
	MemoryChart sleepChartObj = null;
	public MemoryChart getSleepChartObj() {				//this is for the observer pattern purpose
		return sleepChartObj;
	}
	
	private void CreateSimulationControlDlg() {
    	
    	// create internal frame
        JInternalFrame jIntframe = new JInternalFrame( 
           "Simulation Control", true, true, true, true );
        //jIntframe.setSize(300, 140);
        jIntframe.setSize(getContentPane().getWidth()-11, 140);
        jIntframe.setLocation(5, 5);

        SimDialog simDialog = new  SimDialog(this); // create new panel
        jIntframe.add( simDialog, BorderLayout.CENTER ); // add panel
        //jIntframe.pack(); // set internal frame to size of contents

        mainDesktop.add( jIntframe ); // attach internal frame
        jIntframe.setVisible( true ); // show internal frame
    }
	
	private void CreateFitnessChart() {
		// create internal frame
        JInternalFrame jIntframe = new JInternalFrame( 
           "Fitness Chart", true, true, true, true );
        //jIntframe.setSize(200, 90);
        jIntframe.setLocation(5, 150);

        FitnessChart fitnessChart = new  FitnessChart(); // create new panel
        fitnessChartObj = fitnessChart;						//for observer pattern ;)
        jIntframe.add( fitnessChart, BorderLayout.CENTER ); // add panel
        //jIntframe.pack(); // set internal frame to size of contents

        mainDesktop.add( jIntframe ); // attach internal frame
        jIntframe.setVisible( true ); // show internal frame
        jIntframe.pack();
	}
	
	
	private void CreatePacketLossChart() {
		// create internal frame
        JInternalFrame jIntframe = new JInternalFrame( 
           "Packet Loss Chart", true, true, true, true );
        //jIntframe.setSize(200, 90);
        jIntframe.setLocation(5, 400);

        PacketLossChart packetlossChart = new  PacketLossChart(); // create new panel
        packetlossChartObj = packetlossChart;						//for observer pattern ;)
        jIntframe.add( packetlossChartObj, BorderLayout.CENTER ); // add panel
        //jIntframe.pack(); // set internal frame to size of contents

        mainDesktop.add( jIntframe ); // attach internal frame
        jIntframe.setVisible( true ); // show internal frame
        jIntframe.pack();
	}
	
	private void CreatePowerChart() {
		// create internal frame
        JInternalFrame jIntframe = new JInternalFrame( 
           "Power Chart", true, true, true, true );
        //jIntframe.setSize(200, 90);
        jIntframe.setLocation(430, 150);

        PowerChart powerChart = new  PowerChart(); // create new panel
        powerChartObj = powerChart;						//for observer pattern ;)
        jIntframe.add( powerChartObj, BorderLayout.CENTER ); // add panel
        //jIntframe.pack(); // set internal frame to size of contents

        mainDesktop.add( jIntframe ); // attach internal frame
        jIntframe.setVisible( true ); // show internal frame
        jIntframe.pack();
	}
	
	private void CreateSleepChart() {
		// create internal frame
        JInternalFrame jIntframe = new JInternalFrame( 
           "Sleep Chart", true, true, true, true );
        //jIntframe.setSize(200, 90);
        jIntframe.setLocation(430, 400);

        MemoryChart sleepChart = new  MemoryChart(); // create new panel
        sleepChartObj = sleepChart;						//for observer pattern ;)
        jIntframe.add( sleepChart, BorderLayout.CENTER ); // add panel
        //jIntframe.pack(); // set internal frame to size of contents

        mainDesktop.add( jIntframe ); // attach internal frame
        jIntframe.setVisible( true ); // show internal frame
        jIntframe.pack();
	}
	
    /*
     * APP Entry
     */
	public static void main(String[] args) {
    	
    	//check for mandatory environment variables: "WSN_HOME"
    	if (System.getenv("WSN_HOME") == null) {
    		JOptionPane.showMessageDialog(null, "Please set the mandatory environment variables: \n- 'WSN_HOME'", "Environment variable error!" , JOptionPane.PLAIN_MESSAGE);
    		return;
    	}
    	
    	//check for mandatory environment variables: "CYGWIN32_HOME_HOME" on Windows only
		OsCheck.OSType ostype=OsCheck.getOperatingSystemType();
		if (ostype == OsCheck.OSType.Windows) {
			
			if (System.getenv("CYGWIN32_HOME") == null) {
	    		JOptionPane.showMessageDialog(null, "Please set the mandatory environment variables (Windows only): \n- 'CYGWIN32_HOME'", "Environment variable error!" , JOptionPane.PLAIN_MESSAGE);
	    		return;
	    	}
		}
    	
    	ThesisMain me = new ThesisMain();
        me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        me.setVisible(true);
    }
	}


