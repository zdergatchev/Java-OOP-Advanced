package CustomListSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by r3v3nan7 on 19.03.17.
 */
public class Sorter extends CustomList{


      public static <T extends Comparable<T>> void sort(ArrayList<String> listForSort){
          Collections.sort((List<T>) listForSort, null);
      }

//    @Override
//    public void sort(CustomList listSort) {
//        Collections.sort(super.workingList);
//    }

//    @SuppressWarnings("unchecked")
//    public static <T extends Comparable> void sort(CustomList<T> listForSorting){
//        Collections.sort(listForSorting);
////        T element = listForSorting.get(0);
////
////        for (int i = 1; i < listForSorting.size(); i++) {
////            if(listForSorting.get(i).compareTo(element) < 0){
////
////            }
////        }
//
//
//
//    }

}
