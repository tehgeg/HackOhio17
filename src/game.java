import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class game extends JPanel{
	
	public game() {
		super();
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		requestFocus();
	}
	
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	public static final JFrame window = new JFrame("QuickType"); 

	public static void main(String[] args) {
		window.setContentPane(new MenuPanel()); 
		window.setLayout(new BorderLayout());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null); 
		window.setVisible(true);
	}
	
	public static void changePanelGame(int time, String side) {
		if(side.equals("left")) {
			window.setContentPane(new GamePanelLeft(time));
		}
		else if(side.equals("full")) {
			window.setContentPane(new GamePanel(time));
		}
		else if(side.equals("right")){
			window.setContentPane(new GamePanelRight(time));
		}
		//window.setContentPane(new GamePanel(time)); 
		window.setLayout(new BorderLayout());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null); 
		window.setVisible(true);
	}
	
	
	
	public static void changePanelMenu() {
		window.setContentPane(new MenuPanel()); 
		window.setLayout(new BorderLayout());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null); 
		window.setVisible(true);
	}
	
	public static void changeDifficulty(String diff) {
		if(diff.equals("left")) {
			window.setContentPane(new DifficultyPanel(diff)); 
		}
		else if(diff.equals("full")){
			window.setContentPane(new DifficultyPanel(diff)); 
		}
		else if(diff.equals("right")) {
			window.setContentPane(new DifficultyPanel(diff)); 
		}
		window.setLayout(new BorderLayout());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null); 
		window.setVisible(true);
	}

}
