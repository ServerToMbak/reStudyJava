import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Demo extends JFrame {
	DefaultListModel model ;
	private JPanel contentPane;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo frame = new Demo();
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
	public Demo() {
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMessage.setBounds(51, 434, 269, 37);
		contentPane.add(lblMessage);
		
		JList lstStudents = new JList();
		lstStudents.setBounds(214, 229, 211, 203);
		contentPane.add(lstStudents);
		
		 model = new DefaultListModel();
		lstStudents.setModel(model);
		
		JButton btnAdd = new JButton("\u00D6grenci ekle");
		btnAdd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				model.addElement(txtName.getText());
				lblMessage.setText("Eleman ekledni");
				txtName.setText("");
			}
		});
		btnAdd.setBounds(172, 122, 148, 41);
		contentPane.add(btnAdd);
		
		JButton btnDelete = new JButton("\u00D6grenci sil");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.removeElement(txtName.getText());	
				lblMessage.setText("Eleman silindi");
				txtName.setText("");
			}
		});
		btnDelete.setBounds(355, 122, 178, 41);
		contentPane.add(btnDelete);
		
		JLabel lblStudent = new JLabel("\u00D6grenci ad\u0131:");
		lblStudent.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStudent.setBounds(124, 54, 108, 41);
		contentPane.add(lblStudent);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtName.setBounds(239, 64, 131, 31);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JButton btnRemoveSelected = new JButton("Se\u00E7ili degeri sil");
		btnRemoveSelected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index =lstStudents.getSelectedIndex();
				if(index!=-1) {
				model.removeElementAt(index);
				lblMessage.setText("seçili eleman silindi");
				}else {
					lblMessage.setText("SEÇÝLÝ ELEMAN YOK");	
				}
				}
		});
		btnRemoveSelected.setBounds(460, 232, 114, 31);
		contentPane.add(btnRemoveSelected);
		
		
		
		
	}
}
