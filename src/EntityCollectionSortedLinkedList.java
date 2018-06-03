import java.util.ArrayList;
/**
 * Created by Guy on 18/04/2018.
 * This class uses a sorted linked list data structure to implement the EntityCollection interface
 */
public class EntityCollectionSortedLinkedList implements EntityCollection{

    private ArrayList<Entity> entityCollection;

    public EntityCollectionSortedLinkedList(){
        entityCollection = new ArrayList<>();
    }

    //The Remove Max Value has a complexity of O(1), Since the list is sorted
    public Entity removeMaxValue(){
        return entityCollection.remove(0);
    }

    //The Add operation has a complexity of O(n), Since we have to place it in its correct position in the list
    public void add(Entity entity){
        int i;
        for (i=0; i<entityCollection.size(); i++){
            if (entityCollection.get(i).getValue() < entity.getValue()) {
                entityCollection.add(i, entity);
                return;
            }
        }
        if (i == entityCollection.size())
            entityCollection.add(entity);
    }
}
