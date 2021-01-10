package id.ac.its.Snake;

import java.awt.event.KeyEvent;

public class Head extends Sprite {

	char direction = 'R';
	boolean running = true;
// private MyRectangle[] body;
	Body bodyParts[] = new Body[GamePanel.GAME_UNITS];
// Body[] bodyParts;
	int bodyLength = 4;

	public Head(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		initHead();
	}

	private void initHead() {
		loadImage("img/snakeHead.png");
		getImageDimensions();

		for (int i = 0; i < bodyLength; i++) {

			bodyParts[i] = new Body(x - GamePanel.UNIT_SIZE, y - GamePanel.UNIT_SIZE);
		}
	}

	public void grow() {
		bodyLength++;
		bodyParts[bodyLength - 1] = new Body(x, y);
	}

	public void move() {
		for (int i = bodyLength - 1; i >= 0; i--) {
//   System.out.println(i);
			if (i == 0) {
				bodyParts[i].setX(x);
				bodyParts[i].setY(y);
			} else {
				bodyParts[i].setX(bodyParts[i - 1].getX());
				bodyParts[i].setY(bodyParts[i - 1].getY());
			}

//   bodyParts[i] = bodyParts[i].setX(bodyParts[i-1].getX());
//   bodyParts[i].x = bodyParts[i].setX(bodyParts[i-1].getX());

		}

		switch (direction) {
		case 'U':
			y = y - GamePanel.UNIT_SIZE;
			break;
		case 'D':
			y = y + GamePanel.UNIT_SIZE;
			break;
		case 'L':
			x = x - GamePanel.UNIT_SIZE;
			break;
		case 'R':
			x = x + GamePanel.UNIT_SIZE;
			break;
		}
	}

	public boolean checkCollisions() {
//  System.out.println(x+" "+y);
		// checks if head collides with body
		for (int i = bodyLength - 1; i >= 0; i--) {
			if (x == bodyParts[i].getX() && y == bodyParts[i].getY()) {
//    System.out.println(x+" "+y);
				running = false;
			}
		}
		// check if head touches left border
		if (x < 0) {
//   System.out.println("stop1"+x);
			running = false;
		}
		// check if head touches right border
		if (x >= GamePanel.SCREEN_WIDTH) {
//   System.out.println("stop2");
			running = false;
		}
		// check if head touches top border
		if (y < 0) {
//   System.out.println("stop3");
			running = false;
		}
		// check if head touches bottom border
		if (y >= GamePanel.SCREEN_HEIGHT) {
//   System.out.println("stop4");
			running = false;
		}

		return running;

	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			if (direction != 'R') {
				direction = 'L';
			}
			break;
		case KeyEvent.VK_RIGHT:
			if (direction != 'L') {
				direction = 'R';
			}
			break;
		case KeyEvent.VK_UP:
			if (direction != 'D') {
				direction = 'U';
			}
			break;
		case KeyEvent.VK_DOWN:
			if (direction != 'U') {
				direction = 'D';
			}
			break;
		}
	}

}