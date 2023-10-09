package ch07.InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        Employee joe = new Employee("Joe", "11/11/1990", "03/03/2020");
        System.out.println(joe);

        SalariedEmployee bob = new SalariedEmployee("Bob", "10/10/1989", "02/02/2021", 35000);
        System.out.println(bob);
        System.out.println("Bob's Paycheck = $" + bob.collectPay());
        bob.retire();
        System.out.println("Bob's Pension check = $ " + bob.collectPay());

        HourlyEmploee mary = new HourlyEmploee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
