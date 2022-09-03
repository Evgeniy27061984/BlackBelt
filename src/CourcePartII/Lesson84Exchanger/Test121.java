package CourcePartII.Lesson84Exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;



public class Test121 {
    public static void main(String[] args) {
        Exchanger<Action>exchanger = new Exchanger<>();

        List<Action>friendAction1 = new ArrayList<>();
        friendAction1.add(Action.SCISSORS);
        friendAction1.add(Action.PAPER);
        friendAction1.add(Action.STONE);

        List<Action>friendAction2 = new ArrayList<>();
        friendAction2.add(Action.PAPER);
        friendAction2.add(Action.STONE);
        friendAction2.add(Action.STONE);
        new BestFriend("Max", friendAction1,exchanger);
        new BestFriend("Alex", friendAction2,exchanger);
    }

}


enum Action {
    STONE, SCISSORS,PAPER;
}

class BestFriend extends Thread{
    private String name;
    private List<Action> myAction;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myAction, Exchanger<Action> exchanger) {
        this.name = name;
        this.myAction = myAction;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.STONE && friendsAction == Action.SCISSORS)
                || (myAction == Action.SCISSORS && friendsAction == Action.PAPER)
                || (myAction == Action.PAPER && friendsAction == Action.STONE)) {
            System.out.println(name + " WINS");
        }


    }

        public void run() {
        Action replay;
            for (Action action: myAction) {
                try {
                    replay = exchanger.exchange(action);
                    whoWins(action,replay);
                   sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }


    }
}