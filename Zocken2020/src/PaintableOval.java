import java.awt.Color;

public class PaintableOval extends SimpleOval implements Paintable {

	public PaintableOval(double width, double height, double x, double y) {
		super(width, height, x, y);
	}

	public void paintTo(java.awt.Graphics g) {
		g.setColor(Color.getHSBColor(255, 204, 229));
		g.fillOval((int) pos.x, (int) pos.y, (int) width, (int) height);
	}
}
