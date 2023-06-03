package io.github.MatheusFSantos.model.manager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import io.github.MatheusFSantos.model.domain.Document;

/**
 * 
 * <h1 align='center'>DocumentManager</h1>
 * <hr>
 * <p>
 * 	Classe de dominio que fará o carregando do documento PDF especificado (porém, pode ser usada para carregar qualquer documento),
 * 	nela contém dois métodos que iram fazer tudo que é preciso para recuperar as informações do documento assim que a classe for
 * 	instanciada
 * </p>
 * <p align='center'>
 * 	<em>Essa classe é responsável por carregar um documento PDF especifico de seu computador</em>
 * </p>
 * 
 * 
 * @author Matheus Ferreira Santos
 * @category Class
 * @since 1.0
 * 
 */
public class DocumentManager {

	private PDFParser pdfParser;
	private PDFTextStripper pdfTextStripper;
	private PDDocument pdDocument;
	private COSDocument cosDocument;
	
	private Document document;
	
	/**
	 * 
	 * <h1 align='center'>DocumentManager</h1>
	 * <hr>
	 * <p>
	 * 	Método construtor da classe DocumentManager, espera receber um PATH que será o caminho do arquivo PDF que está no pacote "src/main/resources" 
	 * </p>
	 * 
	 * 
	 * @author Matheus Ferreira Santos
	 * @category Constructor
	 * @since 1.0
	 * 
	 */
	public DocumentManager(String path) {
		this.document = new Document(path);
		
		try {
			this.toText();
		} catch (IOException ioException) {
			System.out.println(ioException.getMessage());
		}
		
	}
	
	
	/**
	 * 
	 * <h1 align='center'>toText</h1>
	 * <hr>
	 * <p>
	 * 	Método é chamado dentro do construtor da classe, ele basicamente recupera as informações do arquivo e tenta 
	 * 	passar linha por linha do pdf para uma lista, que se encontra na classe Document.
	 * </p>
	 * <p align='center'>
	 * 	<em>Esse metodo facilitará o tratamento dos dados em uma classe futura</em>
	 * </p>
	 * 
	 * 
	 * @author Matheus Ferreira Santos
	 * @category Method
	 * @return Void
	 * @since 1.0
	 * @throws IOException
	 * 
	 */
	private void toText() throws IOException {
		
		this.pdfParser = new PDFParser(new RandomAccessFile(this.document.getArchive(), "r"));
		this.pdfParser.parse();
		this.cosDocument = pdfParser.getDocument();
		
		this.pdfTextStripper = new PDFTextStripper();
		this.pdDocument = new PDDocument(this.cosDocument);
		
		pdfTextStripper.setStartPage(0);
		pdfTextStripper.setEndPage(this.pdDocument.getNumberOfPages());
		
		this.document.setPdfContent(this.getPdfContentToList(this.pdfTextStripper.getText(this.pdDocument)));
	
	}
	
	/**
	 * 
	 * <h1 align='center'>getPdfContentToList</h1>
	 * <hr>
	 * <p>
	 * 	Método é chamado dentro do metodo "toText", método mais importante do sistema, ele espera receber um texto
	 * 	que será imediatamente convertido para uma lista (usando a interface List e a implementação ArrayList) e poderá
	 * 	ser acessada através do metodo "Document.getPdfContent()", que trará justamente todo o conteudo do PDF em forma de lista
	 * </p>
	 * <p align='center'>
	 * 	<em>>> Método mais importante da classe << </em>
	 * </p>
	 * 
	 * 
	 * @author Matheus Ferreira Santos
	 * @category Method
	 * @return List (String)
	 * @since 1.0
	 * 
	 */
	private List<String> getPdfContentToList(String text) {
		List<String> pdfContent = new ArrayList<String>();
		
		StringTokenizer stringTokenizer = new StringTokenizer(text, "\n");
		
		while(stringTokenizer.hasMoreElements())
			pdfContent.add(stringTokenizer.nextToken());
		
		return pdfContent;
	}
	
	public Document getDocument() {
		return document;
	}
	
}
