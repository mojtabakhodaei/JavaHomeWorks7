import java.util.Random;
import java.util.TreeSet;

public class question2 {
    public static void main(String[] args) {
        Random random = new Random();

        TreeSet<Character> myTree1 = new TreeSet<Character>();
        TreeSet<Character> myTree2 = new TreeSet<Character>();

        for (int i = 0; i < 10; i++) {
            myTree1.add(((char) (random.nextInt(25) + 97)));
            myTree2.add(((char) (random.nextInt(25) + 97)));
        }

        System.out.println(myTree1);
        System.out.println(myTree2);

    }

}
