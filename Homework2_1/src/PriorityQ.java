import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQ {

    public static void main(String[] args) {
        System.out.println(new PriorityQ().run());
    }

    String run(){
        StringBuilder result = new StringBuilder("");
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++){
            String line = sc.nextLine();
            if(line.startsWith("Insert")){
                int num = Integer.parseInt(line.substring(7));
                queue.add(num);
            } else {
                result.append(queue.poll()).append("\n");
            }
        }
        return result.toString();
    }
}
