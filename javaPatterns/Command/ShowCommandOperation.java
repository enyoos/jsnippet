//then you can create multiple operations (in this example, the operation is "showCommand") implementing the same interface
public class ShowCommandOperation implements Executor{
    private Command cmd;
    public ShowCommandOperation(Command cmd){
        this.cmd=cmd;
    }
    @Override
    public void execute(){
        this.cmd.showCommand();
    } 
}