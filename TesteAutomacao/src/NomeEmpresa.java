import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

public class NomeEmpresa {
    public static String main() throws Exception {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String result =  (String) clipboard.getData(DataFlavor.stringFlavor);
        return result.replace(":", "_");
    }
}
