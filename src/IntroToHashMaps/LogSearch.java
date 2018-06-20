package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	HashMap<Integer, String> log = new HashMap<Integer, String>();
	JFrame f;
	JPanel p;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	public static void main(String[] args) {
		LogSearch ls = new LogSearch();
	}
	LogSearch(){
		f = new JFrame();
		p = new JPanel();
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		f.add(p);
		b1.setText("Add Entry");
		b2.setText("Search by ID");
		b3.setText("View List");
		b4.setText("Remove Entry");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		f.setVisible(true);
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1) {
			String id = JOptionPane.showInputDialog("Enter ID");
			String name = JOptionPane.showInputDialog("Enter Name");
			int idi = Integer.parseInt(id);
			log.put(idi, name);
		}
		if(e.getSource() == b2) {
			String in = JOptionPane.showInputDialog("Enter ID");
			int ini = Integer.parseInt(in);
			if(log.containsKey(ini)) {
				JOptionPane.showMessageDialog(null, log.get(ini));
			} else {
				JOptionPane.showMessageDialog(null, "That entry does not exist");
			}
		}
		if(e.getSource() == b3) {
			String l = "";
			for (Map.Entry<Integer, String> entry : log.entrySet()) {
				l += ("ID: " + entry.getKey() + "   Name: " + entry.getValue() + "\n");
			}
			JOptionPane.showMessageDialog(null, l);
		}
		if(e.getSource() == b4) {
			String ir = JOptionPane.showInputDialog("Enter ID");
			int iri = Integer.parseInt(ir);
			if(log.containsKey(iri)) {
				log.remove(iri);
			} else {
				JOptionPane.showMessageDialog(null, "That entry does not exist");
			}
		}
	}
}