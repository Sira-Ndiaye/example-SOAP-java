package server;

import javax.xml.ws.Endpoint;
import domaine.UserServices;

public class ServerWeb{
	public static void main(String[] args) {
		String url="http://localhost:10254/";
		Endpoint.publish(url, new UserServices());
		System.out.println(url);
	}
}