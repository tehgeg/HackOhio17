import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {

final static int platWidth = 200;
final static int platLength = 20;

final static int plat1_InitX = 0;
final static int plat1_InitY = 0;

final static int plat2_InitX = 256;
final static int plat2_InitY = 144;

final static int plat3_InitX = 2*plat2_InitX;
final static int plat3_InitY = 2*plat2_InitY;

final static int plat4_InitX = 3*plat2_InitX;
final static int plat4_InitY = 3*plat2_InitY;

final static int plat5_InitX = 4*plat2_InitX;
final static int plat5_InitY = 4*plat2_InitY;
	
final static int plat6_InitX = 5*plat2_InitX;
final static int plat6_InitY = 5*plat2_InitY;

final static int plat7_InitX = 6*plat2_InitX;
final static int plat7_InitY = 6*plat2_InitY;
	
private Vector2D plat1;
private Vector2D plat2;
private Vector2D plat3;
private Vector2D plat4;
private Vector2D plat5;
private Vector2D plat6;
private Vector2D plat7;


public void init() {
	plat1 = new Vector2D(plat1_InitX, plat1_InitY);
	plat2 = new Vector2D(plat2_InitX, plat2_InitY);
	plat3 = new Vector2D(plat3_InitX, plat3_InitY);
	plat4 = new Vector2D(plat4_InitX, plat4_InitY);
	plat5 = new Vector2D(plat5_InitX, plat5_InitY);
	plat6 = new Vector2D(plat6_InitX, plat6_InitY);
	plat7 = new Vector2D(plat7_InitX, plat7_InitY);
	Vector2D displacement = new Vector2D(-16, -9);
	plat1.setDisplacement(displacement);
	plat2.setDisplacement(displacement);
	plat3.setDisplacement(displacement);
	plat4.setDisplacement(displacement);
	plat5.setDisplacement(displacement);
	plat6.setDisplacement(displacement);
	plat7.setDisplacement(displacement);
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
}
