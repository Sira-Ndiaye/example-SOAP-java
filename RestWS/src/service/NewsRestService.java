package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import db.BdAcces;

@Path("/news")
public class NewsRestService {
	
	@GET
	@Path("/allArticles")
	@Produces({MediaType.APPLICATION_JSON})
	public List <Article> getAllArticles(){
		List <Article> articles=new ArrayList<Article>();
		
		BdAcces db = new BdAcces();
		try {
			Connection connection = db.connectToDB();
			Statement statement = connection.createStatement();
			String req = "SELECT Article.id,titre,contenu,dateCreation,dateModification,Categorie.libelle as categorie FROM Article, Categorie where categorie=Categorie.id";
			ResultSet rs= statement.executeQuery(req);
			while(rs.next()) {
				int id = Integer.parseInt(rs.getString("id"));
				String categorie = rs.getString("categorie");
				String titre = rs.getString("titre");
				String contenu = rs.getString("contenu");
				Date dateCreation = rs.getDate("dateCreation");
				Date dateModification = rs.getDate("dateModification");
				
				Article article = new Article(id,dateCreation,dateModification,titre,contenu,categorie);
				articles.add(article);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Nous rencontrons des problemes internes. Merci de ressayer plus tard");
		}
		
		return articles;
	
	}
	@GET
	@Path("/allArticlesOrderByCategory")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List <Article> getAllArticlesOrderByCategory(){
List <Article> articles=new ArrayList<Article>();
		
		BdAcces db = new BdAcces();
		try {
			Connection connection = db.connectToDB();
			Statement statement = connection.createStatement();
			String req = "SELECT Article.id,titre,contenu,dateCreation,dateModification,Categorie.libelle AS categorie FROM Article, Categorie where categorie=Categorie.id ORDER BY categorie asc";
			ResultSet rs= statement.executeQuery(req);
			while(rs.next()) {
				int id = Integer.parseInt(rs.getString("id"));
				String categorie = rs.getString("categorie");
				String titre = rs.getString("titre");
				String contenu = rs.getString("contenu");
				Date dateCreation = rs.getDate("dateCreation");
				Date dateModification = rs.getDate("dateModification");
				
				Article article = new Article(id,dateCreation,dateModification,titre,contenu,categorie);
				articles.add(article);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Nous rencontrons des problemes internes. Merci de ressayer plus tard");
		}
		
		return articles;
	}
	
	
	@GET
	@Path("/articlesForACategory/{categorieName}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List <Article> getArticleByCategory(@PathParam (value="categorieName")String categorieName){
List <Article> articles=new ArrayList<Article>();
		
		BdAcces db = new BdAcces();
		try {
			Connection connection = db.connectToDB();
			Statement statement = connection.createStatement();
			String req = "SELECT Article.id,titre,contenu,dateCreation,dateModification,Categorie.libelle AS categorie FROM Article, Categorie where categorie=Categorie.id AND Categorie.libelle='"+categorieName+"'";
			ResultSet rs= statement.executeQuery(req);
			while(rs.next()) {
				int id = Integer.parseInt(rs.getString("id"));
				String categorie = rs.getString("categorie");
				String titre = rs.getString("titre");
				String contenu = rs.getString("contenu");
				Date dateCreation = rs.getDate("dateCreation");
				Date dateModification = rs.getDate("dateModification");
				
				Article article = new Article(id,dateCreation,dateModification,titre,contenu,categorie);
				articles.add(article);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Nous rencontrons des problemes internes. Merci de ressayer plus tard");
		}
		
		return articles;
	}
	
}


