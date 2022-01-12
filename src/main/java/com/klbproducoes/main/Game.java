package com.klbproducoes.main;


import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;

public class Game extends GameApplication {

    @Override
    protected void initSettings(GameSettings gameSettings) {

    }

    @Override
    protected void initGame() {
        FXGL.getGameWorld().addEntityFactory(new Factory());
        FXGL.spawn("enemy", 100, 100);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
