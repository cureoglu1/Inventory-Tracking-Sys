package GUI;

import java.awt.EventQueue; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Classes.*;
import java.awt.Font;

public class PersonnelSystemGUI extends JFrame {
	
	private JPanel contentPane;
	private JTextArea displayTA;
	private JComboBox<String> forceComboBox;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonnelSystemGUI frame = new PersonnelSystemGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// frames
	SearchFrame searchFrame = new SearchFrame(); 
	
	// method for filling the combo box
	 public void fillComboBox() {
	        forceComboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Navy", "Air", "Ground"}));
	    }
	/**
	 * Create the frame.
	 */
	
	public PersonnelSystemGUI() {
		
		setTitle("TSK Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInfo = new JLabel();
		lblInfo.setFont(new Font("Calibri", Font.BOLD, 23));
		lblInfo.setText("PERSONNEL INFO");
		lblInfo.setBounds(73, 16, 221, 27);
		contentPane.add(lblInfo);
		
		
		JButton btnAdd = new JButton();
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 PersonnelSys.addPersonnel();
				 displayTA.setText("Personnel added.");
			}
		});
		btnAdd.setText("Add");
		btnAdd.setBounds(50, 336, 112, 23);
		contentPane.add(btnAdd);
		
		JButton btnSrch = new JButton();
		btnSrch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fillComboBox();
		        searchFrame.setVisible(true);
			}
		});
		btnSrch.setText("Search");
		btnSrch.setBounds(200, 336, 112, 23);
		contentPane.add(btnSrch);
		
		JButton btnDisplay = new JButton();
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PersonnelSys.perList.isEmpty()) {
		            displayTA.setText("List is empty");
		        } else {
		            displayTA.setText(PersonnelSys.display());
		        }
			}
		});
		btnDisplay.setText("Display");
		btnDisplay.setBounds(350, 336, 112, 23);
		contentPane.add(btnDisplay);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 53, 282, 255);
		contentPane.add(scrollPane);
		
		displayTA = new JTextArea();
		scrollPane.setViewportView(displayTA);
		
		 forceComboBox = new JComboBox<>();
	        forceComboBox.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	Military b;
	            	  if (forceComboBox.getSelectedItem() == "Navy")
	            	  {
	            		  b = new NavyForces();
	            	  }
	            	  else if (forceComboBox.getSelectedItem() == "Ground")
	            		  b = new GroundForces();
	            	  else
	            		  b = new AirForces();
	                
	              }
	            
	        });
	        forceComboBox.setBounds(369, 120, 101, 36);
	        contentPane.add(forceComboBox);
	        
	        fillComboBox();
	}
}
