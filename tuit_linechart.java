
import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

import java.awt.BasicStroke; 
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.xy.XYDataset; 
import org.jfree.data.xy.XYSeries; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 
import org.jfree.chart.plot.XYPlot; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.xy.XYSeriesCollection; 
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;


	
	public class tuit_linechart extends ApplicationFrame
	{
	   public tuit_linechart( String applicationTitle , String chartTitle,int n,int Array[] )
	   {
	     
		   super(applicationTitle);
		      JFreeChart xylineChart = ChartFactory.createXYLineChart(
		         chartTitle ,
		         "Number of Frames","Number of Page Faults",
		         createDataset(n,Array) ,
		         PlotOrientation.VERTICAL ,
		         true , true , false);
		         
		      ChartPanel chartPanel = new ChartPanel( xylineChart );
		      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
		      final XYPlot plot = xylineChart.getXYPlot( );
		      XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
		      renderer.setSeriesPaint( 0 , Color.pink);
		      renderer.setSeriesStroke( 0 , new BasicStroke( 2.0f ) );
		      plot.setRenderer( renderer ); 
		      setContentPane( chartPanel );
	   }

	  
	   private XYDataset createDataset(int n,int Array[])
	   {
		   
	      final XYSeries firefox = new XYSeries( "Page Faults" );
	      int i;
	      for(i=1;i<=n;i++){
	    	  firefox.add(i,Array[i]);
	      }
	      final XYSeriesCollection dataset = new XYSeriesCollection( );          
	      dataset.addSeries( firefox );          
	      return dataset;
	      
	      /////////////
	               
	      
	   }
	   
	   
	   public void Beladys(String applicationTitle , String chartTitle,int n,int Array[]  ) 
	   {
		   
		   tuit_linechart chart = new tuit_linechart(
	      "Belady's Analomy" ,
	      "FIFO illustrating Belady's Analomy",n,Array);
		   
	      chart.pack( );
	      RefineryUtilities.centerFrameOnScreen( chart );
	      chart.setVisible( true );
	   }
	}


