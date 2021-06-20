package Block2Lesson1;

public class MainAuto {
    public static void main(String[] args) throws CloneNotSupportedException {
        Auto auto = new Auto("Dmitry","Ford","Focus");
        Auto.Engine engine = new Auto.Engine();
        Auto.Engine newEngine = new Auto.Engine();

        auto.setEngines(newEngine);

        Auto nextAuto = auto.clone();

        System.out.println(engine);
        System.out.println(newEngine);
        System.out.println(auto);
        System.out.println(nextAuto);
    }
}
