import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("file.txt"));
        int total = 0;
        while(sc.hasNext()){
            String next = sc.next();
            System.out.println(next);
            String[] numbers = new String[4];
            int fMax = 0, fMin = 0, sMax = 0, sMin = 0;



            numbers = next.split("[-,]");

            fMin = Integer.parseInt(numbers[0]);
            fMax = Integer.parseInt(numbers[1]);
            sMin = Integer.parseInt(numbers[2]);
            sMax = Integer.parseInt(numbers[3]);

            /* Part One
            if((fMin >= sMin && fMax <= sMax) || (sMin >= fMin && sMax <= fMax))
            {
                total += 1;
            }
            */
            //Part Two
            ArrayList<Integer> range_1 = new ArrayList<>();
            ArrayList<Integer> range_2 = new ArrayList<>();
            for(int i = fMin; i <= fMax; i++){
                range_1.add(i);
            }
            for(int i = sMin; i <= sMax; i++){
                range_2.add(i);

            }
            if(!Collections.disjoint(range_1, range_2))
            {
                total += 1;
            }

            System.out.println(total);
            System.out.println(Arrays.toString(numbers));
            System.out.println("First Max: " + fMax + "First Min: " + fMin + "Second Max: " + sMax +"Second Min: " + sMin);




            System.out.println("\n");
        }

    }
}