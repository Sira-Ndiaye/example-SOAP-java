package service;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Article {
	private int id;
	private Date dateCreation;
	private Date dateModification;
	private String titre;
	private String contenu;
	private String categorie;
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Article(int id, Date dateCreation, Date dateModification, String titre, String contenu, String categorie) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.titre = titre;
		this.contenu = contenu;
		this.categorie = categorie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
}
