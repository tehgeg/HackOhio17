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
	
	public static void changePanelGame() {
		window.setContentPane(new GamePanel()); 
		window.setLayout(new BorderLayout());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null); 
		window.setVisible(true);
	}
	
	public static void changePanelGameLeft() {
		window.setContentPane(new GamePanelLeft()); 
		window.setLayout(new BorderLayout());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null); 
		window.setVisible(true);
	}
	
	public static void changePanelGameRight() {
		window.setContentPane(new GamePanelRight()); 
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

}
