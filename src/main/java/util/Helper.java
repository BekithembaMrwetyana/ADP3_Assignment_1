package util;
   /*
Helper.java
Helper model class
Author : Thandolwethu p Mseleku(223162477)
Date:25 March 2025
 */
import java.util.UUID;

public class Helper {
    //method to auto generate id
    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    //method to check validity of a String
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }
}
