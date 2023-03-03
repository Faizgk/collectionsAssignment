import java.io.Serializable;

public class Is {

    public static boolean isNumeric(Serializable strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble((String) strNum);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isBoolean(Serializable strNum){
        if (strNum == null) {
            return false;
        }
        try{
            boolean b = Boolean.parseBoolean((String)strNum);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
