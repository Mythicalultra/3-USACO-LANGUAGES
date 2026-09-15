//import Java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class pasture {
    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("Square.in"));
        //System.setOut(new PrintStream(new FileOutputStream("Square.out")));

        Scanner input = new Scanner(System.in);

    //List<Integer> rect1 = new ArrayList<>();
    //List<Integer> rect2 = new ArrayList<>();
    
    String string1 = input.nextLine();
    String string2 = input.nextLine();

    List<Integer> rect1 = Arrays.stream(string1.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
    List<Integer> rect2 = Arrays.stream(string2.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

    System.out.println(rect1);
    System.out.println(rect2);
    
    int lowx = Math.min(rect1.get(0), rect2.get(0));
    }
}
