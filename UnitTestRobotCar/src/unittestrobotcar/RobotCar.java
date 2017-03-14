/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestrobotcar;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Jeppe
 */
public class RobotCar {

    public enum Direction {RIGHT,LEFT,UP,DOWN}
    
    private final IntegerProperty x = new SimpleIntegerProperty();
    private final IntegerProperty y = new SimpleIntegerProperty();
    private final DoubleProperty speed = new SimpleDoubleProperty();
    private final IntegerProperty jumpPower = new SimpleIntegerProperty();
    private Direction direction;

    public RobotCar() {
        x.set(0);
        y.set(0);
        speed.set(3);
        direction=Direction.RIGHT;
        jumpPower.set(450);
    }
    
    void jump() {
        double newSpeed = speed.get() * (1+(jumpPower.doubleValue()/100));
        move((int) newSpeed);
    }
    
    public void move()
    {
        move((int)speed.get());
    }
    
    private void move(int atSpeed)
    {
        switch (direction)
        {
            case RIGHT:
                x.set(x.get()+atSpeed);
                break;
            case LEFT:
                x.set(x.get()-atSpeed);
                break;
            case UP:
                y.set(y.get()-atSpeed);
                break;
            case DOWN:
                y.set(y.get()+atSpeed);
                break;
            default:
                throw new RuntimeException("Direction not supported");
        }
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
    
    
    public int getJumpPower() {
        return jumpPower.get();
    }

    public void setJumpPower(int value) {
        jumpPower.set(value);
    }

    public IntegerProperty jumpPowerProperty() {
        return jumpPower;
    }
    
    public double getSpeed() {
        return speed.get();
    }

    public void setSpeed(int value) {
        speed.set(value);
    }

    public DoubleProperty speedProperty() {
        return speed;
    }
    public int getY() {
        return y.get();
    }

    public IntegerProperty yProperty() {
        return y;
    }

    public int getX() {
        return x.get();
    }

    public IntegerProperty xProperty() {
        return x;
    }
    
}
