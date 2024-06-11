package GUI;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Classes.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class SearchFrame extends JFrame {

	private JPanel contentPane;
	private JComboBox personnelNameCMB;
	private JTextField personnelName;
	private JTextArea dispTA;
	
	// method for returning the search frame's combo box
	public JComboBox getpersonnelName_CMB() {
        return personnelNameCMB;
    }

	/**
	 * Create the frame.
	 */
	public SearchFrame() {
		setTitle("Search Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel();
		lblName.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblName.setText("Personnel Name:");
		lblName.setBounds(49, 17, 137, 14);
		contentPane.add(lblName);
		
		personnelName = new JTextField();
		personnelName.setBounds(196, 11, 140, 22);
		contentPane.add(personnelName);
		
		dispTA = new JTextArea();
		dispTA.setRows(5);
		dispTA.setColumns(20);
		dispTA.setBounds(10, 46, 349, 155);
		contentPane.add(dispTA);
		
		JButton btnSearch = new JButton();
		btnSearch.addKeyListener(new KeyAdapter(){
		  @Override
		  public void keyPressed(KeyEvent e){
		  	if (e.getKeyCode() == KeyEvent.VK_ENTER){
		  		if (PersonnelSys.perList.isEmpty()) {
		            dispTA.setText("Personnel not found!");
		        } else {
		           dispTA.setText(PersonnelSys.searchPersonnel(Integer.parseInt(personnelName.getText())).toString());
		        }
		  	}
		  }
		 });
		
		btnSearch.setText("Search");
		btnSearch.setBounds(50, 237, 82, 23);
		contentPane.add(btnSearch);
		
		JButton btnClose = new JButton("Clear");
		btnClose.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispTA.setText(null);
		        personnelNameCMB.setSelectedIndex(0);
		        dispose();
		        //SearchFrame sf = new SearchFrame();
		        //sf.setVisible(false);
		    }
		});
		btnClose.setBounds(260, 237, 70, 23);
		contentPane.add(btnClose);
		
		JButton deleteBtn = new JButton("Delete");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dispTA.getText().isEmpty()) {
					dispTA.setText("No Personnel Selected!");
				}
				else {
					PersonnelSys.removePersonnel(Integer.parseInt(personnelName.getText()));
					dispTA.setText("Personnel " +Integer.parseInt(personnelName.getText())+ " Removed.");
				}
			}
		});
		deleteBtn.setBounds(154, 238, 85, 21);
		contentPane.add(deleteBtn);
	}
}
