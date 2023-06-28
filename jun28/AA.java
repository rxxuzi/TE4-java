package jun28;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class AA {
   private static String media = "./rsc/Mos.java";
   public static void main(String[] args) {
      //grayscale img as media
      File file = new File(media);
      //grayscale img as media
      try {
         Image img = ImageIO.read(file);
         int width = img.getWidth(null);
         int height = img.getHeight(null);
         //create a new image with the same size
         Image grayImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

         //convert to grayscale
         for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
               Color color = new Color(((BufferedImage) img).getRGB(x, y));
               int r = color.getRed();
               int g = color.getGreen();
               int b = color.getBlue();
               int gray = (r + g + b) / 3;

            }
         }
      }catch (Exception e){
         e.printStackTrace();
      }


   }
}
