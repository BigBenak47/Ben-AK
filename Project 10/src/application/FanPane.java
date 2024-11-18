/*
 * Class: CMSC214 
 * Instructor: Mark R. Estep
 * Description: (Give a brief description for each Program)
 * Due: 11/19/23
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ben Amon-Kotey
*/

package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;

public class FanPane extends Pane {
    private double w = 200;
    private double h = 200;
    private double radius = Math.min(w, h) * 0.45;

    private Arc[] arc = new Arc[4];
    private double startAngle = 30;
    private Circle circle = new Circle(w / 2, h / 2, radius);
    private boolean reverse = false;
    private boolean paused = false;
    private Thread fanThread;

    public FanPane() {
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);
        getChildren().add(circle);

        for (int i = 0; i < 4; i++) {
            arc[i] = new Arc(w / 2, h / 2, radius * 0.9, radius * 0.9, startAngle + i * 90, 35);
            arc[i].setFill(Color.BLACK);
            arc[i].setType(ArcType.ROUND);
            getChildren().addAll(arc[i]);
        }

        fanThread = new Thread(() -> {
            try {
                while (true) {
                    if (!paused) {
                        rotateFan();
                        Thread.sleep(40); 
                    } else {
                        Thread.sleep(100); 
                    }
                }
            } catch (InterruptedException ex) {
                
            }
        });
        fanThread.setDaemon(true); 
        fanThread.start(); 
    }

    private void rotateFan() {
        int direction = reverse ? -1 : 1;
        for (int i = 0; i < 4; i++) {
            arc[i].setStartAngle(arc[i].getStartAngle() + (5 * direction)); 
        }
    }

    public void pauseRotation() {
        paused = true;
    }

    public void resumeRotation() {
        paused = false;
    }

    public void reverseRotation() {
        reverse = !reverse;
    }

    public void setValues(double w, double h) {
        this.w = w;
        this.h = h;
        radius = Math.min(w, h) * 0.45;
        circle.setRadius(radius);
        circle.setCenterX(w / 2);
        circle.setCenterY(h / 2);

        for (int i = 0; i < 4; i++) {
            arc[i].setRadiusX(radius * 0.9);
            arc[i].setRadiusY(radius * 0.9);
            arc[i].setCenterX(w / 2);
            arc[i].setCenterY(h / 2);
            arc[i].setStartAngle(startAngle + i * 90);
        }
    }

    public void setW(double w) {
        setValues(w, this.h);
    }

    public void setH(double h) {
        setValues(this.w, h);
    }
}
