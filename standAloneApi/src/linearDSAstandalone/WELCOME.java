package linearDSAstandalone;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;

public class WELCOME {

	private JFrame CALCULATOR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WELCOME window = new WELCOME();
					window.CALCULATOR.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WELCOME() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CALCULATOR = new JFrame();
		CALCULATOR.getContentPane().setForeground(UIManager.getColor("Button.foreground"));
		CALCULATOR.setBackground(new Color(0, 0, 0));
		CALCULATOR.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 50));
		CALCULATOR.getContentPane().setBackground(new Color(255, 0, 0));
		CALCULATOR.setBounds(100, 100, 737, 467);
		CALCULATOR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CALCULATOR.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO DATA STRUCTURE CREATION");
		lblNewLabel.setForeground(new Color(128, 255, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(138, 52, 553, 55);
		CALCULATOR.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PLEASE CHOOSE A DATA STRUCTURE");
		lblNewLabel_1.setForeground(new Color(128, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setBounds(212, 133, 360, 33);
		CALCULATOR.getContentPane().add(lblNewLabel_1);
		
		JButton add = new JButton("D LINKED LIST");
		add.setFont(new Font("Arial Black", Font.BOLD, 15));
		add.setBounds(272, 362, 200, 33);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlinkedlist ll=new dlinkedlist();
				ll.setVisible(true);
			}
		});
		CALCULATOR.getContentPane().add(add);
		
		JButton btnNewButton = new JButton("ARRAY");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arrays a = new arrays();
				a.setVisible(true);
			}
		});
		btnNewButton.setBounds(77, 245, 135, 33);
		CALCULATOR.getContentPane().add(btnNewButton);
		
		JButton btnStack = new JButton("STACK");
		btnStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stack s = new stack();
			    s.setVisible(true);
			}
		});
		btnStack.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnStack.setBounds(306, 245, 135, 33);
		CALCULATOR.getContentPane().add(btnStack);
		
		JButton btnQueue = new JButton("QUEUE");
		btnQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				queue q = new queue();
				q.setVisible(true);
			}
		});
		btnQueue.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnQueue.setBounds(545, 245, 135, 33);
		CALCULATOR.getContentPane().add(btnQueue);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\down pic\\dark-landscape-lake-hd-wallpaper-preview.jpg"));
		lblNewLabel_2.setBounds(0, 0, 723, 430);
		CALCULATOR.getContentPane().add(lblNewLabel_2);
	}
}
