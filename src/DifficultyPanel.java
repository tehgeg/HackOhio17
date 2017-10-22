import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class DifficultyPanel extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Width and height of the window
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	
	private static String side;
	
	//Initialization of the buttons
	public static JButton easy_button = new JButton("Easy");
	public static JButton medium_button = new JButton("Medium");
	public static JButton hard_button = new JButton("Hard");
		
	
	public DifficultyPanel(String side) {
		//Usually done for us
		super();
		//Set the dimensions
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		//Allows the JPanel to be focused
		setFocusable(true);
		//Focus on the JPanel
		requestFocus();
		this.side = side;
	}
	
	public void paintComponent(Graphics g) {
		System.out.println("Testing");
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
		easy_button.setBounds(355, 390, 150, 30);
		medium_button.setBounds(565 , 390 , 150 , 30);
		hard_button.setBounds(775, 390, 150, 30);
		
		//Add the buttons to the panel
		add(easy_button);
		add(medium_button);
		add(hard_button);
		
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		add(jp);
		
		//invokes the actionPerformed method
		easy_button.addActionListener(this);
		medium_button.addActionListener(this);
		hard_button.addActionListener(this);	
	}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == easy_button) {
				game.changePanelGame(1200, side);
			}
			else if(e.getSource() == medium_button) {
				game.changePanelGame(800, side);
			}
			else if(e.getSource() == hard_button) {
				game.changePanelGame(400, side);
			}
			else {
				System.out.println("Button Error! Close the game and try again.");
			}
		}
	}

