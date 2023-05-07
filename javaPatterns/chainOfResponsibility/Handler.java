abstract public class Handler{
    private Handler next;
    public Handler setNextHandler(Handler h){
        this.next=h;
        return next;
    }
    public abstract boolean handle(String u, String p);
    protected boolean handleNext(String u, String p){
        if (this.next == null){
            return true;
        }
        return next.handle(u, p);
    }
}