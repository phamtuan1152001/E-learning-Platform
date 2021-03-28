package E_learning_Platform;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class RegisterAccount extends JFrame {

	private JPanel contentPane;
	private JTextField txtuser;
	private JTextField txtgmail;
	private JPasswordField txtpassword;
	private JPasswordField txtcfpassword;

	String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String url = "jdbc:sqlserver://DESKTOP-JTBVOBK:1433;databaseName=LOGIN";
	String user = "sa";
	String password = "sa";
	Statement st;
	ResultSet rs;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterAccount frame = new RegisterAccount();
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
	public RegisterAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register Account");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(134, 11, 175, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Gmail:");
		lblNewLabel_2.setBounds(43, 83, 65, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setBounds(43, 124, 65, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ConfirmPassword:");
		lblNewLabel_4.setBounds(43, 162, 107, 14);
		contentPane.add(lblNewLabel_4);
		
		txtuser = new JTextField();
		txtuser.setBounds(160, 45, 149, 20);
		contentPane.add(txtuser);
		txtuser.setColumns(10);
		
		txtgmail = new JTextField();
		txtgmail.setBounds(160, 83, 149, 20);
		contentPane.add(txtgmail);
		txtgmail.setColumns(10);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(160, 121, 149, 20);
		contentPane.add(txtpassword);
		
		txtcfpassword = new JPasswordField();
		txtcfpassword.setBounds(160, 159, 149, 20);
		contentPane.add(txtcfpassword);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setBounds(43, 45, 65, 27);
		contentPane.add(lblNewLabel_1);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnlogin.setBounds(81, 202, 89, 23);
		contentPane.add(btnlogin);
		
		JButton btnregister = new JButton("Register");
		btnregister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int regis = JOptionPane.showConfirmDialog(btnregister, this, "Are you want to registering!", JOptionPane.YES_NO_OPTION);
				if (regis != JOptionPane.YES_OPTION) {
					return;
				}
				//Connection connection = null;
				try {
				/*	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					String url = "jdbc:sqlserver://DESKTOP-JTBVOBK:1433;databaseName=LOGIN"; */
					Class.forName(driver);
					Connection con = DriverManager.getConnection(url, "sa", "115");
					System.out.println("Login Successfully!");
					String sql = "Insert into ACCOUNT values(?, ?, ?, ?)";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, txtuser.getText());
					ps.setString(2, txtgmail.getText());
					ps.setString(3, txtpassword.getText());
					ps.setString(4, txtcfpassword.getText());
					
					int n = ps.executeUpdate();
					
					if(txtuser.getText().equals("")|txtgmail.getText().equals("")|txtpassword.getText().equals("")|txtcfpassword.getText().equals("")) {
						JOptionPane.showMessageDialog(btnregister, this, "Do not let this empty!", regis);
					}
					else if (n != 0) {
						JOptionPane.showMessageDialog( btnregister, this, "Registering Succesfully", regis);
					}
					else {
						JOptionPane.showMessageDialog( btnregister, this, "Registering Fail", regis);
					}
					
				} catch (Exception e1) {   //Exception e1 ,ClassNotFoundException |
					//  System.out.println("Login Fail!");
				//System.err.println(e1.getMessage() + "/n" + e1.getClass() + "/n" + e1.getCause());
					e1.printStackTrace();
				}
			}
		});
		btnregister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnregister.setBounds(271, 202, 89, 23);
		contentPane.add(btnregister);
	}
}
