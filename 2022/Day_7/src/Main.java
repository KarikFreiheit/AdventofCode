import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main {



    public static void main (String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("file.txt"));

        Tree t =  new Tree(12);

        t.printPreorder();
    }


}
