

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Queue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JTextPane;
import javax.swing.Timer;


public class gui   {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(200, 200, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnStart = new JButton("START");
		btnStart.setBackground(new Color(102, 102, 204));
		btnStart.setBounds(132, 390, 85, 23);
		frame.getContentPane().add(btnStart);
		
		JButton btnStop = new JButton("STOP");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnStop.setBackground(new Color(153, 0, 0));
		
		btnStop.setBounds(450, 390, 89, 23);
		frame.getContentPane().add(btnStop);
		
		JLabel label_22 = new JLabel("1");
		label_22.setForeground(Color.BLUE);
		label_22.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		label_22.setBounds(315, 246, 46, 14);
		frame.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel("2");
		label_23.setForeground(Color.BLUE);
		label_23.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		label_23.setBounds(493, 175, 46, 14);
		frame.getContentPane().add(label_23);
		
		JLabel label_24 = new JLabel("3");
		label_24.setForeground(Color.BLUE);
		label_24.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		label_24.setBounds(432, 92, 46, 14);
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("4");
		label_25.setForeground(Color.BLUE);
		label_25.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		label_25.setBounds(281, 92, 46, 14);
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("5");
		label_26.setForeground(Color.BLUE);
		label_26.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		label_26.setBounds(206, 175, 46, 14);
		frame.getContentPane().add(label_26);
		
		JLabel t1=new JLabel("");
		t1.setText("THINKING");
		t1.setBounds(383, 273, 57, 47);
		frame.getContentPane().add(t1);
		
		JLabel t2=new JLabel("");
		t2.setText("THINKING");
		t2.setBounds(517, 105, 57, 47);
		frame.getContentPane().add(t2);
		
		JLabel t3=new JLabel("");
		t3.setText("THINKING");
		t3.setBounds(469, 20, 57, 47);
		frame.getContentPane().add(t3);
		
		JLabel t4=new JLabel("");
		//t4.setForeground(Color.BLUE);
		t4.setText("THINKING");
		t4.setBounds(315, 44, 57, 23);
		frame.getContentPane().add(t4);
		
		JLabel t5=new JLabel("");
		t5.setText("THINKING");
		t5.setBounds(183, 92, 57, 47);
		frame.getContentPane().add(t5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\spon1.png"));
		lblNewLabel.setBounds(255, 213, 57, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_13 = new JLabel("");
		label_13.setBounds(250, 126, 73, 76);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setBounds(294, 123, 57, 58);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setBounds(368, 114, 57, 50);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setBounds(398, 193, 77, 50);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setBounds(397, 175, 97, 50);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("");
		label_18.setBounds(294, 213, 57, 50);
		frame.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setBounds(336, 213, 75, 68);
		frame.getContentPane().add(label_19);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(398, 138, 57, 37);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel label_20 = new JLabel("");
		label_20.setBounds(237, 192, 57, 51);
		frame.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setBounds(220, 166, 85, 48);
		frame.getContentPane().add(label_21);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\adi.png"));
		label.setBounds(315, 180, 96, 109);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel_2 = new JLabel("Thinking");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\think.png"));
		lblNewLabel_2.setBounds(294, 14, 96, 83);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label_9 = new JLabel("Thinking");
		label_9.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\think.png"));
		label_9.setBounds(448, 11, 104, 83);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Thinking");
		label_10.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\think.png"));
		label_10.setBounds(500, 92, 104, 83);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Thinking");
		label_11.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\think.png"));
		label_11.setBounds(167, 80, 104, 83);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Thinking");
		label_12.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\think2.png"));
		label_12.setBounds(336, 257, 104, 101);
		frame.getContentPane().add(label_12);
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(Color.LIGHT_GRAY);
		label_1.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\2.png"));
		label_1.setBounds(368, 225, 57, 70);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\adi.png"));
		label_2.setBounds(398, 166, 96, 109);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\s.png"));
		label_3.setBounds(408, 154, 57, 50);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\adi.png"));
		label_4.setBounds(368, 105, 96, 109);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\1.png"));
		label_5.setBounds(321, 123, 57, 63);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\adi.png"));
		label_6.setBounds(281, 105, 96, 109);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\3.png"));
		label_7.setBounds(227, 154, 85, 48);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\adi.png"));
		label_8.setBounds(227, 154, 96, 109);
		frame.getContentPane().add(label_8);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\adi.jpg"));
		lblNewLabel_1.setBounds(122, 66, 437, 303);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		
		//Timer( int delayInMillis, ActionListener listener );
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
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
	    		for( i=1 ; i<=5 ; i++ )
	    		{
	    			Thinking_Time[i] = random.nextInt(5) + 1;
	    			Eating_Time[i]   = -1;
	    		}

	    		int cnt[]  = new int[1];
	    		int interval = 4000; // repeating every 1000 ms
	    		new Timer(interval, new ActionListener() {
	    		    @Override
	    		    public void actionPerformed(ActionEvent e) {
	    		    	
	    		    	int i,j,k;
	    	    		String Output        = new String();
	    	    		String string        = new String();
	    	    		String k1            = new String();
	    	    		String string1        = new String();
	    	    		int temp=0,size;
	    	    		btnStop.addActionListener(new ActionListener() {
	    	    			public void actionPerformed(ActionEvent et) {
	    	    				((Timer)e.getSource()).stop();
	    	    			}
	    	    		});
	    	    			 
	    	    		
	    			//for( i=0 ;  i<=10; i++){
	    			
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
	    							//Eating_Time[k] = random.nextInt(5) + 1;
	    							Eating_Time[k] = 2;
	    							flag = 1;
	    						}
	    					}
	    					else if( k==4 ){
	    						if( Action[k]== "HUNGRY  " && Action[3]!= "EATING  " && Action[5]!= "EATING  "){
	    							Action[k] = "EATING  ";
	    							//Eating_Time[k] = random.nextInt(5) + 1;
	    							Eating_Time[k] = 2;
	    							flag = 1;
	    						}
	    					}
	    					else if( Action[k]== "HUNGRY  " && Action[k-1]!= "EATING  " && Action[(k+1)%5]!= "EATING  "){
	    						Action[k] = "EATING  ";
	    						//Eating_Time[k] = random.nextInt(5) + 1;
	    						Eating_Time[k] = 2;
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
	    		
	    			t1.setText(Action[1]);
	    			t2.setText(Action[2]);
	    			t3.setText(Action[3]);
	    			t4.setText(Action[4]);
	    			t5.setText(Action[5]);
	    			
	    			for( int o=1;o<6;o++)
	    			{
	    				if (Action[o]=="EATING  ")
	    				{
	    					if (o==1)
	    					{ 
	    						t1.setFont(new Font("Dialog", Font.BOLD, 10));
	    						t1.setForeground(Color.green);
	    						lblNewLabel.setIcon(new ImageIcon(""));
	    						label_18.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\spon1.png"));
	    						label_1.setIcon(new ImageIcon(""));
	    						label_19.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\2.png"));
	    						label_12.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\eat2.png"));


	    					}
	    					else if (o==2)
	    					{

	    						t2.setFont(new Font("Dialog", Font.BOLD, 10));
	    						t2.setForeground(Color.green);
	    						label_1.setIcon(new ImageIcon(""));
	    						label_17.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\p1.png"));
	    						label_3.setIcon(new ImageIcon(""));
	    						label_16.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\p.png"));
	    						label_10.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\eat.png"));

	    					}
	    					else if (o==3)
	    					{

	    						t3.setFont(new Font("Dialog", Font.BOLD, 10));
	    						t3.setForeground(Color.green);
	    						label_3.setIcon(new ImageIcon(""));
	    						label_15.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\s.png"));
	    						label_5.setIcon(new ImageIcon(""));
	    						lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\s.png"));
	    						label_9.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\eat.png"));

	    					}
	    					else if(o==4)
	    					{

	    						t4.setFont(new Font("Dialog", Font.BOLD, 10));
	    						t4.setForeground(Color.green);
	    						label_5.setIcon(new ImageIcon(""));
	    						label_14.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\1.png"));
	    						label_7.setIcon(new ImageIcon(""));
	    						label_13.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\3.png"));
	    						lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\eat.png"));
	    						
	    					}
	    					else if(o==5)
	    					{

	    						t5.setFont(new Font("Dialog", Font.BOLD, 10));
	    						t5.setForeground(Color.green);
	    						label_7.setIcon(new ImageIcon(""));
	    						label_21.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\3.png"));
	    						lblNewLabel.setIcon(new ImageIcon(""));
	    						label_20.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\spon1.png"));
	    						label_11.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\eat.png"));

	    					}
	    				}
	    				else if(Action[o]=="THINKING" || Action[o]=="HUNGRY  ")
	    				{
	    					if (o==1)
	    					{
	    						label_18.setIcon(new ImageIcon(""));
	    						label_19.setIcon(new ImageIcon(""));
	    						if(Action[2]!="EATING  ")
	    						{
	    							label_1.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\2.png"));
	    						}
	    						if(Action[5]!="EATING  ")
	    						{
	    							lblNewLabel.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\spon1.png"));
	    						}
	    						if(Action[o]=="THINKING")
	    						{

		    						t1.setFont(new Font("Dialog", Font.ITALIC, 10));
		    						t1.setForeground(Color.black);
		    						label_12.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\think2.png"));

	    						}
	    						else
	    						{

		    						t1.setFont(new Font("Dialog", Font.ITALIC, 10));
		    						//t1.setForeground(Color.red);
		    						t1.setForeground(new Color(255,51,0));
		    						//t4.setForeground(new Color(255, 51, 0));

		    						label_12.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\hungry2.png"));

	    						}
	    					}
	    					if (o==2)
	    					{
	    						label_16.setIcon(new ImageIcon(""));
	    						label_17.setIcon(new ImageIcon(""));
	    						if (Action[3]!="EATING  ")
	    						{
	    							label_3.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\s.png"));
	    						}
	    						if (Action[1]!="EATING  ")
	    						{
	    							label_1.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\2.png"));
	    						}
	    						if(Action[o]=="THINKING")
	    						{

		    						t2.setFont(new Font("Dialog", Font.ITALIC, 10));
		    						t2.setForeground(Color.black);
		    						label_10.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\think.png"));
	    						}
	    						else
	    						{

		    						t2.setFont(new Font("Dialog", Font.ITALIC, 10));
		    						//t2.setForeground(Color.red);
		    						t2.setForeground(new Color(255,51,0));

		    						label_10.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\hungry.png"));

	    						}
	    					}
	    					if (o==3)
	    					{
	    						label_15.setIcon(new ImageIcon(""));
	    						lblNewLabel_4.setIcon(new ImageIcon(""));
	    						if (Action[4]!="EATING  ")
	    						{
	    							label_5.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\1.png"));
	    						}
	    						if (Action[2]!="EATING  ")
	    						{
	    							label_3.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\s.png"));
	    						}
	    						if(Action[o]=="THINKING")
	    						{

		    						t3.setFont(new Font("Dialog", Font.ITALIC, 10));
		    						t3.setForeground(Color.black);
		    						label_9.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\think.png"));

	    						}
	    						else
	    						{

		    						t3.setFont(new Font("Dialog", Font.ITALIC, 10));
		    						//t3.setForeground(Color.red);
		    						t3.setForeground(new Color(255,51,0));

		    						label_9.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\hungry.png"));

	    						}
	    					}
	    					if (o==4)
	    					{
	    						label_14.setIcon(new ImageIcon(""));
	    						label_13.setIcon(new ImageIcon(""));
	    						if (Action[5]!="EATING  ")
	    						{
	    							label_7.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\3.png"));
	    						}
	    						if (Action[3]!="EATING  ")
	    						{
	    							label_5.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\1.png"));
	    						}
	    						if(Action[o]=="THINKING")
	    						{

		    						t4.setFont(new Font("Dialog", Font.ITALIC, 10));
		    						t4.setForeground(Color.black);
		    						
		    						lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\think.png"));

	    						}
	    						else
	    						{

		    						t4.setFont(new Font("Dialog", Font.ITALIC, 10));
		    						//t4.setForeground(Color.red);
		    						t4.setForeground(new Color(255, 0, 51));

		    						lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\hungry.png"));

	    						}
	    					}
	    					if (o==5)
	    					{
	    						label_20.setIcon(new ImageIcon(""));
	    						label_21.setIcon(new ImageIcon(""));
	    						if (Action[1]!="EATING  ")
	    						{
	    							lblNewLabel.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\spon1.png"));
	    						}
	    						if (Action[4]!="EATING  ")
	    						{
	    							label_7.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\3.png"));
	    						}
	    						if(Action[o]=="THINKING")
	    						{

		    						t5.setFont(new Font("Dialog", Font.ITALIC, 10));
		    						t5.setForeground(Color.black);
		    						label_11.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\think.png"));

	    						}
	    						else
	    						{

		    						t5.setFont(new Font("Dialog", Font.ITALIC, 10));
		    						//t5.setForeground(Color.red);
		    						t5.setForeground(new Color(255, 0, 51));

		    						label_11.setIcon(new ImageIcon("C:\\Users\\G. ADITYA\\Desktop\\hungry.png"));

	    						}
	    					}
	    				}
	    			}
	    			
	    			System.out.println(Output + "\n");			
	    	/*		try{
	    				Thread.sleep(1000);
	    			}
	    			catch(InterruptedException abhi){
	    				System.out.println(abhi);
					
		    		}*/
	    	/*		Timer timer = new Timer(delay, new ActionListener()(
	    				    @Override
	    				    public void actionPerformed(ActionEvent e) {
	    				        if (count == 0) {
	    				            ((Timer)e.getSource()).stop();
	    				        } else {
	    				            //make a change to your label
	    				            count--;
	    				        }
	    				    }
	    				));*/
	    			}
	    		
	    		
			
		}).start();
	    		
		
	}
		
	});
	/* public void windowClosing(WindowEvent e) 
     {
             dispose();
             System.exit(0);
     }
	 @Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}*/
}
}
