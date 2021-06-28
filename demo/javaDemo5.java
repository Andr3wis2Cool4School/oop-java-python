// For convient we don't use private key word
class Employee{
    String first;
    String last;
    String email;
    int pay;

    public Employee(String first, String last, int pay){
        this.first = first;
        this.last = last;
        this.email = this.first + "." + this.last + "@company.com";
        this.pay = pay;
    }

    public String fullName(){
        String fullname = this.first + " " + this.last;
        return fullname;
    }
}


public class javaDemo5 {
    public static void main(String args[]){
        Employee emp_1 = new Employee("Colin", "Xiao", 50000);
        Employee emp_2 = new Employee("Lorna", "Deng", 20000);

        System.out.println(emp_1.fullName());
        System.out.println(emp_2.fullName());
    }
}
