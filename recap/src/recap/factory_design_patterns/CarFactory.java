package recap.factory_design_patterns;

public class CarFactory {

    public static Car createCar(Class aClass) throws IllegalAccessException, InstantiationException {
        return (Car) aClass.newInstance();
    }
}