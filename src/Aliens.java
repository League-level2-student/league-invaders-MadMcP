import java.awt.Color;
import java.awt.Graphics;

public class Aliens extends GamePanel{
	
	Aliens(int x, int y, int width, int height){
		speed = 1;
	}
	
	void update() {
		r.y+=speed;
	}
	
	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
	}
}
