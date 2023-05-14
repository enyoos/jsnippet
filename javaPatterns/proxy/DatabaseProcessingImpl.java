public class DatabaseProcessingImpl implements HeavyProcess{
    public DatabaseProcessingImpl(){
        System.out.println("doing some heavy work");        
    }

    @Override
    public void process(){
        System.out.println("doing some heavy processing");
    }
}