package com.man;

import com.man.model.Robot;
import org.example.model.Direction;
import org.example.model.Position;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Direction direction = Direction.EAST;
        Position position = new Position(2,3);
        Robot robot = new Robot(position,direction);
        robot.moves("AARAAAA");
    }
}
