package breakout;

import acm.program.GraphicsProgram;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Breakout extends GraphicsProgram {
    static int mouseX;
    
    public void run() {
    	setSize(600, 400);
    	Game game = new Game(600, 400);
        add(game.frame);
        game.frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mouseX = e.getX();
            }
        });
        add(game.paddle.pos);
        add(game.ball.pos);
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        while(true) {
        	if(game.ball.pos.getY() > 390)
        		break;
        	game.update(mouseX);
        	try {
        		Thread.sleep(4);
        	} catch (InterruptedException e) {
        		e.printStackTrace();
        	}
        }
        
    }
}