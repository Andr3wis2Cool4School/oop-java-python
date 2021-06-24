class Employee {
    private String first;
    private String last;
    private String email;
    private int pay;

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
    

public class javaDemo2 {
    public static void main(String args[]){
        Employee emp_1 = new Employee();
        Employee emp_2 = new Employee();

        emp_1.setInfo("Colin", "Xiao");
        emp_1.setPay(50000);
        System.out.println(emp_1.getEmail());

        emp_2.setInfo("Lorna", "Deng");
        emp_2.setPay(20000);
        System.out.println(emp_2.getEmail());

    }    
}
