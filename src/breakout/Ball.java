package breakout;

import acm.graphics.*;

class Ball {
	protected GOval pos;
	protected int xSpeed, ySpeed;
	
	protected Ball() {
		pos = new GOval(0, 0, 10, 10); xSpeed = 1; ySpeed = 1;
	}
	
	void update(GRect frame, GRect paddle) {
		GPoint futureX = new GPoint(pos.getX()+pos.getWidth()*Math.signum(xSpeed)/2, pos.getY());
		if(!frame.contains(futureX) || paddle.contains(futureX))
			xSpeed = -xSpeed;
		GPoint futureY = new GPoint(pos.getX(), pos.getY() + pos.getHeight()*Math.signum(ySpeed)/2);
		if(!frame.contains(futureY) || paddle.contains(futureY))
			ySpeed = -ySpeed;
		pos.setLocation(pos.getX() + xSpeed, pos.getY()+ ySpeed);
	}
	
}
