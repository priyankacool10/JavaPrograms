import java.util.Comparator;


public class namesort implements Comparator<employee> {
        @Override
        public int compare(employee emp1, employee emp2) {

                return emp1.getLastName().compareTo(emp2.getLastName());

        }
}
