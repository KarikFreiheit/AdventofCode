import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("file.txt"));
        ArrayList<String> list = new ArrayList<>();
        int r = 0, c = 0;

        sc.reset();
        while(sc.hasNextLine()){
            String next = sc.nextLine();
            r = list.size();
            c = next.length();
            list.add(next);
        }
        int[][] trees = new int[r][c];
        int visible = 0;



        for(int i = 0; i < list.size() - 1; i++){
            String k =  list.get(i);
            for(int j = 0; j < k.length(); j++){
                trees[i][j] = k.charAt(j);
                System.out.print( trees[i][j]);
            }
            System.out.println();

        }






    }
}