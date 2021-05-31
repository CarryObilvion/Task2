package sample.Methods;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.TextAlignment;

public class DataArea implements Shape {
    @Override
    public void draw(GraphicsContext gc) {
        gc.setTextAlign(TextAlignment.CENTER);
        gc.strokeOval(200, 100, 200, 100);
        gc.fillText("Область данных", 300,  150);
    }
}
