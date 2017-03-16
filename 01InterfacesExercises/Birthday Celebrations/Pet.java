package BorderControl_05;

/**
 * Created by r3v3nan7 on 16.03.17.
 */
public class Pet implements BirthDate {
    private String name;
    private String birthday;

    public Pet(String name, String birthday){
        this.name = name;
        this.birthday = birthday;
    }


    @Override
    public String getBirthDate() {
        return this.birthday;
    }
}
