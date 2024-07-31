package user1.app;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import sub2.User1VO;
import user1.User1DAO;
import javax.swing.JTextField;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class User1AppMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tblList;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtBirth;
	private JTextField txtAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User1AppMain frame = new User1AppMain();
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
	public User1AppMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				System.out.println("전환!!!");
			}
		});
;
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel listPanel = new JPanel();
		contentPane.add(listPanel, "listPanel");
		listPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("User1 목록 ");
		listPanel.add(lblNewLabel, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		listPanel.add(scrollPane, BorderLayout.CENTER);
		
		
		/////////////////////////////////////////////////////////////////////////
		// 테이블 설정
		tblList = new JTable();
		scrollPane.setViewportView(tblList);
		/////////////////////////////////////////////////////////////////////////
		// 컬럼 설정
		String[] columNames = {"아이디", "이름", "생년월일", "휴대폰", "나이"};
		DefaultTableModel model = new DefaultTableModel(columNames, 0);
		model.setRowCount(0);
		tblList.setModel(model);
		
		
		// 데이터 출력
		User1DAO dao = User1DAO.getInstance();
		List<user1.User1VO> users = dao.selectUsers();
				
		for(user1.User1VO user : users) {
		Object[] rowData = {user.getUid(), user.getName(), user.getBirth(), user.getHp(), user.getAge()};
		model.addRow(rowData);
				}		
		
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		listPanel.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnRegister = new JButton("등록");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 등록화면으로 전환
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(getContentPane(), "registerPanel");
			}
		});
		panel_1.add(btnRegister);
		
		
		
		
		JPanel registerPanel = new JPanel();
		contentPane.add(registerPanel, "registerPanel");
		registerPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("User1 등록");
		lblNewLabel_1.setBounds(0, 0, 452, 15);
		registerPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(12, 40, 57, 15);
		registerPanel.add(lblNewLabel_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(81, 37, 116, 21);
		registerPanel.add(txtUid);
		txtUid.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(12, 68, 57, 15);
		registerPanel.add(lblNewLabel_2_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(81, 65, 116, 21);
		registerPanel.add(txtName);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("휴대폰");
		lblNewLabel_2_1_1.setBounds(12, 124, 57, 15);
		registerPanel.add(lblNewLabel_2_1_1);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(81, 121, 116, 21);
		registerPanel.add(txtHp);
		
		JLabel lblNewLabel_2_2 = new JLabel("생년월일");
		lblNewLabel_2_2.setBounds(12, 96, 57, 15);
		registerPanel.add(lblNewLabel_2_2);
		
		txtBirth = new JTextField();
		txtBirth.setColumns(10);
		txtBirth.setBounds(81, 93, 116, 21);
		registerPanel.add(txtBirth);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("나이");
		lblNewLabel_2_1_1_1.setBounds(12, 152, 57, 15);
		registerPanel.add(lblNewLabel_2_1_1_1);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(81, 149, 116, 21);
		registerPanel.add(txtAge);
		
		JButton btninsert = new JButton("등록하기");
		btninsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				String name = txtName.getText();
				String birth = txtBirth.getText();
				String hp = txtHp.getText();
				int age = Integer.parseInt(txtAge.getText());
				
				User1VO vo = new User1VO(uid, name, birth, hp, age);
				User1DAO.getInstance().insertUser(vo);
				
				JOptionPane.showMessageDialog(null, "등록 완료!");
				
				
				
			}
		});
		btninsert.setBounds(112, 194, 85, 23);
		registerPanel.add(btninsert);
		
		JButton btnList = new JButton("목록");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 목록화면으로 전환
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(getContentPane(), "listPanel");
			}
		});
		btnList.setBounds(26, 194, 85, 23);
		registerPanel.add(btnList);
	}
}
