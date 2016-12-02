
import java.awt.Color;
import java.util.*;

import static java.lang.Math.abs;
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
public class tem_sstf  {
  
   public static int SSTF(int Pages[],int n,int head,int tem) 
   {
	   int Array[] = new int[100];
		int Seek[]=new int[100];
		int Final[]=new int[100];
	    int Visited[]=new int[100];
	    int Sort[]=new int[100];
        int i,j,k=1,l_sum=0,r_sum=0,sum1=0,sum=0,L=0,R=0,li=0,ri=0,t,temp,pointer=0,count=0,l_ind=0,r_ind=0,f=1;
	     
		//Scanner s=new Scanner(System.in);
		Random r = new Random();
		/*System.out.print("enter the n value");*/
		//n=s.nextInt();
		for(i=1;i<=n;i++){
			//System.out.print("enter the vaulse");
			Array[i]=Pages[i];
			//Array[i]=s.nextInt();
		}
		//head=r.nextInt();;
		Array[n+1]=head;
		n=n+1;
	 
	      for(i=1;i<=n;i++){
				Sort[i]=Array[i];
				Visited[i]=0;
			}
			//System.out.println("Enter the head");
			
			
			for(i=1;i<=n-1;i++){
				for(j=1;j<=n-1;j++){
					if(Sort[j+1]<Sort[j]){
						temp=Sort[j+1];
						Sort[j+1]=Sort[j];
						Sort[j]=temp;
					}
				}
			}
			
			if(Sort[1]==head){
				pointer=1;
				r_ind=pointer+1;
				Visited[pointer]=1;
				Final[f]=Sort[pointer];
				f++;
				count++;
				li=1;
			}
			else if(Sort[n]==head){
				pointer=n;
				l_ind=pointer-1;
				Visited[pointer]=1;
				count++;
				Final[f]=Sort[pointer];
				f++;
				ri=1;
			}
			else{
				for(i=1;i<=n;i++){
					if(Sort[i]==head){
						pointer=i;
						l_ind=pointer-1;;
						r_ind=pointer+1;
						Visited[pointer]=1;
						count++;
						Final[f]=Sort[pointer];
						f++;
						break;
					}
				}
			}
			for(i=1;i<=n;i++){
				if(count==n){
					for(i=1;i<=n-1;i++){
						sum=sum+Seek[i];
					}
					//System.out.println("Total Seek Time is "+sum);
					break;
				}
				
				L=0;
				R=0;
				if(li==0){
					l_sum=abs(Sort[pointer]-Sort[l_ind]);
					L=1;
				}
				if(ri==0){
					r_sum=abs(Sort[pointer]-Sort[r_ind]);
					R=1;
				}
				if(li==1){
					while(r_ind<n+1){
						sum1=abs(Sort[pointer]-Sort[r_ind]);
						Seek[k]=sum1;
						k++;
						pointer=r_ind;
						Visited[pointer]=1;
						count++;
						Final[f]=Sort[pointer];
						f++;
						r_ind++;
					}
					L=2;
				}
				if(ri==1){
					while(l_ind>0){
						sum1=abs(Sort[pointer]-Sort[l_ind]);
						Seek[k]=sum1;
						k++;
						pointer=l_ind;
						Visited[pointer]=1;
						count++;
						Final[f]=Sort[pointer];
						f++;
						l_ind--;
					}
					R=2;
				}
				if(L==1 && R==1){
					if(l_sum<r_sum){
						pointer=l_ind;
						Visited[pointer]=1;
						count++;
						Final[f]=Sort[pointer];
						f++;
						Seek[k]=l_sum;
						k++;
						l_ind--;
						if(l_ind==0){
							li=1;
						}
						else{
							while(Visited[l_ind]==1){
								l_ind--;
							}
						}
						
					}
					else if(r_sum<l_sum){
						pointer=r_ind;
						Visited[pointer]=1;
						count++;
						Final[f]=Sort[pointer];
						f++;
						Seek[k]=r_sum;
						k++;
						r_ind++;
						if(r_ind==n+1){
							ri=1;
						}
						else{
							while(Visited[r_ind]==1){
								r_ind++;
							}
						}
					}
				}
			}
/*			if(tem==1){
			tem_graphs_1 graph = new tem_graphs_1("Disk Scheduling - SSTF Illustration", "Shortest Seek Time First",n,Final);
		    graph.Disk_Graph("Disk Scheduling - SSTF Illustration", "Shortest Seek Time First",n,Final);
			}*/
			 if(tem==1){
				  // tem_graphs_1 graph = new tem_graphs_1("Disk Scheduling - FCFS Illustration", "First Come First Search",n,Array);
				   //graph.pack();
				   //graph.setVisible(true);
				  // graph.Disk_Graph("Disk Scheduling - FCFS Illustration", "First Come First Search",n,Array);
					   
					//   super("Disk Scheduling - FCFS Illustration");
					   String chartTitle="Shortest Seek Time First";
					      JFreeChart xylineChart = ChartFactory.createXYLineChart(
					          chartTitle ,
					         "" ,
					         "Disk" ,
					         createDataset(n,Final) ,
					         PlotOrientation.HORIZONTAL ,
					         true , true , false);
					      
					      
					      JFrame fa = new JFrame("title");
					      
					         
					      ChartPanel chartPanel = new ChartPanel( xylineChart );
					      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
					      
					     
					      fa.setTitle("Disk Scheduling - SSTF Illustration");
					      fa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					      fa.setLayout(new BorderLayout(0, 5));
					      fa.add(chartPanel);
					      
					      chartPanel.setMouseWheelEnabled(true);
					      chartPanel.setHorizontalAxisTrace(true);
					      chartPanel.setVerticalAxisTrace(true);
					     
					      final XYPlot plot = xylineChart.getXYPlot( );
					      XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
					      renderer.setSeriesPaint( 0 , Color.red);
					      renderer.setSeriesStroke( 0 , new BasicStroke( 2.0f ) );
					      plot.setRenderer( renderer ); 
					     fa.setContentPane( chartPanel ); 
					      fa.pack();

					      RefineryUtilities.centerFrameOnScreen( fa );
					      fa.setVisible(true); 
					   }
		    sum=0;
		    if(count==n){
		    for(i=1;i<=n;i++){
		    	sum=sum+abs(Final[i]-Final[i+1]);
		    }
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