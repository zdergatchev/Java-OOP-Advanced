package CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by r3v3nan7 on 19.03.17.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomList<String> myList = new CustomList<String>();

        String command = reader.readLine();

        while (!"END".equals(command)){
            String[] commandArgs = command.split(" ");

            switch (commandArgs[0]){
                case "Add":
                    myList.add(commandArgs[1]);
                    break;
                case "Remove":
                    myList.remove(Integer.parseInt(commandArgs[1]));
                    break;
                case "Contains":
                    System.out.println(myList.contains(commandArgs[1]));
                    break;
                case "Swap":
                    myList.swap(Integer.parseInt(commandArgs[1]), Integer.parseInt(commandArgs[2]));
                    break;
                case "Greater":
                    System.out.println(myList.countGreaterThat(commandArgs[1]));
                    break;
                case "Max":
                    System.out.println(myList.getMax());
                    break;
                case "Min":
                    System.out.println(myList.getMin());
                    break;
                case "Print":
                    myList.print();
                    break;
            }

            command = reader.readLine();

        }




    }

}
