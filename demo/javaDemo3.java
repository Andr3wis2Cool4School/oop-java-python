class Employee {
    private String first;
    private String last;
    private String email;
    private int pay;

    public Employee(String tempFirst, String tempLast, int tempPay){
        first = tempFirst;
        last = tempLast;
        email = tempFirst + "." + tempLast + "@company.com";
        pay = tempPay;
    }

    public void setInfo(String tempFirst, String tempLast){
        first = tempFirst;
        last = tempLast;
        email = tempFirst + "." + tempLast + "@company.com";
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



public class javaDemo3{
    public static void main(String args[]){
        Employee emp_1 = new Employee("Colin", "Xiao", 50000);
        Employee emp_2 = new Employee("Lorna", "Deng", 20000);


        System.out.println(emp_1.getEmail());
        System.out.println(emp_2.getEmail());
    }
}