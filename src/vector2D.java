/*
 * Representation of a 2D vector for which game objects (platform/hero) will be positioned at.
 */
public class vector2D {
	/*
	 * Variables containing the x and y coordinates for some object
	 */
	private int x;
	private int y;
	
	/*
	 * Constructor for a 2D vector where @i is the x-coordinate and @j is the y-coordinate
	 */
	public vector2D(int i, int j) {
		x = i;
		y = j;
	}
	
	/*
	 * Returns the current x-coordinate of @this
	 */
	public int getX() {
		return this.x;
	}
	
	/*
	 * Returns the current y-coordinate of @this
	 */
	public int getY() {
		return this.y;
	}
	
	/*
	 * Sets the x-coordinate of @this and returns the old x-coordinate
	 */
	public int setX(int i) {
		int oldX = this.x;
		this.x = i;
		return oldX;
	}
	
	
	/*
	 * Sets the y-coordinate of @this and returns the old y-coordinate
	 */
	public int setY(int j) {
		int oldY = this.y;
		this.y = j;
		return oldY;
	}

	/*
	 * Adds vector @v2 to @this
	 */
	public void add(vector2D v2) {
		this.x += v2.getX();
		this.y += v2.getY();
	}
	
}
