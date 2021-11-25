package unit11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JComboboxDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(400, 400);
		frame.setTitle("Combo box");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(null);

		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		
		JMenuItem newItem = new JMenuItem("New");
		
		fileMenu.add(newItem);
		
		menuBar.add(fileMenu);
		
		
		
		
		frame.setJMenuBar(menuBar);
		
		
		JComboBox< String> shristhi = new JComboBox<>();
		shristhi.setBounds(100, 100, 100, 20);
		shristhi.addItem("Radha");
		shristhi.addItem("Krishnan");
		
		shristhi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(shristhi.getSelectedItem());
				
			}
		});
		
		frame.add(shristhi);
		
		frame.setVisible(true);
		
	}
}
