public class Main {
    public static void main(String[] args) {
        String names[] = new String[3];
        names[0] = "Мария";
        names[1] = "Андрей";
        names[2] = "Светлана";
        Play play = new Play(4, 3, names);
        play.startPlay();
    }
}
