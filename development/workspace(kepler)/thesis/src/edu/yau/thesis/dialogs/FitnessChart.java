package edu.yau.thesis.dialogs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleInsets;

import edu.yau.thesis.IObserver;

public class FitnessChart extends JPanel implements IObserver {
	
	int count;
	XYDataset ds;
    //declare all the xy series here
    static XYSeries dataXY;
    //static XYSeries dataXY2;
    
    /**
	 * The purpose of this inner class is to change the dimension of the chart panel 
	 * from the default DEFAULT_WIDTH and DEFAULT_HEIGHT of 680 x 420.
	 * @author Yau
	 *
	 */
    private static final int NEW_WIDTH = 400;
    private static final int NEW_HEIGHT = 200;
	class AnotherChartPanel extends ChartPanel {

		public AnotherChartPanel(JFreeChart chart) {
			super(chart);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public Dimension getPreferredSize() {
		    // given some values of w & h
		    return new Dimension(NEW_WIDTH, NEW_HEIGHT);
		}
		
	}

	PrintStream logFileStream;
    public FitnessChart() {
             
    	try {
			logFileStream = new PrintStream(new File("fitness.log"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	count = 0;
    	ds = createDataset();
    	
        JFreeChart chart = ChartFactory.createXYLineChart(
		 "Fitness Plot", 				// Title
		 "Count", 					// x-axis Label
		 "Fitness", 					// y-axis Label
		 ds, 						// Dataset
	     PlotOrientation.VERTICAL, 		// Plot Orientation
		 false, 						// Show Legend
		 false, 						// Use tooltips
		 false 							// Configure chart to generate URLs?
		 );
        
        //chart.setBorderVisible(true);
        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setPaint(Color.black);
        chart.getTitle().setFont(getFont().deriveFont(16.0f));
        //chart.setPadding(new RectangleInsets(12, 12, 12, 12));
        
        	
        final XYPlot plot = chart.getXYPlot(); 
        plot.setInsets(new RectangleInsets(1, 1, 1, 20));	//this is the margin. Arg1 -x, arg2 y, x, -y
        //plot.setBackgroundPaint(Color.WHITE);
        //plot.setRangeGridlinesVisible(true);
        //plot.setDomainGridlinesVisible(true);
        //XYLineAndShapeRenderer xylineandshaperenderer = (XYLineAndShapeRenderer)plot.getRenderer();
        //xylineandshaperenderer.setSeriesShape(0, new java.awt.Rectangle(-25,-25,50,50));
        
        
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
        
        //ChartPanel label = new ChartPanel(chart);
        AnotherChartPanel chartPanel = new AnotherChartPanel(chart);
        this.add(chartPanel);	//added the chart to myself since I a frame 
        //this.setSize(600, 260);
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
    
    
    @Override
    public void updateFitness(double x, double y) {
    	dataXY.add(count,y);
    	
    	//dump it to file too
    	logFileStream.println(count + "," + y);
    	count++;
    }
    
    @Override
    public void updatePacketLoss(double x, double y) {}	//not needed here since we have two lines to plot
    
    @Override
    public void updateMemory(double x, double y) {}	//not needed here since we have two lines to plot
    	
    @Override
    public void updatePower(double x, double y) {}
    
    @Override
    protected void finalize() {	//close this file when disposing this object during GC
    
    	logFileStream.close();
    }
    
}
