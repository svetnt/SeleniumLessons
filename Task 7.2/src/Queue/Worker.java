package Queue;

import java.util.Deque;
import java.util.Queue;

public class Worker {

    private String name;
    private Deque tasks;

    public Worker(String name, Deque tasks){
        setName(name);
        this.tasks=tasks;
    }

    public void takeTaskFifo(){
        Object task=tasks.poll();
        if(task!=null){
            System.out.println("Выполняю задание "+task);
        } else {
            System.out.println("Заданий больше нет, отдыхаю");
        }
    }

    public void takeTaskLifo(){
      Object task=tasks.pollLast();
      if (task!=null){
          System.out.println("Выполняю задание "+task);
      } else {
          System.out.println("Заданий больше нет, отдыхаю");
      }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
