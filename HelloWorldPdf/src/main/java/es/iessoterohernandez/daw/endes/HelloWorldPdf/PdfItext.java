package es.iessoterohernandez.daw.endes.HelloWorldPdf;

import java.io.FileOutputStream;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.*;

public class PdfItext {
    public void main(String[] args) throws Exception {
        
    	
    	Document documento = new Document();
    	PdfWriter.getInstance(documento, new FileOutputStream("Hello World"));
    	documento.open();
    	documento.add(new Paragraph("Hola mundo"));
    	documento.close();
    }
}
