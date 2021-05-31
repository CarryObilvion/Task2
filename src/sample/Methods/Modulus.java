package sample.Methods;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.TextAlignment;

public class Modulus implements Shape {


    @Override
    public void draw(GraphicsContext gc) {
        gc.setTextAlign(TextAlignment.CENTER);
        gc.fillText("Модуль", 300,  150);
        gc.strokeRect(200,100,200,100);
    }
}
