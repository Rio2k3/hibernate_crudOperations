package linearDSAstandalone;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class stack extends JFrame {

	int arr[];
	int size;
	int top=-1;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a1;
	private JTextField a2;
	private JTextField res1;
	private JButton push;
	private JButton pop;
	private JTextField res2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stack frame = new stack();
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
	public stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO STACK CREATION");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(173, 53, 380, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("SIZE");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setBounds(105, 163, 58, 19);
		contentPane.add(lblNewLabel);
		
		a1 = new JTextField();
		a1.setFont(new Font("Arial Black", Font.BOLD, 15));
		a1.setBounds(173, 162, 76, 19);
		contentPane.add(a1);
		a1.setColumns(10);
		
		JLabel lblElement = new JLabel("ELEMENT");
		lblElement.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblElement.setBounds(298, 163, 96, 19);
		contentPane.add(lblElement);
		
		a2 = new JTextField();
		a2.setFont(new Font("Arial Black", Font.BOLD, 15));
		a2.setColumns(10);
		a2.setBounds(404, 162, 96, 19);
		contentPane.add(a2);
		
		JLabel lblNewLabel_3 = new JLabel("STACK :");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_3.setBounds(206, 249, 84, 13);
		contentPane.add(lblNewLabel_3);
		
		res1 = new JTextField();
		res1.setFont(new Font("Arial Black", Font.BOLD, 15));
		res1.setColumns(10);
		res1.setBounds(298, 245, 152, 31);
		contentPane.add(res1);
		
		push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int v;
				String s=a2.getText();
				v=Integer.parseInt(s);
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(null, "Sorry stack is full");
				}
				else {
				top++;
				arr[top]=v;
				JOptionPane.showMessageDialog(null,v+ "Element added");
				}
			}
		});
		push.setFont(new Font("Arial Black", Font.BOLD, 15));
		push.setBounds(309, 392, 85, 21);
		contentPane.add(push);
		
		pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top==-1)
				{
					JOptionPane.showMessageDialog(null, "Sorry stack is empty");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "deleted element "+arr[top]);
					arr[top]=0;
					top--;
				}
			}
		});
		pop.setFont(new Font("Arial Black", Font.BOLD, 15));
		pop.setBounds(502, 392, 85, 21);
		contentPane.add(pop);
		
		JButton sort = new JButton("SORT");
		sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		sort.setFont(new Font("Arial Black", Font.BOLD, 15));
		sort.setBounds(309, 452, 85, 21);
		contentPane.add(sort);
		
		JButton search = new JButton("SEARCH");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int key=Integer.parseInt(a2.getText());		
				
				int high = arr.length-1;
				int low = 0;
				while(low<=high)
				{
					int mid = low+(high-low)/2;
					if(arr[mid]==key)
					{
					 res2.setText(Integer.toString(mid));
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
		});
		search.setFont(new Font("Arial Black", Font.BOLD, 15));
		search.setBounds(105, 452, 107, 21);
		contentPane.add(search);
		
		JLabel lblNewLabel_3_1 = new JLabel("FOUND AT INDEX :");
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_3_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_3_1.setBounds(116, 309, 174, 13);
		contentPane.add(lblNewLabel_3_1);
		
		res2 = new JTextField();
		res2.setFont(new Font("Arial Black", Font.BOLD, 15));
		res2.setColumns(10);
		res2.setBounds(298, 308, 134, 19);
		contentPane.add(res2);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top==-1)
				{
					JOptionPane.showMessageDialog(null, "Sorry stack is empty");
				}
				else
				{
					res1.setText(Arrays.toString(arr));
				}
			}
		});
		display.setFont(new Font("Arial Black", Font.BOLD, 15));
		display.setBounds(485, 452, 124, 21);
		contentPane.add(display);
		
		JButton create = new JButton("CREATE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					size=Integer.parseInt(a1.getText());
					if(size<=0)
					{
						JOptionPane.showMessageDialog(null, "invalid input size");
					}
					else
					{
					arr=new int[size];
					JOptionPane.showMessageDialog(null, "stack created of size"+size);
					}
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Some error occured pls check input");
				}
			}
		});
		create.setFont(new Font("Arial Black", Font.BOLD, 15));
		create.setBounds(105, 394, 107, 21);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Ss.jpg"));
		lblNewLabel_2.setBounds(0, 0, 723, 483);
		contentPane.add(lblNewLabel_2);
	}
}
