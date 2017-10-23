import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.event.AncestorListener;


public class GamePanelLeft extends JPanel implements Runnable {


	private static String userStr;

	private Thread thread;

	private boolean running;

	private int FPS = 60;

	private long targetTime;

	private static final long serialVersionUID = 1L;

	final static int platWidth = 200;
	final static int platLength = 20;
	final static int x_inc = 288;
	final static int y_inc = 144;

	final static int plat1_InitX = game.WIDTH-x_inc*5;
	final static int plat1_InitY = y_inc*5;


	final static int plat2_InitX = game.WIDTH-x_inc*4;
	final static int plat2_InitY = y_inc*4;

	final static int plat3_InitX = game.WIDTH-x_inc*3;
	final static int plat3_InitY = y_inc*3;

	final static int plat4_InitX = game.WIDTH-x_inc*2;
	final static int plat4_InitY = y_inc*2;

	final static int plat5_InitX = game.WIDTH-x_inc*1;
	final static int plat5_InitY = y_inc*1;

	final static int plat6_InitX = game.WIDTH-x_inc*0;
	final static int plat6_InitY = y_inc*0;

	final static int plat7_InitX = game.WIDTH-x_inc*-1;
	final static int plat7_InitY = y_inc*-1;

	final static int hero_InitX = plat4_InitX + 70;
	final static int hero_InitY = plat4_InitY - 92;


	char[] arr = RandomChars.generateLeft(1000000);
	public static int charIndex = 0;
	private static int index = 3;

	private Platform plat1;
	private Platform plat2;
	private Platform plat3;
	private Platform plat4;
	private Platform plat5;
	private Platform plat6;
	private Platform plat7;
	private Hero hero;


	public GamePanelLeft(int time) {
		super();
		setPreferredSize(new Dimension(game.WIDTH, game.HEIGHT));
		setFocusable(true);
		requestFocus();
		this.targetTime = time/FPS;	
		this.listenUp();
	}


	public void addNotify() {
		super.addNotify();
		if (thread == null) {
			thread = new Thread(this);
			thread.start();
		}
		running = true;
	}



	public void init() {

		plat1 = new Platform(plat1_InitX, plat1_InitY, platWidth, platLength, "");
		plat2 = new Platform(plat2_InitX, plat2_InitY, platWidth, platLength, "");
		plat3 = new Platform(plat3_InitX, plat3_InitY, platWidth, platLength, "");
		plat4 = new Platform(plat4_InitX, plat4_InitY, platWidth, platLength, "");
		plat5 = new Platform(plat5_InitX, plat5_InitY, platWidth, platLength, Character.toString(arr[0]));
		plat6 = new Platform(plat6_InitX, plat6_InitY, platWidth, platLength, Character.toString(arr[1]));
		plat7 = new Platform(plat7_InitX, plat7_InitY, platWidth, platLength, Character.toString(arr[2]));
		hero = new Hero(hero_InitX, hero_InitY, "Left");

		Vector2D displacement = new Vector2D(-2, 1);

		plat1.setDisplacement(displacement);
		plat2.setDisplacement(displacement);
		plat3.setDisplacement(displacement);
		plat4.setDisplacement(displacement);
		plat5.setDisplacement(displacement);
		plat6.setDisplacement(displacement);
		plat7.setDisplacement(displacement);
		hero.setDisplacement(displacement);
	}



	@Override
	public void run() {
		init();
		long start;
		long elapsed;
		long wait;
		while (running) {
			start = System.nanoTime();
			update();
			elapsed = System.nanoTime() - start;
			wait = targetTime - elapsed / 1000000;
			if (wait < 0 ) wait = 5;
			try {
				Thread.sleep(wait);
			} catch (Exception e) {
				e.printStackTrace();
			}
			repaint();
		}
	}	
	/*
	 * Updates the position of the platforms
	 */
	public void update() {

		boolean inc = plat1.updatePos(index, arr);
		if(inc) {
			index++;
		}
		boolean inc2 = plat2.updatePos(index, arr);
		if(inc2) {
			index++;
		}
		boolean inc3 = plat3.updatePos(index, arr);
		if(inc3) {
			index++;
		}
		boolean inc4 = plat4.updatePos(index, arr);
		if(inc4) {
			index++;
		}
		boolean inc5 = plat5.updatePos(index, arr);
		if(inc5) {
			index++;
		}
		boolean inc6 = plat6.updatePos(index, arr);
		if(inc6) {
			index++;
		}
		boolean inc7 = plat7.updatePos(index, arr);
		if(inc7) {
			index++;
		}
		boolean heroBool = hero.updatePos();
		if (heroBool) {
			System.out.print("GAME OVER");
		}
	}



	/*
	 * Updates game objects.
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("src/images/clear_blue_sky_panorama-wallpaper-1280x720.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(img, 0, 0, null);
		if (plat1 != null) {
			plat1.draw((Graphics2D) g);
		}
		if (plat2 != null) {
			plat2.draw((Graphics2D) g);
		}
		if (plat3 != null) {
			plat3.draw((Graphics2D) g);
		}
		if (plat4 != null) {
			plat4.draw((Graphics2D) g);
		}
		if (plat5 != null) {
			plat5.draw((Graphics2D) g);
		}
		if (plat6 != null) {
			plat6.draw((Graphics2D) g);
		}
		if (plat7 != null) {
			plat7.draw((Graphics2D) g);
		}
		if (hero != null) {
			hero.draw((Graphics2D) g);
		}
	}

	public void listenUp() {
		this.addKeyListener(new KeyListener(){

			@Override
			public void keyPressed(KeyEvent e) {


			}

			@Override
			public void keyReleased(KeyEvent e) {


			}

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == arr[charIndex]) {
					Hero.jump = true;
				}
			}

		});
		this.setFocusable(true);
	}


}

