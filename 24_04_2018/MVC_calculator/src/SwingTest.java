import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingTest extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	CalcController c = new CalcController("+", 0, 0);
	
	//Add the ubiquitous "Hello World" label.
    JLabel label = new JLabel("0");
	JTextField txtnum1 = new JTextField(10);
    JTextField txtnum2 = new JTextField(10);

	public void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("Calculadora");
	        frame.setLayout(new FlowLayout());
	        
	        JButton sum = new JButton("Suma");
	        JButton min = new JButton("Resta");
	        JButton div = new JButton("Dividir");
	        JButton mult = new JButton("Multiplicacion");
	       
	        
	        frame.getContentPane().add(txtnum1);
	        frame.getContentPane().add(txtnum2);
	        frame.getContentPane().add(sum);
	        frame.getContentPane().add(min);
	        frame.getContentPane().add(div);
	        frame.getContentPane().add(mult);
	        frame.getContentPane().add(label);
	        
	        sum.addActionListener(this);
	        min.addActionListener(this);
	        div.addActionListener(this);
	        mult.addActionListener(this);
	        
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }
	  
	  public SwingTest() {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Suma")) {
			c.setOperation("+");
			c.setNumbers(Integer.parseInt(txtnum1.getText()), Integer.parseInt(txtnum2.getText()));
			label.setText(Integer.toString(c.returnResult()));
		}else if(e.getActionCommand().equals("Resta")) {
			c.setOperation("-");
			c.setNumbers(Integer.parseInt(txtnum1.getText()), Integer.parseInt(txtnum2.getText()));
			label.setText(Integer.toString(c.returnResult()));
		}else if(e.getActionCommand().equals("Dividir")) {
			c.setOperation("/");
			c.setNumbers(Integer.parseInt(txtnum1.getText()), Integer.parseInt(txtnum2.getText()));
			label.setText(Integer.toString(c.returnResult()));
		}else if(e.getActionCommand().equals("Multiplicacion")) {
			c.setOperation("*");
			c.setNumbers(Integer.parseInt(txtnum1.getText()), Integer.parseInt(txtnum2.getText()));
			label.setText(Integer.toString(c.returnResult()));
		}
	}
}