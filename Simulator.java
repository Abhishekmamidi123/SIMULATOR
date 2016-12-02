import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager; 

public class Simulator {

	public JFrame frame;
	public int[] Arr_time=new int[1000];
	public int[] Burst_time=new int[1000];
	public int[] Priority=new int[1000];
	public int[] Pages=new int[1000];
	public int DPages[]    = new int[21];
	public JTextField txtQuantum;
	public JTable table;
	public JTable table_1;
	public String [] A=new String[2];
	public JTable table_2;
	public JTable table_3;
	public int Time_quantum;
	private JTextField txtInputpages;
	private JTextField txtFifo;
	private JTextField txtLru;
	private JTextField txtOptimal;
	private JTextField txtSecond;
	private JTable table_4;
	
	public JLabel lblClock;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simulator window = new Simulator();
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
	public Simulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(0,0,1980,1080);
		
		//frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		
		JLabel lblSimulator = new JLabel("SIMULATOR");
		lblSimulator.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 33));
		lblSimulator.setBounds(865, 460, 199, 39);
		frame.getContentPane().add(lblSimulator);
		
		JLabel lblSimulator_1 = new JLabel("SIMULATOR");
		lblSimulator_1.setForeground(new Color(128,0,0));
		lblSimulator_1.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 33));
		lblSimulator_1.setBounds(865, 460, 199, 39);
		frame.getContentPane().add(lblSimulator_1);
		
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 51, 102));
		panel_7.setBounds(621, 13, 653, 63);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(null);
		panel_7.setVisible(false);
		
		JLabel lblHeading = new JLabel("");
		lblHeading.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblHeading.setForeground(new Color(255, 255, 255));
		lblHeading.setBounds(184, 13, 363, 37);
		panel_7.add(lblHeading);
				
				JPanel panel_2 = new JPanel();
				panel_2.setBounds(621, 89, 653, 904);
				frame.getContentPane().add(panel_2);
				panel_2.setBackground(new Color(255, 255, 204));
				panel_2.setLayout(null);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(new Color(204, 204, 255));
				panel_1.setBounds(153, 676, 383, 134);
				panel_2.add(panel_1);
				
				
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spinner.setForeground(new Color(51, 51, 153));
		spinner.setBackground(new Color(255, 204, 255));
		spinner.setBounds(396, 38, 116, 37);
		panel_2.add(spinner);
		spinner.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 153));
		panel.setBounds(82, 187, 518, 200);
		JScrollPane tablecontainer = new JScrollPane(table_3);
		panel.add(tablecontainer,BorderLayout.CENTER);
		panel_2.add(panel);
		
		//panel.setLayout(null);
		
				table_2 = new JTable();
				table_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
				table_2.setBorder(UIManager.getBorder("CheckBox.border"));
				table_2.setBackground(Color.WHITE);
				table_2.setBounds(168, 5, 0, 0);
				panel_1.add(table_2);
				
				JButton btnCompare = new JButton("COMPARE");
				btnCompare.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnCompare.setForeground(new Color(255, 255, 255));
				btnCompare.setBackground(new Color(51, 51, 153));
				btnCompare.setBounds(277, 601, 132, 47);
				panel_2.add(btnCompare);
				
				JButton btnSjfnp = new JButton("SJF NON-PREMPTIVE");
				btnSjfnp.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnSjfnp.setForeground(new Color(255, 255, 255));
				btnSjfnp.setBackground(new Color(204, 0, 102));
				btnSjfnp.setBounds(82, 531, 211, 37);
				panel_2.add(btnSjfnp);
				
				JButton btnPrioritynp = new JButton("PRIORITY NP");
				btnPrioritynp.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnPrioritynp.setForeground(new Color(255, 255, 255));
				btnPrioritynp.setBackground(new Color(204, 0, 102));
				btnPrioritynp.setBounds(389, 530, 211, 39);
				panel_2.add(btnPrioritynp);
				
				JButton btnSjf = new JButton("SJF PREEMPTIVE");
				btnSjf.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnSjf.setForeground(new Color(255, 255, 255));
				btnSjf.setBackground(new Color(204, 0, 102));
				btnSjf.setBounds(82, 478, 211, 39);
				panel_2.add(btnSjf);
				
				JButton btnPriorityp_1 = new JButton("PRIORITY P");
				btnPriorityp_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnPriorityp_1.setForeground(new Color(255, 255, 255));
				btnPriorityp_1.setBackground(new Color(204, 0, 102));
				btnPriorityp_1.setBounds(389, 478, 211, 39);
				panel_2.add(btnPriorityp_1);
				//table_1 = new JTable();
				
				JButton btnFcfs = new JButton("FCFS");
				btnFcfs.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnFcfs.setForeground(new Color(255, 255, 255));
				btnFcfs.setBackground(new Color(204, 0, 102));
				btnFcfs.setBounds(82, 426, 211, 39);
				panel_2.add(btnFcfs);
				
				JButton btnPriorityp = new JButton("ROUND_ROBIN");
				btnPriorityp.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnPriorityp.setForeground(new Color(255, 255, 255));
				btnPriorityp.setBackground(new Color(204, 0, 102));
				btnPriorityp.setBounds(389, 426, 211, 39);
				panel_2.add(btnPriorityp);
				
				JButton btnSarefresh = new JButton("");
				btnSarefresh.setBackground(new Color(250, 250, 210));
				btnSarefresh.setBounds(583, 38, 44, 35);
				panel_2.add(btnSarefresh);
				btnSarefresh.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Random random = new Random();
						int i,n;
//				panel.setBackground(Color.PINK);
						n=(Integer)spinner.getValue();
						for(i=0;i<n;i++){
							Arr_time[i]=1+random.nextInt(10);
						}
						for(i=0;i<n;i++){
							Burst_time[i]=1+random.nextInt(10);
						}
						for (i=0;i<n;i++){
							Priority[i] = 1+random.nextInt(10);
						}
						int r=n+1,c=3;
						//table_1 = new JTable(r,c);
						table_3.setModel(new DefaultTableModel(
							new Object[][] {
							},
							new String[] {
								
							}
						));
					//	table.getColumnModel().getColumn(0).setPreferredWidth(15);
						for(i=0;i<3;i++)
						{
							
							((DefaultTableModel)table_3.getModel()).addColumn(A);
						}
						for(i=0;i<3;i++)
						{
							table_3.getColumnModel().getColumn(i).setPreferredWidth(170);
						}
					//	table.getColumnModel().getColumn(c).setMinWidth(17);
						for (int l=0;l<n+1;l++){
							Object [] D=new Object[3];
//					for (int j=0;j<3;j++){
								if(l==0){
									D[0] = "ARRIVAL TIME";
									D[1] = "BURST TIME";
									D[2] = "PRIORITY";
								}
								else{
									D[0] = Arr_time[l-1];
									D[1] = Burst_time[l-1];
									D[2] = Priority[l-1];
								}
//					}
							((DefaultTableModel)table_3.getModel()).addRow(D);
						}
						panel.add(table_3);
						Time_quantum=1+random.nextInt(3);
						txtQuantum.setText(Integer.toString(Time_quantum));
					}
				});
				btnSarefresh.setIcon(new ImageIcon("C:\\Users\\abhishek\\Desktop\\refresh.png"));
				
				JLabel lblEnterTheNo = new JLabel("Enter the no of processes :");
				lblEnterTheNo.setForeground(new Color(0, 0, 0));
				lblEnterTheNo.setBounds(95, 46, 269, 21);
				panel_2.add(lblEnterTheNo);
				lblEnterTheNo.setFont(new Font("Tw Cen MT", Font.PLAIN, 23));
				
				
				
				JLabel lblQuantumTime = new JLabel("Quantum Time :\r\n");
				lblQuantumTime.setForeground(new Color(0, 0, 0));
				lblQuantumTime.setBounds(193, 96, 150, 25);
				panel_2.add(lblQuantumTime);
				lblQuantumTime.setFont(new Font("Tw Cen MT", Font.PLAIN, 23));
				
				txtQuantum = new JTextField();
				txtQuantum.setFont(new Font("Tahoma", Font.PLAIN, 18));
				txtQuantum.setBackground(new Color(255, 255, 255));
				txtQuantum.setBounds(396, 92, 116, 37);
				panel_2.add(txtQuantum);
				txtQuantum.setColumns(10);
				
				
				
				table_3 = new JTable();
				table_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				table_3.setBounds(249, 30, 1, 1);
				panel.add(table_3);
				
				JLabel lblMinimum = new JLabel("");
				lblMinimum.setForeground(new Color(178, 34, 34));
				lblMinimum.setBounds(122, 855, 460, 36);
				panel_2.add(lblMinimum);
				lblMinimum.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 18));
				
				JPanel panel_12 = new JPanel();
				panel_12.setBackground(new Color(30, 144, 255));
				panel_12.setBounds(0, 0, 653, 10);
				panel_2.add(panel_12);
				
				JPanel panel_13 = new JPanel();
				panel_13.setBackground(new Color(30, 144, 255));
				panel_13.setBounds(643, 0, 10, 904);
				panel_2.add(panel_13);
				
				JPanel panel_14 = new JPanel();
				panel_14.setBackground(new Color(30, 144, 255));
				panel_14.setBounds(0, 894, 653, 10);
				panel_2.add(panel_14);
				
				JPanel panel_15 = new JPanel();
				panel_15.setBackground(new Color(30, 144, 255));
				panel_15.setBounds(0, 0, 10, 904);
				panel_2.add(panel_15);
				
				JPanel panel_3 = new JPanel();
				panel_3.setBounds(0, 0, 653, 904);
				panel_2.add(panel_3);
				panel_3.setBackground(new Color(153, 102, 102));
				panel_3.setLayout(null);
				
				JPanel panel_4 = new JPanel();
				panel_4.setBackground(new Color(245, 222, 179));
				panel_4.setBounds(12, 256, 629, 145);
				panel_3.add(panel_4);
				//				panel_4.setLayout(null);
								
								JSpinner spinner_1 = new JSpinner();
								spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
								spinner_1.setBounds(408, 32, 105, 35);
								panel_3.add(spinner_1);
								spinner_1.setModel(new SpinnerNumberModel(0, 0, 6, 1));
								
								JSpinner spinner_2 = new JSpinner();
								spinner_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
								spinner_2.setBounds(408, 80, 105, 35);
								panel_3.add(spinner_2);
								spinner_2.setModel(new SpinnerNumberModel(0, 0, 20, 1));
								
								table_4 = new JTable();
								table_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
								table_4.setBounds(345, 23, -36, 15);
								panel_4.add(table_4);
								
								txtInputpages = new JTextField();
								txtInputpages.setFont(new Font("Tahoma", Font.PLAIN, 19));
								txtInputpages.setBounds(96, 180, 459, 27);
								panel_3.add(txtInputpages);
								txtInputpages.setColumns(10);
								
								txtFifo = new JTextField();
								txtFifo.setFont(new Font("Tahoma", Font.PLAIN, 19));
								txtFifo.setBounds(397, 456, 116, 35);
								panel_3.add(txtFifo);
								txtFifo.setColumns(10);
								
								txtLru = new JTextField();
								txtLru.setFont(new Font("Tahoma", Font.PLAIN, 19));
								txtLru.setBounds(397, 514, 116, 34);
								panel_3.add(txtLru);
								txtLru.setColumns(10);
								
								txtOptimal = new JTextField();
								txtOptimal.setFont(new Font("Tahoma", Font.PLAIN, 19));
								txtOptimal.setBounds(397, 577, 116, 34);
								panel_3.add(txtOptimal);
								txtOptimal.setColumns(10);
								
								txtSecond = new JTextField();
								txtSecond.setFont(new Font("Tahoma", Font.PLAIN, 19));
								txtSecond.setBounds(397, 642, 116, 34);
								panel_3.add(txtSecond);
								txtSecond.setColumns(10);
								
								panel_3.setVisible(false);
								//		    	panel_5.setVisible(false);
										    	
										    	JLabel lblMinimumNoOf = new JLabel("Minimum no of page faults is for");
										    	lblMinimumNoOf.setForeground(new Color(255, 255, 255));
										    	lblMinimumNoOf.setFont(new Font("Tw Cen MT", Font.PLAIN, 24));
										    	lblMinimumNoOf.setBounds(109, 753, 484, 35);
										    	panel_3.add(lblMinimumNoOf);
										    	
				JButton btnPfrefresh = new JButton("");
				btnPfrefresh.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Random random = new Random();
						
						int n,Frames,k;
						
						
						n=(Integer)spinner_2.getValue();
						Frames=(Integer)spinner_1.getValue();
//						int Pages[]    = new int[21];
						int PageFault[]  = new int[21];
						int[][] Memory_Table = new int[21][21];
						String Output = "";
						for(int i=1;i<=n;i++){
							Pages[i] = 1+random.nextInt(5);
							Output = Output + Integer.toString(Pages[i]) + " ";
						}
						txtInputpages.setText(Output);
						txtFifo.setText("");
						txtLru.setText("");
						txtOptimal.setText("");
						txtSecond.setText("");
					}
				});
				btnPfrefresh.setIcon(new ImageIcon("C:\\Users\\abhishek\\Desktop\\refresh.png"));
				btnPfrefresh.setBounds(583, 32, 44, 35);
				panel_3.add(btnPfrefresh);
				
				JButton btnFifo = new JButton("FIFO");
				btnFifo.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnFifo.setForeground(new Color(0, 0, 0));
				btnFifo.setBackground(new Color(255, 255, 204));
				btnFifo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Random random = new Random();
						int n,Frames,k;
						n=(Integer)spinner_2.getValue();
						Frames=(Integer)spinner_1.getValue();
						int PageFault[]  = new int[21];
						int[][] Memory_Table = new int[21][21];
						FIFO fifo = new FIFO();
						k = fifo.fifo(n,Frames,Pages,Memory_Table,PageFault);
						txtFifo.setText(Float.toString(k));
						txtLru.setText("");
						txtOptimal.setText("");
						txtSecond.setText("");
						int i;
						table_4.setModel(new DefaultTableModel(
							new Object[][] {
							},
							new String[] {
								
							}
						));
					//	table.getColumnModel().getColumn(0).setPreferredWidth(15);
						for(i=0;i<=n;i++)
						{
							((DefaultTableModel)table_4.getModel()).addColumn(A);
						}
						table_4.getColumnModel().getColumn(0).setPreferredWidth(60);
						for(i=1;i<=n;i++)
						{
							table_4.getColumnModel().getColumn(i).setPreferredWidth(30);
						}
//						table.getColumnModel().getColumn(Frames).setMinWidth(17);
						for (int l=0;l<=Frames;l++){
							Object [] D=new Object[n+1];
							for (int j=0;j<=n;j++){
								if(l==0 && j==0){
									D[0] = "Pages";
								}
								else if(j==0){
									D[j] = "";
								}
								else if(l==0){
									D[j] = Pages[j];
								}
								else{
									D[j] = Memory_Table[l][j];
								}
								if(l>=1 && PageFault[j]==1){
									D[j] = "";
								}
							}
							((DefaultTableModel)table_4.getModel()).addRow(D);
//							table.getColumnModel().getColumn(Frames).setMinWidth(17);
						}
						panel_4.add(table_4);
					}
				});
				btnFifo.setBounds(96, 456, 204, 35);
				panel_3.add(btnFifo);
				
				JButton btnLru = new JButton("LRU");
				btnLru.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnLru.setForeground(new Color(0, 0, 0));
				btnLru.setBackground(new Color(255, 255, 204));
				btnLru.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int n,Frames,k;
						n=(Integer)spinner_2.getValue();
						Frames=(Integer)spinner_1.getValue();
						int PageFault[]  = new int[21];
						int[][] Memory_Table = new int[21][21];
						LRU lru = new LRU();
						k = lru.lru(n,Frames,Pages,Memory_Table,PageFault);
//						System.out.println(k);
						txtFifo.setText("");
						txtLru.setText(Float.toString(k));
						txtOptimal.setText("");
						txtSecond.setText("");
						int i;
						table_4.setModel(new DefaultTableModel(
							new Object[][] {
							},
							new String[] {
								
							}
						));
					//	table.getColumnModel().getColumn(0).setPreferredWidth(15);
						for(i=0;i<=n;i++)
						{
							((DefaultTableModel)table_4.getModel()).addColumn(A);
						}
						table_4.getColumnModel().getColumn(0).setPreferredWidth(60);
						for(i=1;i<=n;i++)
						{
							table_4.getColumnModel().getColumn(i).setPreferredWidth(30);
						}
//						table.getColumnModel().getColumn(Frames).setMinWidth(17);
						for (int l=0;l<=Frames;l++){
							Object [] D=new Object[n+1];
							for (int j=0;j<=n;j++){
								if(l==0 && j==0){
									D[0] = "Pages";
								}
								else if(j==0){
									D[j] = "";
								}
								else if(l==0){
									D[j] = Pages[j];
								}
								else{
									D[j] = Memory_Table[l][j];
								}
								if(l>=1 && PageFault[j]==1){
									D[j] = "";
								}
							}
							((DefaultTableModel)table_4.getModel()).addRow(D);
//							table.getColumnModel().getColumn(Frames).setMinWidth(17);
						}
						panel_4.add(table_4);
					}
				});
				btnLru.setBounds(96, 513, 204, 35);
				panel_3.add(btnLru);
				
				JButton btnOptimal = new JButton("OPTIMAL");
				btnOptimal.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnOptimal.setForeground(new Color(0, 0, 0));
				btnOptimal.setBackground(new Color(255, 255, 204));
				btnOptimal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int n,Frames,k;
						n=(Integer)spinner_2.getValue();
						Frames=(Integer)spinner_1.getValue();
						int PageFault[]  = new int[21];
						int[][] Memory_Table = new int[21][21];
						OPTIMAL optimal = new OPTIMAL();
						k = optimal.optimal(n,Frames,Pages,Memory_Table,PageFault);
//						System.out.println(k);
						txtFifo.setText("");
						txtLru.setText("");
						txtOptimal.setText(Float.toString(k));
						txtSecond.setText("");
						int i;
						table_4.setModel(new DefaultTableModel(
							new Object[][] {
							},
							new String[] {
								
							}
						));
					//	table.getColumnModel().getColumn(0).setPreferredWidth(15);
						for(i=0;i<=n;i++)
						{
							((DefaultTableModel)table_4.getModel()).addColumn(A);
						}
						table_4.getColumnModel().getColumn(0).setPreferredWidth(60);
						for(i=1;i<=n;i++)
						{
							table_4.getColumnModel().getColumn(i).setPreferredWidth(30);
						}
//						table.getColumnModel().getColumn(Frames).setMinWidth(17);
						for (int l=0;l<=Frames;l++){
							Object [] D=new Object[n+1];
							for (int j=0;j<=n;j++){
								if(l==0 && j==0){
									D[0] = "Pages";
								}
								else if(j==0){
									D[j] = "";
								}
								else if(l==0){
									D[j] = Pages[j];
								}
								else{
									D[j] = Memory_Table[l][j];
								}
								if(l>=1 && PageFault[j]==1){
									D[j] = "";
								}
							}
							((DefaultTableModel)table_4.getModel()).addRow(D);
//							table.getColumnModel().getColumn(Frames).setMinWidth(17);
						}
						panel_4.add(table_4);
					}
				});
				btnOptimal.setBounds(96, 576, 204, 35);
				panel_3.add(btnOptimal);
				
				JButton btnSecondChance = new JButton("SECOND CHANCE");
				btnSecondChance.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnSecondChance.setForeground(new Color(0, 0, 0));
				btnSecondChance.setBackground(new Color(255, 255, 204));
				btnSecondChance.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int n,Frames,k;
						n=(Integer)spinner_2.getValue();
						Frames=(Integer)spinner_1.getValue();
						int PageFault[]  = new int[21];
						int[][] Memory_Table = new int[21][21];
						SECOND_CHANCE second_chance= new SECOND_CHANCE();
						k = second_chance.second_chance(n,Frames,Pages,Memory_Table,PageFault);
//						System.out.println(k);
						txtFifo.setText("");
						txtLru.setText("");
						txtOptimal.setText("");
						txtSecond.setText(Float.toString(k));
						int i;
						table_4.setModel(new DefaultTableModel(
							new Object[][] {
							},
							new String[] {
								
							}
						));
					//	table.getColumnModel().getColumn(0).setPreferredWidth(15);
						for(i=0;i<=n;i++)
						{
							((DefaultTableModel)table_4.getModel()).addColumn(A);
						}
						table_4.getColumnModel().getColumn(0).setPreferredWidth(60);
						for(i=1;i<=n;i++)
						{
							table_4.getColumnModel().getColumn(i).setPreferredWidth(30);
						}
//						table.getColumnModel().getColumn(Frames).setMinWidth(17);
						for (int l=0;l<=Frames;l++){
							Object [] D=new Object[n+1];
							for (int j=0;j<=n;j++){
								if(l==0 && j==0){
									D[0] = "Pages";
								}
								else if(j==0){
									D[j] = "";
								}
								else if(l==0){
									D[j] = Pages[j];
								}
								else{
									D[j] = Memory_Table[l][j];
								}
								if(l>=1 && PageFault[j]==1){
									D[j] = "";
								}
							}
							((DefaultTableModel)table_4.getModel()).addRow(D);
//							table.getColumnModel().getColumn(Frames).setMinWidth(17);
						}
						panel_4.add(table_4);
					}
				});
				btnSecondChance.setBounds(96, 639, 204, 35);
				panel_3.add(btnSecondChance);
				
				JButton btnCompare_1 = new JButton("Compare");
				btnCompare_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnCompare_1.setForeground(new Color(0, 0, 0));
				btnCompare_1.setBackground(new Color(204, 204, 255));
				btnCompare_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int n,Frames,f,lr,o,s;
						n=(Integer)spinner_2.getValue();
						Frames=(Integer)spinner_1.getValue();
						int PageFault[]    = new int[21];
						int[][] Memory_Table = new int[21][21];
						SECOND_CHANCE second_chance= new SECOND_CHANCE();
						s = second_chance.second_chance(n,Frames,Pages,Memory_Table,PageFault);
						FIFO fifo = new FIFO();
						f = fifo.fifo(n,Frames,Pages,Memory_Table,PageFault);
						LRU lru = new LRU();
						lr = lru.lru(n,Frames,Pages,Memory_Table,PageFault);
						OPTIMAL optimal = new OPTIMAL();
						o = optimal.optimal(n,Frames,Pages,Memory_Table,PageFault);
//						SECOND_CHANCE second_chance= new SECOND_CHANCE();
//						s = second_chance.second_chance(n,Frames,Pages,Memory_Table,PageFault);
//						System.out.println(k);
						txtFifo.setText(Float.toString(f));
						txtLru.setText(Float.toString(lr));
						txtOptimal.setText(Float.toString(o));
						txtSecond.setText(Float.toString(s));
						int i;
						table_4.setModel(new DefaultTableModel(
							new Object[][] {
							},
							new String[] {
								
							}
						));
					//	table.getColumnModel().getColumn(0).setPreferredWidth(15);
						for(i=0;i<=1;i++)
						{
							((DefaultTableModel)table_4.getModel()).addColumn(A);
						}
						for(i=0;i<=1;i++)
						{
							table_4.getColumnModel().getColumn(i).setPreferredWidth(200);
						}
//						table.getColumnModel().getColumn(Frames).setMinWidth(17);
						for (int l=0;l<=4;l++){
							Object [] D=new Object[2];
								if(l==0){
									D[0] = "Type";
									D[1] = "PageFaults";
								}
								else if(l==1){
									D[0] = "FIFO";
									D[1] = f;
								}
								else if(l==2){
									D[0] = "LRU";
									D[1] = lr;
								}
								else if(l==3){
									D[0] = "OPTIMAL";
									D[1] = o;
								}
								else if(l==4){
									D[0] = "SECOND CHANCE";
									D[1] = s;
								}
							((DefaultTableModel)table_4.getModel()).addRow(D);
//							table.getColumnModel().getColumn(Frames).setMinWidth(17);
						}
						panel_4.add(table_4);
						float A[]    = new float[5];
						A[0] = f;
						A[1] = lr;
						A[2] = o;
						A[3] = s;
						float min=10000;
						int k=0;
						for(i=0;i<4;i++){
							if(A[i]<min){
								min=A[i];
								k=i;
							}
						}
						if(k==0){
							 lblMinimumNoOf.setText("Minimum no of page faults is for FCFS");
						}
						else if(k==1){
							 lblMinimumNoOf.setText("Minimum no of page faults is for LRU");
						}
						else if(k==2){
							 lblMinimumNoOf.setText("Minimum no of page faults is for OPTIMAL");
						}
						else if(k==3){
							 lblMinimumNoOf.setText("Minimum no of page faults is for SECOND CHANCE");
						}
						compare_pf compare = new compare_pf("COMPARISION AMONGST PAGEFAULT SCHEDULING ALGORITHMS","COMPARISION",A);
						compare.Compare_Chart("COMPARISION AMONGST PAGEFAULT SCHEDULING ALGORITHMS","COMPARISION",A);
					}
				});
				btnCompare_1.setBounds(273, 700, 131, 46);
				panel_3.add(btnCompare_1);
				
				JLabel lblNumberOfFrames = new JLabel("Number of Frames :");
				lblNumberOfFrames.setFont(new Font("Tw Cen MT", Font.PLAIN, 23));
				lblNumberOfFrames.setForeground(new Color(255, 255, 255));
				lblNumberOfFrames.setBounds(122, 45, 191, 19);
				panel_3.add(lblNumberOfFrames);
				
				JLabel lblNumberOfPages = new JLabel("Number of Pages :");
				lblNumberOfPages.setFont(new Font("Tw Cen MT", Font.PLAIN, 23));
				lblNumberOfPages.setForeground(new Color(255, 255, 255));
				lblNumberOfPages.setBounds(132, 93, 191, 24);
				panel_3.add(lblNumberOfPages);
				
				JButton btnBeladysAnomaly = new JButton("Belady's Anomaly");
				btnBeladysAnomaly.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnBeladysAnomaly.setForeground(new Color(0, 0, 0));
				btnBeladysAnomaly.setBackground(new Color(255, 204, 51));
				btnBeladysAnomaly.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Belady_graph belady = new Belady_graph("Belady's Analomy" ,
							      "FIFO illustrating Belady's Analomy");
						belady.Beladys("Belady's Analomy" ,
							      "FIFO illustrating Belady's Analomy");
						String Output="";
						Output="1 "+"2 "+"3 "+"4 "+"1 "+"2 "+"5 "+"1 "+"2 "+"3 "+"4 "+"5 ";
						txtInputpages.setText(Output);
						
					}
				});
				btnBeladysAnomaly.setBounds(247, 828, 190, 46);
				panel_3.add(btnBeladysAnomaly);
				
				JLabel lblInputString = new JLabel("Input String");
				lblInputString.setFont(new Font("Tw Cen MT", Font.PLAIN, 23));
				lblInputString.setForeground(new Color(255, 250, 250));
				lblInputString.setBounds(257, 156, 116, 22);
				panel_3.add(lblInputString);
				
				JPanel panel_8 = new JPanel();
				panel_8.setBackground(new Color(255, 165, 0));
				panel_8.setBounds(0, 0, 10, 904);
				panel_3.add(panel_8);
				
				JPanel panel_9 = new JPanel();
				panel_9.setBackground(new Color(255, 165, 0));
				panel_9.setBounds(0, 894, 653, 10);
				panel_3.add(panel_9);
				
				JPanel panel_10 = new JPanel();
				panel_10.setBackground(new Color(255, 165, 0));
				panel_10.setBounds(643, 0, 10, 904);
				panel_3.add(panel_10);
				
				JPanel panel_11 = new JPanel();
				panel_11.setBackground(new Color(255, 165, 0));
				panel_11.setBounds(0, 0, 653, 10);
				panel_3.add(panel_11);
				
				JPanel panel_5 = new JPanel();
				panel_5.setBounds(0, 0, 653, 904);
				panel_3.add(panel_5);
				panel_5.setBackground(new Color(255, 228, 196));
				panel_5.setLayout(null);
				panel_5.setVisible(false);
				
				JSpinner spinner_3 = new JSpinner();
				spinner_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
				spinner_3.setBounds(396, 79, 97, 33);
				panel_5.add(spinner_3);
				spinner_3.setModel(new SpinnerNumberModel(0, 0, 20, 1));
				
				JTextArea txtrCylinders = new JTextArea();
				txtrCylinders.setFont(new Font("Monospaced", Font.PLAIN, 19));
				txtrCylinders.setBounds(299, 587, 103, 33);
				panel_5.add(txtrCylinders);
				
				JLabel lblNoOfCylinders = new JLabel("No of Cylinders crossed for");
				lblNoOfCylinders.setFont(new Font("Tw Cen MT", Font.PLAIN, 23));
				lblNoOfCylinders.setBounds(176, 546, 376, 22);
				panel_5.add(lblNoOfCylinders);
				
				JTextArea txtrDinputstring = new JTextArea();
				txtrDinputstring.setFont(new Font("Monospaced", Font.PLAIN, 19));
				txtrDinputstring.setBounds(12, 265, 629, 33);
				panel_5.add(txtrDinputstring);
				
				JLabel lblStartingDisk = new JLabel("Number of Disks :");
				lblStartingDisk.setFont(new Font("Tw Cen MT", Font.PLAIN, 23));
				lblStartingDisk.setBounds(158, 79, 183, 33);
				panel_5.add(lblStartingDisk);
				
				JLabel lblHeadAtDisk = new JLabel("Head at Disk no :");
				lblHeadAtDisk.setFont(new Font("Tw Cen MT", Font.PLAIN, 23));
				lblHeadAtDisk.setBounds(166, 150, 175, 25);
				panel_5.add(lblHeadAtDisk);
				
				JTextArea txtrHead = new JTextArea();
				txtrHead.setFont(new Font("Monospaced", Font.PLAIN, 18));
				txtrHead.setBounds(396, 148, 50, 27);
				panel_5.add(txtrHead);
				
				JTextArea txtrMincyl = new JTextArea();
				txtrMincyl.setFont(new Font("Monospaced", Font.PLAIN, 18));
				txtrMincyl.setBounds(283, 778, 135, 33);
				panel_5.add(txtrMincyl);
				
				JButton btnDsrefresh = new JButton("");
				btnDsrefresh.setBackground(new Color(255, 228, 181));
				btnDsrefresh.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int n;
						Random random = new Random();
						//Change Pages to DPages;
						n=(Integer)spinner_3.getValue();
						for(int i=1;i<=n;i++){
							DPages[i] = random.nextInt(200);
						}
						int head = random.nextInt(200);
						String Input="";
						String Cylinders="";
						for(int i=1;i<=n;i++){
							Input = Input + Integer.toString(DPages[i]) + " ";
						}
						txtrDinputstring.setText(Input);
						txtrHead.setText(Integer.toString(head));
						//lblNoOfCylinders.setText("No of Cylinders crossed for FCFS");
						
					}
				});
				btnDsrefresh.setIcon(new ImageIcon("C:\\Users\\abhishek\\Desktop\\refresh.png"));
				btnDsrefresh.setBounds(587, 37, 44, 38);
				panel_5.add(btnDsrefresh);
				
				
				
				JButton btnDfcfs = new JButton("FCFS");
				btnDfcfs.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnDfcfs.setForeground(new Color(248, 248, 255));
				btnDfcfs.setBackground(new Color(219, 112, 147));
				btnDfcfs.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						 int n=(Integer)spinner_3.getValue();
						 int k,t=1;
						 tem__fff fifo = new tem__fff();
						 int head = Integer.parseInt(txtrHead.getText());
						 k=fifo.fff(DPages,n,head,t);
						 txtrCylinders.setText(Integer.toString(k));
						 lblNoOfCylinders.setText("No of Cylinders crossed for FCFS");
					}
				});
				btnDfcfs.setBounds(176, 326, 114, 33);
				panel_5.add(btnDfcfs);
				
				JButton btnScan = new JButton("SCAN");
				btnScan.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnScan.setForeground(new Color(248, 248, 255));
				btnScan.setBackground(new Color(219, 112, 147));
				btnScan.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int k,t=1;
						int n=(Integer)spinner_3.getValue();
						 SCAN scan = new SCAN();
						 int head = Integer.parseInt(txtrHead.getText());
						 k=scan.scan(DPages,n,head,t);
						 txtrCylinders.setText(Integer.toString(k));
						 lblNoOfCylinders.setText("No of Cylinders crossed for SCAN");
					}
				});
				btnScan.setBounds(288, 465, 114, 33);
				panel_5.add(btnScan);
				
				JButton btnSstf = new JButton("SSTF");
				btnSstf.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnSstf.setForeground(new Color(248, 248, 255));
				btnSstf.setBackground(new Color(219, 112, 147));
				btnSstf.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 int k,t=1;
						 int n=(Integer)spinner_3.getValue();
						 tem_sstf sstf = new tem_sstf();
						 int head = Integer.parseInt(txtrHead.getText());
						 k=sstf.SSTF(DPages,n,head,t);
						 txtrCylinders.setText(Integer.toString(k));
						 lblNoOfCylinders.setText("No of Cylinders crossed for SSTF");
					}
				});
				btnSstf.setBounds(176, 394, 114, 33);
				panel_5.add(btnSstf);
				
				JLabel lblInputDisksTo = new JLabel("Input Disks to be crossed");
				lblInputDisksTo.setFont(new Font("Tw Cen MT", Font.PLAIN, 23));
				lblInputDisksTo.setBounds(222, 227, 237, 25);
				panel_5.add(lblInputDisksTo);
				
				
				
				JButton btnCscan = new JButton("C-SCAN");
				btnCscan.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnCscan.setForeground(new Color(248, 248, 255));
				btnCscan.setBackground(new Color(219, 112, 147));
				btnCscan.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int k,t=1;
						int n=(Integer)spinner_3.getValue();
						 C_SCAN c_scan = new C_SCAN();
						 int head = Integer.parseInt(txtrHead.getText());
						 k=c_scan.c_scan(DPages,n,head,t);
						 txtrCylinders.setText(Integer.toString(k));
						 lblNoOfCylinders.setText("No of Cylinders crossed for C-SCAN");
					}
				});
				btnCscan.setBounds(396, 326, 121, 33);
				panel_5.add(btnCscan);
				
				
				
				JButton btnClook = new JButton("C-LOOK");
				btnClook.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnClook.setForeground(new Color(248, 248, 255));
				btnClook.setBackground(new Color(219, 112, 147));
				btnClook.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int k,t=1;
						int n=(Integer)spinner_3.getValue();
						 C_LOOK c_look = new C_LOOK();
						 int head = Integer.parseInt(txtrHead.getText());
						 k=c_look.c_look(DPages,n,head,t);
						 txtrCylinders.setText(Integer.toString(k));
						 lblNoOfCylinders.setText("No of Cylinders crossed for C-LOOK");
					}
				});
				btnClook.setBounds(396, 394, 121, 33);
				panel_5.add(btnClook);
				
				
				
				JButton btnCompare_2 = new JButton("Compare");
				btnCompare_2.setForeground(new Color(255, 255, 255));
				btnCompare_2.setBackground(new Color(154, 205, 50));
				btnCompare_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int n=(Integer)spinner_3.getValue();
						int Array[] = new int[6];
						int min=10000,h=0,t=0;
						tem__fff fifo = new tem__fff();
						tem_sstf sstf = new tem_sstf();
						SCAN scan = new SCAN();
						C_SCAN c_scan = new C_SCAN();
						C_LOOK c_look = new C_LOOK();
						int head = Integer.parseInt(txtrHead.getText());
						Array[1]=fifo.fff(DPages,n,head,t);
						Array[2]=sstf.SSTF(DPages,n,head,t);
						Array[3]=scan.scan(DPages,n,head,t);
						Array[4]=c_scan.c_scan(DPages,n,head,t);
						Array[5]=c_look.c_look(DPages,n,head,t);
						for(int i=1;i<=5;i++){
							if(Array[i]<min){
								min=Array[i];
								h=i;
							}
						}
						if(h==1){
							txtrMincyl.setText("FIFO - "+Integer.toString(min));
						}
						else if(h==2){
							txtrMincyl.setText("SSTF - "+Integer.toString(min));
						}
						else if(h==3){
							txtrMincyl.setText("SCAN - "+Integer.toString(min));
						}
						else if(h==4){
							txtrMincyl.setText("C-SCAN - "+Integer.toString(min));
						}
						else if(h==5){
							txtrMincyl.setText("C-LOOK - "+Integer.toString(min));
						}
					
					compare_chart compare = new compare_chart("COMPARISION AMONGST DISK SCHEDULING ALGORITHMS","COMPARISION",Array);
					compare.Compare_Chart("COMPARISION AMONGST DISK SCHEDULING ALGORITHMS","COMPARISION",Array);
					}
				});
				btnCompare_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
				btnCompare_2.setBounds(289, 686, 129, 41);
				panel_5.add(btnCompare_2);
				
				JLabel lblMincylinders = new JLabel("Minimum no Cylinders crossed for");
				lblMincylinders.setFont(new Font("Tw Cen MT", Font.PLAIN, 23));
				lblMincylinders.setBounds(169, 740, 324, 22);
				panel_5.add(lblMincylinders);
				
				JPanel panel_16 = new JPanel();
				panel_16.setBackground(new Color(220, 20, 60));
				panel_16.setBounds(0, 0, 10, 904);
				panel_5.add(panel_16);
				
				JPanel panel_17 = new JPanel();
				panel_17.setBackground(new Color(220, 20, 60));
				panel_17.setBounds(0, 894, 653, 10);
				panel_5.add(panel_17);
				
				JPanel panel_18 = new JPanel();
				panel_18.setBackground(new Color(220, 20, 60));
				panel_18.setBounds(643, 0, 10, 904);
				panel_5.add(panel_18);
				
				JPanel panel_19 = new JPanel();
				panel_19.setBackground(new Color(220, 20, 60));
				panel_19.setBounds(0, 0, 653, 10);
				panel_5.add(panel_19);
				
				JPanel panel_21 = new JPanel();
				panel_21.setBackground(new Color(0, 0, 0));
				panel_21.setBounds(12, 89, 596, 904);
				frame.getContentPane().add(panel_21);
				panel_21.setLayout(null);
				
				JPanel panel_20 = new JPanel();
				panel_20.setBackground(new Color(255, 255, 255));
				panel_20.setBounds(129, 56, 350, 350);
				panel_21.add(panel_20);
				panel_20.setLayout(null);
				
				JPanel panel_22 = new JPanel();
				panel_22.setBackground(new Color(255, 20, 147));
				panel_22.setBounds(10, 13, 326, 57);
				panel_20.add(panel_22);
				panel_22.setLayout(null);
				
				JLabel lblCpuScheduling = new JLabel("CPU Scheduling");
				lblCpuScheduling.setForeground(new Color(255, 250, 250));
				lblCpuScheduling.setBounds(71, 13, 180, 38);
				panel_22.add(lblCpuScheduling);
				lblCpuScheduling.setFont(new Font("Tahoma", Font.PLAIN, 26));
				
				JPanel panel_29 = new JPanel();
				panel_29.setBounds(0, 0, 350, 10);
				panel_29.setBackground(new Color(124, 252, 0));
				panel_20.add(panel_29);
				panel_29.setLayout(null);
				
				JPanel panel_31 = new JPanel();
				panel_31.setBounds(0, 340, 350, 10);
				panel_31.setBackground(new Color(124, 252, 0));
				panel_20.add(panel_31);
				panel_31.setLayout(null);
				
				JPanel panel_45 = new JPanel();
				panel_45.setBackground(new Color(30, 144, 255));
				panel_45.setBounds(84, 83, 150, 30);
				panel_20.add(panel_45);
				panel_45.setLayout(null);
				
				JLabel lblFifo = new JLabel("FCFS");
				lblFifo.setForeground(new Color(255, 255, 255));
				lblFifo.setBounds(53, 0, 43, 24);
				panel_45.add(lblFifo);
				lblFifo.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_46 = new JPanel();
				panel_46.setBounds(84, 126, 150, 30);
				panel_46.setBackground(new Color(30, 144, 255));
				panel_20.add(panel_46);
				panel_46.setLayout(null);
				
				JLabel lblSjf = new JLabel("SJF P");
				lblSjf.setForeground(new Color(255, 255, 255));
				lblSjf.setBounds(52, 0, 53, 24);
				panel_46.add(lblSjf);
				lblSjf.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_47 = new JPanel();
				panel_47.setForeground(new Color(128, 128, 128));
				panel_47.setBounds(84, 169, 150, 30);
				panel_47.setBackground(new Color(30, 144, 255));
				panel_20.add(panel_47);
				panel_47.setLayout(null);
				
				JLabel lblSjfNonpreemptive = new JLabel("SJF NP");
				lblSjfNonpreemptive.setForeground(new Color(255, 255, 255));
				lblSjfNonpreemptive.setBounds(48, 0, 67, 24);
				panel_47.add(lblSjfNonpreemptive);
				lblSjfNonpreemptive.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_48 = new JPanel();
				panel_48.setForeground(new Color(255, 255, 255));
				panel_48.setBounds(84, 212, 150, 30);
				panel_48.setBackground(new Color(30, 144, 255));
				panel_20.add(panel_48);
				panel_48.setLayout(null);
				
				JLabel lblRoundRobin = new JLabel("ROUND ROBIN");
				lblRoundRobin.setForeground(new Color(255, 255, 255));
				lblRoundRobin.setBounds(12, 5, 134, 16);
				panel_48.add(lblRoundRobin);
				lblRoundRobin.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_49 = new JPanel();
				panel_49.setBounds(84, 255, 150, 30);
				panel_49.setBackground(new Color(30, 144, 255));
				panel_20.add(panel_49);
				panel_49.setLayout(null);
				
				JLabel lblPriorityNonpreemptive = new JLabel("PRIORITY NP");
				lblPriorityNonpreemptive.setForeground(new Color(255, 255, 255));
				lblPriorityNonpreemptive.setBounds(14, 5, 117, 16);
				panel_49.add(lblPriorityNonpreemptive);
				lblPriorityNonpreemptive.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_50 = new JPanel();
				panel_50.setBounds(84, 295, 150, 30);
				panel_50.setBackground(new Color(30, 144, 255));
				panel_20.add(panel_50);
				panel_50.setLayout(null);
				
				JLabel lblPriorityPreemptive = new JLabel("PRIORITY P");
				lblPriorityPreemptive.setForeground(new Color(255, 255, 255));
				lblPriorityPreemptive.setBounds(30, 5, 106, 16);
				panel_50.add(lblPriorityPreemptive);
				lblPriorityPreemptive.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_23 = new JPanel();
				panel_23.setBackground(new Color(255, 255, 255));
				panel_23.setBounds(129, 521, 350, 350);
				panel_21.add(panel_23);
				panel_23.setLayout(null);
				
				JPanel panel_24 = new JPanel();
				panel_24.setBackground(new Color(255, 0, 0));
				panel_24.setBounds(10, 13, 328, 57);
				panel_23.add(panel_24);
				panel_24.setLayout(null);
				
				JLabel lblDiningPhilosophers = new JLabel("DINING PHILOSOPHERS");
				lblDiningPhilosophers.setForeground(new Color(255, 255, 255));
				lblDiningPhilosophers.setFont(new Font("Tahoma", Font.PLAIN, 19));
				lblDiningPhilosophers.setBounds(67, 13, 230, 31);
				panel_24.add(lblDiningPhilosophers);
				
				JLabel lblDiningTable = new JLabel("DINING TABLE");
				lblDiningTable.setIcon(new ImageIcon("F:\\Downloads\\adi.jpg"));
				lblDiningTable.setBounds(55, 112, 244, 167);
				panel_23.add(lblDiningTable);
				
				JPanel panel_36 = new JPanel();
				panel_36.setBackground(new Color(65, 105, 225));
				panel_36.setBounds(0, 340, 350, 10);
				panel_23.add(panel_36);
				
				JPanel panel_33 = new JPanel();
				panel_33.setBackground(new Color(65, 105, 225));
				panel_33.setBounds(0, 0, 350, 10);
				panel_23.add(panel_33);
				panel_33.setLayout(null);
				
				JPanel panel_30 = new JPanel();
				panel_30.setBackground(new Color(0, 0, 0));
				panel_30.setBounds(1286, 89, 616, 904);
				frame.getContentPane().add(panel_30);
				panel_30.setLayout(null);
				
				JPanel panel_25 = new JPanel();
				panel_25.setBounds(150, 78, 350, 350);
				panel_25.setBackground(new Color(255, 255, 255));
				panel_30.add(panel_25);
				panel_25.setLayout(null);
				
				JPanel panel_26 = new JPanel();
				panel_26.setBackground(new Color(255, 69, 0));
				panel_26.setBounds(12, 13, 326, 57);
				panel_25.add(panel_26);
				panel_26.setLayout(null);
				
				JLabel lblPageReplacement = new JLabel("PAGE REPLACEMENT");
				lblPageReplacement.setForeground(new Color(255, 255, 255));
				lblPageReplacement.setFont(new Font("Tahoma", Font.PLAIN, 19));
				lblPageReplacement.setBounds(72, 13, 196, 31);
				panel_26.add(lblPageReplacement);
				
				JPanel panel_38 = new JPanel();
				panel_38.setBackground(new Color(255, 20, 147));
				panel_38.setBounds(0, 0, 350, 10);
				panel_25.add(panel_38);
				panel_38.setLayout(null);
				
				JPanel panel_40 = new JPanel();
				panel_40.setBackground(new Color(255, 20, 147));
				panel_40.setBounds(0, 340, 350, 10);
				panel_25.add(panel_40);
				panel_40.setLayout(null);
				
				JPanel panel_51 = new JPanel();
				panel_51.setBackground(new Color(221, 160, 221));
				panel_51.setBounds(80, 251, 175, 43);
				panel_25.add(panel_51);
				panel_51.setLayout(null);
				
				JLabel lblSecondChance = new JLabel("SECOND CHANCE");
				lblSecondChance.setForeground(new Color(255, 255, 255));
				lblSecondChance.setBounds(12, 13, 150, 17);
				panel_51.add(lblSecondChance);
				lblSecondChance.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_52 = new JPanel();
				panel_52.setBackground(new Color(221, 160, 221));
				panel_52.setBounds(80, 195, 175, 43);
				panel_25.add(panel_52);
				panel_52.setLayout(null);
				
				JLabel lblLru = new JLabel("LRU");
				lblLru.setForeground(new Color(255, 250, 250));
				lblLru.setBounds(68, 13, 56, 17);
				panel_52.add(lblLru);
				lblLru.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_53 = new JPanel();
				panel_53.setBackground(new Color(221, 160, 221));
				panel_53.setForeground(new Color(221, 160, 221));
				panel_53.setBounds(80, 139, 175, 43);
				panel_25.add(panel_53);
				panel_53.setLayout(null);
				
				JLabel lblOptimal = new JLabel("OPTIMAL");
				lblOptimal.setForeground(new Color(255, 255, 255));
				lblOptimal.setBounds(40, 13, 86, 17);
				panel_53.add(lblOptimal);
				lblOptimal.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_54 = new JPanel();
				panel_54.setBackground(new Color(221, 160, 221));
				panel_54.setBounds(80, 83, 175, 43);
				panel_25.add(panel_54);
				panel_54.setLayout(null);
				
				JLabel lblFifo_1 = new JLabel("FIFO");
				lblFifo_1.setForeground(new Color(255, 255, 255));
				lblFifo_1.setBounds(62, 13, 56, 23);
				panel_54.add(lblFifo_1);
				lblFifo_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_27 = new JPanel();
				panel_27.setBackground(new Color(255, 255, 255));
				panel_27.setBounds(150, 515, 350, 350);
				panel_30.add(panel_27);
				panel_27.setLayout(null);
				
				JPanel panel_28 = new JPanel();
				panel_28.setBackground(new Color(30, 144, 255));
				panel_28.setBounds(10, 13, 326, 57);
				panel_27.add(panel_28);
				panel_28.setLayout(null);
				
				JLabel lblDiskScheduling = new JLabel("DISK SCHEDULING");
				lblDiskScheduling.setForeground(new Color(255, 255, 255));
				lblDiskScheduling.setFont(new Font("Tahoma", Font.PLAIN, 19));
				lblDiskScheduling.setBounds(68, 13, 181, 31);
				panel_28.add(lblDiskScheduling);
				
				JPanel panel_44 = new JPanel();
				panel_44.setBounds(0, 340, 350, 10);
				panel_44.setBackground(new Color(255, 215, 0));
				panel_27.add(panel_44);
				panel_44.setLayout(null);
				
				JPanel panel_55 = new JPanel();
				panel_55.setBackground(new Color(255, 105, 180));
				panel_55.setBounds(82, 184, 171, 39);
				panel_27.add(panel_55);
				panel_55.setLayout(null);
				
				JLabel lblScan = new JLabel("SCAN");
				lblScan.setForeground(new Color(255, 255, 255));
				lblScan.setBounds(59, 13, 56, 16);
				panel_55.add(lblScan);
				lblScan.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_56 = new JPanel();
				panel_56.setBackground(new Color(255, 105, 180));
				panel_56.setBounds(82, 135, 168, 39);
				panel_27.add(panel_56);
				panel_56.setLayout(null);
				
				JLabel lblSstf = new JLabel("SSTF");
				lblSstf.setForeground(new Color(255, 255, 255));
				lblSstf.setBounds(57, 13, 56, 16);
				panel_56.add(lblSstf);
				lblSstf.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_57 = new JPanel();
				panel_57.setBackground(new Color(255, 105, 180));
				panel_57.setBounds(82, 83, 168, 43);
				panel_27.add(panel_57);
				panel_57.setLayout(null);
				
				JLabel lblFifo_2 = new JLabel("FIFO");
				lblFifo_2.setForeground(new Color(255, 255, 255));
				lblFifo_2.setBounds(58, 13, 44, 16);
				panel_57.add(lblFifo_2);
				lblFifo_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_58 = new JPanel();
				panel_58.setBackground(new Color(255, 105, 180));
				panel_58.setBounds(82, 236, 171, 39);
				panel_27.add(panel_58);
				panel_58.setLayout(null);
				
				JLabel lblCscan = new JLabel("C-SCAN");
				lblCscan.setForeground(new Color(255, 255, 255));
				lblCscan.setBounds(49, 13, 71, 16);
				panel_58.add(lblCscan);
				lblCscan.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_59 = new JPanel();
				panel_59.setBackground(new Color(255, 105, 180));
				panel_59.setBounds(82, 288, 171, 39);
				panel_27.add(panel_59);
				panel_59.setLayout(null);
				
				JLabel lblClook = new JLabel("C-LOOK");
				lblClook.setForeground(new Color(255, 255, 255));
				lblClook.setBounds(50, 13, 71, 16);
				panel_59.add(lblClook);
				lblClook.setFont(new Font("Tahoma", Font.PLAIN, 19));
				
				JPanel panel_32 = new JPanel();
				panel_32.setBackground(new Color(255, 215, 0));
				panel_32.setBounds(0, 0, 350, 10);
				panel_27.add(panel_32);
				panel_32.setLayout(null);
				panel_2.setVisible(false);
				
				
				
				
				
				
				
				
                
				btnPriorityp.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						float k;
						int n=(Integer)spinner.getValue();
						String C,t;
						C = "RR";
						Random abhi = new Random();
						k = onclick.execute(n, C,Arr_time,Burst_time,Priority,Time_quantum);
						int i;
						int r=2,c=2;
						//table_1 = new JTable(r,c);
						table_2.setModel(new DefaultTableModel(
							new Object[][] {
							},
							new String[] {
								
							}
						));
					//	table.getColumnModel().getColumn(0).setPreferredWidth(15);
						for(i=0;i<2;i++)
						{
							((DefaultTableModel)table_2.getModel()).addColumn(A);
						}
						for(i=0;i<2;i++)
						{
							table_2.getColumnModel().getColumn(i).setPreferredWidth(190);
						}
					//	table.getColumnModel().getColumn(c).setMinWidth(17);
						for (int l=0;l<2;l++){
							Object [] D=new Object[2];
							//for (int j=0;j<2;j++){
								if(l==0){
									D[0] = "TYPE";
									D[1] = "AVERAGE WAITING TIME";
								}
								if(l==1){
									D[0] = "ROUND ROBIN";
									D[1] = k;
								}
							//}
							((DefaultTableModel)table_2.getModel()).addRow(D);
						}
						panel_1.add(table_2);
						txtQuantum.setText(Integer.toString(Time_quantum));
					}
				});
				btnFcfs.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
//				panel_1.setBackground(Color.PINK);
						float k;
						int n=(Integer)spinner.getValue();
						String C,t;
						C = "FCFS";
						Random abhi = new Random();
						k = onclick.execute(n, C,Arr_time,Burst_time,Priority,Time_quantum);
						int i;
						int r=2,c=2;
						//table_1 = new JTable(r,c);
						table_2.setModel(new DefaultTableModel(
							new Object[][] {
							},
							new String[] {
								
							}
						));
					//	table.getColumnModel().getColumn(0).setPreferredWidth(15);
						for(i=0;i<2;i++)
						{
							((DefaultTableModel)table_2.getModel()).addColumn(A);
						}
						for(i=0;i<2;i++)
						{
							table_2.getColumnModel().getColumn(i).setPreferredWidth(190);
						}
					//	table.getColumnModel().getColumn(c).setMinWidth(17);
						for (int l=0;l<2;l++){
							Object [] D=new Object[2];
							//for (int j=0;j<2;j++){
								if(l==0){
									D[0] = "TYPE";
									D[1] = "AVERAGE WAITING TIME";
								}
								if(l==1){
									D[0] = "FCFS";
									D[1] = k;
								}
							//}
							((DefaultTableModel)table_2.getModel()).addRow(D);
						}
						panel_1.add(table_2);
					}
				});
				btnPriorityp_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						float k;
						int n=(Integer)spinner.getValue();
						String C,t;
						C = "PP";
						Random abhi = new Random();
						k = onclick.execute(n, C,Arr_time,Burst_time,Priority,Time_quantum);
						int i;
						int r=2,c=2;
						//table_1 = new JTable(r,c);
						table_2.setModel(new DefaultTableModel(
							new Object[][] {
							},
							new String[] {
								
							}
						));
					//	table.getColumnModel().getColumn(0).setPreferredWidth(15);
						for(i=0;i<2;i++)
						{
							((DefaultTableModel)table_2.getModel()).addColumn(A);
						}
						for(i=0;i<2;i++)
						{
							table_2.getColumnModel().getColumn(i).setPreferredWidth(190);
						}
					//	table.getColumnModel().getColumn(c).setMinWidth(17);
						for (int l=0;l<2;l++){
							Object [] D=new Object[2];
							//for (int j=0;j<2;j++){
								if(l==0){
									D[0] = "TYPE";
									D[1] = "AVERAGE WAITING TIME";
								}
								if(l==1){
									D[0] = "PRIORITY PREEMPTIVE";
									D[1] = k;
								}
							//}
							((DefaultTableModel)table_2.getModel()).addRow(D);
						}
						panel_1.add(table_2);
					}
				});
				btnSjf.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						float k;
						int n=(Integer)spinner.getValue();
						String C,t;
						C = "SJFP";
						Random abhi = new Random();
						k = onclick.execute(n, C,Arr_time,Burst_time,Priority,Time_quantum);
						int i;
						int r=2,c=2;
						//table_1 = new JTable(r,c);
						table_2.setModel(new DefaultTableModel(
							new Object[][] {
							},
							new String[] {
								
							}
						));
					//	table.getColumnModel().getColumn(0).setPreferredWidth(15);
						for(i=0;i<2;i++)
						{
							((DefaultTableModel)table_2.getModel()).addColumn(A);
						}
						for(i=0;i<2;i++)
						{
							table_2.getColumnModel().getColumn(i).setPreferredWidth(190);
						}
					//	table.getColumnModel().getColumn(c).setMinWidth(17);
						for (int l=0;l<2;l++){
							Object [] D=new Object[2];
							//for (int j=0;j<2;j++){
								if(l==0){
									D[0] = "TYPE";
									D[1] = "AVERAGE WAITING TIME";
								}
								if(l==1){
									D[0] = "SJF PREEMPTIVE";
									D[1] = k;
								}
							//}
							((DefaultTableModel)table_2.getModel()).addRow(D);
						}
						panel_1.add(table_2);
					}
				});
				btnPrioritynp.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						float k;
						int n=(Integer)spinner.getValue();
						String C,t;
						C = "PNP";
						Random abhi = new Random();
						k = onclick.execute(n, C,Arr_time,Burst_time,Priority,Time_quantum);
						int i;
						int r=2,c=2;
						//table_1 = new JTable(r,c);
						table_2.setModel(new DefaultTableModel(
							new Object[][] {
							},
							new String[] {
								
							}
						));
					//	table.getColumnModel().getColumn(0).setPreferredWidth(15);
						for(i=0;i<2;i++)
						{
							((DefaultTableModel)table_2.getModel()).addColumn(A);
						}
						for(i=0;i<2;i++)
						{
							table_2.getColumnModel().getColumn(i).setPreferredWidth(190);
						}
					//	table.getColumnModel().getColumn(c).setMinWidth(17);
						for (int l=0;l<2;l++){
							Object [] D=new Object[2];
							//for (int j=0;j<2;j++){
								if(l==0){
									D[0] = "TYPE";
									D[1] = "AVERAGE WAITING TIME";
								}
								if(l==1){
									D[0] = "PRIORITY NON-PREEMPTIVE";
									D[1] = k;
								}
							//}
							((DefaultTableModel)table_2.getModel()).addRow(D);
						}
						panel_1.add(table_2);
					}
				});
				btnSjfnp.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						float k;
						int n=(Integer)spinner.getValue();
						String C,t;
						C = "SJFNP";
						Random abhi = new Random();
						k = onclick.execute(n, C,Arr_time,Burst_time,Priority,Time_quantum);
						int i;
						int r=2,c=2;
						//table_1 = new JTable(r,c);
						table_2.setModel(new DefaultTableModel(
							new Object[][] {
							},
							new String[] {
								
							}
						));
					//	table.getColumnModel().getColumn(0).setPreferredWidth(15);
						for(i=0;i<2;i++)
						{
							((DefaultTableModel)table_2.getModel()).addColumn(A);
						}
						for(i=0;i<2;i++)
						{
							table_2.getColumnModel().getColumn(i).setPreferredWidth(190);
						}
					//	table.getColumnModel().getColumn(c).setMinWidth(17);
						for (int l=0;l<2;l++){
							Object [] D=new Object[2];
							//for (int j=0;j<2;j++){
								if(l==0){
									D[0] = "TYPE";
									D[1] = "AVERAGE WAITING TIME";
								}
								if(l==1){
									D[0] = "SJF NON-PREEMPTIVE";
									D[1] = k;
								}
							//}
							((DefaultTableModel)table_2.getModel()).addRow(D);
						}
						panel_1.add(table_2);
					}
				});
				btnCompare.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						float k;
						int n=(Integer)spinner.getValue();
						String C,t;
						float[] A=new float[1000];
						String[] B=new String[1000];
						onclick OnClick = new onclick();
						Random abhi = new Random();
						String S = OnClick.compare(A,B,n,Arr_time,Burst_time,Priority,Time_quantum);
						int i;
						int r=7,c=2;
						//table_1 = new JTable(r,c);
						table_2.setModel(new DefaultTableModel(
							new Object[][] {
							},
							new String[] {
							}
						));
					//	table.getColumnModel().getColumn(0).setPreferredWidth(15);
						for(i=0;i<2;i++)
						{
							((DefaultTableModel)table_2.getModel()).addColumn(A);
						}
						for(i=0;i<2;i++)
						{
							table_2.getColumnModel().getColumn(i).setPreferredWidth(190);
						}
					//	table.getColumnModel().getColumn(c).setMinWidth(17);
						for (int l=0;l<7;l++){
							Object [] D=new Object[2];
							//for (int j=0;j<2;j++){
								if(l==0){
									D[0] = "TYPE";
									D[1] = "AVERAGE WAITING TIME";
								}
								if(l==1){
									D[0] = "FCFS";
									D[1] = A[0];
								}
								if(l==2){
									D[0] = "SJF PREEMPTIVE";
									D[1] = A[1];
								}
								if(l==3){
									D[0] = "SJF NON-PREEMPTIVE";
									D[1] = A[2];
								}
								if(l==4){
									D[0] = "ROUND ROBIN";
									D[1] = A[3];
								}
								if(l==5){
									D[0] = "PRIORITY PREEMPTIVE";
									D[1] = A[4];
								}
								if(l==6){
									D[0] = "PRIORITY NON-PREEMPTIVE";
									D[1] = A[5];
								}
							//}
							((DefaultTableModel)table_2.getModel()).addRow(D);
						}
						panel_1.add(table_2);
						compare_sa compare = new compare_sa("COMPARISION AMONGST CPU SCHEDULING ALGORITHMS","COMPARISION",A);
						compare.Compare_Chart("COMPARISION AMONGST CPU SCHEDULING ALGORITHMS","COMPARISION",A);
	/*			JLabel lblMinimum = new JLabel("Minimum Waiting Time is for "+ S);
						lblMinimum.setBounds(902, 969, 56, 16);
						frame.getContentPane().add(lblMinimum);
						lblMinimum.setVisible(true);*/
						lblMinimum.setText("Minimum Waiting Time is for "+ S);
					}
				});
		
		
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHome.setBackground(new Color(255, 255, 255));
		btnHome.setIcon(new ImageIcon("F:\\Downloads\\home_1.jpg"));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSimulator.setVisible(true);
				lblSimulator.setText("Simulator");
				lblSimulator_1.setVisible(true);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_5.setVisible(false);
				panel_7.setVisible(false);
			}
		});
		menuBar.add(btnHome);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		mnFile.setIcon(new ImageIcon("F:\\Downloads\\file_1.jpg"));
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		mntmNew.setIcon(new ImageIcon("F:\\Downloads\\new_plus.png"));
		mnFile.add(mntmNew);
		mntmNew.addActionListener(new New_Window());
		
		JMenu mnAlgorithms = new JMenu("Algorithms");
		mnAlgorithms.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		mnAlgorithms.setIcon(new ImageIcon("F:\\Downloads\\algo_1.png"));
		menuBar.add(mnAlgorithms);
		
		JMenuItem mntmCpuScheduling = new JMenuItem("CPU Scheduling");
		mntmCpuScheduling.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		mntmCpuScheduling.setIcon(new ImageIcon("F:\\Downloads\\cpu.png"));
		mnAlgorithms.add(mntmCpuScheduling);
		
		
		JMenuItem mntmPageReplacement = new JMenuItem("Page Replacement");
		mntmPageReplacement.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		mntmPageReplacement.setIcon(new ImageIcon("F:\\Downloads\\ram.jpg"));
		mnAlgorithms.add(mntmPageReplacement);
		
		JMenuItem mntmDiningPhilosophers = new JMenuItem("Dining Philosophers");
		mntmDiningPhilosophers.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		mntmDiningPhilosophers.setIcon(new ImageIcon("F:\\Downloads\\spoon_icon.jpg"));
		mnAlgorithms.add(mntmDiningPhilosophers);
		
		JMenuItem mntmDiskScheduling = new JMenuItem("Disk Scheduling");
		mntmDiskScheduling.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		mntmDiskScheduling.setIcon(new ImageIcon("F:\\Downloads\\disk_1.jpg"));
		mnAlgorithms.add(mntmDiskScheduling);
		
		JPanel panel_6 = new JPanel();
		menuBar.add(panel_6);
		panel_6.setLayout(null);
		
		lblClock = new JLabel("Clock");
		lblClock.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblClock.setIcon(new ImageIcon("F:\\Downloads\\clk.jpg"));
		lblClock.setBackground(new Color(0, 204, 204));
		lblClock.setForeground(new Color(51, 102, 153));
		lblClock.setBounds(1294, 0, 289, 38);
		panel_6.add(lblClock);
		
		clock();
		
		class CPU implements ActionListener {
		      public void actionPerformed(ActionEvent e) {            
				  lblSimulator.setText("");
				  lblSimulator_1.setText("");
		    	  panel_3.setVisible(false);
		    	  panel_2.setVisible(true);
		    	  panel_5.setVisible(false);
		    	  panel_7.setVisible(true);
		    	  lblHeading.setText("CPU SCHEDULING");
		    	//page
		    	  panel_11.setVisible(false);
		    	  panel_8.setVisible(false);
		    	  panel_9.setVisible(false);
		    	  panel_10.setVisible(false);
		    	  panel_4.setVisible(false);
		    	  btnPfrefresh.setVisible(false);
		    	  lblNumberOfFrames.setVisible(false);
		    	  lblNumberOfPages.setVisible(false);
		    	  spinner_1.setVisible(false);
		    	  spinner_2.setVisible(false);
		    	  lblInputString.setVisible(false);
		    	  txtInputpages.setVisible(false);
		    	  btnFifo.setVisible(false);
		    	  btnOptimal.setVisible(false);
		    	  btnLru.setVisible(false);
		    	  btnSecondChance.setVisible(false);
		    	  btnCompare_1.setVisible(false);
		    	  lblMinimumNoOf.setVisible(false);
		    	  txtFifo.setVisible(false);
		    	  txtLru.setVisible(false);
		    	  txtOptimal.setVisible(false);
		    	  txtSecond.setVisible(false);
		    	  btnBeladysAnomaly.setVisible(false);
		    	  //Cpu
		    	  panel_12.setVisible(true);
		    	  panel_13.setVisible(true);
		    	  panel_14.setVisible(true);
		    	  panel_15.setVisible(true);
		    	  lblEnterTheNo.setVisible(true);
		    	  lblQuantumTime.setVisible(true);
		    	  spinner.setVisible(true);
		    	  txtQuantum.setVisible(true);
		    	  btnSarefresh.setVisible(true);
		    	  panel.setVisible(true);
		    	  btnFcfs.setVisible(true);
		    	  btnSjf.setVisible(true);
		    	  btnSjfnp.setVisible(true);
		    	  btnPriorityp.setVisible(true);
		    	  btnPriorityp_1.setVisible(true);
		    	  btnPrioritynp.setVisible(true);
		    	  btnCompare.setVisible(true);
		    	  panel_1.setVisible(true);
//		    	  lblMinimumNoOf.setVisible(true);
		    	  lblMinimum.setVisible(true);
		    	  //Disk
		    	  panel_16.setVisible(false);
		    	  panel_17.setVisible(false);
		    	  panel_18.setVisible(false);
		    	  panel_19.setVisible(false);
		    	  lblStartingDisk.setVisible(false);
		    	  spinner_3.setVisible(false);
		    	  txtrCylinders.setVisible(false);
		    	  lblNoOfCylinders.setVisible(false);
		    	  txtrDinputstring.setVisible(false);
		    	  lblHeadAtDisk.setVisible(false);
		    	  txtrHead.setVisible(false);
		    	  txtrMincyl.setVisible(false);
		    	  btnDsrefresh.setVisible(false);
		    	  btnDfcfs.setVisible(false);
		    	  btnSstf.setVisible(false);
		    	  btnScan.setVisible(false);
		    	  btnCscan.setVisible(false);
		    	  btnClook.setVisible(false);
		    	  lblInputDisksTo.setVisible(false);
		    	  btnCompare_2.setVisible(false);
		    	  lblMincylinders.setVisible(false);
		    	  
		      }    
		   }
		CPU Cpu = new CPU();
		mntmCpuScheduling.addActionListener(Cpu);
		
		class PAGE implements ActionListener {
		      public void actionPerformed(ActionEvent e) {            
		    	  lblSimulator.setText("");
		    	  lblSimulator_1.setText("");
		    	  panel_3.setVisible(true);
		    	  panel_2.setVisible(true);
		    	  panel_5.setVisible(false);
		    	  panel_7.setVisible(true);
		    	  lblHeading.setText("PAGE REPLACEMENT");
		    	  //page
		    	  panel_11.setVisible(true);
		    	  panel_8.setVisible(true);
		    	  panel_9.setVisible(true);
		    	  panel_10.setVisible(true);
		    	  panel_4.setVisible(true);
		    	  btnPfrefresh.setVisible(true);
		    	  lblNumberOfFrames.setVisible(true);
		    	  lblNumberOfPages.setVisible(true);
		    	  spinner_1.setVisible(true);
		    	  spinner_2.setVisible(true);
		    	  lblInputString.setVisible(true);
		    	  txtInputpages.setVisible(true);
		    	  btnFifo.setVisible(true);
		    	  btnOptimal.setVisible(true);
		    	  btnLru.setVisible(true);
		    	  btnSecondChance.setVisible(true);
		    	  btnCompare_1.setVisible(true);
		    	  lblMinimumNoOf.setVisible(true);
		    	  txtFifo.setVisible(true);
		    	  txtLru.setVisible(true);
		    	  txtOptimal.setVisible(true);
		    	  txtSecond.setVisible(true);
		    	  btnBeladysAnomaly.setVisible(true);
		    	//Cpu
		    	  panel_12.setVisible(false);
		    	  panel_13.setVisible(false);
		    	  panel_14.setVisible(false);
		    	  panel_15.setVisible(false);
		    	  lblEnterTheNo.setVisible(false);
		    	  lblQuantumTime.setVisible(false);
		    	  spinner.setVisible(false);
		    	  txtQuantum.setVisible(false);
		    	  btnSarefresh.setVisible(false);
		    	  panel.setVisible(false);
		    	  btnFcfs.setVisible(false);
		    	  btnSjf.setVisible(false);
		    	  btnSjfnp.setVisible(false);
		    	  btnPriorityp.setVisible(false);
		    	  btnPriorityp_1.setVisible(false);
		    	  btnPrioritynp.setVisible(false);
		    	  btnCompare.setVisible(false);
		    	  panel_1.setVisible(false);
//		    	  lblMinimumNoOf.setVisible(false);
		    	  lblMinimum.setVisible(false);
		    	  //Disk
		    	  panel_16.setVisible(false);
		    	  panel_17.setVisible(false);
		    	  panel_18.setVisible(false);
		    	  panel_19.setVisible(false);
		    	  lblStartingDisk.setVisible(false);
		    	  spinner_3.setVisible(false);
		    	  txtrCylinders.setVisible(false);
		    	  lblNoOfCylinders.setVisible(false);
		    	  txtrDinputstring.setVisible(false);
		    	  lblHeadAtDisk.setVisible(false);
		    	  txtrHead.setVisible(false);
		    	  txtrMincyl.setVisible(false);
		    	  btnDsrefresh.setVisible(false);
		    	  btnDfcfs.setVisible(false);
		    	  btnSstf.setVisible(false);
		    	  btnScan.setVisible(false);
		    	  btnCscan.setVisible(false);
		    	  btnClook.setVisible(false);
		    	  lblInputDisksTo.setVisible(false);
		    	  btnCompare_2.setVisible(false);
		    	  lblMincylinders.setVisible(false);

			      }    
		   }
		PAGE Page = new PAGE();
		mntmPageReplacement.addActionListener(Page);
		
		class DISK implements ActionListener {
		      public void actionPerformed(ActionEvent e) {            
		    	  lblSimulator.setText("");
		    	  lblSimulator_1.setText("");
		    	  panel_3.setVisible(true);
		    	  panel_2.setVisible(true);
		    	  panel_5.setVisible(true);
		    	  panel_7.setVisible(true);
		    	  lblHeading.setText("DISK SCHEDULING");
		    	  //pages
		    	  panel_11.setVisible(false);
		    	  panel_8.setVisible(false);
		    	  panel_9.setVisible(false);
		    	  panel_10.setVisible(false);
		    	  panel_4.setVisible(false);
		    	  btnPfrefresh.setVisible(false);
		    	  lblNumberOfFrames.setVisible(false);
		    	  lblNumberOfPages.setVisible(false);
		    	  spinner_1.setVisible(false);
		    	  spinner_2.setVisible(false);
		    	  lblInputString.setVisible(false);
		    	  txtInputpages.setVisible(false);
		    	  btnFifo.setVisible(false);
		    	  btnOptimal.setVisible(false);
		    	  btnLru.setVisible(false);
		    	  btnSecondChance.setVisible(false);
		    	  btnCompare_1.setVisible(false);
		    	  lblMinimumNoOf.setVisible(false);
		    	  txtFifo.setVisible(false);
		    	  txtLru.setVisible(false);
		    	  txtOptimal.setVisible(false);
		    	  txtSecond.setVisible(false);
		    	  btnBeladysAnomaly.setVisible(false);
		    	//Cpu
		    	  panel_12.setVisible(false);
		    	  panel_13.setVisible(false);
		    	  panel_14.setVisible(false);
		    	  panel_15.setVisible(false);
		    	  lblEnterTheNo.setVisible(false);
		    	  lblQuantumTime.setVisible(false);
		    	  spinner.setVisible(false);
		    	  txtQuantum.setVisible(false);
		    	  btnSarefresh.setVisible(false);
		    	  panel.setVisible(false);
		    	  btnFcfs.setVisible(false);
		    	  btnSjf.setVisible(false);
		    	  btnSjfnp.setVisible(false);
		    	  btnPriorityp.setVisible(false);
		    	  btnPriorityp_1.setVisible(false);
		    	  btnPrioritynp.setVisible(false);
		    	  btnCompare.setVisible(false);
		    	  panel_1.setVisible(false);
		    	  lblMinimumNoOf.setVisible(false);
		    	  lblMinimum.setVisible(false);
		    	//Disk
		    	  panel_16.setVisible(true);
		    	  panel_17.setVisible(true);
		    	  panel_18.setVisible(true);
		    	  panel_19.setVisible(true);
		    	  lblStartingDisk.setVisible(true);
		    	  spinner_3.setVisible(true);
		    	  txtrCylinders.setVisible(true);
		    	  lblNoOfCylinders.setVisible(true);
		    	  txtrDinputstring.setVisible(true);
		    	  lblHeadAtDisk.setVisible(true);
		    	  txtrHead.setVisible(true);
		    	  txtrMincyl.setVisible(true);
		    	  btnDsrefresh.setVisible(true);
		    	  btnDfcfs.setVisible(true);
		    	  btnSstf.setVisible(true);
		    	  btnScan.setVisible(true);
		    	  btnCscan.setVisible(true);
		    	  btnClook.setVisible(true);
		    	  lblInputDisksTo.setVisible(true);
		    	  btnCompare_2.setVisible(true);
		    	  lblMincylinders.setVisible(true);

		      }
		   }
		DISK Disk = new DISK();
		mntmDiskScheduling.addActionListener(Disk);
		
		class DINING implements ActionListener {
		      public void actionPerformed(ActionEvent e) {            
		    	  lblSimulator.setText("Simulator");
		    	  panel_3.setVisible(false);
		    	  panel_2.setVisible(false);
		    	  panel_5.setVisible(false);
		    	  panel_7.setVisible(true);
		    	  lblHeading.setText("DINING PHILOSOPHERS");
		    	  DP_GUI dining = new DP_GUI();
		    	  dining.Dining();
		      }    
		   }
		DINING Dining = new DINING();
		mntmDiningPhilosophers.addActionListener(Dining);		
	}
	public void clock(){
		Thread clock = new Thread(){
			public void run(){
				try {
					while(true){
					Calendar cal = new GregorianCalendar();
					int day = cal.get(Calendar.DAY_OF_MONTH);
					int month = cal.get(Calendar.MONTH);
					int year = cal.get(Calendar.YEAR);

					int sec = cal.get(Calendar.SECOND);
					int min = cal.get(Calendar.MINUTE);
					int hour = cal.get(Calendar.HOUR);

					lblClock.setText("Time "+hour+":"+min+":"+sec+"  "+" Date "+day+"/"+month+"/"+year);
					sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		clock.start();
	}
}
