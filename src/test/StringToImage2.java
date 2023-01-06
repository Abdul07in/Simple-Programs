import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class StringToImage2 {
  public static void main(String[] args) {
    String text = "This is the text that will be converted to an image.";
    
    // Set image width and height
    int width = 600;
    int height = 200;
    
    // Create a BufferedImage object
    BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    // Get the graphics object for the image
    Graphics2D g2d = image.createGraphics();
    
    // Enable anti-aliasing for text
    g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    
    // Set the background color
    g2d.setColor(Color.WHITE);
    g2d.fillRect(0, 0, width, height);
    
    // Set the font and color for the text
    g2d.setFont(new Font("Arial", Font.PLAIN, 18));
    g2d.setColor(Color.BLACK);
    
    // Draw the text on the image
    g2d.drawString(text, 10, 30);
    
    // Dispose the graphics object
    g2d.dispose();
    
    // Save the image to a file
    File file = new File("image.png");
    try {
      ImageIO.write(image, "png", file);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
