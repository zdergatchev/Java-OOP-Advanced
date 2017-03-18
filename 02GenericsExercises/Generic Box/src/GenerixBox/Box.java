package GenerixBox;

/**
 * Created by r3v3nan7 on 18.03.17.
 */
public class Box<T> {
    private String someText;


    public Box(String str){
        this.someText = str;
    }

    @Override
    public String toString(){
        return "" +this.someText.getClass().getName()+ ": " + this.someText;
    }


}
