
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class DS_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnter;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DS_GUI frame = new DS_GUI();
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
	public DS_GUI() {
		setBackground(new Color(154, 205, 50));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setForeground(new Color(205, 133, 63));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*txtEnter = new JTextField();
		txtEnter.setText("Enter");
		txtEnter.setBounds(41, 58, 86, 20);
		contentPane.add(txtEnter);
		txtEnter.setColumns(10);*/
		
		/*textField = new JTextField();
		textField.setBounds(38, 57, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);*/
		
		JTextArea txtrStart = new JTextArea();
		txtrStart.setText("");
		txtrStart.setBounds(318, 44, 44, 22);
		contentPane.add(txtrStart);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(137, 95, 276, 22);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(197, 151, 49, 22);
		contentPane.add(textArea_2);
		
		
		
		Random random = new Random();
		//String n1 = textField.getText();
		int i,n;
		int head;
		n=10;
		//n = Integer.parseInt(n1);
		int Pages[]    = new int[21];
		head = 1;
		String Input="";
		
		JButton btnRefresh = new JButton("");
		btnRefresh.setIcon(new ImageIcon("C:\\Users\\vagdevi\\Desktop\\ref\\r2.png"));
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(int i=1;i<=n;i++){
					Pages[i] = random.nextInt(200);
				}
				int head = random.nextInt(200);
				
				String Input="";
				String Cylinders="";
				for(int i=1;i<=n;i++){
					Input = Input + Integer.toString(Pages[i]) + " ";
				}
				textArea_1.setText(Input);
				txtrStart.setText(Integer.toString(head));
			}
		});
		btnRefresh.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		btnRefresh.setBackground(new Color(250, 235, 215));
		btnRefresh.setForeground(new Color(0, 100, 0));
		btnRefresh.setBounds(385, 11, 28, 28);
		contentPane.add(btnRefresh);
		
//		textArea_1.setText(Input);
		textArea_1.setText("");
		JButton btnFcfs = new JButton("FCFS");
		btnFcfs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int k,t=1;
				 tem__fff fifo = new tem__fff();
				 int head = Integer.parseInt(txtrStart.getText());
				 k=fifo.fff(Pages,n,head,t);
				 textArea_2.setText(Integer.toString(k));		
			}
		});
		btnFcfs.setForeground(new Color(255, 255, 255));
		btnFcfs.setBackground(new Color(199, 21, 133));
		btnFcfs.setBounds(38, 96, 89, 23);
		contentPane.add(btnFcfs);
		
		JButton btnSstf = new JButton("SSTF");
		btnSstf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int k,t=1;
				 tem_sstf sstf = new tem_sstf();
				 int head = Integer.parseInt(txtrStart.getText());
				 k=sstf.SSTF(Pages,n,head,t);
				 textArea_2.setText(Integer.toString(k));
			}
		});
		btnSstf.setBackground(new Color(199, 21, 133));
		btnSstf.setForeground(new Color(255, 255, 255));
		btnSstf.setBounds(38, 150, 89, 23);
		contentPane.add(btnSstf);
		
		JButton btnNewButton = new JButton("SCAN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int k,t=1;
				 SCAN scan = new SCAN();
				 int head = Integer.parseInt(txtrStart.getText());
				 k=scan.scan(Pages,n,head,t);
				 textArea_2.setText(Integer.toString(k));
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(199, 21, 133));
		btnNewButton.setBounds(172, 45, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCscan = new JButton("C-SCAN");
		btnCscan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int k,t=1;
				 C_SCAN c_scan = new C_SCAN();
				 int head = Integer.parseInt(txtrStart.getText());
				 k=c_scan.c_scan(Pages,n,head,t);
				 textArea_2.setText(Integer.toString(k));
			}
		});
		btnCscan.setForeground(new Color(255, 255, 255));
		btnCscan.setBackground(new Color(199, 21, 133));
		btnCscan.setBounds(302, 118, 89, 23);
		contentPane.add(btnCscan);
		
		JButton btnClook = new JButton("C-LOOK");
		btnClook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int k,t=1;
				 C_LOOK c_look = new C_LOOK();
				 int head = Integer.parseInt(txtrStart.getText());
				 k=c_look.c_look(Pages,n,head,t);
				 textArea_2.setText(Integer.toString(k));
			}
		});
		btnClook.setForeground(new Color(255, 255, 255));
		btnClook.setBackground(new Color(199, 21, 133));
		btnClook.setBounds(302, 152, 89, 23);
		contentPane.add(btnClook);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(236, 215, 75, 23);
		contentPane.add(textArea);

		
		JButton btnCompare = new JButton("COMPARE");
		btnCompare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Array[] = new int[6];
				int min=10000,h=0,t=0;
				tem__fff fifo = new tem__fff();
				tem_sstf sstf = new tem_sstf();
				SCAN scan = new SCAN();
				C_SCAN c_scan = new C_SCAN();
				C_LOOK c_look = new C_LOOK();
				int head = Integer.parseInt(txtrStart.getText());
				Array[1]=fifo.fff(Pages,n,head,t);
				Array[2]=sstf.SSTF(Pages,n,head,t);
				Array[3]=scan.scan(Pages,n,head,t);
				Array[4]=c_scan.c_scan(Pages,n,head,t);
				Array[5]=c_look.c_look(Pages,n,head,t);
				for(int i=1;i<=5;i++){
					if(Array[i]<min){
						min=Array[i];
						h=i;
					}
				}
				if(h==1){
					textArea.setText("FIFO - "+Integer.toString(min));
				}
				else if(h==2){
					textArea.setText("SSTF - "+Integer.toString(min));
				}
				else if(h==3){
					textArea.setText("SCAN - "+Integer.toString(min));
				}
				else if(h==4){
					textArea.setText("C-SCAN - "+Integer.toString(min));
				}
				else if(h==5){
					textArea.setText("C-LOOK - "+Integer.toString(min));
				}
			}
			
		});
		btnCompare.setBackground(new Color(0, 100, 0));
		btnCompare.setForeground(new Color(255, 255, 255));
		btnCompare.setBounds(107, 197, 94, 41);
		contentPane.add(btnCompare);
		
		JLabel lblDiskScheduling = new JLabel("Disk Scheduling");
		lblDiskScheduling.setForeground(new Color(128, 0, 0));
		lblDiskScheduling.setFont(new Font("Monotype Corsiva", Font.ITALIC, 23));
		lblDiskScheduling.setBounds(149, 11, 162, 23);
		contentPane.add(lblDiskScheduling);
		
		JLabel lblInputString = new JLabel("Input String");
		lblInputString.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
		lblInputString.setForeground(new Color(220, 20, 60));
		lblInputString.setBounds(182, 79, 89, 14);
		contentPane.add(lblInputString);
		
		JLabel lblNoOfCylinders = new JLabel("No of cylinders crossed");
		lblNoOfCylinders.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
		lblNoOfCylinders.setForeground(new Color(220, 20, 60));
		lblNoOfCylinders.setBounds(149, 137, 142, 14);
		contentPane.add(lblNoOfCylinders);
		
				
		JLabel lblMinimum = new JLabel("Minimum no of cylinders crossed for");
		lblMinimum.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		lblMinimum.setForeground(new Color(47, 79, 79));
		lblMinimum.setBounds(211, 197, 213, 14);
		contentPane.add(lblMinimum);
		
		JLabel lblNoOfDisks = new JLabel("No of disks in input");
		lblNoOfDisks.setForeground(new Color(34, 139, 34));
		lblNoOfDisks.setFont(new Font("Palatino Linotype", Font.PLAIN, 13));
		lblNoOfDisks.setBounds(23, 45, 128, 14);
		contentPane.add(lblNoOfDisks);
	}
}
