package org.ideas.services;

import java.util.concurrent.*;


public class StartGame {

    public static Boolean gameBegin(String[] plys) {
        Boolean gameOver = false;
        PlaySnakeLadder pslP1 = new PlaySnakeLadder(plys);
        try {
            ExecutorService executor = Executors.newFixedThreadPool(1);
            while (!gameOver) {
                Future<Boolean> callFuture = (executor.submit(pslP1));
                gameOver = callFuture.get();
            }

            final boolean isTerminated = executor.isTerminated();
            System.out.println(isTerminated);
            executor.awaitTermination(30, TimeUnit.SECONDS);
            executor.shutdownNow();

        } catch (Exception ex) {
            gameOver = false;
            ex.printStackTrace();
        } finally {
            return gameOver;
        }

    }

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        //String[] args = {"Player7", "PLAYER2"};
        gameBegin(args);
    }
}
