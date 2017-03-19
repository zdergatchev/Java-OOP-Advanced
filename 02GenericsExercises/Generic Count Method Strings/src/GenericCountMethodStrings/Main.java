package GenericCountMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by r3v3nan7 on 18.03.17.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        //List<String> swappingList = new ArrayList<>();
        List<String> compareList = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            //swappingList.add(reader.readLine());
            compareList.add(reader.readLine());
        }

        String strToCompare = reader.readLine();

        System.out.println(Box.compareElements(compareList, strToCompare));




//        String[] indexArgs = reader.readLine().split(" ");
//        int firstIndex = Integer.parseInt(indexArgs[0]);
//        int lastIdex = Integer.parseInt(indexArgs[1]);
//
//        Box.swap(swappingList, firstIndex, lastIdex);



    }

}
