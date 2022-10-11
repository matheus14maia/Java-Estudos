/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FicusMaheus
 */
import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;

public class Data {
    public static void data(Robot bot, String st) throws NoSuchFieldException, IllegalAccessException, InterruptedException {
        for (int i = 0; i < st.length(); i++) {
            String letter = Character.toString(st.charAt(i));
            String code = "VK_"+letter;

            Field f = KeyEvent.class.getField(code);
            int keyEvent = f.getInt(null);

            bot.keyPress(keyEvent);
            bot.keyRelease(keyEvent);
            Thread.sleep(500);
        }
    }
}