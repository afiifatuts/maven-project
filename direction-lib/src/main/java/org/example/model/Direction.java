package org.example.model;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Direction turnLeft(){
        return Direction.values()[(ordinal()+3)%4];
    }
    public Direction turnRight(){
        return Direction.values()[(ordinal()+1)%4];
    }


}
