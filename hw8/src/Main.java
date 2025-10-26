import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Account ac1 = new Account("00123456789","saleh",3000);
        Account ac2 = new Account("1234578900", "mohammed"); // has balance 0
        Account ac3 = new Account();
        ac3.setBalance(1000);
        ac3.setId("2345667891");
        ac3.setName("ahmed");

        ac1.transferTo(ac2, 1500);

        System.out.printf("name: %s\nid: %s\nbalance: %d\n\n",
                ac1.getName(), ac1.getId(), ac1.getBalance());



        System.out.printf("%s\n\n-------------------------Employee class-------------------------\n\n",
                ac2.toString()); // after transfer should be 1500



        Employee em1 = new Employee();
        em1.setSalary(12000);
        em1.setId("2345667891");
        em1.setName("ahmed");

        Employee em2 = new Employee("1234567890", "ahmed", 10000);
        System.out.printf("%s\nannual salary: %d\nraised salary: %d\n\n",
                em1.toString(),em1.getAnnualSalary(),em1.raisedSalary(10));
        System.out.printf("name: %s\nid: %s\nsalary: %d\nannual salary: %d\nraised salary: %d",
                em2.getName(), em2.getId(), em2.getSalary(),em2.getAnnualSalary(),em2.raisedSalary(5));

    }
}
