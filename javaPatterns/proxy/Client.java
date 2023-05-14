public final class Client{
    public static void main(String[] a){
        HeavyProcess h = new DatabaseProcessingProxy();
        h.process();

        //will skip the initial config
        h.process();

        // will skip the initial config 
        HeavyProcess h2 = new DatabaseProcessingProxy();
        h2.process();
        h2.process();
    }
}