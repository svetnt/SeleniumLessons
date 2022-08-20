import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EE {

    public static void main(String[] args) {

        List<String> color = new ArrayList<>();
        color.add("White");
        color.add("Tan");
        color.add("Yellow");
        color.add("Orange");
        color.add("Red");
        color.add("Pink");
        color.add("Purple");
        color.add("Blue");

        Iterator<String> iter = color.iterator();
        while (iter.hasNext()) {
            String nextColor = iter.next();
            if (nextColor.toUpperCase().indexOf("L") != -1) {
                iter.remove();
            }
        }

       /* for (String elem : color) {
            System.out.println(elem);
        }*/
        color.stream().forEach(c-> System.out.println(c));

        List<Integer> num = new ArrayList<>();
        for (int i = 100; i <= 1000; i++) {
            num.add(i);
        }

        for(int i=0; i<num.size(); i++){
            if(num.get(i)%2==0){
                num.remove(i);
            }
        }
        for(int i=0; i< num.size(); i++){
            System.out.println(num.get(i));
        }

      /*  Iterator<Integer> it = num.iterator();
        while (iter.hasNext()) {
            Integer numer = it.next();
            if (numer % 2 == 0) {
                iter.remove();
            }
        }*/
       // num.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));
    }
}

