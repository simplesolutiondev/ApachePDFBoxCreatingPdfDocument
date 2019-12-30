package dev.simplesolution;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class CreatingPdfDocument {

	public static void main(String[] args) {
		try(PDDocument document = new PDDocument()) {
			PDPage page = new PDPage();
			document.addPage(page);
			
			PDPageContentStream pageContentStream = new PDPageContentStream(document, page);
			pageContentStream.beginText();
			pageContentStream.setFont( PDType1Font.TIMES_ROMAN , 12 );
			pageContentStream.newLineAtOffset(100,  700);
			pageContentStream.showText("Welcome to simplesolution.dev");
			pageContentStream.endText();
			pageContentStream.close();
			
			document.save("D:\\SimpleSolution\\Document.pdf");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
