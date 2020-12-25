package id.ac.its.SnakeLagi;

import java.awt.Color;
import java.awt.Graphics;

public class Apple extends Sprite{

	public Apple(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		initApple();
	}
	
	private void initApple() {
		loadImage("img/apple.png");
        getImageDimensions();
	}

}
