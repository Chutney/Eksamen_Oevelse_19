import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Dream> dreams = new ArrayList<>();

        dreams.add(new Dream("10/10/2001", 100, Type.NIGHTMARE));
        dreams.add(new Dream("07/08/1991", 80, Type.NEUTRAL));
        dreams.add(new Dream("10/04/1800",500, Type.PROBLEMSOLVING));

        dreams.sort(Comparator.naturalOrder());

        for (Dream dream : dreams) {
            System.out.println(dream.toString());
        }


    }

}
