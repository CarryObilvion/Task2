package sample;

import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import sample.Methods.Shape;
import sample.Methods.ShapeFactory;

public class Controller {
    public Canvas can;
    public TextField text;

    public void drawImage(ActionEvent actionEvent) {
        String textValue = text.getText().toUpperCase();
        GraphicsContext gc = can.getGraphicsContext2D();
        if(!((textValue.equals("МОДУЛЬ")) || (textValue.equals("ПОДСИСТЕМА")) || (textValue.equals("БИБЛИОТЕКА")) || (textValue.equals("ОБЛАСТЬ ДАННЫХ")))){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Предупреждение: ");
            alert.setHeaderText(null);
            alert.setContentText("Введенный модуль не обнаружен");
            alert.showAndWait();
            return;
        }else {
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape1 = shapeFactory.createShape(textValue);
            gc.clearRect(0,0,can.getWidth(),can.getHeight());
            shape1.draw(gc);
        }

    }
}
