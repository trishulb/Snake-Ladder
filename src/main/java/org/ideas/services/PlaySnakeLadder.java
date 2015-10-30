package org.ideas.services;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

import org.ideas.entity.PlayerInfo;
/**
 * Created with IntelliJ IDEA.
 * User: trishulb
 * Date: 10/30/15
 * Time: 12:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlaySnakeLadder implements Callable<Boolean> {

    HashMap info = new HashMap<String, PlayerInfo>();
    Board lb;
    Random ra = new Random();

    public PlaySnakeLadder(String[] playList) {
        for (String name : playList) {
            info.put(name, new PlayerInfo(name));
        }
        lb = new Board(info);
    }

    @Override
    public Boolean call() throws Exception {
        boolean gameover = false;
        Set<String> setKey = info.keySet();
        Iterator<String> itr = setKey.iterator();
        while (itr.hasNext()) {
            gameover = lb.playDice(itr.next(), ra.nextInt(6) + 1);
            if (gameover) {
                break;
            }
        }

        return gameover;
    }
}
