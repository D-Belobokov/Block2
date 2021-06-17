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
    public void setEngines(Engine...engines){
        this.engines = engines;
    }

    public Auto clone() throws CloneNotSupportedException{          //метод для клонирования с объекта Auto с объектом класса Engine
        Auto newAuto = (Auto) super.clone();                         // клонируем новый объект класса Auto
        Engine[] newEngine = new Engine[newAuto.engines.length];     //создаем мвссив с объектами Engine.Длинна равна кол-ву объ_в Auto с объ_м engine
        for (int i = 0;i<newAuto.engines.length;i++){                //идем циклом по массиву с объектами Auto и клонируем в их объект класса Engine
            newEngine[i] = newAuto.engines[i].clone();               // в объект newAuto мы запихиваем склонированный объект engine
        }
        newAuto.setEngines(newEngine);                                //запихиваем в новый объект auto склонированный объект класса engine
        return newAuto;                                               //возвращаем склонированный новый объект класса Auto
    }
}
