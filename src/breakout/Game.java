package breakout;

import acm.graphics.GRect;

class Game {
	protected GRect frame;
	protected Ball ball;
	protected Paddle paddle;
	
	protected Game(int x, int y){
		frame = new GRect(x, y);
		paddle = new Paddle(x, y);
		ball = new Ball();
	}

	public void update(int mouseX) {
		paddle.update(mouseX);	
		ball.update(frame, paddle.pos);
	}
}