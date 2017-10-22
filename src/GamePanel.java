import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
	
private Thread thread;
	
	private boolean running;
	
	private int FPS = 60;
	
	private long targetTime = 1000 / FPS;
	
	public GamePanel() {
		super();
		setPreferredSize(new Dimension(game.WIDTH, game.HEIGHT));
		setFocusable(true);
		requestFocus();
	}
	private static final long serialVersionUID = 1L;

	final static int platWidth = 200;
	final static int platLength = 20;
	
	final static int plat1_InitX = game.WIDTH-256*6;
	final static int plat1_InitY = 144*6;
	
	final static int plat2_InitX = game.WIDTH-256*5;
	final static int plat2_InitY = 144*5;
	
	final static int plat3_InitX = game.WIDTH-256*4;
	final static int plat3_InitY = 144*4;
	
	final static int plat4_InitX = game.WIDTH-256*3;
	final static int plat4_InitY = 144*3;
	
	final static int plat5_InitX = game.WIDTH-256*2;
	final static int plat5_InitY = 144*2;
		
	final static int plat6_InitX = game.WIDTH-256;
	final static int plat6_InitY = 144;
	
	final static int plat7_InitX = game.WIDTH;
	final static int plat7_InitY = 0;
		
	private Platform plat1;
	private Platform plat2;
	private Platform plat3;
	private Platform plat4;
	private Platform plat5;
	private Platform plat6;
	private Platform plat7;

	
	public void addNotify() {
		super.addNotify();
		if (thread == null) {
		thread = new Thread(this);
		thread.start();
		}
		running = true;
	}
	
	
	
	public void init() {
		plat1 = new Platform(plat1_InitX, plat1_InitY, platWidth, platLength);
		plat2 = new Platform(plat2_InitX, plat2_InitY, platWidth, platLength);
		plat3 = new Platform(plat3_InitX, plat3_InitY, platWidth, platLength);
		plat4 = new Platform(plat4_InitX, plat4_InitY, platWidth, platLength);
		plat5 = new Platform(plat5_InitX, plat5_InitY, platWidth, platLength);
		plat6 = new Platform(plat6_InitX, plat6_InitY, platWidth, platLength);
		plat7 = new Platform(plat7_InitX, plat7_InitY, platWidth, platLength);
		Vector2D displacement = new Vector2D(-16, 9);
		plat1.setDisplacement(displacement);
		plat2.setDisplacement(displacement);
		plat3.setDisplacement(displacement);
		plat4.setDisplacement(displacement);
		plat5.setDisplacement(displacement);
		plat6.setDisplacement(displacement);
		plat7.setDisplacement(displacement);
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
		plat1.updatePos();
		plat2.updatePos();
		plat3.updatePos();
		plat4.updatePos();
		plat5.updatePos();
		plat6.updatePos();
		plat7.updatePos();
	}



	/*
	 * Updates game objects.
	 */
	@Override
	public void paintComponent(Graphics g) {
			super.paintComponent(g);
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
	}
	

}

