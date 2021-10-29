package com.softuni.Abstraction.jediGalaxy;

public class JediMovement {
    public long move(int row, int col, Field field){
        long starsCollected = 0;
        while (row >= 0 && col < field.getColLength(1)) {
            if (field.isInBounds(row, col)) {
                starsCollected += field.getValue(row, col);
            }
            col++;
            row--;
        }
        return starsCollected;
    }
}
