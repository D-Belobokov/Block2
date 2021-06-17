package Block2Lesson1;

public class Auto implements Cloneable{
    private final String name;
    private final String brand;
    private final String model;

    private Engine[] engines;

    public Auto(String name, String brand,String model){
        this.name = name;
        this.brand = brand;
        this.model = model;
    }
    static class Engine implements Cloneable {

        public Engine clone() throws CloneNotSupportedException {
            return (Engine) super.clone();
        }
    }
}
