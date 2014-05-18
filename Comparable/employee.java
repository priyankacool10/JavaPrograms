import java.lang.Comparable;
import java.util.Date;

public class employee implements Comparable<employee> {
        String lastName;
        String firstName;
        Date hireDate;

        public employee(String lastName, String firstName, Date hireDate) {
                this.lastName = lastName;
                this.firstName = firstName;
                this.hireDate = hireDate;
        }

        public Date getHireDate() {
                return hireDate;
        }

        public String getLastName() {
                return lastName;
        }

        @Override
        public String toString() {
                return new String(firstName+" "+lastName+", "+hireDate);
        }

        @Override
        public int compareTo(employee other) {
                Date otherEmployeeHireDate = other.getHireDate();
                return this.hireDate.compareTo(otherEmployeeHireDate);
        }
}
