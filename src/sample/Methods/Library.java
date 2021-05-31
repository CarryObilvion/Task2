package sample.Methods;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.TextAlignment;

public class Library implements Shape {
    @Override
    public void draw(GraphicsContext gc) {
        gc.setTextAlign(TextAlignment.CENTER);
        gc.strokeRect(200,100,200,100);
        gc.strokeLine(200,120,400,120);
        gc.strokeLine(200,180,400,180);
        gc.fillText("Библиотека", 300,  150);
    }
}
