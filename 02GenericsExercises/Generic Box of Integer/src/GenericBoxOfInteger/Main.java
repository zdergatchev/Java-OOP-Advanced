package GenericBoxOfInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by r3v3nan7 on 18.03.17.
 */
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(reader.readLine());
            Box number = new Box(num);
            System.out.println(number.toString());

        }
    }



}
