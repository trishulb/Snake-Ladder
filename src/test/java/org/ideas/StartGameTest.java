package org.ideas;

import org.ideas.services.StartGame;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: trishulb
 * Date: 10/30/15
 * Time: 12:49 PM
 * To change this template use File | Settings | File Templates.
 */

public class StartGameTest {
    @Test
    public void runGame(){
        String[] args1 = { "PLAYER1", "PLAYER2" };
        assert(StartGame.gameBegin(args1));

    }
}
