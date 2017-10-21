import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/*
 * Represents a platform for the hero to stand on.
 */
public class platform {
	
	private Point point;
	
	private int length;
	
	private int width;
	
	private vector2D displacement;
	
	/*
	 * Constructor for the platform object
	 */
	public void platform(int x, int y, int length, int width) {
		point = new Point(x, y);
		this.length = length;
		this.width = width;
		
	}
	
	public int getX() {
		return point.x;
	}
	
	public int getY() {
		return point.y;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public vector2D getDisplacement() {
		return this.displacement;
	}
	
	public void setX(int x) {
		point.x = x;
	}
	
	public void setY(int y) {
		point.y = y;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setDisplacement(vector2D v) {
		this.displacement = v;
	}
	
	public void	updatePos() {
		point.x += displacement.getX();
		point.y += displacement.getY();
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.RED);
		g.fillRect(getX(),getY(), getLength(), getWidth());
	}
	


}
