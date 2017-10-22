import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Hero {

	private Point point;
	
	private Vector2D displacement;
	private Vector2D jumpDisplacement = new Vector2D(24,-12);
	private int jumpTicks = 0;
	static boolean jump;
	
	
	/*
	 * Constructor for the hero object
	 */
	public Hero(int x, int y) {
		point = new Point(x, y);
		jump = false;
	}
	
	public int getX() {
		return point.x;
	}
	
	public int getY() {
		return point.y;
	}
	
	public Vector2D getDisplacement() {
		return this.displacement;
	}
	
	public void setX(int x) {
		point.x = x;
	}
	
	public void setY(int y) {
		point.y = y;
	}
	
	public void setDisplacement(Vector2D v) {
		this.displacement = v;
	}
	
	public boolean updatePos() {
		boolean offScreen = false;
		// Standing position update
		if (!jump) {
		if((point.x == (game.WIDTH-(288*5)+70)) && (point.y == (144*5)-92)) {
			offScreen = true;
		}
		point.x += displacement.getX();
		point.y += displacement.getY();
		} else { // Jumping position update
			point.x += displacement.getX() + jumpDisplacement.getX();
			point.y += displacement.getY() + jumpDisplacement.getY();
			jumpTicks++;
			if (jumpTicks == 12) {
				jumpTicks = 0;
				jump = false;
			}
		}
		return offScreen;
	}
	
	public void draw(Graphics2D g) {
		if (!jump) {
			BufferedImage img = null;
			try {
				img = ImageIO.read(new File("src/images/player_stand.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			g.drawImage(img, getX(), getY(), null);
		} else {
			BufferedImage img = null;
			try {
				img = ImageIO.read(new File("src/images/player_jump.png"));
			} catch (IOException e) {
				e.printStackTrace();
		}
			g.drawImage(img, getX(), getY(), null);
	}
	
	}
}
