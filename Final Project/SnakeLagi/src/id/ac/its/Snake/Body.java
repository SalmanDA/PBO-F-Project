package id.ac.its.Snake;

public class Body extends Sprite{
	 
	 public Body(int x, int y) {
	  super(x, y);
	  initBody();
	 }

	 private void initBody() {
	  loadImage("img/snakeBody.png");
	        getImageDimensions();

	 }

	}
