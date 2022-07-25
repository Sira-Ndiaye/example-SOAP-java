package domaine;

import java.util.List;
import java.util.Scanner;

public class Client{
	public static void main(String[] args) {
		
		UserServices userServices= new UserServicesService().getUserServicesPort();
		
		System.out.println("----------------------BIENVENUE SUR NOTRE PLATEFORME----------------------");
		
		System.out.println("Veuillez-vous identifier:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre username: ");
		String adminUserName=sc.next();
		System.out.println("Entrez votre mot de passe: ");
		String adminPassword=sc.next();
		
		System.out.println("------------------------------------------------------------------");
		
		User admin = userServices.seConnecter(adminUserName,adminPassword);
		
		if(admin.getUserType().toString().equals("ADMINISTRATOR")) {
			System.out.println("----------------------BIENVENUE CHEF----------------------");

	    	while(true) {
	    		
	    		System.out.println("Choissez une operation");
				System.out.println("1 -> Affichez la liste des utilisateurs");
				System.out.println("2 -> Ajouter un utilisateur");
				System.out.println("3 -> modifier un utilisateur");
				System.out.println("4 -> Suprimer un utilisateur");
				
		    	int choice=sc.nextInt();
		    	
	    		while(choice<=0||choice>4){
	    	    	System.out.println("Réessayer");
	    	    	choice=sc.nextInt();
	    	    }
	    	    
	    	    switch(choice){
	    	      case 1:
	    	    	  try {
		    	    	  List <User> users = userServices.recupererUtilisateurs();
		    	    	  for(User user: users) {
		    	    		  System.out.println("Id: "+user.getId()+" -> "+user.getUserName());
		    	    	  }  
	    	    	  }catch(Exception e) {
	    	    		  System.out.println("Nous rencontrons quelques erreurs internes, veuillez ressayer plus tard");
	    	    	  }
	    	          break;
	    	      case 2:
	    	    	  	System.out.println("Entrez le username de l'utilisateur: ");
		    	  		String userName=sc.next();
		    	  		System.out.println("Entrez le mot de passe de l'utilisateur: ");
		    	  		String password=sc.next();
		    	  		String userType="";
		    	  		System.out.println("Est-ce un: ");
		    	  		System.out.println("1 -> Visiteur ");
		    	  		System.out.println("2 -> Éditeur");
		    	  		System.out.println("3 -> Administrateur ");
		    	  		int typeChoice=sc.nextInt();
				    	
			    		while(typeChoice<=0||typeChoice>3){
			    	    	System.out.println("Réessayer");
			    	    	typeChoice=sc.nextInt();
			    	    }
			    		
			    		switch(typeChoice) {
				    		case 1:
				    			userType="visitor";
				    			break;
				    		case 2:
				    			userType="editor";
				    			break;
				    		case 3:
				    			userType="administrator";
				    			break;
			    		}
			    		try {
			    			boolean add = userServices.ajouterUtilisateur(userName, password, UserType.valueOf(userType.toUpperCase()));
				    		
				    		if(add) {
				    			System.out.println("Utilisateur ajouté avec success");
				    		}else {
				    			System.out.println("Utilisateur n'a pas été ajouté, veuillez réessayer");
				    		}	
			    		}catch(Exception e) {
		    	    		  System.out.println("Nous rencontrons quelques erreurs internes, veuillez ressayer plus tard");
		    	    	  }
			    		
	    	    	  break;
	    	      case 3:
	    	    	  System.out.println("Entrez l'identifiant de l'utilisateur sur lequel vous voulez intervenir: ");
	    	    	  int userIdMod=sc.nextInt();
	    	    	  
	    	    	  	System.out.println("Entrez le nouveau username de l'utilisateur: ");
		    	  		String userNameM=sc.next();
		    	  		System.out.println("Entrez le nouveau mot de passe de l'utilisateur: ");
		    	  		String passwordM=sc.next();
		    	  		String userTypeM=""
		    	  				;
		    	  		System.out.println("Est-ce un: ");
		    	  		System.out.println("1 -> Visiteur ");
		    	  		System.out.println("2 -> Éditeur");
		    	  		System.out.println("3 -> Administrateur ");
		    	  		int typeChoiceM=sc.nextInt();
				    	
			    		while(typeChoiceM<=0||typeChoiceM>3){
			    	    	System.out.println("Réessayer");
			    	    	typeChoiceM=sc.nextInt();
			    	    }
			    		
			    		switch(typeChoiceM) {
				    		case 1:
				    			userTypeM="visitor";
				    			break;
				    		case 2:
				    			userTypeM="editor";
				    			break;
				    		case 3:
				    			userTypeM="administrator";
				    			break;
			    		}
			    		
			    		try {
			    			boolean mod = userServices.modifierUtilisateur(userIdMod,userNameM, passwordM, UserType.valueOf(userTypeM.toUpperCase()));
				    		
				    		if(mod) {
				    			System.out.println("Utilisateur modifié avec success");
				    		}else {
				    			System.out.println("Utilisateur n'a pas été modifié, veuillez réessayer");
				    		}	
			    		}catch(Exception e) {
		    	    		  System.out.println("Nous rencontrons quelques erreurs internes, veuillez ressayer plus tard");
		    	    	  }
			    		
	    	    	  break;
	    	      case 4:
	    	    	  System.out.println("Entrez l'identifiant de l'utilisateur: ");
	    	    	  int userId=sc.nextInt();
	    	    	  
	    	    	  try {
		    	    	  boolean del = userServices.supprimerUtilisateur(userId);
		    	    	  
		    	    	  if(del) {
				    			System.out.println("Utilisateur supprimé avec success");
				    		}else {
				    			System.out.println("Utilisateur n'a pas été supprimé, veuillez réessayer");
				    			}
	    	    	  }catch(Exception e) {
	    	    		  System.out.println("Nous rencontrons quelques erreurs internes, veuillez ressayer plus tard");
	    	    	  }	    	    	  
	    	    	  break;
	    	  
	    	      default:
	    	    	  System.out.println("rien");
	    	          break;
	    	    }
	    	}
			
		}else {
			System.out.println("Vous ne pouvez pas acceder à ce service.");
			System.out.println("------------------------------------------------------------------");
		}
	}
}