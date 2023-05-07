public class UserExistHandler extends Handler{
    private Database db;
    public UserExistHandler(Database db){
        this.db=db;
    }
    @Override 
    public boolean handle(String n, Strign p){
        if (!n.equals(this.db.db.get(1))){
            System.out.println("wrong pass");
            return false;
        }
        return handleNext(n, p);
    }
}