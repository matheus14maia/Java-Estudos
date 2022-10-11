import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenshotItens {
    private static double percent;

    public static double getPercent() {
        return percent;
    }

    public static void main(String args, String tipo) throws IOException, AWTException {
        Robot r = new Robot();

        BufferedImage screenshot = r.createScreenCapture(new Rectangle(178, 9, 1010, 718));
        ImageIO.write(screenshot, "png", new File("d:\\Screenshot Receitanet\\empresa"+args+".png"));

        BufferedImage img1 = ImageIO.read(new File("d:\\Screenshot Receitanet\\"+tipo+".png"));
        BufferedImage img2 = ImageIO.read(new File("d:\\Screenshot Receitanet\\empresa"+args+".png"));

        int w1 = img1.getWidth();
        int h1 = img1.getHeight();

        long diff = 0;
        for (int i = 0; i < h1; i++) {
            for (int j = 0; j < w1; j++) {
                int pixel1 = img1.getRGB(j, i);
                Color color1 = new Color(pixel1, true);
                int r1 = color1.getRed();
                int g1 = color1.getGreen();
                int b1 = color1.getBlue();

                int pixel2 = img2.getRGB(j, i);
                Color color2 = new Color(pixel2, true);
                int r2 = color2.getRed();
                int g2 = color2.getGreen();
                int b2 = color2.getBlue();

                long data = Math.abs(r1 - r2) + Math.abs(g1 - g2) + Math.abs(b1 - b2);
                diff = diff + data;
            }
        }

        double avg = diff/(w1*h1*3);
        percent = (avg/255)*100;
        //System.out.println("Difference: "+percent);
    }
}
