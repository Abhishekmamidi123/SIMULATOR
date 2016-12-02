
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


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


public class compare_sa extends ApplicationFrame
{
   public compare_sa( String applicationTitle , String chartTitle, float Array[] )
   {
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Algorithm","Average Waiting Time",
         createDataset(Array),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      /*final XYPlot plot = lineChart.getXYPlot( );
      XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
      renderer.setSeriesPaint( 0 , Color.red);
      renderer.setSeriesStroke( 0 , new BasicStroke( 2.0f ) );
      plot.setRenderer( renderer );*/ 
      setContentPane( chartPanel );
   }

   private DefaultCategoryDataset createDataset(float Array[] )
   {
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      dataset.addValue( Array[0], "Algorithm" , "FCFS" );
      dataset.addValue( Array[1], "Algorithm" , "SJF P" );
      dataset.addValue( Array[2], "Algorithm" , "SJF NP" );
      dataset.addValue( Array[3], "Algorithm" , "RR" );
      dataset.addValue( Array[4], "Algorithm" , "PP" );
      dataset.addValue( Array[5], "Algorithm" , "PNP" );
      return dataset;
   }
   public void Compare_Chart(  String applicationTitle , String chartTitle, float Array[] ) 
   {
	   compare_sa chart = new compare_sa(
			   applicationTitle,chartTitle,Array);

      chart.pack( );
      RefineryUtilities.centerFrameOnScreen( chart );
      chart.setVisible( true );
      chart.setDefaultCloseOperation(chart.DISPOSE_ON_CLOSE);
   }
}