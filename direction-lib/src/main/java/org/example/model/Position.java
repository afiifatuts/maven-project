package org.example.model;

public class Position {
    private Integer coordinateX;
    private Integer coordinateY;

    public Position(Integer coordinateX, Integer coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
    public Position getRight(){
        //koordinat x bertambah 1 koordinat y tetap
        return new Position(coordinateX+1 , coordinateY);
    }
    public Position getLeft(){
        //koordinat x berkurang 1 koordinat y tetap
        return new Position(coordinateX-1 , coordinateY);
    }
    public Position getTop(){
        //koordinat x tetap koordinat y bertambah 1
        return new Position(coordinateX , coordinateY+1);
    }
    public Position getBottom(){
        //koordinat x tetap 1 koordinat y berkurang 1
        return new Position(coordinateX, coordinateY-1);
    }


    @Override
    public String toString() {
        return "Position{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
