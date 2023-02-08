import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayListImplementation list = new ArrayListImplementation(10);

        ArrayList<Integer> arrayList = new ArrayList<>(10);
        TreeSetImplementation treeSetImplementation = new TreeSetImplementation();

        for (int i = 0; i < 123; i++) {
            list.add(i);
        }
        list.remove(2);

        list.print();
//
//        list.add(2);
//        list.add(4);
//        list.add(10);
//        list.add(14);

        System.out.println(Arrays.toString(list.array));

treeSetImplementation.add(1);
treeSetImplementation.add(10);
treeSetImplementation.add(100);

        System.out.println(treeSetImplementation.root + "     ");
        System.out.println(treeSetImplementation.root.left);
    }
}
