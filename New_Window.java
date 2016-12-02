import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JProgressBar;


public class New_Window implements ActionListener{

//        private JFrame frame;

       
   public void actionPerformed(ActionEvent e)
   {
       if("New".equals(e.getActionCommand())){
               Simulator S=new Simulator();
               S.frame.setVisible(true);
       }
   }
}