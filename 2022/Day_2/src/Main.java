import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //SO MESSY NOT PROUD OF IT PLS DONT LOOK I SHOULD HAVE JUST MADE AN ALGO INSTEAD OF USING IF?ELSE


        File file = new File("file.txt");
        Scanner sc = new Scanner(file);
        int total = 0;
        int win = 6;
        int tie = 3;

        while (sc.hasNextLine()){
            String first = sc.next();
            System.out.print(first);
            String second = sc.next();
            System.out.println(second);

            /* First Challenge
            if (first.equals("A")) {
                    if (second.equals("Y")) {
                        total += 2 + win;
                        //win
                    } else if (second.equals("X")) {
                        total += 1 + tie;
                        //tie
                    } else if (second.equals("Z")) {
                        total += 3;
                        //lose
                    }
                }
                if (first.equals("B")) {
                    if (second.equals("Y")) {
                        total += 2 + tie;
                        //tie
                    } else if (second.equals("X")) {
                        total += 1;
                        //lose
                    } else if (second.equals("Z")) {
                        total += 3 + win;
                        //win
                    }
                }
                if (first.equals("C")) {
                    if (second.equals("Y")) {

                        total += 2;
                        //lose
                    } else if (second.equals("X")) {
                        total += 1 + win;
                        //win
                    } else if (second.equals("Z")) {
                        total += (3 + tie);
                        //tie
                    }
                }
                */
            if(second.equals("X")){
                //lose
                if(first.equals("A")) {
                    total += 3;
                } else if (first.equals("B"))
                {
                    total += 1;
                } else if (first.equals("C"))
                {
                    total += 2;
                }
            }else if(second.equals("Y")){
                //Tie
                if(first.equals("A")) {
                    total += 1 + tie;
                } else if (first.equals("B"))
                {
                    total += 2 + tie;
                } else if (first.equals("C"))
                {
                    total += 3 + tie;
                }
            }else if(second.equals("Z")){
                //Win
                if(first.equals("A")) {
                    total += 2 + win;
                } else if (first.equals("B"))
                {
                    total += 3 + win;
                } else if (first.equals("C"))
                {
                    total += 1 + win;
                }
            }

        }
        System.out.println(total);





    }
}