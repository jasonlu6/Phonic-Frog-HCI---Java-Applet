/**
 * Controller Class for HCI / UI Prep Assignment 1 (Phonics Frog Application) 
 * TO DO: Fill in the main functionality of the application (for now, all it does is create a green screen
 * with some yellow text, and a couple of buttons from A,B,C,D). 
 * Be sure to test the GUI, using PDP methodogy and design methods (factory method would be handy). 
 * The GUI coding runs as intended, click each button to spell out a phonics symbol on main GUI. 
 * Author: Jason Lu (jasonlu968@gmail.com) 
 * 
 * Date: 8.02.2019 - 8.21.2019  (GUI extension, controller debug and design issue).
 */

package controller;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import java.util.*;
	

	@SuppressWarnings("serial")
	public class GraphicsController extends JFrame {

	    private JButton jbtNum1;
	    private JButton jbtNum2;
	    private JButton jbtNum3;
	    private JButton jbtNum4;
	    private JButton jbtNum5;
	    private JButton jbtNum6;
	    private JButton jbtNum7;
	    private JButton jbtNum8;
	    private JButton jbtNum9;
	    private JButton jbtNum10;
	    private JButton jbtNum11;
	    private JButton jbtNum12;
	    private JButton jbtNum13;
	    private JButton jbtNum14;
	    private JButton jbtNum15;
	    private JButton jbtNum16;
	    private JButton jbtNum17;
	    private JButton jbtNum18;
	    private JButton jbtNum19;
	    private JButton jbtNum20;
	    private JButton jbtNum21;
	    private JButton jbtNum22;
	    private JButton jbtNum23;
	    private JButton jbtNum24;
	    private JButton jbtNum25;
	    private JButton jbtNum26;
	    private JButton jtfResult;

	    Boolean addBool = false;
	    Boolean subBool = false;
	    Boolean divBool = false;
	    Boolean mulBool = false;

	    String display = "";

	    public GraphicsController() {

	        JPanel p1 = new JPanel();
	        p1.setLayout(new GridLayout(4, 3));
	        // Add all of the buttons of the alphabet manually. 
	        p1.add(jbtNum1 = new JButton("A"));
	        p1.add(jbtNum2 = new JButton("B"));
	        p1.add(jbtNum3 = new JButton("C"));
	        p1.add(jbtNum4 = new JButton("D"));
	        p1.add(jbtNum5 = new JButton("E"));
	        p1.add(jbtNum6 = new JButton("F"));
	        p1.add(jbtNum7 = new JButton("G"));
	        p1.add(jbtNum8 = new JButton("H"));
	        p1.add(jbtNum9 = new JButton("I"));
	        p1.add(jbtNum10 = new JButton("J"));
	        p1.add(jbtNum11 = new JButton("K"));
	        p1.add(jbtNum12 = new JButton("K"));
	        p1.add(jbtNum13 = new JButton("M"));
	        p1.add(jbtNum14 = new JButton("N"));
	        p1.add(jbtNum15 = new JButton("O"));
	        p1.add(jbtNum16 = new JButton("P"));
	        p1.add(jbtNum17 = new JButton("Q"));
	        p1.add(jbtNum18 = new JButton("R"));
	        p1.add(jbtNum19 = new JButton("S"));
	        p1.add(jbtNum20 = new JButton("T"));
	        p1.add(jbtNum21 = new JButton("U"));
	        p1.add(jbtNum22 = new JButton("V"));
	        p1.add(jbtNum23 = new JButton("W"));
	        p1.add(jbtNum24 = new JButton("X"));
	        p1.add(jbtNum25 = new JButton("Y"));
	        p1.add(jbtNum26 = new JButton("Z"));
	        
	        JPanel p2 = new JPanel();
	        p2.setLayout(new FlowLayout());

	        JPanel p = new JPanel();
	        p.setLayout(new GridLayout());
	        p.add(p2, BorderLayout.NORTH);
	        p.add(p1, BorderLayout.SOUTH);

	        add(p);

	        jbtNum1.addActionListener(new ListenToA());
	        jbtNum2.addActionListener(new ListenToB());
	        jbtNum3.addActionListener(new ListenToC());
	        jbtNum4.addActionListener(new ListenToD());
	        jbtNum5.addActionListener(new ListenToE());
	        jbtNum6.addActionListener(new ListenToF());
	        jbtNum7.addActionListener(new ListenToG());
	        jbtNum8.addActionListener(new ListenToH());
	        jbtNum9.addActionListener(new ListenToI());
	        jbtNum10.addActionListener(new ListenToJ());
	        jbtNum11.addActionListener(new ListenToK());
	        jbtNum12.addActionListener(new ListenToL());
	        jbtNum13.addActionListener(new ListenToM());
	        jbtNum14.addActionListener(new ListenToN());
	        jbtNum15.addActionListener(new ListenToO());
	        jbtNum16.addActionListener(new ListenToP());
	        jbtNum17.addActionListener(new ListenToQ());
	        jbtNum18.addActionListener(new ListenToR());
	        jbtNum19.addActionListener(new ListenToS());
	        jbtNum20.addActionListener(new ListenToT());
	        jbtNum21.addActionListener(new ListenToU());
	        jbtNum22.addActionListener(new ListenToV());
	        jbtNum23.addActionListener(new ListenToX());
	        jbtNum24.addActionListener(new ListenToX());
	        jbtNum25.addActionListener(new ListenToY());
	        jbtNum25.addActionListener(new ListenToY());
	        jbtNum26.addActionListener(new ListenToZ());

	    } 

	    class ListenToClear implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            //display = jtfResult.getText();
	            jtfResult.setText("");
	            addBool = false;
	            subBool = false;
	            mulBool = false;
	            divBool = false;
	        }
	    }

	    /** Listener classes for the alphabets of the phonics. */ 
	    
	    class ListenToA implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "A");
	        }
	    }

	    class ListenToB implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "B");
	        }
	    }

	    class ListenToC implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "C");
	        }
	    }

	    class ListenToD implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "D");
	        }
	    }
	    
	    class ListenToE implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "E");
	        }
	    }

	    class ListenToF implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "F");
	        }
	    }

	    class ListenToG implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "G");
	        }
	    }

	    class ListenToH implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "H");
	        }
	    }
	    
	    class ListenToI implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "I");
	        }
	    }

	    class ListenToJ implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "J");
	        }
	    }

	    class ListenToK implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "K");
	        }
	    }

	    class ListenToL implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "L");
	        }
	    }
	    
	    class ListenToM implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "M");
	        }
	    }

	    class ListenToN implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "N");
	        }
	    }

	    class ListenToO implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "O");
	        }
	    }

	    class ListenToP implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "P");
	        }
	    }
	    
	    class ListenToQ implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "Q");
	        }
	    }

	    class ListenToR implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "R");
	        }
	    }

	    class ListenToS implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "S");
	        }
	    }

	    class ListenToT implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "T");
	        }
	    }
	    
	    class ListenToU implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "U");
	        }
	    }

	    class ListenToV implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "V");
	        }
	    }

	    class ListenToW implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "W");
	        }
	    }

	    class ListenToX implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "X");
	        }
	    }
	    
	    class ListenToY implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "Y");
	        }
	    }

	    class ListenToZ implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            display = jtfResult.getText();
	            jtfResult.setText(display + "Z");
	        }
	    }
	    
	    public static void main(String[] args) {
	        // Add in own main method here. 
	    	// TODO Auto-generated method stub
	        GraphicsController gc = new GraphicsController();
	        gc.pack();
	        gc.setLocationRelativeTo(null);
	        gc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        gc.setVisible(true);
	        // Add colors to make it more like Phonic Frog 
	        gc.getColorModel();
	        gc.setBackground(Color.GREEN);
	        gc.setTitle("Phonics Frog Graphics Controller");
	}
}
