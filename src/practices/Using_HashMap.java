package practices;

import java.util.*;

public class Using_HashMap {

    static HashMap<String, String> info = new HashMap<String, String>();

    static HashMap fillHashMap(){
        info.put("FirstName", "Víctor");
        info.put("LastName", "Arango");
        info.put("YearOfBirth", "1994");
        info.put("MonthOfBirth", "October");
        info.put("DayOfBirth", "21");

        return info;
    }
}
