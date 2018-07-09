package passagensaereas;

import com.itextpdf.text.DocumentException;
import java.io.IOException;

public class PassagensAereas {

    public static void main(String[] args) throws IOException, DocumentException {
        GeraPDF p = new GeraPDF();
        p.func_geraEticket("teste.pdf");
    }
    
}
