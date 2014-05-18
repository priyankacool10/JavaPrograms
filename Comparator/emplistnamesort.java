import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

public class emplistnamesort {
        public static void main(String[] arg) {
                employee emp1 = new employee("Kapoor", "Priyanka", (new GregorianCalendar(2005, 04, 03)).getTime());
                employee emp2 = new employee("Jain", "Ishita", (new GregorianCalendar(1999, 03, 02)).getTime());
                employee emp3 = new employee("Sharma", "Gaury", (new GregorianCalendar(2013, 11, 1)).getTime());
                employee emp4 = new employee("Gupta", "Anny", (new GregorianCalendar(2013, 2, 3)).getTime());

                namesort myNameSort = new namesort();

                List<employee> myEmpList = new ArrayList<employee>();
                myEmpList.add(emp1);
                myEmpList.add(emp2);
                myEmpList.add(emp3);
                myEmpList.add(emp4);

                System.out.println(myEmpList);
                Collections.sort(myEmpList, myNameSort);
                System.out.println(myEmpList);
        }
}
