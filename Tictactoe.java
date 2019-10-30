
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Ttt extends JApplet implements MouseListener {
	

	private String playerName = "";

	private javax.swing.JLabel playerNumber;
	private java.awt.Panel buttonsPanel;

	private JButton[] buttons;
	private JButton buttonPlay;
	private boolean gotAWinner = false;

	public void init() {
		initComponents();
	}

	private void initComponents() {
		buttonsPanel = new java.awt.Panel();

		playerNumber = new javax.swing.JLabel(playerName, SwingConstants.CENTER);

		Font buttonFont = new Font("Times New Roman", Font.PLAIN, 30);

		buttonsPanel.setLayout(new java.awt.GridLayout(4, 3));

		buttons = new JButton[9];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].addMouseListener(this);
			buttons[i].setFont(buttonFont);
			buttonsPanel.add(buttons[i]);
		}

		playerNumber.setText("Your turn!");
		buttonsPanel.add(playerNumber);

		buttonPlay = new JButton("Play Again");
		buttonPlay.addMouseListener(this);
		buttonPlay.setEnabled(false);
		buttonsPanel.add(buttonPlay);

		add(buttonsPanel);
	}


	private void reset() {
		for (JButton b : buttons) {
			b.setText("");
			b.setBackground(null);
			b.addMouseListener(this);
			b.setEnabled(true);
			gotAWinner = false;
		}
		playerNumber.setText("Your turn!");
	}

	public void checkForWinner() {

		if (findThreeInARow()) {
			gotAWinner = true;
			String winnerName = (playerName == "X") ? "Human" : "Computer";
		

			playerNumber.setText(winnerName + " won!!! Congratulations!!!");
			endOfTheGame();
			buttonPlay.setEnabled(true);

		}
		else if(!checkEmptySquare())
		{
			endOfTheGame();
			playerNumber.setText("Try again");
			buttonPlay.setEnabled(true);
		}

	}

	public void mouseClicked(MouseEvent e) {
		javax.swing.JButton currentButton = (JButton) e.getComponent();

		if (currentButton == buttonPlay) {
			buttonPlay.setEnabled(false);
			reset();
		}

		if (currentButton.getText() == "") {
				currentButton.setText("X");
				checkForWinner();
				
				if(gotAWinner != true)
				{
				computerMove();
				checkForWinner();
				}

		}
		
		

	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	private boolean findThreeInARow() {
		if (buttons[0].getText() == buttons[1].getText()
				&& buttons[1].getText() == buttons[2].getText()
				&& buttons[0].getText() != "") {

			highliteWinningCombination(0, 1, 2);
			playerName = buttons[0].getText();
			return true;

		} else if (buttons[3].getText() == buttons[4].getText()
				&& buttons[4].getText() == buttons[5].getText()
				&& buttons[3].getText() != "") {
			highliteWinningCombination(3, 4, 5);
			playerName = buttons[3].getText();
			return true;

		} else if (buttons[6].getText() == buttons[7].getText()
				&& buttons[7].getText() == buttons[8].getText()
				&& buttons[6].getText() != "") {
			highliteWinningCombination(6, 7, 8);
			playerName = buttons[6].getText();
			return true;

		} else if (buttons[0].getText() == buttons[3].getText()
				&& buttons[3].getText() == buttons[6].getText()
				&& buttons[0].getText() != "") {
			highliteWinningCombination(0, 3, 6);
			playerName = buttons[0].getText();
			return true;

		} else if (buttons[1].getText() == buttons[4].getText()
				&& buttons[4].getText() == buttons[7].getText()
				&& buttons[1].getText() != "") {
			highliteWinningCombination(1, 4, 7);
			playerName = buttons[1].getText();
			return true;

		} else if (buttons[2].getText() == buttons[5].getText()
				&& buttons[5].getText() == buttons[8].getText()
				&& buttons[2].getText() != "") {
			highliteWinningCombination(2, 5, 8);
			playerName = buttons[2].getText();
			return true;

		} else if (buttons[0].getText() == buttons[4].getText()
				&& buttons[4].getText() == buttons[8].getText()
				&& buttons[0].getText() != "") {
			highliteWinningCombination(0, 4, 8);
			playerName = buttons[0].getText();
			return true;

		} else if (buttons[2].getText() == buttons[4].getText()
				&& buttons[4].getText() == buttons[6].getText()
				&& buttons[2].getText() != "") {

			highliteWinningCombination(2, 4, 6);
			playerName = buttons[2].getText();
			return true;
		}

		else
			return false;
	}

	private void highliteWinningCombination(int b1, int b2, int b3) {

		buttons[b1].setOpaque(true);
		buttons[b1].setBackground(Color.GREEN);
		buttons[b2].setOpaque(true);
		buttons[b2].setBackground(Color.GREEN);
		buttons[b3].setOpaque(true);
		buttons[b3].setBackground(Color.GREEN);
	}

	private void computerMove() {
		Random r = new Random();
		int i = r.nextInt(9);
		if ((!buttons[i].getText().equals("")) &&(checkEmptySquare())) {
			computerMove();
		} else if(checkEmptySquare()){
			buttons[i].setText("O");
		}
		else
		{
			return;
		}
	}
	
	private boolean checkEmptySquare()
	{
		for (int i = 0; i < buttons.length; i++) {
			if(buttons[i].getText() == "")
			{
				return true;
			}
			
		}
		return false;
	}
	
	private void endOfTheGame()
	{
		for(int i = 0; i < buttons.length; i++)
		{
			buttons[i].removeMouseListener(this);
			buttons[i].setEnabled(false);
		}
	}
}
