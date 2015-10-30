package org.ideas.entity;

/**
 * Created with IntelliJ IDEA.
 * User: trishulb
 * Date: 10/30/15
 * Time: 12:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Ladders {

    public static Integer getLadderPos(Integer position) {
        switch (position) {
            case 4:
                position = 14;
                break;
            case 9:
                position = 31;
                break;
            case 20:
                position = 38;
                break;
            case 40:
                position = 59;
                break;
            case 51:
                position = 67;
                break;
            case 63:
                position = 81;
                break;

        }
        return position;

    }

}
