package ArrayCreator;

import java.lang.reflect.Array;

/**
 * Created by r3v3nan7 on 16/03/2017.
 */
public class Main {

    public static void main(String[] args) {
        Integer[] integers = ArrayCreator.create(Integer.class, 5, 1);
        System.out.println(integers.length);

    }




}
