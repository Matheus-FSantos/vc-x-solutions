package io.github.MatheusFSantos.model.domain;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Document implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<String> pdfContent;
	
	private String path;
	private File archive;
	
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
