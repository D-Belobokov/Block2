package Block2Lesson1;

import java.util.Arrays;

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

        public Engine() {
        }

        public Engine clone() throws CloneNotSupportedException {
            return (Engine) super.clone();

        }
    }
    public void setEngines(Engine...engines){
        this.engines = engines;
    }

    public Auto clone() throws CloneNotSupportedException{
        Auto newAuto = (Auto) super.clone();
        Engine[] newEngine = new Engine[newAuto.engines.length];
        for (int i = 0;i<newAuto.engines.length;i++){
            newEngine[i] = newAuto.engines[i].clone();
        }
        newAuto.setEngines(newEngine);
        return newAuto;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engines=" + Arrays.toString(engines) +
                '}';
    }
}
