package Queue;

import java.util.Deque;
import java.util.Queue;

public class Boss {

    private Deque tasks;

    public Boss(Deque tasks){
        this.tasks=tasks;
    }

    public void giveTask(String task){
        tasks.add(task);
        System.out.println("Дал задание "+task);
    }
}
