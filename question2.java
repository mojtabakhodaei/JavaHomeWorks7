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

        System.out.println(union(myTree1, myTree2));
    }


    protected static TreeSet<Character> union(TreeSet treeSet1, TreeSet treeSet2) {
        TreeSet<Character> unionTree = new TreeSet<Character>();
        unionTree.addAll(treeSet1);

        for (Object character : treeSet2) {
            if (!treeSet1.contains(character))
                unionTree.add((Character) character);
        }
        return unionTree;
    }

}
