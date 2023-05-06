public class TrainFactory{
    @Override 
    protected MotorVehicul createMotorVehicl(){
        return new Train();
    }
}