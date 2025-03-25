package za.ac.cput.util;

public class Helper {

public static boolean isNullorEmpty(String s) {
if(s.isEmpty() || s == null)
    return true;
        return false;

}
public static boolean isValidDouble(double d){
    if (d < 0)
        return false;
    return true;
}
}
