package sample.Methods;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.TextAlignment;

public class Subsystem implements Shape {
    @Override
    public void draw(GraphicsContext gc) {
        gc.setTextAlign(TextAlignment.CENTER);
        gc.strokeRect(200,100,200,100);
        gc.strokeLine(230,100,230,200);
        gc.strokeLine(400 - 30,100,400 - 30,200);
        gc.fillText("Подсистема", 300,  150);
    }
}
