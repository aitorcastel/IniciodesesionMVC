package dad.javafx.inicioSesionMVC.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class Model {

	private String password;
	private String userName;

	public Model(String name, String password) {

		userName = name;
		this.password = password;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean checkUserInfo() {

		boolean matches = false;
		boolean userExists = false;
		boolean passExists = false;
		
		int userPosition = 0, passPosition = 0;
		
		ArrayList<String> users = new ArrayList<String>();
		ArrayList<String> passcodes = new ArrayList<String>();

		try {
			
			//@SuppressWarnings("resource")
			
			// lectura del fichero
			
			String fileName = "users1.csv";
			File file = new File(fileName);
			Scanner inputStream = new Scanner(file);
			
			while(inputStream.hasNext()) {
				String data = inputStream.next();
				String [] pass = data.split(",");
				
				// recogida lista de usuarios
				users.add(pass[0]);
				
				// recogida lista de contraseñas 
				passcodes.add((pass[1]));
			}
			inputStream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < users.size(); i++) {

			if (users.get(i).equals(userName) == true) {
				userPosition = i;
				userExists = true;	
			}

			if (passcodes.get(i).equals( stringToMd5(getPassword()) ) == true) {
				passPosition = i;
				passExists = true;
			}

		}
		matches = (userPosition == passPosition && userExists == true && passExists == true) ? true : false;
		return matches;

	}

	private String stringToMd5(String pass) {
		String md5 = DigestUtils.md5Hex(pass).toUpperCase();
		return md5;
	}

}
