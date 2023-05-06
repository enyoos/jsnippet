public class Duck implements Animal{
    @Override
    public String getAnimal(){
        return "Duck";
    }
    @Override String makeNoise(){
        return "Quack";
    }
}