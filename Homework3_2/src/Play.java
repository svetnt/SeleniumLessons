/* Класс Игра */
public class Play {
    int N; // количество игроков
    int K; // количество кубиков
    Player[] players;
    int currentWinner; // победитель в текущей игре. Он начинает следующую игру
    int nGame; // номер текущей игры (хода)

    public Play(int N, int K, String[] names){
        this.N = N;
        this.K = K;
        players = new Player[N];
        for (int i = 0; i < N-1; i++){
            players[i] = new Player(names[i], false);
            players[N-1] = new Player("Компьютер", true);
        }
        nGame = 1;
    }

    /* Завершение игры, если уже есть победтель */
    private boolean stopGame(){
        for (int i = currentWinner; i < N; i++){
            if (players[i].has7wins()){
                System.out.println("Игрок " + players[i] + " победил!");
                return true;
            }
        }
        for (int i = 0; i < currentWinner; i++){
            if (players[i].has7wins()){
                System.out.println("Игрок " + players[i] + " победил!");
                return true;
            }
        }
        return false;
    }

    /* Ход */
    private void Move(){
        System.out.println("Начинается " + nGame + " ход!");
        nGame++;
        int winner = currentWinner;
        int winnerResult = 0;
        for (int i = currentWinner; i < N; i++){
            players[i].makeMove(K);
            System.out.println();
            if (players[i].getCurrentResult() > winnerResult){
                winnerResult = players[i].getCurrentResult();
                winner = i;
            }
        }
        for (int i = 0; i < currentWinner; i++){
            players[i].makeMove(K);
            System.out.println();
            if (players[i].getCurrentResult() > winnerResult){
                winnerResult = players[i].getCurrentResult();
                winner = i;
            }
        }
        currentWinner = winner;
        players[winner].becomeWinner();
        System.out.println("В этом ходе победил " + players[winner] +
                ". Он имеет уже " + players[winner].getNumberOfWins() + " побед.");
        System.out.println();
    }

    public void startPlay(){
        while (!stopGame()){
            Move();
        }
    }
}
