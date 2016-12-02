

import java.util.*;
import javax.swing.*;
import javax.swing.JApplet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JFrame;
public class Dining_Philosophers_NT{
	public static void main(String args[]){
		int i,j,k;
		String Output        = new String();
		String string        = new String();
		String k1            = new String();
		String string1        = new String();
		string = "x";
		int temp=0,size;
		Queue<Integer> queue = new LinkedList<Integer>();
		Queue<String>  q     = new LinkedList<String>();
		Random random        = new Random();
		int Thinking_Time[]  = new int[6];
		int Eating_Time[]    = new int[6];
		String Action[]      = new String[6];
		for( i=1 ; i<=5 ; i++ ){
			Action[i] = "THINKING";
		}
		for( i=1 ; i<=5 ; i++ ){
			Thinking_Time[i] = random.nextInt(5) + 1;
			Eating_Time[i]   = -1;
		}
		for( i=0 ;  i<=20  ; i++){
			
			for( j=1 ; j<=5 ; j++ ){
				if(Eating_Time[j] > 0){
					Eating_Time[j] = Eating_Time[j] - 1;
					if(Eating_Time[j] == 0){
						Eating_Time[j] = -1;
						Thinking_Time[j] = random.nextInt(5) + 1;
						Action[j] = "THINKING";
					}
				}
			}	
			temp = 0;
			for( j=1 ; j<=5 ; j++ ){
				if( Thinking_Time[j] == 0 ){
					queue.add(j);
					q.add(string);
					Action[j] = "HUNGRY  ";
					temp = 1;
				}
			}
			int flag;
			if(temp == 1){
				if(string == "x"){
					string = "y";
				}
				else{
					string ="x";
				}
			}
			if(queue.size()!=0){
				string1 = q.peek();
			}
			flag = 0;
			if(queue.size()!= 0){
				size = queue.size();
				k = queue.peek();
				k1 = q.peek();
				for( int z=1 ; z<=size ; z++ ){
					flag = 0;
					if( k == 1){
						if( Action[k]== "HUNGRY  " && Action[5]!= "EATING  " && Action[2]!= "EATING  "){
							Action[k] = "EATING  ";
							Eating_Time[k] = random.nextInt(5) + 1;
							flag = 1;
						}
					}
					else if( k==4 ){
						if( Action[k]== "HUNGRY  " && Action[3]!= "EATING  " && Action[5]!= "EATING  "){
							Action[k] = "EATING  ";
							Eating_Time[k] = random.nextInt(5) + 1;
							flag = 1;
						}
					}
					else if( Action[k]== "HUNGRY  " && Action[k-1]!= "EATING  " && Action[(k+1)%5]!= "EATING  "){
						Action[k] = "EATING  ";
						Eating_Time[k] = random.nextInt(5) + 1;
						flag = 1;
					}
					if(flag == 1){
						queue.poll();
							q.poll();
					}
					else{
						queue.add(queue.remove());
						q.add(q.remove());
					}
					if(q.peek()!=string1 && z==1){
						int y;
						if(queue.size()!=0){
							for( y=z+1 ; y<=size ; y++ ){
								queue.add(queue.remove());
								q.add(q.remove());
							}
						}
						break;	
					}
					else if(q.peek()!=string1){
						int y;
						if(queue.size()!=0){
							for( y=z+1 ; y<=size ; y++ ){
								queue.add(queue.remove());
								q.add(q.remove());
							}
						}
						break;
					}
					k  = queue.peek();
					k1 = q.peek();
				}
			}
			Output = "";
			for( j=1 ; j<=5 ; j++ ){
				Thinking_Time[j] = Thinking_Time[j] - 1;
				Output = Output + Action[j] + '\t';
			}
			System.out.println(Output + "\n");			
			try{
				Thread.sleep(0000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}		
	}
}