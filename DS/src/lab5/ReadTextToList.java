package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextToList {
    public static void main(String[] args) {
        SinglyLinkedList<String> list= new SinglyLinkedList<>();

        try {
            Scanner input= new Scanner(new File("F://Students.txt"));

            while (input.hasNext())
            {list.addFirst(input.nextLine());}

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
        System.out.println(list.print());
    }
}
