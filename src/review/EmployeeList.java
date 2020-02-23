package review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeList {

    public static void main(String[] args) throws IOException {
        List<String> allLines = Files.readAllLines(Paths.get("src/review/emp.txt"));
        Map<Integer, String> empList = new HashMap<>();

        for (String each : allLines) {
            int id = Integer.parseInt(each.split(",")[0]);
            String names = each.split(",")[1];
            empList.put(id,names);        
        }
        System.out.println("empList = " + empList);

        System.out.println("empList.get(20) = " + empList.get(20));
    }
}
