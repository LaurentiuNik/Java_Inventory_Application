package sample.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import sample.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FindPassController {

    @FXML
    private TextField usernametxt;

    @FXML
    private TextField ansertxt;

    @FXML
    private TextField idtxt;

    @FXML
    private Button find;

    @FXML
    private Label PasswordRecovery;

    @FXML
    void findPass(ActionEvent event) throws Exception {
        DatabaseConnection connect = new DatabaseConnection();
        try {
            Connection con = connect.getDBConnection();

            String username = usernametxt.getText().trim();
            String CNP = idtxt.getText().trim();
            String answer = ansertxt.getText().trim();

            if (username.isEmpty() || CNP.isEmpty() || answer.isEmpty()) {
                PasswordRecovery.setTextFill(Color.RED);

                PasswordRecovery.setText("Please complete all fields ");
            } else {

                PreparedStatement ps = con.prepareStatement("select * from admins where username=?" + " and regno=?"
                        + " and answer=?");

                ps.setString(1, usernametxt.getText().trim());
                ps.setString(2, idtxt.getText().trim());
                ps.setString(3, ansertxt.getText().trim());

                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    PasswordRecovery.setText(rs.getString("password"));
                    PasswordRecovery.setTextFill(Color.GREEN);
                } else {
                    PasswordRecovery.setTextFill(Color.RED);
                    PasswordRecovery.setText("Invalid data!");
                }
            }
        } catch (Exception ex) {
            System.out.println("error" + ex.toString());
        }


    }

}

