module com.kodillastein.nicetictactoe {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.kodillastein.nicetictactoe to javafx.fxml;
    exports com.kodillastein.nicetictactoe;
}