public class AnimalFactory implements AbstractFactory<Animal>{

    @Override
    public Animal create(String animalType){
        switch(animalType){
            case "Duck":
            return new Duck();
            break;
            default:
            return null;
            break;
        }
        return null;
    }

}