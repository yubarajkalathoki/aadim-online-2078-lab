package com.aadim.online.lab.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class JTableDemo extends Panel{
	public JTableDemo() {
		String[] columns = { "Roll No.", "Name", "Course" };
		String[][] rows = { 
				{ "1", "Anita", "CSIT" }, 
				{ "2", "Sajan", "BIT" }, 
				{ "3", "Santosh", "BCA" },
				{ "4", "Santosh", "BCA" },
				{ "5", "Santosh", "BCA" },
				{ "6", "Chaudhary", "BBS" } ,
				{ "1", "Anita", "CSIT" }, 
				{ "2", "Sajan", "BIT" }, 
				{ "3", "Santosh", "BCA" },
				{ "4", "Santosh", "BCA" },
				{ "5", "Santosh", "BCA" },
				{ "6", "Chaudhary", "BBS" } ,
				{ "1", "Anita", "CSIT" }, 
				{ "2", "Sajan", "BIT" }, 
				{ "3", "Santosh", "BCA" },
				{ "4", "Santosh", "BCA" },
				{ "5", "Santosh", "BCA" },
				{ "6", "Chaudhary", "BBS" } ,
				{ "1", "Anita", "CSIT" }, 
				{ "2", "Sajan", "BIT" }, 
				{ "3", "Santosh", "BCA" },
				{ "4", "Santosh", "BCA" },
				{ "5", "Santosh", "BCA" },
				{ "6", "Chaudhary", "BBS" } 
				};
		JTable table = new JTable(rows, columns) {
			public boolean isCellEditable(int row, int column) {
				// 1,1
//				if(row == 1 && column == 1)
//				return true;
				return false;
			}
			
			public Component prepareRenderer(TableCellRenderer tcr, int row, int column) {
				Component c = super.prepareRenderer(tcr, row, column);
				if(row % 2 == 0)
					c.setBackground(Color.WHITE);
				else
					c.setBackground(Color.LIGHT_GRAY);
				
				if(isRowSelected(row))
					c.setBackground(Color.MAGENTA);
				
				return c;
			}
			
		};
		table.setPreferredScrollableViewportSize(new Dimension(350, 280));
		JScrollPane jsp = new JScrollPane(table);
		
		add(jsp);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("JTable Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.add(new JTableDemo());
		
		
		frame.setVisible(true);
		
		frame.setLocationRelativeTo(null); // To make center
	}
}
