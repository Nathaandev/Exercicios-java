package entities;

public class Product{
    private String name;
    private int age;
    private double height;


    public Product(String name ,int age ,double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public double getHeight() {
        return height;
    }

}
