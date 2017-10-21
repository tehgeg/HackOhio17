import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/*
 * Represents a platform for the hero to stand on.
 */
public class Platform {
	
	private Point point;
	
	private int width;
	
	private int height;
	
	private Vector2D displacement;
	
	/*
	 * Constructor for the platform object
	 */
	public Platform(int x, int y, int width, int height) {
		point = new Point(x, y);
		this.width = width;
		this.height = height;
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
	
	public void	updatePos() {
		point.x += displacement.getX();
		point.y += displacement.getY();
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.RED);
		g.fillRect(getX(),getY(), this.width, this.height);
	}
	

}
