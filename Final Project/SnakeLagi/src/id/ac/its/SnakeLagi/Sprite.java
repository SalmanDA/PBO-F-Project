package id.ac.its.SnakeLagi;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Sprite {
	
	protected int x;
    protected int y;
    protected int width = GamePanel.UNIT_SIZE;
    protected int height = GamePanel.UNIT_SIZE;
//    protected Color color;
    protected Image image;
    
	public Sprite(int x, int y) {
		this.x = x;
		this.y = y;
		
//		this.color = color;
	}
	
	protected void getImageDimensions() {

        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    protected void loadImage(String imageName) {

        ImageIcon ii = new ImageIcon(imageName);
        image = ii.getImage();
    }

    public Image getImage() {
        return image;
    }

//	public Color getColor() {
//		return color;
//	}
//
//	public void setColor(Color color) {
//		this.color = color;
//	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

}
