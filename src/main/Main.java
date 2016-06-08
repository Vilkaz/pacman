package main;

import ch.aplu.jgamegrid.GGKeyListener;
import ch.aplu.jgamegrid.Location;
import controller.PacmanController;
import model.MyGameGrid;
import controller.ActorController;
import controller.GameGridController;
import model.Pacman;

import java.awt.event.KeyEvent;

/**
 * Created by vkukanauskas on 08/06/2016.
 */
public class Main {
    public static void main(String[] args) {
        MyGameGrid gameGrid = GameGridController.getBasicGrid();
        Pacman pacman = PacmanController.getPacman();
        gameGrid.addActor(pacman, new Location(1,1));
        gameGrid.addKeyListener(new GGKeyListener() {
            @Override
            public boolean keyPressed(KeyEvent keyEvent) {
                char key = keyEvent.getKeyChar();
                switch (key){
                    case 'd': pacman.moveRight();
                    break;
                }
                gameGrid.refresh();
                return false;
            }

            @Override
            public boolean keyReleased(KeyEvent keyEvent) {
                return false;
            }
        });
        gameGrid.show();
    }
}
