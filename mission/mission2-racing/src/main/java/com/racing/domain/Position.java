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
        positionException();
        return position;
    }

    public boolean isMax(int max){
        if(this.position == max)
            return true;
        return false;
    }

    private void positionException(){
        if(this.position < start)
            throw new IllegalArgumentException();
    }

}
