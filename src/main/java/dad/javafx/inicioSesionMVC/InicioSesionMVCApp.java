package dad.javafx.inicioSesionMVC;

import dad.javafx.inicioSesionMVC.controller.Controller;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InicioSesionMVCApp extends Application {
	
	private Controller controller = new Controller();

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// boton de cancelar
		controller.getView().getCancelButton().setOnAction(e -> onCancelButtonAction(e));
		
		Scene scene = new Scene(controller.getView(), 340, 180);
			
		primaryStage.setTitle("Iniciar Sesión");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	private void onCancelButtonAction(ActionEvent e) {

		Stage stage = (Stage) controller.getView().getCancelButton().getScene().getWindow();
	    stage.close();
		
	}

	public static void main(String[] args) {
		launch(args);		
	}

}
