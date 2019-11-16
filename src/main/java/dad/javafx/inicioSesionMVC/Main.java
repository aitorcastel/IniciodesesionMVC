package dad.javafx.inicioSesionMVC;

import java.io.IOException;

//import java.util.ArrayList;
//import org.apache.commons.codec.digest.DigestUtils;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println(""
				+ "[i] Usuarios y contraseñas:\n\n"
				+ "[>] chuck:norris\n"
				+ "[>] charles:bronson\n"
				+ "[>] david:carradine\n"
				+ "[>] test:test\n"
		);
		
		// generador basico de las contraseñas
		
		/*
		ArrayList<String> md5 = new ArrayList<String>();
		String [] usuarios = {"chuck","charles","david","test"};
		String [] password = {"norris","bronson","carradine","test"};
		
		for (int j = 0; j < password.length; j++) {
			md5.add( DigestUtils.md5Hex(password[j]).toUpperCase() );
			System.out.println("[c] "+usuarios[j]+"," + md5.get(j));
		}
		*/
		
		
		InicioSesionMVCApp.main(args);		
	}

}