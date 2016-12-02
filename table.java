import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class table {

	private JFrame frame;
	int r=4,c=20;
	String [] A=new String[c]; 
	int [][] S=new int[r][c];
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					table window = new table();
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
	
	public table(){
		 /* JFrame frame = new JFrame();
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    //Object rowData[][] = { { "Row1-Column1", "Row1-Column2"},
		     //   { "Row2-Column1", "Row2-Column2"} };
		    //Object columnNames[] = { "Column One", "Column Two", };
		    JTable table = new JTable(a,b);
		    table.setSize(50,35);
		    JScrollPane scrollPane = new JScrollPane(table);
		    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		    frame.setSize(300, 150);
		    frame.setVisible(true);*/
		    
		    
		    initialize();
	  }
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 698, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 656, 357);
		frame.getContentPane().add(panel);
		
		table = new JTable(4,2);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				
			}
		));
		for(int y=0;y<r;y++)
		{
			for(int h=0;h<c;h++)
			{
				S[y][h]=h;
			}
		}

	//	table.getColumnModel().getColumn(0).setPreferredWidth(15);
		for(int i=0;i<c;i++)
		{
			((DefaultTableModel)table.getModel()).addColumn(A);
		}
		for(int i=0;i<c;i++)
		{
			table.getColumnModel().getColumn(i).setPreferredWidth(30);
		}
	//	table.getColumnModel().getColumn(c).setMinWidth(17);
		for (int k=0;k<r;k++){
			Object [] D=new Object[c];
			for (int j=0;j<c;j++){
				D[j]=S[k][j];
			}
			((DefaultTableModel)table.getModel()).addRow(D);	

		}
		panel.add(table);
		
		}
}
