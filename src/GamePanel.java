import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class GamePanel extends JPanel implements ActionListener{
	Scanner in = new Scanner(System.in);
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	
	public GamePanel() {
		super();
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		requestFocus();
	}
	
	public void paintComponent(Graphics g) {
		int centerPanelX = WIDTH / 2; 
		int centerPanelY = HEIGHT / 2;
		JButton button = new JButton("Goodbye World");
		// Calculate the starting point for the centered string
		int strX = centerPanelX - (int)(button.getWidth() / 2); 
		int strY = centerPanelY + (int)(button.getHeight() / 2);
		button.setBounds(strX , strY , 100 , 30);
		add(button);
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		JLabel jl = new JLabel("Goodbye");
		add(jp);
		add(jl);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Goodbye");
		game.changePanelMenu();
	}
}

