package passagensaereas;

import Disco.Disco;
import static Disco.Disco.agendaPassagem;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import passagensaereas.AppInicio;

public class GeraPDF {
    
    public void func_geraEticket(String nomeArq) throws IOException, DocumentException {
        //mesmo da passagem

        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        String arq = "TESTE.pdf";
        
     try {
            PdfWriter.getInstance(document, new FileOutputStream(arq));
            document.open();
            Image logo;
            try {
                logo = Image.getInstance("logoOrca2.png");
                document.add(logo);
                logo.setAlignment(0);
            } catch (BadElementException | IOException ex) {
                Logger.getLogger(GeraPDF.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            document.add(new Paragraph(" "));
                        
            Font f = new Font(Font.FontFamily.TIMES_ROMAN, 15, Font.ITALIC);
            Paragraph p = new Paragraph();
            document.add(new Paragraph("E-ticket", f));
            p.setAlignment(50);
            
        } catch (DocumentException ex) {
            System.out.println("Erro: " + ex.toString());
        } finally {
            document.close();
        }
        
        //abre o pdf gerado
        try {
            Desktop.getDesktop().open(new File(arq));
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.toString());
        }
    }
   
}