package org.ideas.services;

import java.util.HashMap;
import java.util.Map;

import org.ideas.entity.Ladders;
import org.ideas.entity.PlayerInfo;
import org.ideas.entity.Snakes;


/**
 * Created with IntelliJ IDEA.
 * User: trishulb
 * Date: 10/30/15
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Board {

        HashMap<String, PlayerInfo> info;
        private Integer position;
        private PlayerInfo currentValue;

        public Board(HashMap<String, PlayerInfo> plys) {
            info = plys;
        }

        public Boolean playDice(String player, int diceValue) {

            currentValue = info.get(player);
            position = currentValue.getPossition() + diceValue;

            if (position == 100) {
                System.out.println("Congrats " + player + " Win!!!!");
                return true;
            }

            position = Ladders.getLadderPos(position);
            position = Snakes.getSnakePos(position);

            if (position < 100) {
                currentValue.setPossition(position);
                info.put(player, currentValue);
            }
            return false;
        }
  }
