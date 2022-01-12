package com.klbproducoes.main;


import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.input.Input;
import com.almasb.fxgl.input.UserAction;
import javafx.scene.input.KeyCode;

public class Game extends GameApplication {

    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setFullScreenAllowed(true);
        gameSettings.setFullScreenFromStart(true);
    }

    @Override
    protected void initGame() {
        FXGL.getGameWorld().addEntityFactory(new Factory());
        FXGL.spawn("enemy", 100, 100);
    }

    @Override
    protected void initInput() {
        Input input = FXGL.getInput();
        FXGL.getNotificationService().pushNotification("Olá");
        input.addAction(new UserAction("Player 1 - Move Right") {
            @Override
            protected void onAction() {
                System.out.println("Move Right");
            }
        }, KeyCode.D);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
