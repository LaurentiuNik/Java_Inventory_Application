package sample.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import sample.DatabaseConnection;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AddRemoveController implements Initializable{
    @FXML
    private TextField brandColumnTable;

    @FXML
    private TextField productNameColumnTable;

    @FXML
    private TextField descriptionColumnTable;

    @FXML
    private TextField modelNumberColumnTable;

    @FXML
    private TextField modelYearColumnTable;



    @FXML
    void onClickReturn(ActionEvent event) throws IOException {
        Parent dashboard = FXMLLoader.load(getClass().getResource("/sample/productsearch1.fxml"));
        Scene sceneX = new Scene(dashboard);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(sceneX);
        window.show();

    }

    @FXML
    void onClickaAdd(ActionEvent event) throws IOException {
        ResultSet rs;
        PreparedStatement ps;
        DatabaseConnection connectNow = new DatabaseConnection();


        try {

            Connection connectDB = connectNow.getDBConnection();

            String brand = brandColumnTable.getText().trim();
            String productName = productNameColumnTable.getText().trim();
            String modelNumber= modelNumberColumnTable.getText().trim();
            String modelYear = modelYearColumnTable.getText().trim();
            String description = descriptionColumnTable.getText().trim();


            if (brand.isEmpty() || productName.isEmpty() || modelNumber.isEmpty() || modelYear.isEmpty() ||description.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Inventory Error");
                alert.setHeaderText("Add product Error!");
                alert.setContentText("Complete all the fields to insert a product to the system.");

                alert.showAndWait();
            } else {

                String sql2 = "insert into product (Brand, ModelNumber, ModelYear, ProductName, Description) value (?,?,?,?,?)";
                ps = connectDB.prepareStatement(sql2);

                ps.setString(1, brandColumnTable.getText());
                ps.setString(4, productNameColumnTable.getText());
                ps.setString(2, modelNumberColumnTable.getText());
                ps.setInt(3, Integer.parseInt(modelYearColumnTable.getText()));
                ps.setString(5, descriptionColumnTable.getText());


                ps.execute();


            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }
        
    }
    @FXML
    void onClickRemove(ActionEvent event) {
        ResultSet rs;
        PreparedStatement pst = null;
        DatabaseConnection connectNow = new DatabaseConnection();

        try {
            Connection connectDB = connectNow.getDBConnection();

            Alert alert = new Alert (Alert.AlertType.CONFIRMATION, "Are you sure you want to delete?", ButtonType.YES, ButtonType.CANCEL);
            alert.showAndWait ();
            if (alert.getResult () == ButtonType.CANCEL) {
                pst.close();

            } 

            String pName = productNameColumnTable.getText();
            String brand = brandColumnTable.getText();
            String mYear = modelYearColumnTable.getText();
            String mNumber = modelNumberColumnTable.getText();
            String description = descriptionColumnTable.getText();


            String sql = "DELETE FROM product where ProductName = '" + pName + "' and Brand ='" + brand + "' and ModelNumber ='" + mNumber + "'and Description ='" + description + "' and ModelYear = '" + mYear + "'";
            pst = connectDB.prepareStatement(sql);
            pst.executeUpdate();
            pst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
