package day64;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RepresentingTableData {
    public static void main(String[] args) throws IOException {
        Map<String, String> row1 = new LinkedHashMap<>();
        row1.put("first_name", "Regan");
        row1.put("email", "rboichat0@1688.com");
        row1.put("gender", "Female");

        Map<String, String> row2 = new LinkedHashMap<>();
        row2.put("first_name", "Carleen");
        row2.put("email", "cmorillas1@blog.com");
        row2.put("gender", "Female");

        // for one row I used one map
        // but I have many rows !
        // may of Some type -->> List<SomeType>

        System.out.println("row1 = " + row1);
        System.out.println("row2 = " + row2);

        List<Map<String, String>> rowMapLst = new ArrayList<>();
        rowMapLst.add(row1);
        rowMapLst.add(row2);

        System.out.println("rowMapLst = " + rowMapLst);

        System.out.println("rowMapLst.get(1).get(\"email\") = " + rowMapLst.get(1).get("email"));
        rowMapLst.get(0).replace("first_name", "HULK");
        System.out.println(rowMapLst);
        rowMapLst.get(0).put("first_name", "Jane");
        System.out.println(rowMapLst);
//        rowMapLst.get(0).replace("first_name", "Hulk");
//        System.out.println("rowMapLst = " + rowMapLst);
//        rowMapLst.get(0).put("first_name", "Jane");
//        System.out.println("rowMapLst = " + rowMapLst);

        List<String> listName = Files.readAllLines(Paths.get("src/day64/listName.txt"));
        System.out.println(listName);
        Map<String,String> rows= new LinkedHashMap<>();
        for (String each : listName) {
            rows.put("first_name", each.split(",")[0]);
            rows.put("email", each.split(",")[1]);
            rows.put("gender", each.split(",")[2]);
        }
        rowMapLst.add(rows);
        System.out.println("rowMapLst = " + rowMapLst);
    }
}
