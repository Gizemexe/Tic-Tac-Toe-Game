import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToeGame {

	private JFrame frame;
	private JTextField xCount;
	private JTextField oCount;
    private int xCount1=0;
    private int oCount1=0;
    private String startGame="X";
    private int b1=10;
    private int b2=10;
    private int b3=10;
    private int b4=10;
    private int b5=10;
    private int b6=10;
    private int b7=10;
    private int b8=10;
    private int b9=10;
    private int i=0;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeGame window = new TicTacToeGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public TicTacToeGame() {
		initialize();
	}
	
	private void winningGame() {
		//For Player X 
		if(b1==1 && b2==1 && b3==1) {
			JOptionPane.showMessageDialog(frame, "Player X Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    xCount1++;
		    xCount.setText(String.valueOf(xCount1));
		}
		else if(b4==1 && b5==1 && b6==1) {
			JOptionPane.showMessageDialog(frame, "Player X Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    xCount1++;
		    xCount.setText(String.valueOf(xCount1));
		}	
		else if(b7==1 && b8==1 && b9==1) {
			JOptionPane.showMessageDialog(frame, "Player X Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    xCount1++;
		    xCount.setText(String.valueOf(xCount1));
		}
		else if(b1==1 && b5==1 && b9==1) {
			JOptionPane.showMessageDialog(frame, "Player X Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    xCount1++;
		    xCount.setText(String.valueOf(xCount1));
		}
		else if(b3==1 && b5==1 && b7==1) {
			JOptionPane.showMessageDialog(frame, "Player X Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    xCount1++;
		    xCount.setText(String.valueOf(xCount1));
		}
		else if(b1==1 && b4==1 && b7==1) {
			JOptionPane.showMessageDialog(frame, "Player X Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    xCount1++;
		    xCount.setText(String.valueOf(xCount1));
		}
		else if(b2==1 && b5==1 && b8==1) {
			JOptionPane.showMessageDialog(frame, "Player X Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    xCount1++;
		    xCount.setText(String.valueOf(xCount1));
		}
		else if(b3==1 && b6==1 && b9==1) {
			JOptionPane.showMessageDialog(frame, "Player X Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    xCount1++;
		    xCount.setText(String.valueOf(xCount1));
		}
		//For Player O
		else if(b1==0 && b2==0 && b3==0) {
			JOptionPane.showMessageDialog(frame, "Player O Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    oCount1++;
		    oCount.setText(String.valueOf(oCount1));
		}
		else if(b4==0 && b5==0 && b6==0) {
			JOptionPane.showMessageDialog(frame, "Player O Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    oCount1++;
		    oCount.setText(String.valueOf(oCount1));
		}	
		else if(b7==0 && b8==0 && b9==0) {
			JOptionPane.showMessageDialog(frame, "Player O Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    oCount1++;
		    oCount.setText(String.valueOf(oCount1));
		}
		else if(b1==0 && b5==0 && b9==0) {
			JOptionPane.showMessageDialog(frame, "Player O Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    oCount1++;
		    oCount.setText(String.valueOf(oCount1));
		}
		
		else if(b3==0 && b5==0 && b7==0) {
			JOptionPane.showMessageDialog(frame, "Player O Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    oCount1++;
		    oCount.setText(String.valueOf(oCount1));
		}
		else if(b1==0 && b4==0 && b7==0) {
			JOptionPane.showMessageDialog(frame, "Player O Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    oCount1++;
		    oCount.setText(String.valueOf(oCount1));
		}
		else if(b2==0 && b5==0 && b8==0) {
			JOptionPane.showMessageDialog(frame, "Player O Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    oCount1++;
		    oCount.setText(String.valueOf(oCount1));
		}
		else if(b3==0 && b6==0 && b9==0) {
			JOptionPane.showMessageDialog(frame, "Player O Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		    oCount1++;
		    oCount.setText(String.valueOf(oCount1));
		}
		//For "No one Wins"
		else if(i==9) {
			JOptionPane.showMessageDialog(frame, "No One Wins " , " Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		   
		}
	}
	
	
	private void choosePlayer() {
		if(startGame.equalsIgnoreCase("X")) {
			startGame="O";
		}
		else {
			startGame = "X";
		}
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Tic Tac Toe Game ");
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton button1 = new JButton("");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button1.setForeground(Color.RED);
					b1=1;
					i++;
				} else {
					button1.setForeground(Color.BLUE);	
					b1=0;
					i++;
					}
				choosePlayer();
				winningGame();
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(button1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton button2 = new JButton("");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button2.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button2.setForeground(Color.RED);
					b2=1;
					i++;
				} else {
					button2.setForeground(Color.BLUE);	
					b2=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(button2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton button3 = new JButton("");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button3.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button3.setForeground(Color.RED);
					b3=1;
					i++;
				} else {
					button3.setForeground(Color.BLUE);	
					b3=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_3.add(button3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel Label1 = new JLabel("Player X");
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		Label1.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel_4.add(Label1, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		xCount = new JTextField();
		xCount.setHorizontalAlignment(SwingConstants.CENTER);
		xCount.setFont(new Font("Tahoma", Font.BOLD, 25));
		xCount.setText("0");
		panel_5.add(xCount, BorderLayout.CENTER);
		xCount.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton button4 = new JButton("");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button4.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button4.setForeground(Color.RED);
					b4=1;
					i++;
				} else {
					button4.setForeground(Color.BLUE);	
					b4=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_6.add(button4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton button5 = new JButton("");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button5.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button5.setForeground(Color.RED);
					b5=1;
					i++;
				} else {
					button5.setForeground(Color.BLUE);	
					b5=0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_7.add(button5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton button6 = new JButton("");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button6.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button6.setForeground(Color.RED);
					b6=1;
					i++;
				} else {
					button6.setForeground(Color.BLUE);	
					b6=0;
					i++;
					}
				choosePlayer();
				winningGame();
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_8.add(button6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel Label2 = new JLabel("Player O");
		Label2.setHorizontalAlignment(SwingConstants.CENTER);
		Label2.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel_9.add(Label2, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		oCount = new JTextField();
		oCount.setFont(new Font("Tahoma", Font.BOLD, 25));
		oCount.setText("0");
		oCount.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(oCount, BorderLayout.CENTER);
		oCount.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton button7 = new JButton("");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button7.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button7.setForeground(Color.RED);
					b7=1;
					i++;
				} else {
					button7.setForeground(Color.BLUE);
					b7=0;
					i++;
					}
				choosePlayer();
				winningGame();
			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_11.add(button7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JButton button8 = new JButton("");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button8.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button8.setForeground(Color.RED);
					b8=1;
					i++;
				} else {
					button8.setForeground(Color.BLUE);
					b8=0;
					i++;
					}
				choosePlayer();
				winningGame();
			}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_12.add(button8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton button9 = new JButton("");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button9.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					button9.setForeground(Color.RED);
					b9=1;
					i++;
				} else {
					button9.setForeground(Color.BLUE);	
					b9=0;
					i++;
					}
				choosePlayer();
				winningGame();
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_13.add(button9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton Reset = new JButton("RESET");
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1.setText(null);
				button2.setText(null);
				button3.setText(null);
				button4.setText(null);
				button5.setText(null);
				button6.setText(null);
				button7.setText(null);
				button8.setText(null);
				button9.setText(null);  
			b1=10;
			b2=10;
			b3=10;
			b4=10;
			b5=10;
			b6=10;
			b7=10;
			b8=10;
			b9=10;
			i=0;
			}
			
		});
		Reset.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_14.add(Reset, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton Exit = new JButton("EXIT");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("EXIT");
			if(JOptionPane.showConfirmDialog(frame, "Confirm you want to Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		Exit.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_15.add(Exit, BorderLayout.CENTER);
	}

}
