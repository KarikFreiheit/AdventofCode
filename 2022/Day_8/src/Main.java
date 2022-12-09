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
            for(int j = 0; j < list.size() -  1; j++){
                trees[i][j] = Character.getNumericValue(k.charAt(j));
                System.out.print( trees[i][j]);
                visible += checkVisibility(trees, i, j);
            }
            System.out.println();

        }

        System.out.println(visible);




    }


    public static int checkVisibility(int[][] trees, int i, int j){
        if(i == 0 || j == 0 || i == trees.length - 1 || j == trees[0].length - 1){
            return 1;
        }
        for(int k = 0; k < trees[i].length - 1; k++){
            if(trees[i][j] < trees[i][k]){
                break;
            }else{

                return 1;

            }
        }
        for(int k = 0; k < trees[j].length - 1; k++){
            if(trees[i][j] < trees[k][j]){
                return 0;
            }else{

                return 1;

            }
        }
        return 1;

    }
}