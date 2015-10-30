package org.ideas.entity;

/**
 * Created with IntelliJ IDEA.
 * User: trishulb
 * Date: 10/30/15
 * Time: 12:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlayerInfo {
    private String name;
    private int possition;
    private int moveCount;

    public PlayerInfo(String name1) {
        this.name = name1;

    }

    public String getName() {
        return name;
    }

    public int getPossition() {
        return possition;
    }

    public void setPossition(int possition) {
        this.possition = possition;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }
}
