import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Stack<Character> one = new Stack<>();
        Stack<Character> two = new Stack<>();
        Stack<Character> three = new Stack<>();
        Stack<Character> four = new Stack<>();
        Stack<Character> five = new Stack<>();
        Stack<Character> six = new Stack<>();
        Stack<Character> seven = new Stack<>();
        Stack<Character> eight = new Stack<>();
        Stack<Character> nine = new Stack<>();

        one.push('H');one.push('C');one.push('R');
        two.push('B');two.push('J');two.push('H');two.push('L');two.push('S');two.push('F');
        three.push('R');three.push('M');three.push('D');three.push('H');three.push('J');three.push('T');three.push('Q');
        four.push('S');four.push('G');four.push('R');four.push('H');four.push('Z');four.push('B');four.push('J');
        five.push('R');five.push('P');five.push('F');five.push('Z');five.push('T');five.push('D');five.push('C');five.push('B');
        six.push('T');six.push('H');six.push('C');six.push('G');
        seven.push('S');seven.push('N');seven.push('V');seven.push('Z');seven.push('B');seven.push('P');seven.push('W');seven.push('L');
        eight.push('R');eight.push('J');eight.push('Q');eight.push('G');eight.push('C');
        nine.push('L');nine.push('D');nine.push('T');nine.push('R');nine.push('H');nine.push('P');nine.push('F');nine.push('S');
        ArrayList<Stack<Character>> stacks = new ArrayList<>();
        stacks.add(one);
        stacks.add(two);
        stacks.add(three);
        stacks.add(four);
        stacks.add(five);
        stacks.add(six);
        stacks.add(seven);
        stacks.add(eight);
        stacks.add(nine);
        Scanner sc = new Scanner(new File("file.txt"));

        while(sc.hasNextInt()){
            int number_1 = sc.nextInt();
            int number_2 = sc.nextInt();
            int number_3 = sc.nextInt();
            System.out.println(number_1 + " " + number_2 + " " + number_3);
            Stack<Character> temp = new Stack<>();
            for(int i = 0; i < number_1; i++){

                temp.push(stacks.get(number_2 - 1).pop());


                //stacks.get(number_3 - 1).push(stacks.get(number_2 - 1).pop());
                System.out.println(stacks.get(number_3 - 1));
                System.out.println(stacks.get(number_2 - 1));
            }
            for(int i = 0; i < number_1; i++){
                stacks.get(number_3 - 1).push(temp.pop());
            }
            System.out.println(temp);



        }
        for(int i = 0; i < 9; i++){
            System.out.print(stacks.get(i).pop());
        }

    }
}