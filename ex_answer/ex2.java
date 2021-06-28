class Dog{
    String name;
    String color;
    String age;
    String weight;

    public Dog(String name, String color, String age, String weight){
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public void tell(){
        System.out.println("There is a " + this.color + ", " + this.age + " years old, " + this.weight + "and its name is " + this.name + ".");
    }
}

public class ex2 {
    public static void main(String args[]){
        Dog dog = new Dog("adam", "green", "20", "20");
        dog.tell(); 
    }    
}
