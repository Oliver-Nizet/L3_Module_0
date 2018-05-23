package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton b1;
	JButton b2;
	ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
	}

	GuestBook() {
		frame = new JFrame();
		panel = new JPanel();
		b1 = new JButton();
		b2 = new JButton();
		b1.setText("Add Name");
		b2.setText("View Names");
		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(b1);
		panel.add(b2);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			String name = JOptionPane.showInputDialog("Enter a Name");
			names.add(name);
		}
		if (e.getSource() == b2) {
			String gl = "";
			for (int i = 0; i < names.size(); i++) {
				gl += "Guest #" + (i + 1) + ": " + names.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, gl);
		}
	}
}
