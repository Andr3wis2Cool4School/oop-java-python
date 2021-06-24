class Employee {
    private String first;
    private String last;
    private String email;
    private int pay;

    public Employee(String first, String last, int pay){
        this.first = first;
        this.last = last;
        this.pay = pay;
        setEmail(this.first, this.last);
    }

    public void setEmail(String first, String last){
        this.email = first + "." + last + "@company.com";
    } 

    public void setPay(int tempPay){
        pay = tempPay;
    }

    public String getFirst(){
        return first;
    }

    public String getLast(){
        return last;
    }

    public String getEmail(){
        return email;
    }

    public int getPay(){
        return pay;
    }
}


public class javaDemo4 {
    public static void main(String args[]){
        Employee emp_1 = new Employee("Colin", "Xiao", 50000);
        Employee emp_2 = new Employee("Lorna", "Deng", 20000);

        System.out.println(emp_1.getEmail());
        System.out.println(emp_2.getEmail());
    }
}
