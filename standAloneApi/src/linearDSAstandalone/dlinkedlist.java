package linearDSAstandalone;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class dlinkedlist extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a1;
	private JTextField res;
		class Node {
			Node pl;
			int data;
			Node nl;
		}
		Node first=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dlinkedlist frame = new dlinkedlist();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public dlinkedlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO D LINKED LIST CREATION");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(121, 46, 494, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("ELEMENT");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(139, 119, 97, 23);
		contentPane.add(lblNewLabel_1_1);
		
		a1 = new JTextField();
		a1.setColumns(10);
		a1.setBounds(292, 123, 96, 19);
		contentPane.add(a1);
		
		JButton insertfirst = new JButton("INSERT F");
		insertfirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node nn=new Node();
				int val=Integer.parseInt(a1.getText());
				nn.pl=null;
				nn.data=val;
				nn.nl=null;
				
				if(first==null)
				{
					first=nn;
					JOptionPane.showMessageDialog(null, "Element added to front");
				}
				else
				{
					
					nn.nl=first;
					first.pl=nn;
					first=nn;
					JOptionPane.showMessageDialog(null, "Element added to front");
				}
			}
		});
		insertfirst.setFont(new Font("Arial Black", Font.BOLD, 15));
		insertfirst.setBounds(121, 317, 117, 21);
		contentPane.add(insertfirst);
		
		JButton deletefirst = new JButton("DELETE F");
		deletefirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null)
				{
					JOptionPane.showMessageDialog(null, "Delete not possible no ll exist");
					
				}
				else if(first.nl==null)
				{
					first=null;
					JOptionPane.showMessageDialog(null, "first node of ll deleted");
					
				}
				else
				{
					first=first.nl;
					first.pl=null;
					JOptionPane.showMessageDialog(null, "first node of ll deleted");
				}
			}
		});
		deletefirst.setFont(new Font("Arial Black", Font.BOLD, 15));
		deletefirst.setBounds(515, 317, 143, 21);
		contentPane.add(deletefirst);
		
		JButton DISPLAYFORWARD = new JButton("DISPLAY");
		DISPLAYFORWARD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList al =new ArrayList();
				if(first==null)
				{
					JOptionPane.showMessageDialog(null, "No ll exist");
					
				}
				else if(first.nl==null)
				{
					res.setText(Integer.toString(first.data));
				}
				else
				{
					
					Node temp=first;
					while(temp!=null)
					{
						al.add(temp.data);
						temp=temp.nl;
						res.setText(al.toString());
					}
				}
			}
		});
		DISPLAYFORWARD.setFont(new Font("Arial Black", Font.BOLD, 15));
		DISPLAYFORWARD.setBounds(322, 393, 117, 21);
		contentPane.add(DISPLAYFORWARD);
		
		JButton DELETELAST = new JButton("DELETE L");
		DELETELAST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null)
				{
					JOptionPane.showMessageDialog(null, "no nodes exist in ll cannot del");
				}
				else if(first.nl==null)
				{
					first=null;
					JOptionPane.showMessageDialog(null, "last node of ll deleted");
					System.out.println("");
				}
				else
				{
					Node temp=first;
					while(temp.nl.nl!=null)
					{
						temp=temp.nl;
					}
					temp.nl=null;
					JOptionPane.showMessageDialog(null, "last node of ll deleted");
				}
			}
		});
		DELETELAST.setFont(new Font("Arial Black", Font.BOLD, 15));
		DELETELAST.setBounds(121, 393, 133, 21);
		contentPane.add(DELETELAST);
		
		JButton insertlast = new JButton("INSERT L");
		insertlast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val=Integer.parseInt(a1.getText());
				Node nn = new Node();
				nn.pl=null;
				nn.data=val;
				nn.nl=null;
				
				if(first==null)
				{
					first=nn;
					JOptionPane.showMessageDialog(null, "Element added to last");
					
				}
				else if(first.nl==null)
				{
					first.nl=nn;
					nn.pl=first;
					JOptionPane.showMessageDialog(null, "Element added to last");
				}
				else
				{
					Node temp=first;
					while(temp.nl!=null)
					{
						temp=temp.nl;
					}
					temp.nl=nn;
					nn.pl=temp;
					JOptionPane.showMessageDialog(null, "Element added to last");
				}
			}
		});
		insertlast.setFont(new Font("Arial Black", Font.BOLD, 15));
		insertlast.setBounds(322, 317, 117, 21);
		contentPane.add(insertlast);
		
		JButton displayREV = new JButton("DISPLAY REV");
		displayREV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList ll =new ArrayList();
				if(first==null)
				{
					JOptionPane.showMessageDialog(null, "Sorry no ll exist");
					
				}
				else if(first.nl==null)
				{
					
					res.setText(Integer.toString(first.data));
					
				}
				else
				{
					
					Node temp=first;
					while(temp.nl!=null)	
					{
						temp=temp.nl;
					}
					while(temp!=null)
					{
						ll.add(temp.data);
						
						res.setText(ll.toString());
						temp=temp.pl;
					}
				}
			}
		});
		displayREV.setFont(new Font("Arial Black", Font.BOLD, 15));
		displayREV.setBounds(515, 395, 158, 21);
		contentPane.add(displayREV);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("LINKED LIST :");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(139, 190, 143, 23);
		contentPane.add(lblNewLabel_1_1_1);
		
		res = new JTextField();
		res.setColumns(10);
		res.setBounds(292, 194, 133, 19);
		contentPane.add(res);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Ss.jpg"));
		lblNewLabel_1.setBounds(0, 0, 719, 484);
		contentPane.add(lblNewLabel_1);
	}

}
