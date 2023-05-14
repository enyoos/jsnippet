public class DatabaseProcessingProxy implements HeavyProcess{
    private static HeavyProcess obj; // make it static so it's linked with the class not the object
    @Override 
    public void process(){
        if (obj == null){
            obj = new DatabaseProcessingImpl();
        }

        obj.process();
    }
}