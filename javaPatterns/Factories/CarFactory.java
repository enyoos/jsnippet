public class CarFactory extends MotorVehiculFactory{
    @Override 
    protected MotorVehicul createMotorVehicl(){
        return new Car();
    }
}