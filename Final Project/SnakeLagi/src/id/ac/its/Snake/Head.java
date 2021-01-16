package id.ac.its.Snake;

import java.awt.event.KeyEvent;

public class Head extends Sprite {

	//Atribut
	char direction = 'R';
	boolean running = true;

	Body bodyParts[] = new Body[GamePanel.GAME_UNITS];

	private int bodyLength = 4;
	
	//Untuk mendapatkan panjang badan ular
	public int getBodyLength() {
		return bodyLength;
	}
	
	//Untuk mengubah panjang tubuh ular
	public void setBodyLength(int bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	//Constructor
	public Head(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		initHead();
	}

	//Untuk memuat gambar kepala ular dan dimensinya
	private void initHead() {
		loadImage("img/snakeHead.png");
		getImageDimensions();

		for (int i = 0; i < bodyLength; i++) {

			bodyParts[i] = new Body(x - GamePanel.UNIT_SIZE, y - GamePanel.UNIT_SIZE);
		}
	}

	//Untuk mentrack dan menambah panjang ular
	public void grow() {
		bodyLength++;
		bodyParts[bodyLength - 1] = new Body(x, y);
	}

	//Agar ular dapat bergerak dengan arah
	public void move() {
		for (int i = bodyLength - 1; i >= 0; i--) {
			if (i == 0) {
				bodyParts[i].setX(x);
				bodyParts[i].setY(y);
			} else {
				bodyParts[i].setX(bodyParts[i - 1].getX());
				bodyParts[i].setY(bodyParts[i - 1].getY());
			}

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

	//Untuk men-check apakah ada tabrakan
	public boolean checkCollisions() {
		// checks if head collides with body
		for (int i = bodyLength - 1; i >= 0; i--) {
			if (x == bodyParts[i].getX() && y == bodyParts[i].getY()) {
				running = false;
			}
		}
		// check if head touches left border
		if (x < 0) {

			running = false;
		}
		// check if head touches right border
		if (x >= GamePanel.SCREEN_WIDTH) {

			running = false;
		}
		// check if head touches top border
		if (y < 0) {

			running = false;
		}
		// check if head touches bottom border
		if (y >= GamePanel.SCREEN_HEIGHT) {

			running = false;
		}

		return running;

	}

	//Untuk men-check apabila tombol tertekan 
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