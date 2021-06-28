class Address{
    String country;
    String province;
    String city;
    String street;
    String zip_code;

    public Address(String country, String province, String city, String street, String zip_code){
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.zip_code = zip_code;
    }

    public String returnAddress(){
        return this.country + " " + this.province + " " + this.city + " " + this.street + " " + this.zip_code;
    }
}

public class ex1 {
    public static void main(String args[]){
        Address add = new Address("China", "Jiangxi", "Nanchang", "xxxRoad", "330000");
        System.out.println(add.returnAddress());
    }    
}
