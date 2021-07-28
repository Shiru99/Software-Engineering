import java.lang.reflect.InvocationTargetException;

enum Color {
    RED, BLUE, BLACK, WHITE
};

class Vehicle {
    Color color;
}

class Bus extends Vehicle {
    public Bus(Color C) {   color = C;  System.out.println("Creating "+C+" Bus");   }
}

class Car extends Vehicle{
    public Car(Color C) {   color = C;  System.out.println("Creating "+C+" Car");       }
}

class VehicleFactory{

    public static <S> Vehicle buildOne(Class<S> class1, Color C) throws InstantiationException, IllegalAccessException,IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
    {
        return (Vehicle) class1.getDeclaredConstructor(new Class[]{Color.class}).newInstance(C);
    }
}

public class A4 {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
    IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
    {
        Vehicle redCar   =  VehicleFactory.buildOne(Car.class, Color.RED);
        Vehicle blueBus  =  VehicleFactory.buildOne(Bus.class, Color.BLUE);
    }


}


