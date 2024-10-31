package com.racing.domain;

public class Position {
    private final int start = 0;
    private int position;

    public Position(){
        this.position = start;
    }

    public void movePosition(){
        this.position++;
    }

    public int getPosition(){
        return position;
    }

}
