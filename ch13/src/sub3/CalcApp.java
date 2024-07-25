package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CalcApp {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp window = new CalcApp();
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
	public CalcApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 348, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setText("0");
		textField.setBounds(12, 10, 253, 52);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setBounds(12, 72, 56, 58);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBounds(73, 72, 56, 58);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(141, 72, 56, 58);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnC = new JButton("/");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnC.setBounds(207, 72, 56, 58);
		frame.getContentPane().add(btnC);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(12, 140, 56, 58);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.setBounds(73, 140, 56, 58);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("6");
		btnNewButton_2_1.setBounds(141, 140, 56, 58);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnC_1 = new JButton("x");
		btnC_1.setBounds(207, 140, 56, 58);
		frame.getContentPane().add(btnC_1);
		
		JButton btnNewButton_4 = new JButton("1");
		btnNewButton_4.setBounds(12, 208, 56, 58);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1_2 = new JButton("2");
		btnNewButton_1_2.setBounds(73, 208, 56, 58);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("3");
		btnNewButton_2_2.setBounds(141, 208, 56, 58);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnC_2 = new JButton("-");
		btnC_2.setBounds(207, 208, 56, 58);
		frame.getContentPane().add(btnC_2);
		
		JButton btnNewButton_5 = new JButton("c");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(12, 276, 56, 58);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_1_3 = new JButton("0");
		btnNewButton_1_3.setBounds(73, 276, 56, 58);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("=");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_3.setBounds(141, 276, 56, 58);
		frame.getContentPane().add(btnNewButton_2_3);
		
		JButton btnC_3 = new JButton("+");
		btnC_3.setBounds(207, 276, 56, 58);
		frame.getContentPane().add(btnC_3);
	}

}
