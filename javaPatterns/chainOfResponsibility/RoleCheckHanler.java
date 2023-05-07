public class RoleCheckHandler extends Handler{
    @Override
    public boolean handle(String u, String p){
        if (!u.equals("admin")){
            System.out.println("you're not the admin");
            return false;
        }
        return handleNext(u, p);
    }
}