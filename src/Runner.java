import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guy on 18/04/2018.
 */
public class Runner {

    public void run() throws IOException {
        EntityCollection entityCollection;
        String use_case;
        System.out.println("Please choose the use/case frequencies: A, B or C");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        use_case = br.readLine();

        //A means that the "Add" function is more frequent and has to take the lowest complexity possible.
        //Therefore we use an unsorted linked list, which has a complexity of O(1) for the "Add" operation.
        if (use_case.equals("A"))
                entityCollection = new EntityCollectionUnsortedLinkedList();

        //B means that the "Add" and "Remove Max Value" functions are equally frequent, and both have the same lowest possible complexity
        //Therefore we use a max heap, which has a complexity of O(log n) for both operations.
        else if (use_case.equals("B"))
                entityCollection = new EntityCollectionHeap();

        //C means that the "Remove Max Value" function is more frequent and has to take the lowest complexity possible.
        //Therefore we use a sorted linked list, which has a complexity of O(1) for the "Remove Max Value" operation.
        else if (use_case.equals("C"))
                entityCollection = new EntityCollectionSortedLinkedList();

        //In case of a different input, We announce a bad input and exit the program.
        else {
            System.out.println("Invalid input, exiting...");
            return;
        }
        test(entityCollection);
    }
    //A test function which receives the appropriate data structure for the chosen use/case and performs some tests.
    private void test(EntityCollection entityCollection){
        System.out.println("The chosen numbers are:");
        int num;
        for (int i = 0; i < 30; i++) {
            num = (int) (Math.random()*1000);
            entityCollection.add(new EntityClass(num));
            System.out.print(num + ", ");
        }
        System.out.println("\n");

        for (int i = 0; i < 30; i++) {
            System.out.print(entityCollection.removeMaxValue().getValue() + ", "); //numbers should be printed in descending order
        }
    }

    public static void main(String[] args) throws IOException {
        Runner runner = new Runner();
        runner.run();
    }
}
