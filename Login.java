package E_learning_Platform;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usertext;
	private JPasswordField passtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(10, 11, 131, 229);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 91, 111, 37);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(151, 11, 263, 229);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbluser = new JLabel("Username:");
		lbluser.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbluser.setBounds(10, 74, 69, 31);
		panel_2.add(lbluser);
		
		JLabel lblpass = new JLabel("Password:");
		lblpass.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblpass.setBounds(10, 116, 69, 14);
		panel_2.add(lblpass);
		
		usertext = new JTextField();
		usertext.setBounds(89, 80, 164, 20);
		panel_2.add(usertext);
		usertext.setColumns(10);
		
		passtext = new JPasswordField();
		passtext.setBounds(89, 114, 164, 20);
		panel_2.add(passtext);
		
		JButton btndangnhap = new JButton("Login");
		btndangnhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btndangnhap.setBounds(10, 159, 89, 23);
		panel_2.add(btndangnhap);
		
		JButton btnreg = new JButton("Register");
		btnreg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterAccount ra = new RegisterAccount();
				ra.setVisible(true);
			}
		});
		btnreg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnreg.setBounds(164, 159, 89, 23);
		panel_2.add(btnreg);
	}
}
