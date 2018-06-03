import java.util.ArrayList;
/**
 * Created by Guy on 18/04/2018.
 * This class uses a unsorted linked list data structure to implement the EntityCollection interface
 */
public class EntityCollectionUnsortedLinkedList implements EntityCollection {
    private ArrayList<Entity> entityCollection;

    public EntityCollectionUnsortedLinkedList(){
        entityCollection = new ArrayList<>();
    }

    //Remove Max Value in this case has a complexity of O(n) since we have to find it in the unsorted list.
    public Entity removeMaxValue(){
        Entity maxEntity = entityCollection.get(0);
        int maxIndex = 0;
        for (int i=1; i<entityCollection.size(); i++){
            if (maxEntity.getValue() < entityCollection.get(i).getValue()) {
                maxEntity = entityCollection.get(i);
                maxIndex = i;
            }
        }
        entityCollection.remove(maxIndex);
        return maxEntity;
    }
    //Add operation has a complexity of O(1) Since the list is unsorted and we don't care which position it will have.
    public void add(Entity entity) {
        entityCollection.add(entity);
    }

}
