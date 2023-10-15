public class SalePerson implements Comparable<SalePerson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString() {
        return (lastName + ", " + firstName + " : " + totalSales);
    };

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SalePerson other = (SalePerson) o;
        return firstName.equals(other.firstName) && lastName.equals(other.lastName);
    }

    // need to implement compareTo() from interface
    // compareTo() compares itself with other instances
    public int compareTo(SalePerson other) {
        if (this.totalSales < other.totalSales) {
            return -1;
        } else if (this.totalSales > other.totalSales) {
            return 1;
        } else {
            //  total sales same, then compare by last name
            return this.lastName.compareTo(other.lastName);
        }
    };

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}
