
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.*;

import employee.*;
import java.awt.Color;


public class Main extends JFrame implements KeyListener, MenuListener, ActionListener{

    EmployeeList list = new EmployeeList();
    int height;
    

    class EmployeePanel extends JPanel {

    	/**
    	 * This function will be called be repaint() in Project1() whenever updates should be made to the GUI
    	 * Draw the name/age/income text.
    	 * For each employee in list, draw the employee text
    	 * */
    	
    	public void paintComponent(Graphics g) {
    		
    		height = 25;
    		super.paintComponent(g);
    		g.setFont(new Font("TimesRoman", Font.ITALIC, 25)); 
    		g.setColor(Color.BLUE);
    		g.drawString("Name", 25, height);
    		g.drawString("Age", 110, height);
    		g.drawString("Salary", 175, height);
    		


    		g.setFont(new Font("Arial", Font.PLAIN, 20)); 
    		if(list.length()>0) {
    			for(int i = 0; i<list.length(); i++) {
    	    		g.setColor(Color.ORANGE);

    				height+=40;
    				g.drawString(list.get(i).getName() , 25, height);
    				g.drawString("" + list.get(i).getAge(), 110, height);
    				g.drawString("$" + list.get(i).getIncome(), 175, height);
    			}
    		}
    	}
    }

    /**
	 * Create a JMenuBar
	 * Add buttons for File/New/Add/Help/About
	 * Add action listeners for the buttons
	 * 
	 * */
    
    JFrame frame;
    JMenuBar menubar;
    JMenu file;
	JMenu help;
	JMenu exit;
	JMenuItem nw;
	JMenuItem add;
	JMenuItem about;
    public Main() {
  
    	frame = new JFrame("Employee Database");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		menubar = new JMenuBar();
		frame.setJMenuBar(menubar);

		
		file = new JMenu("File");
		help = new JMenu("Help");
		exit = new JMenu("Exit");
		menubar.add(file);
		menubar.add(help);
		menubar.add(exit);

		ImageIcon addIcon = new ImageIcon(new ImageIcon("add-icon.png")
		        .getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
		ImageIcon newIcon = new ImageIcon(new ImageIcon("confirm-1326929049071735468_32.png")
		        .getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
		ImageIcon aboutIcon = new ImageIcon(new ImageIcon("aboutIcon.png")
		        .getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
		
		nw = new JMenuItem("New", newIcon);
		add = new JMenuItem("Add", addIcon);
		about = new JMenuItem("About",aboutIcon); 
		file.add(nw);
		file.add(add);
		help.add(about);

		
		add.addActionListener(this);
		nw.addActionListener(this);
		about.addActionListener(this);

		exit.addMenuListener(this);
		

		EmployeePanel  eg = new EmployeePanel();
		frame.add(eg);
		
		frame.setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==add) {
				String name = JOptionPane.showInputDialog("Please Enter Name: ");
				int age = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Age: "));
				float salary = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Salary: "));
				list.addData(name, age, salary);
				
				frame.repaint();
			}
			
			if(e.getSource()==nw) {
				
				String name = JOptionPane.showInputDialog("Please Enter Name: ");
				int age = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Age: "));
				float salary = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Salary: "));
				list.newData(name, age, salary);	
				
				frame.repaint();
				}
			
			
			if(e.getSource()==about)
				JOptionPane.showMessageDialog(frame, "Copyright 2021 \nContact us at: www.SystemServices.com");
				
	}

	@Override
	public void menuSelected(MenuEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==exit)
			System.exit(0);
	}

	@Override
	public void menuDeselected(MenuEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuCanceled(MenuEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	 //Nothing to be done here
    public static void main(String[] args) {
        new Main();
    }

}
