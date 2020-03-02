import javax.swing.JFrame;

public class LeagueInvaders {
	
	JFrame frame;
	public static final int width = 500;
	public static final int height = 800;
	GamePanel gp;
	
	
	LeagueInvaders(){
		frame = new JFrame();
		gp = new GamePanel();
	}
	
	void setup(){
		frame.add(gp);
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(gp);
	}
	
	public static void main(String[] args) {
		LeagueInvaders li = new LeagueInvaders();
		li.setup();
	}
}
