import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class SplitPDF {
    public static void main() throws IOException {
        String pathFile = TelaSplitPDF.getTxtPathPDF().replace("\\", "\\\\");
        String pathFolder = TelaSplitPDF.getTxtOutput().replace("\\", "\\\\");

        int pagInicial = 1;
        int pagFinal = 100;

        File pdfFile = new File(pathFile);
        PDDocument pdfDocument = PDDocument.load(pdfFile);

        Splitter splitter = new Splitter();
        splitter.setSplitAtPage(100);

        List<PDDocument> Pages = splitter.split(pdfDocument);

        Iterator<PDDocument> iterator = Pages.listIterator();

        while(iterator.hasNext()){
            PDDocument pd = iterator.next();
            pd.save(pathFolder + "\\" + "Páginas "+pagInicial+ " a "+ pagFinal + ".pdf");
           // System.out.printf("pdf %d gerado\n", i);
            pagInicial += pd.getNumberOfPages();
            pagFinal += pd.getNumberOfPages();
        }

        pdfDocument.close();
    }
}
