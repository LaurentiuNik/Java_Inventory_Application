module searchbar {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires java.sql;
    requires java.desktop;
    opens sample;
    opens sample.Controller;
    opens sample.Model;
}