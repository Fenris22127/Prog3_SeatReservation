module de.medieninformatik.seatreservation {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.medieninformatik.seatreservation to javafx.fxml;
    exports de.medieninformatik.seatreservation;
}