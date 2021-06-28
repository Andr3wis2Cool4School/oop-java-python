class Employee{
    String first;
    String last;
    String email;
    int pay;
}

public class javaDemo1 {
    public static void main(String args[]) {
        Employee emp_1 = new Employee();
        Employee emp_2 = new Employee();

        emp_1.first = "Colin";
        emp_1.last = "Xiao";
        emp_1.email = "Colin.Xiao@company.com"; // first name + last name @company.com
        emp_1.pay = 50000;


        emp_2.first = "Lorna";
        emp_2.last = "Deng";
        emp_2.email = "Lorna.Deng@company.com"; // first name + last name @company.com
        emp_2.pay = 20000;
        
        System.out.println(emp_1.email);
        System.out.println(emp_2.email);
    }
}