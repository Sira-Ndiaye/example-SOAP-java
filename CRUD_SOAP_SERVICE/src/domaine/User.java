package domaine;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	public enum UserType {
		visitor,
		editor,
		administrator
	}

	private int id;
	private String userName;
	private String passWord;
	private UserType userType;
	
	public User() {}

	public User(int id, String userName, String passWord, UserType userType) {
		super();
		this.id=id;
		this.userName = userName;
		this.passWord = passWord;
		this.userType = userType;
	}
	
	public User(String userName, String passWord, UserType userType) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.userType = userType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
}
