package Queue;

import java.util.LinkedList;
import java.util.List;

public class Generic {

    public static void main(String[] args) {

      //  Box<Integer> integerBox = new Box<>(15);

        //Number number = integerBox.getContents(); // строка 4

        //System.out.println(number.getClass().getSimpleName());

        int n=10;
        List <Integer> listNumber=new LinkedList<>();
        for(int i=0; i<=n; i++){
            listNumber.add(i);
        }

      for (int i=0, j=n; i<n/2 && j>=0; i++, j--) {
            int x=listNumber.get(i);
            int y=listNumber.get(j);
            listNumber.set(x,y);
            listNumber.set(y,x);
        }

        for (Integer el:listNumber){
            System.out.print(el+" ");
        }

    }

}
