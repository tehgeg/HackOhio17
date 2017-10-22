import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MenuPanel extends JPanel implements ActionListener{
	Scanner in = new Scanner(System.in);
	//Width and height of the window
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	
	//Initialization of the buttons
	public static JButton left_button = new JButton("Left Half");
	public static JButton full_button = new JButton("Full Keyboard");
	public static JButton right_button = new JButton("Right Half");
	
	public MenuPanel() {
		//Usually done for us
		super();
		//Set the dimensions
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		//Allows the JPanel to be focused
		setFocusable(true);
		//Focus on the JPanel
		requestFocus();
	}
	
	public void paintComponent(Graphics g) {
		//Call paintComponent of the parent, not MenuPanel
		super.paintComponent(g);
		//Add image to the background for aestheticness
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("/Users/chiriac/Downloads/clear_blue_sky_panorama-wallpaper-1280x720.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(img, 0, 0, null);
			
		//Set bounds with manual numbers, just easier than figuring out why it was not aligned
		left_button.setBounds(355, 390, 150, 30);
		full_button.setBounds(565 , 390 , 150 , 30);
		right_button.setBounds(775, 390, 150, 30);
		
		//Add the buttons to the panel
		add(left_button);
		add(full_button);
		add(right_button);
		
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		add(jp);
		
		//invokes the actionPerformed method
		left_button.addActionListener(this);
		full_button.addActionListener(this);
		right_button.addActionListener(this);		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == left_button) {
			game.changePanelGame();
		}
		else if(e.getSource() == full_button) {
			game.changePanelGame();
		}
		else if(e.getSource() == right_button) {
			game.changePanelGame();
		}
		else {
			System.out.println("Button Error! Close the game and try again.");
		}
	}
}
