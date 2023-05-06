public abstract class MotorVehiculFactory{
    public MotorVehicul create(){
        MotorVehicul vehicl = createMotorVehicl();
        vehicl.build();
        return vehicl;
    } 
    protected abstract MotorVehicul createMotorVehicl();
}