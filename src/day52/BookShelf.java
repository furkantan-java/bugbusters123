package day52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookShelf {

    public static void main(String[] args) {
        List<Book> lst = new ArrayList<>();

        lst.add(new PaperBook("Java", "Akbar", 3));
        lst.add(new PaperBook("Selenium", "Vasyl", 2));
        lst.add(new AudioBook("Agile", "Guljannat", 1.8));
        Book b2 = new PaperBook("Selenium","Vasyl",2);
        Book b3 = new AudioBook("Agile","Guljannat",1.8);
        Book b4 = new PaperBook("The Kite Runner","Khaled Hosseini",3);
        Book b5 = new PaperBook("Lord of the Rings","J. R. R. Tolkien",2000);
        Book b6 = new AudioBook("Game of Thrones","George R. R. Martin",95.5);
        lst.addAll(Arrays.asList(b2,b3,b4,b5,b6));

        System.out.println(lst);

        System.out.println(lst.size());
        int count=0;
        for(Book each: lst){
            if(each.getClass().getSimpleName().equals("PaperBook")){
                count++;
            }
        }
        System.out.println(count);


    }
}
