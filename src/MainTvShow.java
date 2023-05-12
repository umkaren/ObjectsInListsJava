import java.util.ArrayList;
import java.util.Scanner;

public class MainTvShow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> showList = new ArrayList<>();

        while (true) {
            System.out.println("Name of the show:");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("How many episodes?");
            int episodes = Integer.parseInt(scanner.nextLine());

            System.out.println("What is the genre?");
            String genre = scanner.nextLine();

            TvShow show = new TvShow(name, episodes, genre);
            showList.add(show);
        }
        for (TvShow show : showList) {
            System.out.println(show.toString());
        }
    }
}
