import java.util.GregorianCalendar;
import java.util.Arrays;

public class empsort {
        public static void main(String[] arg){
                employee john = new employee("Doe", "John", (new GregorianCalendar(2005, 04, 03)).getTime());
                employee abc = new employee("abc", "def", (new GregorianCalendar(1999, 03, 02)).getTime());
                employee greg = new employee("Gregory", "John", (new GregorianCalendar(2013, 11, 1)).getTime());
                employee any = new employee("any", "who", (new GregorianCalendar(2013, 2, 3)).getTime());

                employee[] empArray = new employee[4];
                empArray[0] = john;
                empArray[1] = abc;
                empArray[2] = greg;
                empArray[3] = any;

                for ( int i = 0 ; i < empArray.length ; i++ )
                        System.out.println(empArray[i]);

                Arrays.sort(empArray);

                System.out.println();

                for ( int i = 0 ; i < empArray.length ; i++ )
                        System.out.println(empArray[i]);
        }
}
