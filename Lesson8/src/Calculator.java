import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class Calculator {

	//JPanel windowContent;
	public JFormattedTextField displayFormattedField;
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button10;
	JButton button11;
	JButton button12;
	JButton button13;
	JButton button14;
	JButton button15;
	JButton button16;
	JButton button17;
	JButton button18;
	JButton button19;
	JButton button20;
	JButton button21;
	JButton button22;
	JButton button23;
	JButton button24;
	JButton button25;
	JButton button26;
	JButton button27;
	
	
	static JPanel p1;
	
	Calculator(){
		p1 = new JPanel();
		GridBagLayout gbl = new GridBagLayout();
		p1.setLayout(gbl);
		
			
		GridBagConstraints constr = new GridBagConstraints();
		
		
		constr.gridx = 0;
		constr.gridy = 0;
		constr.gridheight = 1;
		constr.gridwidth = 6;
		constr.fill = constr.BOTH;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.anchor= constr.CENTER;
		constr.insets = new Insets(5,5,5,5);
		displayFormattedField = new JFormattedTextField();
		gbl.setConstraints(displayFormattedField, constr);
		displayFormattedField.setHorizontalAlignment(SwingConstants.RIGHT);
		p1.add(displayFormattedField);	
			
		button0 = new JButton("MC");
		constr.gridx = 0;
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.fill = constr.BOTH;
		constr.anchor= constr.WEST;
		constr.insets = new Insets(5,5,0,5);
		gbl.setConstraints(button0, constr);
		p1.add(button0);
		
		button1 = new JButton("MR");
		constr.gridx = 0;
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,5);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button1, constr);
		p1.add(button1);
		
		button2 = new JButton("MS");
		constr.gridx = 0;
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,5);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button2, constr);
		p1.add(button2);
		
		button3 = new JButton("M+");
		constr.gridx = 0;
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,5,5);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button3, constr);
		p1.add(button3);
		
		button4 = new JButton("Backspase");
		constr.gridx = 1;
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 2;
		constr.ipadx = 0;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button4, constr);
		p1.add(button4);
		
		button5 = new JButton("7");
		constr.gridx = 1;
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button5, constr);
		p1.add(button5);
		
		button6 = new JButton("4");
		constr.gridx = 1;
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button6, constr);
		p1.add(button6);
		
		button7 = new JButton("1");
		constr.gridx = 1;
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button7, constr);
		p1.add(button7);
		
		button8 = new JButton("0");
		constr.gridx = 1;
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,5,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button8, constr);
		p1.add(button8);
		
		button9 = new JButton("CE");
		constr.gridx = 3;
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 2;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button9, constr);
		p1.add(button9);
		
		button10 = new JButton("8");
		constr.gridx = 2;
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button10, constr);
		p1.add(button10);
		
		button11 = new JButton("5");
		constr.gridx = 2;
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button11, constr);
		p1.add(button11);
		
		button12 = new JButton("2");
		constr.gridx = 2;
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button12, constr);
		p1.add(button12);
		
		button13 = new JButton("+/-");
		constr.gridx = 2;
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,5,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button13, constr);
		p1.add(button13);
		
		button14 = new JButton("9");
		constr.gridx = 3;
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button14, constr);
		p1.add(button14);
		
		button15 = new JButton("6");
		constr.gridx = 3;
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button15, constr);
		p1.add(button15);
		
		button16 = new JButton("3");
		constr.gridx = 3;
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button16, constr);
		p1.add(button16);
		
		button17 = new JButton(".");
		constr.gridx = 3;
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,5,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button17, constr);
		p1.add(button17);
		
		button18 = new JButton("/");
		constr.gridx = 4;
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button18, constr);
		p1.add(button18);
		
		button19 = new JButton("*");
		constr.gridx = 4;
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button19, constr);
		p1.add(button19);
		
		button20 = new JButton("-");
		constr.gridx = 4;
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button20, constr);
		p1.add(button20);
		
		button21 = new JButton("+");
		constr.gridx = 4;
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,5,0);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button21, constr);
		p1.add(button21);
		
		button22 = new JButton("C");
		constr.gridx = 5;
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,5);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button22, constr);
		p1.add(button22);
		
		button23 = new JButton("sqrl");
		constr.gridx = 5;
		constr.gridy = 2;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,5);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button23, constr);
		p1.add(button23);
		
		button24 = new JButton("%");
		constr.gridx = 5;
		constr.gridy = 3;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,5);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button24, constr);
		p1.add(button24);
		
		button25 = new JButton("1/x");
		constr.gridx = 5;
		constr.gridy = 4;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,0,5);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button25, constr);
		p1.add(button25);
		
		button26 = new JButton("=");
		constr.gridx = 5;
		constr.gridy = 5;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		constr.weightx = 1.0;
		constr.weighty = 1.0;
		constr.insets = new Insets(5,5,5,5);
		constr.fill = constr.BOTH;
		constr.anchor= constr.CENTER;
		gbl.setConstraints(button26, constr);
		p1.add(button26);
		
		JFrame frame = new JFrame("Calculator");
		frame.setContentPane(p1);
		frame.setSize(300,200);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		
		CalculatorEngine2 calcEngine = new CalculatorEngine2(this);

		button0.addActionListener(calcEngine);
		button1.addActionListener(calcEngine);
		button2.addActionListener(calcEngine);
		button3.addActionListener(calcEngine);
		button4.addActionListener(calcEngine);
		button5.addActionListener(calcEngine);
		button6.addActionListener(calcEngine);
		button7.addActionListener(calcEngine);
		button8.addActionListener(calcEngine);
		button9.addActionListener(calcEngine);
		button10.addActionListener(calcEngine);
		button11.addActionListener(calcEngine);
		button12.addActionListener(calcEngine);
		button13.addActionListener(calcEngine);
		button14.addActionListener(calcEngine);
		button15.addActionListener(calcEngine);
		button16.addActionListener(calcEngine);
		button17.addActionListener(calcEngine);
		button18.addActionListener(calcEngine);
		button19.addActionListener(calcEngine);
		button20.addActionListener(calcEngine);
		button21.addActionListener(calcEngine);
		button22.addActionListener(calcEngine);
		button23.addActionListener(calcEngine);
		button24.addActionListener(calcEngine);
		button25.addActionListener(calcEngine);
		button26.addActionListener(calcEngine);
		
		
			
	}
	
 public void setDisplayValue(String val){
			 displayFormattedField.setText(val);
		 }
	public String getDisplayValue() {
			return displayFormattedField.getText();
		}
	
	public static void main (String [] args){
	Calculator calc = new Calculator();
	
	}
	
}