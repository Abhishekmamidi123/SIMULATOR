import java.util.Random;
import javax.swing.*;
import static java.lang.Math.abs;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;

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
import java.util.Scanner;
public class C_SCAN {
	public static int c_scan(int Memory1[],int n,int head,int temp){
//		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int i,j,k,start;
//		n = 1 + random.nextInt(20);
//		n = scan.nextInt();
		start = head;
//		start = 1 + random.nextInt(200);
//		start = scan.nextInt();
//		int Memory[] = new int[200];
		int Output[] = new int[200];
		int Memory[] = new int[200];
		for(i=1;i<=n;i++){
			Memory[i] = Memory1[i];
		}
		Memory[n+1] = 199;
		int N = n+1,pointer;
		Sort(Memory,N);
		pointer = Start_Pointer(start,Memory,N);
		for(i=1;i<=N;i++){
			System.out.printf("%d ",Memory[i]);
		}
		System.out.println("");
		System.out.println(pointer);
			
		Output[1] = start;
		for(i=pointer,j=2;i<=N;i++,j++){
			Output[j] = Memory[i];
		}
		Output[j] = 0;
		for(i=1,k=j+1;i<=pointer-1;i++,k++){
			Output[k] = Memory[i];
		}
		for(i=1;i<=N+2;i++){
			System.out.printf("%d ",Output[i]);
		}
		System.out.println("");
		int sum=0;
		for(i=1;i<=N+1;i++){
			sum = sum + Math.abs(Output[i]-Output[i+1]);
		}
		//Output {1 to N+2}
		for(i=1;i<=N+2;i++){
			System.out.println(Output[i]);
		}
/*		if(temp==1){
		tem_graphs_1 graph = new tem_graphs_1("Disk Scheduling -  C-SCAN Illustration", "C-SCAN",N+2,Output);
		   graph.Disk_Graph("Disk Scheduling - C-SCAN Illustration", "C-SCAN",N+2,Output);
		}*/
		 if(temp==1){
			  // tem_graphs_1 graph = new tem_graphs_1("Disk Scheduling - FCFS Illustration", "First Come First Search",n,Array);
			   //graph.pack();
			   //graph.setVisible(true);
			  // graph.Disk_Graph("Disk Scheduling - FCFS Illustration", "First Come First Search",n,Array);
				   
				//   super("Disk Scheduling - FCFS Illustration");
				   String chartTitle="C-SCAN";
				      JFreeChart xylineChart = ChartFactory.createXYLineChart(
				          chartTitle ,
				         "" ,
				         "Disk" ,
				         createDataset(N+2,Output) ,
				         PlotOrientation.HORIZONTAL ,
				         true , true , false);
				      
				      
				      JFrame f = new JFrame("title");
				      
				         
				      ChartPanel chartPanel = new ChartPanel( xylineChart );
				      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
				      
				     
				      f.setTitle("Disk Scheduling -  C-SCAN Illustration");
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
	    return (sum-200);
	}
	public static void Sort(int Memory[],int n){
		int i,j,k;
		for(i=1;i<=n;i++){
			for(j=1;j<=n-i;j++){
				if(Memory[j]>Memory[j+1]){
					k = Memory[j];
					Memory[j] = Memory[j+1];
					Memory[j+1] = k;
				}
			}
		}
	}
	public static int Start_Pointer(int start,int Memory[],int n){
		int i;
		for(i=1;i<=n;i++){
			if(start<=Memory[i]){
				return i;
			}
		}
		return 0;
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
