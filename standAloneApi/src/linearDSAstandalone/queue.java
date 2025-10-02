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
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class queue extends JFrame {
int arr[];
int size;
int f=-1;
int r=-1;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a1;
	private JTextField res1;
	private JTextField a2;
	private JTextField res2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					queue frame = new queue();
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
	public queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO QUEUE CREATION");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(166, 38, 398, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SIZE");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setBounds(111, 134, 71, 22);
		contentPane.add(lblNewLabel_1);
		
		a1 = new JTextField();
		a1.setBounds(192, 138, 96, 19);
		contentPane.add(a1);
		a1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("QUEUE :");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(234, 205, 88, 22);
		contentPane.add(lblNewLabel_1_1);
		
		res1 = new JTextField();
		res1.setColumns(10);
		res1.setBounds(332, 209, 158, 19);
		contentPane.add(res1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ELEMENT");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(343, 134, 110, 22);
		contentPane.add(lblNewLabel_1_1_1);
		
		a2 = new JTextField();
		a2.setColumns(10);
		a2.setBounds(445, 138, 96, 19);
		contentPane.add(a2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("FOUND AT INDEX :");
		lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1_2.setBounds(145, 283, 177, 22);
		contentPane.add(lblNewLabel_1_1_2);
		
		res2 = new JTextField();
		res2.setColumns(10);
		res2.setBounds(332, 287, 96, 19);
		contentPane.add(res2);
		
		JButton create = new JButton("CREATE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.parseInt(a1.getText());
				if(size<=0)
				{
					JOptionPane.showMessageDialog(null, "Enter valid size");
				}
				else {
					JOptionPane.showMessageDialog(null, "queue created of size "+size);
				arr=new int[size];
				}
			}
		});
		create.setFont(new Font("Arial Black", Font.BOLD, 15));
		create.setBounds(69, 365, 113, 21);
		contentPane.add(create);
		
		JButton insert = new JButton("ENQUE");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int el=Integer.parseInt(a2.getText());
				if(r==size-1)
				{
					JOptionPane.showMessageDialog(null, "queue is full pls wait ");
				}
				else
				{
					r++;
					arr[r]=el;
					JOptionPane.showMessageDialog(null, "Enque  done to the rear end");
				}
			}
		});
		insert.setFont(new Font("Arial Black", Font.BOLD, 15));
		insert.setBounds(272, 367, 113, 21);
		contentPane.add(insert);
		
		JButton delete = new JButton("DEQUE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((r==-1 && f==-1)||f==size-1)
				{
					JOptionPane.showMessageDialog(null, "sry queue is empty ");
				}
				else
				{
					f++;
					arr[f]=0;
					JOptionPane.showMessageDialog(null, "Deque  done from front");
				}
			}
		});
		delete.setFont(new Font("Arial Black", Font.BOLD, 15));
		delete.setBounds(489, 367, 113, 21);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r==-1 && f==-1)
					{
					JOptionPane.showMessageDialog(null, "sry queue is empty nothing display");
					}
				else
				{
					res1.setText(Arrays.toString(arr));
				}
		}
		});
		display.setFont(new Font("Arial Black", Font.BOLD, 15));
		display.setBounds(69, 432, 113, 21);
		contentPane.add(display);
		
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
		sort.setBounds(272, 434, 113, 21);
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
				res2.setText("No element founddddddddd");
			}
		});
		search.setFont(new Font("Arial Black", Font.BOLD, 15));
		search.setBounds(489, 434, 113, 21);
		contentPane.add(search);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Ss.jpg"));
		lblNewLabel_2.setBounds(0, 0, 716, 482);
		contentPane.add(lblNewLabel_2);
	}
}
