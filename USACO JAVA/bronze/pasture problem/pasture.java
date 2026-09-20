import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class pasture {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("square.in"));
        System.setOut(new PrintStream(new FileOutputStream("square.out")));

        Scanner input = new Scanner(System.in);

    //List<Integer> rect1 = new ArrayList<>();
    //List<Integer> rect2 = new ArrayList<>();
    
    String string1 = input.nextLine();
    String string2 = input.nextLine();

    List<Integer> rect1 = Arrays.stream(string1.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
    List<Integer> rect2 = Arrays.stream(string2.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
    
    int lowx = Math.min(rect1.get(0), rect2.get(0));
    int highx = Math.max(rect1.get(2), rect2.get(2));

    int lowy = Math.min(rect1.get(1), rect2.get(1));
    int highy = Math.max(rect1.get(3), rect2.get(3));

    int area = Math.max(highx - lowx, highy - lowy) * Math.max(highx - lowx, highy - lowy);
    System.out.println(area);
    }
}
