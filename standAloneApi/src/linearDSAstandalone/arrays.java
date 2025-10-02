 package linearDSAstandalone;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class arrays extends JFrame {
int arr[];
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField a1;
	private JTextField a2;
	private JTextField res1;
	private JTextField a3;
	private JTextField res2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arrays frame = new arrays();
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
	public arrays() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setForeground(new Color(0, 255, 255));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("WELCOME TO ARRAY CREATION");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(149, 68, 393, 29);
		contentPane.add(lblNewLabel);
		
		a1 = new JTextField();
		a1.setBounds(99, 164, 96, 19);
		contentPane.add(a1);
		a1.setColumns(10);
		
		a2 = new JTextField();
		a2.setColumns(10);
		a2.setBounds(324, 164, 96, 19);
		contentPane.add(a2);
		
		res1 = new JTextField();
		res1.setColumns(10);
		res1.setBounds(272, 242, 184, 35);
		contentPane.add(res1);
		
		a3 = new JTextField();
		a3.setColumns(10);
		a3.setBounds(548, 164, 96, 19);
		contentPane.add(a3);
		
		JLabel lblNewLabel_1 = new JLabel("SIZE");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setBounds(42, 165, 60, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("INDEX");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(250, 165, 60, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ARRAY :");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(173, 243, 89, 29);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("ELEMENT");
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(451, 165, 101, 13);
		contentPane.add(lblNewLabel_1_3);
		
		JButton create = new JButton("CREATE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int size;
			    String s;
				try
				{
					size=Integer.parseInt(a1.getText());
					if(size>=0)
					{
						
					
					arr=new int[size];
					
					s=a3.getText();
					String ss[]=s.split(" ");
					for(int i=0;i<=size-1;i++)
					{
					arr[i]=Integer.parseInt(ss[i]);
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Enter positive size for array");
					}
					
				  
				}
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Some error occured pls check input");
				}
			}
		});
		create.setFont(new Font("Arial Black", Font.BOLD, 15));
		create.setBounds(71, 389, 123, 21);
		contentPane.add(create);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index;
				int size;
				try
				{
					size=Integer.parseInt(a1.getText());
					index=Integer.parseInt(a2.getText());
					if(index>=0 && index<size)
					{
					arr[index]=0;
					res1.setText(Arrays.toString(arr));
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Enter valid index for array");
					}
				}
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Some error occured pls check input");
				}
				
			}
		});
		delete.setFont(new Font("Arial Black", Font.BOLD, 15));
		delete.setBounds(286, 389, 123, 21);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				res1.setText(Arrays.toString(arr));
			}
		});
		display.setFont(new Font("Arial Black", Font.BOLD, 15));
		display.setBounds(490, 389, 123, 21);
		contentPane.add(display);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("FOUND AT INDEX :");
		lblNewLabel_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(83, 308, 179, 29);
		contentPane.add(lblNewLabel_1_2_1);
		
		res2 = new JTextField();
		res2.setColumns(10);
		res2.setBounds(272, 307, 184, 35);
		contentPane.add(res2);
		
		JButton search = new JButton("SEARCH");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s;
				int size;
				try
				{
					size=Integer.parseInt(a1.getText());
					int key=Integer.parseInt(a3.getText());
					
					int high = size-1;
					int low = 0;
					while(low<=high)
					{
						int mid = low+(high-low)/2;
						if(arr[mid]==key)
						{
							String m=Integer.toString(mid);
							res2.setText(m);
							return;
						}
						else if(arr[mid]>key)
						{
							high = mid-1;
							low = low;
						}
						else
						{
							low = mid+1;
							high = high;
						}
					}
					res2.setText("No element found");
					
				}
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Some error occured pls check input");
				}
			}
		});
		search.setFont(new Font("Arial Black", Font.BOLD, 15));
		search.setBounds(286, 442, 123, 21);
		contentPane.add(search);
		
		JButton sort = new JButton("SORT");
		sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int size;
				try
				{
				size=Integer.parseInt(a1.getText());
				
				for(int i=1;i<=size-1;i++)
				{
					int item=arr[i];
					int j=i-1;
					while(j>=0 && arr[j]>item)
					{
						arr[j+1]=arr[j];
						j--;
					}
					arr[j+1]=item;
				}
				res1.setText(Arrays.toString(arr));
				}
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Some error occured pls check input");
				}
				
			}
		});
		sort.setFont(new Font("Arial Black", Font.BOLD, 15));
		sort.setBounds(490, 442, 123, 21);
		contentPane.add(sort);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index;
				String s;
				int size;
				try
				{
					
					index=Integer.parseInt(a2.getText());
					size=Integer.parseInt(a1.getText());
					if(index>=0 && index<size)
					{
					s=a3.getText();
					arr[index]=Integer.parseInt(s);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Enter valid index for array");
					}
				}
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Some error occured pls check input");
				}
			
			}
		});
		insert.setBackground(new Color(128, 255, 255));
		insert.setFont(new Font("Arial Black", Font.BOLD, 15));
		insert.setBounds(71, 442, 123, 21);
		contentPane.add(insert);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Ss.jpg"));
		lblNewLabel_2.setBounds(0, 0, 723, 482);
		contentPane.add(lblNewLabel_2);
	}
}
