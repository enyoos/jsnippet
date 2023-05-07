import java.util.ArrayList;

public class Sum{
    public static void main(String ... arse){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(555);
        integers.add(5);
        int sum = integers.stream().mapToInt(e -> e).sum();
        System.out.println(sum);
    }
}