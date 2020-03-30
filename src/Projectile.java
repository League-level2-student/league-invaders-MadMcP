import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GamePanel{
		
	Projectile(int x, int y, int width, int height){
		speed = 1;
	}
		
	void update() {
		y-=speed;
	}
		
	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
	}
}
