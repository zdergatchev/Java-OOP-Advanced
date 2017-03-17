package GenericScale;

/**
 * Created by r3v3nan7 on 16/03/2017.
 */
public class Scale<T extends Comparable<T>> {

    private T left;
    private T right;

    public Scale(T left, T right){
        this.left = left;
        this.right = right;
    }

    public T getHeavier(){
        if(left.compareTo(right) == 0){
            return  null;
        }

        if(left.compareTo(right) < 0){
            return right;
        }

        return left;

    }


}
