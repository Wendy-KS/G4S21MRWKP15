/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21mrwkp15;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author Sonia
 */
public class G4S21MRWKP15 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        PdfWriter pdfwriter = null;
        try {
            // TODO code application logic here
            String nombrearch = "Wendy.pdf";
            File file = new File(nombrearch);
            pdfwriter = new PdfWriter(file);
            
            String cadena = "este es otro parrafo el cual contendra mas informacion de lo debido ya que estamos probando que se pueda escribir dentro del archivo pdf";
            
            PdfDocument pdfDocument = new PdfDocument(pdfwriter);
            Document document = new Document(pdfDocument);
            Paragraph paragraph = new Paragraph("Sera mi primer linea de mi pdf la cual puede contener texto");
            document.add(paragraph);
            paragraph = new Paragraph(cadena);
            document.add(paragraph);
            PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
            
            cadena = "Pensar es fácil, actuar es difícil, y poner los pensamientos de uno mismo en acción es lo más difícil del mundo. Goethe.";
            paragraph = new Paragraph(cadena);
            paragraph.setFont(font);
            Color myColor = new DeviceRgb(255, 100, 20);
            paragraph.setFontColor(myColor);
            paragraph.setFirstLineIndent(100);
            paragraph.setTextAlignment(TextAlignment.JUSTIFIED_ALL);
            document.add(paragraph);
            pdfDocument.close();
            pdfwriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
        
    }
    
}