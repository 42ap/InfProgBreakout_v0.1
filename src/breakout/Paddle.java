package breakout;

import acm.graphics.GRect;

public class Paddle {
	
	protected GRect pos;

	protected Paddle(int x, int y) {
		pos = new GRect(x/2 - 25, y*7.0/8.0, 60, 10);
	}

	public void update(int mouseX) {
		if(mouseX < pos.getX())
			pos.setLocation(pos.getX() - 1, pos.getY());
		if(mouseX > pos.getX()+pos.getWidth())
			pos.setLocation(pos.getX() + 1, pos.getY());
	}
}
