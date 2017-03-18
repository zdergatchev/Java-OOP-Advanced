package GenericBoxOfInteger;

/**
 * Created by r3v3nan7 on 18.03.17.
 */
public class Box<T> {
    private Integer number;

    public Box(int number){
        this.number = number;
    }

    @Override
    public String toString(){
        return "" + this.number.getClass().getName() + ": " + this.number;
    }


}
