package E_learning_Platform;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Homepage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
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
	public Homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 969, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E - LEARNING PLATFORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 933, 89);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 123, 933, 57);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnadmin = new JButton("Admin");
		btnadmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg = new Login();
				lg.setVisible(true);
			}
		});
		btnadmin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnadmin.setBounds(46, 11, 125, 35);
		panel.add(btnadmin);
		
		JButton btnlecturer = new JButton("Lecturer");
		btnlecturer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg1 = new Login();
				lg1.setVisible(true);
			}
		});
		btnlecturer.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnlecturer.setBounds(405, 11, 125, 35);
		panel.add(btnlecturer);
		
		JButton btnlearner = new JButton("Learner");
		btnlearner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg2 = new Login();
				lg2.setVisible(true);
			}
		});
		btnlearner.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnlearner.setBounds(764, 11, 125, 35);
		panel.add(btnlearner);
	}
}
