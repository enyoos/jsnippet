public class AuthService{
    private Handler handler;
    public AuthService(Handler h){this.handler=h;}
    public boolean logIn(String e, String password){
        if (handler.handle(e, password)){
            //do some stuff....
            return true;
        }
        return false;
    }
}