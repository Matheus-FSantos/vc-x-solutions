package io.github.MatheusFSantos.model.domain;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * <h1 align='center'>Document</h1>
 * <hr>
 * <p>
 * 	Classe de Dominio do sistema que tem como foco abstrair um documento pdf real, nesse caso, o pdf utilizado está no diretório "src/main/resources".
 *  Essa classe tem como atributos:
 * </p>
 * 
 * <em>
 * 	<ul>
 *   <li>pdfContent - List(String)</li>
 *   <li>path - String</li>
 *   <li>archive - File</li>
 * 	</ul>
 * </em>
 * 
 * @author Matheus Ferreira Santos
 * @category Class
 * @since 1.0
 * 
 */
public class Document implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<String> pdfContent;
	
	private String path;
	private File archive;
	
	/**
	 * 
	 * <h1 align='center'>Document</h1>
	 * <hr>
	 * <p>
	 * 	Metodo construtor da classe que espera receber um caminho do arquivo pdf, para que o software consiga ler
	 * </p>
	 * 
	 * <p>
	 * 	<em>Obs.: Arquivo PDF está presente no caminho "src/main/resources"</em>
	 * </p>
	 * 
	 * @author Matheus Ferreira Santos
	 * @category Constructor
	 * @since 1.0
	 * 
	 */
	public Document(String path) {
		this.path = path;
		this.archive = new File(path);
		this.pdfContent = new ArrayList<String>();
	}

	public List<String> getPdfContent() {
		return pdfContent;
	}
	
	public void setPdfContent(List<String> pdfContent) {
		this.pdfContent = pdfContent;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public File getArchive() {
		return archive;
	}

	public void setArchive(File archive) {
		this.archive = archive;
	}
	
}
