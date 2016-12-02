
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class my_pf_gui extends JFrame {

	private JPanel contentPane;
	private JTextField txtInframes;
	private JTextField txtInpages;
	private JTextField txtOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					my_pf_gui frame = new my_pf_gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public my_pf_gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1980, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setBounds(50, 50, 1260, 650);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(250, 235, 215));
		panel.setBounds(45, 436, 1173, 171);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JButton btnFifo = new JButton("FIFO");
		btnFifo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Random random = new Random();
				String n1 = txtInpages.getText();
				int n,Frames,k;
				n = Integer.parseInt(n1);
				String Frames1 = txtInframes.getText();
				Frames = Integer.parseInt(Frames1);
				int Pages[]    = new int[21];
				int PageFault[]    = new int[21];
				int[][] Memory_Table = new int[10][];
				for(int i=1;i<=n;i++){
					Pages[i] = 1+random.nextInt(5);
				}
				FIFO fifo = new FIFO();
				k = fifo.fifo(n,Frames,Pages,Memory_Table,PageFault);
//				System.out.println(k);
				txtOutput.setText(Float.toString(k));
				
				
			}
		});
		btnFifo.setForeground(new Color(255, 255, 255));
		btnFifo.setBackground(new Color(210, 105, 30));
		btnFifo.setFont(new Font("Monotype Corsiva", Font.PLAIN, 12));
		btnFifo.setBounds(44, 35, 100, 23);
		panel.add(btnFifo);
		
		JButton btnOptimal = new JButton("Optimal");
		btnOptimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Random random = new Random();
				String n1 = txtInpages.getText();
				int n,Frames,k;
				n = Integer.parseInt(n1);
				String Frames1 = txtInframes.getText();
				Frames = Integer.parseInt(Frames1);
				int Pages[]    = new int[21];
				int PageFault[]    = new int[21];
				int[][] Memory_Table = new int[10][];
				for(int i=1;i<=n;i++){
					Pages[i] = 1+random.nextInt(5);
				}
				OPTIMAL optimal = new OPTIMAL();
				k = optimal.optimal(n,Frames,Pages,Memory_Table,PageFault);
//				System.out.println(k);
				txtOutput.setText(Float.toString(k));
				
			}
		});
		btnOptimal.setBackground(new Color(210, 105, 30));
		btnOptimal.setForeground(new Color(255, 255, 255));
		btnOptimal.setFont(new Font("Monotype Corsiva", Font.PLAIN, 12));
		btnOptimal.setBounds(44, 103, 100, 23);
		panel.add(btnOptimal);
		
		JButton btnLeastRecentlyUsed = new JButton("LRU");
		btnLeastRecentlyUsed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					Random random = new Random();
					String n1 = txtInpages.getText();
					int n,Frames,k;
					n = Integer.parseInt(n1);
					String Frames1 = txtInframes.getText();
					Frames = Integer.parseInt(Frames1);
					int Pages[]    = new int[21];
					int PageFault[]    = new int[21];
					int[][] Memory_Table = new int[10][];
					for(int i=1;i<=n;i++){
						Pages[i] = 1+random.nextInt(5);
					}
					LRU lru = new LRU();
					k = lru.lru(n,Frames,Pages,Memory_Table,PageFault);
//					System.out.println(k);
					txtOutput.setText(Float.toString(k));
				
			}
		});
		btnLeastRecentlyUsed.setForeground(new Color(255, 255, 255));
		btnLeastRecentlyUsed.setBackground(new Color(210, 105, 30));
		btnLeastRecentlyUsed.setFont(new Font("Monotype Corsiva", Font.PLAIN, 12));
		btnLeastRecentlyUsed.setBounds(44, 69, 100, 23);
		panel.add(btnLeastRecentlyUsed);
		
		JButton btnSecondChance = new JButton("Second Chance");
		btnSecondChance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Random random = new Random();
				String n1 = txtInpages.getText();
				int n,Frames,k;
				n = Integer.parseInt(n1);
				String Frames1 = txtInframes.getText();
				Frames = Integer.parseInt(Frames1);
				int Pages[]    = new int[21];
				int PageFault[]    = new int[21];
				int[][] Memory_Table = new int[10][];
				for(int i=1;i<=n;i++){
					Pages[i] = 1+random.nextInt(5);
				}
				SECOND_CHANCE second_chance= new SECOND_CHANCE();
				k = second_chance.second_chance(n,Frames,Pages,Memory_Table,PageFault);
//				System.out.println(k);
				txtOutput.setText(Float.toString(k));
				
			}
		});
		btnSecondChance.setBackground(new Color(210, 105, 30));
		btnSecondChance.setForeground(new Color(255, 255, 255));
		btnSecondChance.setBounds(42, 137, 102, 23);
		panel.add(btnSecondChance);
		btnSecondChance.setFont(new Font("Monotype Corsiva", Font.PLAIN, 12));
		
		JLabel lblIndividualProcesses = new JLabel("Individual Processes");
		lblIndividualProcesses.setFont(new Font("Lucida Handwriting", Font.PLAIN, 11));
		lblIndividualProcesses.setBounds(34, 10, 148, 14);
		panel.add(lblIndividualProcesses);
		
		JButton btnSecondChance_1 = new JButton("Belady's Anomaly");
		btnSecondChance_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtOutput.setText("abhi");
				Random random = new Random();
//				Scanner scan = new Scanner(System.in);
				String n1 = txtInpages.getText();
				int i,n,Frames,k;
				n = Integer.parseInt(n1);
				System.out.println(n);
				int Pages[]    = new int[21];
				int PageFault[]    = new int[21];
				int[][] Memory_Table = new int[10][];
				int[] Different_Frames = new int[10];
				for(i=1;i<=n;i++){
					Pages[i] = 1+random.nextInt(6);
				}
				FIFO fifo = new FIFO();
				for(i=1;i<=6;i++){
					Different_Frames[i] = fifo.fifo(n,i,Pages,Memory_Table,PageFault);
				}
				for(i=1;i<=6;i++){
					System.out.println(Different_Frames[i]);
				}
				Belady_graph belady = new Belady_graph("Belady's Analomy" ,
					      "FIFO illustrating Belady's Analomy");
				belady.Beladys("Belady's Analomy" ,
					      "FIFO illustrating Belady's Analomy");
				String Output="";
				for(i=1;i<=6;i++){
					Output = Output + Float.toString(Different_Frames[i]) + " ";
				}
//				System.out.println(k);
				txtOutput.setText(Output);
				
			}
		});
		btnSecondChance_1.setForeground(new Color(255, 255, 255));
		btnSecondChance_1.setBackground(new Color(210, 105, 30));
		btnSecondChance_1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		btnSecondChance_1.setBounds(1006, 35, 138, 35);
		panel.add(btnSecondChance_1);
		
		JLabel lblGraphs = new JLabel("Graph");
		lblGraphs.setFont(new Font("Lucida Handwriting", Font.PLAIN, 12));
		lblGraphs.setBounds(1046, 10, 57, 14);
		panel.add(lblGraphs);
		
		txtInframes = new JTextField();
		txtInframes.setBackground(new Color(152, 251, 152));
		txtInframes.setText("frames");
		txtInframes.setBounds(431, 35, 86, 20);
		panel.add(txtInframes);
		txtInframes.setColumns(10);
		
		JLabel lblNumberOfFrames = new JLabel("Number of Frames");
		lblNumberOfFrames.setFont(new Font("Lucida Handwriting", Font.PLAIN, 12));
		lblNumberOfFrames.setBounds(290, 38, 131, 14);
		panel.add(lblNumberOfFrames);
		
		JLabel lblNumberOfInput = new JLabel("Number of input Pages");
		lblNumberOfInput.setFont(new Font("Lucida Handwriting", Font.PLAIN, 12));
		lblNumberOfInput.setBounds(261, 112, 160, 14);
		panel.add(lblNumberOfInput);
		
		txtInpages = new JTextField();
		txtInpages.setBackground(new Color(152, 251, 152));
		txtInpages.setForeground(new Color(0, 0, 0));
		txtInpages.setText("pages");
		txtInpages.setBounds(431, 109, 86, 20);
		panel.add(txtInpages);
		txtInpages.setColumns(10);
		
		JButton btnCompare = new JButton("Compare ");
		btnCompare.setForeground(new Color(255, 255, 255));
		btnCompare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Random random = new Random();
				String n1 = txtInpages.getText();
				int n,Frames,f,l,o,s;
				n = Integer.parseInt(n1);
				String Frames1 = txtInframes.getText();
				Frames = Integer.parseInt(Frames1);
				int Pages[]    = new int[21];
				int PageFault[]    = new int[21];
				int[][] Memory_Table = new int[10][];
				for(int i=1;i<=n;i++){
					Pages[i] = 1+random.nextInt(5);
				}
				FIFO fifo = new FIFO();
				f = fifo.fifo(n,Frames,Pages,Memory_Table,PageFault);
				LRU lru = new LRU();
				l = lru.lru(n,Frames,Pages,Memory_Table,PageFault);
				OPTIMAL optimal = new OPTIMAL();
				o = optimal.optimal(n,Frames,Pages,Memory_Table,PageFault);
				SECOND_CHANCE second_chance= new SECOND_CHANCE();
				s = second_chance.second_chance(n,Frames,Pages,Memory_Table,PageFault);
//				System.out.println(k);
				txtOutput.setText("   "+Float.toString(f)+"     "+Float.toString(l)+"          "+Float.toString(o)+"           "+Float.toString(s));
			}
		});
		btnCompare.setBackground(new Color(46, 139, 87));
		btnCompare.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		btnCompare.setBounds(730, 130, 89, 35);
		panel.add(btnCompare);
		
		txtOutput = new JTextField();
		txtOutput.setText("Output");
		txtOutput.setBackground(new Color(240, 255, 240));
		txtOutput.setBounds(657, 69, 237, 44);
		panel.add(txtOutput);
		txtOutput.setColumns(10);
		
		JLabel lblFcfsLruOptimal = new JLabel("FCFS  LRU  OPTIMAL  SECOND Chance");
		lblFcfsLruOptimal.setForeground(new Color(85, 107, 47));
		lblFcfsLruOptimal.setFont(new Font("Palatino Linotype", Font.ITALIC, 13));
		lblFcfsLruOptimal.setBounds(657, 34, 237, 23);
		panel.add(lblFcfsLruOptimal);
		
		
		
		
		
	}
}
