package edu.yau.thesis.scratch;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class TestChart2 {
    
    XYDataset ds;
    //declare all the xy series here
    static XYSeries dataXY;
    //static XYSeries dataXY2;

    public TestChart2() {
             
    	ds = createDataset();
    	
        JFreeChart chart = ChartFactory.createXYLineChart(
		 "Fitness Plot", 				// Title
		 "Evolution", 					// x-axis Label
		 "Fitness", 					// y-axis Label
		 ds, 						// Dataset
	     PlotOrientation.VERTICAL, 		// Plot Orientation
		 false, 						// Show Legend
		 false, 						// Use tooltips
		 false 							// Configure chart to generate URLs?
		 );
        	
        final XYPlot plot = chart.getXYPlot();
        //x-axis stuff
        ValueAxis axisX = plot.getDomainAxis();
        //axisX.setRange(0.0, 20); 	//make x-axis 0 - 20
        axisX.setAutoRange(true);
        //axisX.setFixedAutoRange(60000.0);	//60 sec
        //y-axis stuff
        NumberAxis axisY = (NumberAxis) plot.getRangeAxis();
        axisY.setRange(0.0, 60);	//make y-axis 0 - 20
        axisY.setAutoRange(true);
        //range.setTickUnit(new NumberTickUnit(0.1));
        /*-----------------------------------------------------*/
        
        JFrame frame = new JFrame("Fitness Plot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChartPanel label = new ChartPanel(chart);
        frame.getContentPane().add(label);
        //Suppose I add combo boxes and buttons here later

        //frame.pack();
        frame.setSize(600, 260);
        frame.setVisible(true);
        }
    
    private XYSeriesCollection createDataset() {
   	 
    	//instantiate all the series here
    	dataXY = new XYSeries("fitness");
    	/* More series can be added like below
        dataXY2 = new XYSeries("fitness2");
        dataXY2.add(0, 0);
        dataXY2.add(0.1, 60);
        */
    	
        XYSeriesCollection dataset_series= new XYSeriesCollection();
        dataset_series.addSeries(dataXY);
        //dataset_series.addSeries(dataXY2);
        
        return dataset_series;
    }
    
    public static void UpdateChart(double x, double y) {
    	dataXY.add(x,y);
    }
    

    static class gen implements Runnable {
        private Random randGen = new Random();

        int count = 0;
        public void run() {
            while(true) {
                int num = randGen.nextInt(50);
                System.out.println(count + "," + num);
                //ts.addOrUpdate(new Millisecond(), num);
                UpdateChart(count, num);
                if (count > 200)
                	break;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                
                count++;
            }
        }
    }
    
public static void main(String[] args) throws InterruptedException {
        
    	new TestChart2();
    	gen myGen = new gen();
        new Thread(myGen).start();
    }
}
