import java.awt.*;

public class MousePosition {
    public static void main(String[] args)throws InterruptedException{
        Thread t = new Thread(){
            @Override
            public void run(){
                while (true) {
                    try {
                        Thread.sleep(5000);

                        Point spot = MouseInfo.getPointerInfo().getLocation();
                        System.out.println(spot.getX() + ", " + spot.getY());

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
        Thread.sleep(40000);
        System.out.println("terminating or closing java program");
        System.exit(1);
    }
}
