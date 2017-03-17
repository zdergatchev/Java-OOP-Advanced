package ArrayCreator;

import java.lang.reflect.Array;

/**
 * Created by r3v3nan7 on 16/03/2017.
 */
public class ArrayCreator {

    @SuppressWarnings("unchecked")
    public static <T> T[] create(int length, T item) {
        T[] array = (T[]) new Object[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }

        return array;
    }


    public static <T> T[] create(Class<T> cl, int length, T item) {

        T[] array = (T[]) Array.newInstance(cl, length);

        for (int i = 0; i < array.length; i++) {

            array[i] = item;

        }

        return array;


    }

}
