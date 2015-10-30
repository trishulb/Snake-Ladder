package org.ideas.entity;

/**
 * Created with IntelliJ IDEA.
 * User: trishulb
 * Date: 10/30/15
 * Time: 12:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Snakes {
    public static Integer getSnakePos(Integer position) {
        switch (position) {
            case 17:
                position = 7;
                break;
            case 54:
                position = 34;
                break;
            case 62:
                position = 19;
                break;
            case 64:
                position = 60;
                break;
            case 95:
                position = 75;
                break;
            case 98:
                position = 51;
                break;

        }
        return position;

    }
}
