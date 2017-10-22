import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;

/*
 * Represents a platform for the hero to stand on.
 */
public class Platform {
	
	private static Font myFont = new Font ("Courier New", 1, 48);
	
	private Point point;
	
	private int width;
	
	private int height;
	
	private Vector2D displacement;
	
	private String character;

	
	/*
	 * Constructor for the platform object
	 */
	public Platform(int x, int y, int width, int height, String character) {
		point = new Point(x, y);
		this.width = width;
		this.height = height;
		this.character = character;
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
	
	public boolean updatePos(int index, char[] arr) {
		boolean offScreen = false;
		if((point.x == (game.WIDTH-288*6)) && (point.y == (144*6))) {
			point.x = game.WIDTH + 288;
			point.y = -144;
			this.setChar(Character.toString(arr[index]));
			offScreen = true;
		}
		point.x += displacement.getX();
		point.y += displacement.getY();
		return offScreen;
	}
	
	public void draw(Graphics2D g) {
		g.setFont (myFont);
		g.setColor(Color.RED);
		g.fillRect(getX(),getY(), this.width, this.height);
		g.setColor(Color.BLACK);
		g.drawString(this.getChar(), getX() + 90, getY() - 10);	
	}
	
	public String getChar() {
		return this.character;
	}
	
	public void setChar(String character) {
		this.character = character;
	}
	
}
