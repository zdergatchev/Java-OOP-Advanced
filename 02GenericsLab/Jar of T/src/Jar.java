import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by r3v3nan7 on 16/03/2017.
 */public class Jar<E> {

    private Deque<E> contents;

    public Jar(){
        this.contents = new ArrayDeque<E>();
    }


    public void add(E element){
        this.contents.push(element);
    }


    public E remove(){
        return this.contents.pop();
    }


    public static void main(String[] args) {
        Jar<String> jar = new Jar<>();
        jar.add("asdf");
    }


}
