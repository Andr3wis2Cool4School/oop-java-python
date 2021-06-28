class Employee {
    String first;
    String last;
    String email;
    int pay;
    double raise_amount = 1.04;

    public Employee(String first, String last, int pay){
        this.first = first;
        this.last = last;
        this.email = this.first + "." + this.last + "@company.com";
        this.pay = pay;
    }

    public void apply_raise(){
        this.pay = (int) (this.pay * this.raise_amount);
    }
}


public class javaDemo8 {
    public static void main(String args[]){
        Employee emp_1 = new Employee("Colin", "Xiao", 50000);
        Employee emp_2 = new Employee("Lorna", "Deng", 20000);

        System.out.println(emp_1.pay);
        System.out.println(emp_2.pay);

        System.out.println(emp_1.raise_amount);
        emp_1.raise_amount = 2.00;
        System.out.println(emp_1.raise_amount);
        System.out.println(emp_2.raise_amount);
        emp_1.apply_raise();
        emp_2.apply_raise();
        System.out.println(emp_1.pay);
        System.out.println(emp_2.pay);
    }
    
}
