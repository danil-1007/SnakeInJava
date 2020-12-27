package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.List;
import java.util.ArrayList;

public class Snake {
    public boolean isAlive=true;
    private List<GameObject> snakeParts = new ArrayList<>();

    private static final String HEAD_SIGN= "\uD83D\uDC7E";
    private static final String BODY_SIGN= "\u26AB";

    public Snake(int x, int y){

        GameObject snake1=new GameObject(x,y);
        GameObject snake2=new GameObject(x+1,y);
        GameObject snake3=new GameObject(x+2,y);

        snakeParts.add(snake1);
        snakeParts.add(snake2);
        snakeParts.add(snake3);

    }

    public void draw(Game game){
        game.setCellValue(snakeParts.get(0).x, snakeParts.get(0).y, HEAD_SIGN);
        for(int i=1;i<snakeParts.size();i++){
            game.setCellValue(snakeParts.get(i).x, snakeParts.get(i).y, BODY_SIGN);
        }
    }

}
