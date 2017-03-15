package Telephony.models;

/**
 * Created by r3v3nan7 on 15.03.17.
 */
public class Smartphone implements Calling, Browsing {



    @Override
    public String calling(String numberToCall) {
        return "Calling... " + numberToCall;
    }

    @Override
    public String browsing(String site) {
        boolean isContainDigit = false;

        for (char ch : site.toCharArray()) {
            if(Character.isDigit(ch)){
                isContainDigit = true;
            }
        }


        if(isContainDigit){
            return "Invalid URL!";
        }

        return "Browsing: " + site + "!";
    }
}
