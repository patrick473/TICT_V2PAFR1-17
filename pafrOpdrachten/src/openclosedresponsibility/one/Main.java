package openclosedresponsibility.one;

import java.util.Scanner;

/**
 * Created by patrick on 11/16/2017.
 */
public class Main {

    public static void main(String[] args){
        Saver mainItem = new Saver();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("geef het bestandsnaam");
        String file = reader.nextLine();
        System.out.println("1: save as html");
        System.out.println("2: save as docx");
        System.out.println("3: save as xml");
        int n = reader.nextInt(); // Scans the next token of the input as an int.

        switch(n){
            case 1 :



                mainItem.saveFile(new html(file));

                break;
            case 2:



                mainItem.saveFile(new docx(file));
                break;

            case 3:



                mainItem.saveFile(new xml(file));
                break;
        }



        reader.close();
    }
}
