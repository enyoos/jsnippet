public class FactoryProvider{
    public static AbstractFactory getFactory(String choice){
        switch(choice){
            case "Animal":
            System.out.println("animal!");
            return new AnimalFactory();
            break;
            default:
            return null;
            break;
        }
        return null;
    }
}