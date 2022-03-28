import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class frmIntro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmIntro frame = new frmIntro();
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
	public frmIntro() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setBounds(313, 75, 126, 36);
		contentPane.add(lblMessage);
		
		JButton btnMessage2 = new JButton("Selam ver2");
		btnMessage2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMessage.setText("Merhaba2");
			}
		});
		btnMessage2.setBackground(Color.BLUE);
		btnMessage2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMessage2.setBounds(313, 200, 126, 44);
		contentPane.add(btnMessage2);
		
		JButton btnMessage1 = new JButton("Selam ver1");
		btnMessage1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 System.out.println("Merhaba 1");
			}
		});
		btnMessage1.setBackground(Color.RED);
		btnMessage1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMessage1.setBounds(313, 121, 126, 44);
		contentPane.add(btnMessage1);
		
		
	}
}
