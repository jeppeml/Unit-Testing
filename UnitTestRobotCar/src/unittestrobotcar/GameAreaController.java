/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestrobotcar;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Slider;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Jeppe
 */
public class GameAreaController implements Initializable {

    @FXML
    private Canvas canvas;
    @FXML
    private Slider sliderSpeed;
    @FXML
    private Slider sliderJumpPower;

    GraphicsContext context;
    private Stage stage;
    private RobotCar rc = new RobotCar();

    private void updateView() {
        clearScreen();
        drawRobotCar();
    }

    private void clearScreen() {
        // clear screen
        context.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    private void drawRobotCar() {
        context.setFill(Color.GREEN);
        context.fillRect(rc.getX() + 200, rc.getY() + 200, 10, 10);
        context.strokeRect(rc.getX() + 200, rc.getY() + 200, 10, 10);
        context.fill();
        context.stroke();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
        context = canvas.getGraphicsContext2D();
        updateView();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sliderJumpPower.valueProperty().addListener(
                (ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
                    rc.setJumpPower(new_val.intValue());
                    canvas.requestFocus();
                }
        );
        
        sliderSpeed.valueProperty().addListener(
                (ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
                    rc.setSpeed(new_val.intValue());
                    canvas.requestFocus();
                }
        );
    }

    void onKeyPress(KeyCode code) {
        switch (code) {
            case LEFT:
                rc.setDirection(RobotCar.Direction.LEFT);
                rc.move();
                break;
            case RIGHT:
                rc.setDirection(RobotCar.Direction.RIGHT);
                rc.move();
                break;
            case UP:
                rc.setDirection(RobotCar.Direction.UP);
                rc.move();
                break;
            case DOWN:
                rc.setDirection(RobotCar.Direction.DOWN);
                rc.move();
                break;
            case SPACE:
                rc.jump();
                break;
        }
        updateView();
    }

}
