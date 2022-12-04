import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

//SHIT CODE
public class Main {
    public static void main(String[] args) throws FileNotFoundException {



        /*
        Scanner sc = new Scanner(new File("file.txt"));
        int total = 0;
        String alph = "abcdefghijklmnopqrstuvwxyz";
        //Creates alphabet Arrays


        char[] upper = alph.toCharArray();
        char[] lower = alph.toCharArray();
        for (int i = 0; i < 26; i++) {
            upper[i] = Character.toUpperCase((upper[i]));
        }





       while(sc.hasNextLine()){

            String one;
            String two;
            String three;
            char same = ' ';
            char same2 = ' ';
            char same3 = ' ';
            //Line => String
            one = sc.nextLine();
            two = sc.nextLine();
            three = sc.nextLine();
            int split = one.length() / 2;
           int split2 = one.length() / 2;
           int split3 = one.length() / 2;

            ArrayList<Character> split_1 = new ArrayList<>();
            ArrayList<Character> split_2 = new ArrayList<>();
           ArrayList<Character> split_3 = new ArrayList<>();
           ArrayList<Character> split_4 = new ArrayList<>();
           ArrayList<Character> split_5 = new ArrayList<>();
           ArrayList<Character> split_6 = new ArrayList<>();
            for(int i = 0; i < split; i++){
                split_1.add(one.charAt(i));
                System.out.print(i);

            }
            for(int i = one.length() - 1; i >= split; i--){
                System.out.print(i);
                split_2.add(one.charAt(i));
                Collections.reverse(split_2);
            }

           for(int i = 0; i < split2; i++){
               split_3.add(two.charAt(i));
               System.out.print(i);

           }
           for(int i = one.length() - 1; i >= split2; i--){
               System.out.print(i);
               split_4.add(two.charAt(i));
               Collections.reverse(split_4);
           }

           for(int i = 0; i < split3; i++){
               split_5.add(three.charAt(i));
               System.out.print(i);

           }
           for(int i = one.length() - 1; i >= split3; i--){
               System.out.print(i);
               split_6.add(three.charAt(i));
               Collections.reverse(split_6);
           }
            //Compare
            for (char c :split_1) {
                for (char d: split_2) {

                    if(c == d){

                        same = c;
                    }
                }
            }
           for (char c :split_3) {
               for (char d: split_4) {

                   if(c == d){
                       same2 = c;
                   }
               }
           }
           for (char c :split_5) {
               for (char d: split_6) {

                   if(c == d){
                       same3 = c;
                   }
               }
           }


               int found = new String(lower).indexOf(same) ;
               int found2 = new String(upper).indexOf(same);
               //Get Points
               System.out.println(same);
               System.out.println(one);
               System.out.println(found + " " + found2);

               System.out.println(Arrays.toString(lower) + "\n" + Arrays.toString(upper));
               if(found != -1) {
                   total += found + 1;
               }else if (found2 != -1){
                   total += (found2)  + 27;
               }else {
                   System.out.println("Not found in either");
               }
               System.out.println(total);
           }

        System.out.println(total);
       */
       //restart for part 2


        int total = 0;
        Scanner sc = new Scanner(new File("file.txt"));

        while(sc.hasNextLine()){
            String one = sc.nextLine();
            String two = sc.nextLine();
            String three = sc.nextLine();
            String[] lines = {one, two, three};
            ArrayList<Character> dups = new ArrayList<>();
            

            for(String s : lines){
                

                Set<Character> charMap = new HashSet<>();


                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    charMap.add(Character.valueOf(ch));

                }
                for(char c: charMap){
                    dups.add(c);
                }
            }
            System.out.println(dups);

            for(char c : dups){
                System.out.println(c);
                if(one.indexOf(c) == -1){
                    System.out.println("one");
                    continue;
                }
                if(two.indexOf(c) == -1){
                    System.out.println("two");
                    continue;
                }
                if(three.indexOf(c) == -1){
                    System.out.println("three");
                    continue;
                }

                if(Character.isUpperCase(c)){
                    System.out.println((c - 'A') + 27);

                    total += (c - 'A') + 27;
                    System.out.println(total);


                }else{
                    System.out.println((c - 'a') + 1);
                    total += (c - 'a') + 1;
                    System.out.println(total);

                }
                break;
            }

        }



        System.out.println(total);


    }


}



