package CourcePartII.Lesson10ExcampleGenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> { //Команды

    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(T participant){ //добавление команды новых игроков
        participants.add(participant);
        System.out.println(" In team " + name + " was adding " + participant.getName());
    }

    public void playWith (Team<T> team) { //game with other team
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);//будет выводить 0 или 1

        if (i==0) {
            winnerName = this.name;
        }else {
            winnerName = team.name;
        }
        System.out.println("Winner " + winnerName);

    }
}
