//this is the receiver class (will perform the given actions)
public class Command{
    private String command;
    public Command(String n){
        this.command=n;
    }
    public void showCommand(){
        System.out.println("the command : " + this.command);
    }
}