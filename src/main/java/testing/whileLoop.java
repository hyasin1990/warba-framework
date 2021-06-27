package testing;

import org.openqa.selenium.NoSuchElementException;
import sun.management.snmp.jvminstr.JvmOSImpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class whileLoop {
    public static void main(String[] args) {

        String userMonth = "March";
        int intUserMonth = 0;
        HashMap<Integer, String> dateMap = new HashMap<Integer, String>();

        dateMap.put(1, "January");
        dateMap.put(2, "February");
        dateMap.put(3, "March");
        dateMap.put(4, "April");
        dateMap.put(5, "May");
        dateMap.put(6, "June");
        dateMap.put(7, "July");
        dateMap.put(8, "August");
        dateMap.put(9, "September");
        dateMap.put(10, "October");
        dateMap.put(11, "November");
        dateMap.put(12, "December");

        for (int i = 1; i <= dateMap.size(); i++) {

            if (dateMap.get(i).contains(userMonth)) {
                intUserMonth =i;
                System.out.println("User Month is: " + intUserMonth);
                System.out.println(dateMap.get(i));
            }


        }
    }
}