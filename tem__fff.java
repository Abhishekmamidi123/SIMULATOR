

import java.awt.Color;
import java.util.*;

import static java.lang.Math.abs;
import java.awt.Color;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import static java.lang.Math.abs;

import java.awt.BasicStroke;
import java.awt.BorderLayout;

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

public class tem__fff  
{  
   public static int fff(int Pages[],int n,int head,int temp) 
   {
	   int Array[] = new int[100];
		int i,j,t,k=1;
		/*Scanner s = new Scanner(System.in);
		Random r = new Random();
		n=s.nextInt();*/
		for(i=2;i<=n+1;i++){
			//System.out.print("enter the vaulse");
			Array[i]=Pages[i-1];
			
		}
		//head=r.nextInt();
		Array[1]=head;
		n=n+1;
		int sum=0;
		for(i=1;i<=n;i++){
			sum = sum + Math.abs(Array[i]-Array[i+1]);
			System.out.print(Array[i]+" ");
		}
		System.out.println();
	   System.out.println("Total seek time for fcfs is: "+sum);	
/*	   if(temp==1){
	   tem_graphs_1 graph = new tem_graphs_1("Disk Scheduling - FCFS Illustration", "First Come First Search",n,Array);
	   graph.Disk_Graph("Disk Scheduling - FCFS Illustration", "First Come First Search",n,Array);
	   }*/
	   if(temp==1){
			  // tem_graphs_1 graph = new tem_graphs_1("Disk Scheduling - FCFS Illustration", "First Come First Search",n,Array);
			   //graph.pack();
			   //graph.setVisible(true);
			  // graph.Disk_Graph("Disk Scheduling - FCFS Illustration", "First Come First Search",n,Array);
				   
				//   super("Disk Scheduling - FCFS Illustration");
				   String chartTitle="First Come First Search";
				      JFreeChart xylineChart = ChartFactory.createXYLineChart(
				          chartTitle ,
				         "" ,
				         "Disk" ,
				         createDataset(n,Array) ,
				         PlotOrientation.HORIZONTAL ,
				         true , true , false);
				      
				      
				      JFrame f = new JFrame("title");
				      
				         
				      ChartPanel chartPanel = new ChartPanel( xylineChart );
				      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
				      
				     
				      f.setTitle("Disk Scheduling - FCFS Illustration");
				      f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				      f.setLayout(new BorderLayout(0, 5));
				      f.add(chartPanel);
				      
				      chartPanel.setMouseWheelEnabled(true);
				      chartPanel.setHorizontalAxisTrace(true);
				      chartPanel.setVerticalAxisTrace(true);
				     
				      final XYPlot plot = xylineChart.getXYPlot( );
				      XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
				      renderer.setSeriesPaint( 0 , Color.red);
				      renderer.setSeriesStroke( 0 , new BasicStroke( 2.0f ) );
				      plot.setRenderer( renderer ); 
				     f.setContentPane( chartPanel ); 
				      f.pack();

				      RefineryUtilities.centerFrameOnScreen( f );
				      f.setVisible(true); 
				   }
	   return sum;
	 }
   public static XYDataset createDataset(int n,int Array[])
   {
	   
      final XYSeries firefox = new XYSeries( "Disk" );
      int i;
      for(i=1;i<=n;i++){
    	  firefox.add(i,Array[i]);
      }
      final XYSeriesCollection dataset = new XYSeriesCollection( );          
      dataset.addSeries( firefox );          
      return dataset;
      
      /////////////  
   }
}


