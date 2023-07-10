class SalariedEmployee{
    String name;
    public void calculatePay(Double salary){
        System.out.println("Monthly Salary"+" "+ salary);
    }
    public void calculatePay(Double hourlyRate, Double hoursWorked){
        System.out.println("Weekly Salary"+" "+(hourlyRate*hoursWorked));
    }
}


public class Main {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee();
        salariedEmployee.name = "Shivani";
        salariedEmployee.calculatePay(50000d);
        salariedEmployee.calculatePay(100d,25d);

    }
}