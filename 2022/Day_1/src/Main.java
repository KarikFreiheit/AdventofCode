import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //String list
        Scanner sc = new Scanner(new File("file.txt"));


        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> totals = new ArrayList<>();
        int value = 0;
        while(sc.hasNextLine()){
            String nxt = sc.nextLine();

            if(nxt.isEmpty()){
                totals.add(value);
                value = 0;

            }else{
                value += Integer.parseInt(nxt);
            }
        }
        System.out.println(totals);


        int max = 0;
        for(int i = 0; i < totals.size(); i++){
            if( max < totals.get(i)){
                max = totals.get(i);
            }
        }
        //Highest Value
        System.out.println(max);

        //top 3 Values
        Collections.sort(totals);
        Collections.reverse(totals);
        System.out.println("1: " + totals.get(0) + "2 " + totals.get(1) + "3 "+ totals.get(2));

        //Collective total of top 3
        System.out.println(totals.get(0) + totals.get(1) + totals.get(2));





    }
}