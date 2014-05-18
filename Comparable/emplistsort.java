import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.GregorianCalendar;

public class emplistsort {
        public static void main(String[] arg) {
                employee john = new employee("Doe", "John", (new GregorianCalendar(2005, 04, 03)).getTime());
                employee abc = new employee("abc", "def", (new GregorianCalendar(1999, 03, 02)).getTime());
                employee greg = new employee("Gregory", "John", (new GregorianCalendar(2013, 11, 1)).getTime());
                employee any = new employee("any", "who", (new GregorianCalendar(2013, 2, 3)).getTime());

                List<employee> myEmpList = new ArrayList<employee>();
                myEmpList.add(john);
                myEmpList.add(abc);
                myEmpList.add(greg);
                myEmpList.add(any);


                System.out.println(myEmpList);
                Collections.sort(myEmpList);
                System.out.println(myEmpList);
        }
}
