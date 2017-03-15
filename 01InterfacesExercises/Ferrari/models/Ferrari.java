package Ferrari.models;

/**
 * Created by r3v3nan7 on 15.03.17.
 */
public class Ferrari implements Car {
    private String model;
    private String driverName;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }



    public Ferrari(String driverName){
        this.setDriverName(driverName);
        this.setModel("488-Spider");
    }



    @Override
    public String useBreaks() {
        return "Brakes!";
    }

    @Override
    public String pushTheGas() {
        return "Zadu6avam sA!";
    }


    @Override
    public String toString(){
        return this.getModel() + "/" + this.useBreaks() + "/" + this.pushTheGas() + "/" + this.getDriverName();
    }


}
