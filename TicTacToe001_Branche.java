import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {
	
	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel textfiled = new JLabel();
	JButton[] buttons = new JButton[9];
	boolean player1_turn;
 	
	TicTacToe(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		textfiled.setBackground(new Color(25,25,25));
		textfiled.setForeground(new Color(25,255,0));
		textfiled.setFont(new Font("Ink Free",Font.BOLD,75));
		textfiled.setHorizontalAlignment(JLabel.CENTER);
		textfiled.setText("Tic-Tac-Toe");
		textfiled.setOpaque(true);
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,800,100);
		
		title_panel.add(textfiled);
		frame.add(title_panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void firstTurn() {
		
	}
	
	public void check() {
		
	}
	
	public void xWins(int a, int b, int c) {
		
	}
	
	public void oWins(int a, int b, int c) {
		
	}

}
