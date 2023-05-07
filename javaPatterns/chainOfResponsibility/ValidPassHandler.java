public class ValidbassHandler extends Handler{

    private Database db;
    public ValidbassHandler(Database db){
        this.db=db;
    }
    public boolean handle(String n, Strign p){
        if (!n.equals(this.db.db.get(1))){
            System.out.println("wrong pass");
            return false;
        }
        return handleNext(n, p);
    }
}