module se.kth.sandva.lab3a {
    requires javafx.controls;
    requires javafx.fxml;


    opens se.kth.sandva.lab3a to javafx.fxml;
    exports se.kth.sandva.lab3a;
}