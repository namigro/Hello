import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCustomizableGUI extends JPanel{

	JPanel p1;
	JPanel p2;
	JLabel lColor;
	JLabel lFont;
	JLabel lSize;
	JComboBox color;
	JComboBox font;
	JComboBox size;
	JTextField t;
	JDialog d;
	JFrame frame;
	JButton Pref;
	JButton Cancel;
	JButton Save;
	String [] colorList = {"Red", "Blue", "Yellow", "Pink", "Green",
			"Orange", "Cyan", "Magenta"};
	String [] fontList = {"Comic Sans MS", "Times New Roman",
			"Arial", "Symbol"};
	String [] sizeList = {"10", "12", "14", "16", "18", "20", "22"};
	
	
	
	MyCustomizableGUI(){
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		t = new JTextField(20);
		Pref = new JButton ("Preferences");
		this.add(t);
		this.add(Pref);
		Pref.addActionListener(evt->
		d.setVisible(true));
	
	frame = new JFrame("My text editor");
	frame.setContentPane(this);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	d = new JDialog(frame, "Dialog", true);
	d.setLayout(new BorderLayout());
	
	p1 = new JPanel();
	p1.setLayout(new GridLayout(3,2));
	
	p2 = new JPanel();
	p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
	
	lColor = new JLabel("ֲûבונטעו צגוע: ");
	color = new JComboBox(colorList);
	
	lFont = new JLabel("ֲûבונטעו רנטפע: ");
	font = new JComboBox(fontList);
	
	lSize = new JLabel("ֲûבונטעו נאחלונ רנטפעא: ");
	size = new JComboBox(sizeList);
	
	Cancel = new JButton ("Cancel");
	Save = new JButton ("Save");
	
	p1.add(lColor);
	p1.add(color);
	p1.add(lFont);
	p1.add(font);
	p1.add(lSize);
	p1.add(size);
	p2.add(Cancel);
	p2.add(Save);
	
	d.add(BorderLayout.NORTH, p1);
	d.add(BorderLayout.SOUTH, p2);
	d.pack();
	
	Save.addActionListener(evt -> {
		String fontChoosen;
		int sizeChoosen;
		d.setVisible(false);
		
		if ((String) color.getSelectedItem()=="Red"){
			t.setForeground(Color.red);
		} if((String) color.getSelectedItem()=="Blue"){
			t.setForeground(Color.blue);
		} if ((String) color.getSelectedItem()=="Yellow"){
			t.setForeground(Color.yellow);
		} if((String) color.getSelectedItem()=="Green"){
			t.setForeground(Color.green);
		} if ((String) color.getSelectedItem()=="Pink"){
			t.setForeground(Color.pink);
		} if((String) color.getSelectedItem()=="Orange"){
			t.setForeground(Color.orange);
		} if ((String) color.getSelectedItem()=="Cyan"){
			t.setForeground(Color.cyan);
		} if((String) color.getSelectedItem()=="Magenta"){
			t.setForeground(Color.magenta);
		} 
		
		fontChoosen = (String) font.getSelectedItem();
		sizeChoosen = Integer.parseInt((String) size.getSelectedItem());
		t.setFont(new Font(fontChoosen, Font.PLAIN, sizeChoosen));
		
		UserPreferences userPrefs = new UserPreferences();
		userPrefs.setColor((String) color.getSelectedItem());
		userPrefs.setFont(fontChoosen);
		userPrefs.setFontSize(sizeChoosen);
		
		try (FileOutputStream fileOut = new FileOutputStream("preferences.ser");
				 ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);){

				objectOut.writeObject(userPrefs);

			} catch (IOException ioe) {
				System.out.println("I/O error: " + ioe.getMessage());
			}
		
	});
	
	
		Cancel.addActionListener(evt -> d.setVisible(false));
		
	}
	
	public void setFont (String f, int fs) {
		t.setFont(new Font(f, Font.PLAIN, fs));	
	}
	
	public static void main(String[] args) {
		
		MyCustomizableGUI custGUI = new MyCustomizableGUI();
		UserPreferences savedPrefs;
		
		try (FileInputStream fileIn = new FileInputStream("preferences.ser");
				 ObjectInputStream objectIn = new ObjectInputStream(fileIn);){

				savedPrefs = (UserPreferences) objectIn.readObject();

				if (savedPrefs.getColor().contains("Red")){
					custGUI.t.setForeground(Color.red);
					custGUI.color.setSelectedItem("Red");
				}if (savedPrefs.getColor().contains("Blue")){
					custGUI.t.setForeground(Color.blue);
					custGUI.color.setSelectedItem("Blue");
				}if (savedPrefs.getColor().contains("Green")){
					custGUI.t.setForeground(Color.green);
					custGUI.color.setSelectedItem("Green");
				}if (savedPrefs.getColor().contains("Yellow")){
					custGUI.t.setForeground(Color.yellow);
					custGUI.color.setSelectedItem("Yellow");
				}if (savedPrefs.getColor().contains("Pink")){
					custGUI.t.setForeground(Color.pink);
					custGUI.color.setSelectedItem("Pink");
				}if (savedPrefs.getColor().contains("Orange")){
					custGUI.t.setForeground(Color.orange);
					custGUI.color.setSelectedItem("Orange");
				}if (savedPrefs.getColor().contains("Cyan")){
					custGUI.t.setForeground(Color.cyan);
					custGUI.color.setSelectedItem("Cyan");
				}if (savedPrefs.getColor().contains("Magenta")){
					custGUI.t.setForeground(Color.magenta);
					custGUI.color.setSelectedItem("Magentta");
				}
				
				custGUI.setFont(savedPrefs.getFont(), savedPrefs.getFontSize());
				custGUI.font.setSelectedItem(savedPrefs.getFont());
				custGUI.size.setSelectedItem("" + savedPrefs.getFontSize());

			} catch (FileNotFoundException noFile) {
				// load default font and color
				custGUI.setFont("Arial", 25);
				custGUI.t.setForeground(Color.black);

			} catch (ClassNotFoundException noPrefs) {
				noPrefs.printStackTrace();
			} catch (IOException e) {
				 System.out.println("I/O Error: " + e.getMessage());
			} 
		}
	}
	