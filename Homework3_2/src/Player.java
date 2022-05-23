import  java.util.Random;
import java.util.Scanner;

/* Класс для хранени информации об игроке */
public class Player {
    private String name;
    private boolean computer; // это реальный игрок или компьютер?
    private int currentResult; // количество очков в текущей игре
    private int numberOfWins; // количество побед
    private Random random;

    public Player(String name, boolean computer){
        this.name = name;
        this.computer = computer;
        this.currentResult = 0;
        this.numberOfWins = 0;
        this.random = new Random();
    }

    /* Проверяем, есть ли у игрока 7 побед */
    public boolean has7wins(){
        return numberOfWins >= 7;
    }

    public int getCurrentResult(){
        return currentResult;
    }

    // переопределение метода toString()
    @Override
    public String toString(){
        return name;
    }

    /* Сделать ход */
    public void makeMove(int k){
        Scanner scanner = new Scanner(System.in);
        System.out.println(this + " делает ход");
        if (!computer){
            System.out.println("Чтобы бросить кости, нажмите enter");
            scanner.nextLine();

        }
        currentResult = 0;
        for (int i = 1; i <= k; i++){
            int j = random.nextInt(6)+1;
            System.out.println("Количество очков на " + i + " кубике: " + j);
            currentResult = currentResult + j;
        }
        System.out.println("Результат игрока " + this + ": " + currentResult);
    }

    /* Записать победу */
    public void becomeWinner(){
        numberOfWins++;
    }

    public int getNumberOfWins(){
        return numberOfWins;
    }
}
