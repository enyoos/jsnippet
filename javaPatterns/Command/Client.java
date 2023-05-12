//this is how our client is going to access our "api"
public class Client{
    public static void main(String... a){
        CLI c = new CLI();
        c.executeCommand(new ShowCommandOperation(new Command("hello world")));
    }
}