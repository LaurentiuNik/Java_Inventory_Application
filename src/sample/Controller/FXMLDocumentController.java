
package sample.Controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.DatabaseConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class FXMLDocumentController {


    @FXML
    private Label label;

    @FXML
    private TextField usernametxt;

    @FXML
    private PasswordField passtxt;

    @FXML
    private Button loginBtn;

    @FXML
    private Button signupBtn;

    @FXML
    private Label errorLabel;

    @FXML
    private Button closeBtn;
    @FXML
    public Button forgotPass;



    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    @FXML
    public void exit(ActionEvent event) throws IOException {
        closeBtn.setOnAction(e -> Platform.exit());
    }




    @FXML
    public void signupScene(ActionEvent event)throws IOException{
        Parent view3=FXMLLoader.load(getClass().getResource("/sample/SignUp.fxml"));
                Scene scene3=new Scene(view3);
                Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene3);
                window.show();
}

    @FXML
    public void signin(ActionEvent event) throws IOException {

        DatabaseConnection connect = new DatabaseConnection();
        try {
            Connection con = connect.getDBConnection();

            String username = usernametxt.getText().trim();
            String password = passtxt.getText().trim();

            if (username.isEmpty() || password.isEmpty()) {
                errorLabel.setText("Please insert username and password");
            } else {

                PreparedStatement ps = con.prepareStatement("select * from admins where username=?"
                        + " and password=?");

                ps.setString(1, usernametxt.getText().trim());
                ps.setString(2, passtxt.getText().trim());

                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    Parent view3=FXMLLoader.load(getClass().getResource("/sample/productsearch1.fxml"));
                Scene scene3=new Scene(view3);
                Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene3);
               window.show();
                } else {
                    errorLabel.setText("Invalid credentials. Please try again!");
                }
            }
        } catch (Exception ex) {
            System.out.println("error" + ex.toString());
        }

    }


    @FXML
    public void forgotPassword(ActionEvent actionEvent) throws IOException {
        Parent view3=FXMLLoader.load(getClass().getResource("/sample/FindPassword.fxml"));
        Scene scene3=new Scene(view3);
        Stage window =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene3);
        window.show();
        
    }
}
