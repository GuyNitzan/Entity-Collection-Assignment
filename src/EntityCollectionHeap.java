/**
 * Created by Guy on 18/04/2018.
 * This class uses a heap data structure to implement the EntityCollection interface
 */
import java.util.*;

public class EntityCollectionHeap implements EntityCollection {
    private PriorityQueue<Entity> heap;

    public EntityCollectionHeap(){
        heap = new PriorityQueue<Entity>();
    }

    public void add(Entity entity){
        heap.add(entity);
    }

    public Entity removeMaxValue(){
        return heap.poll();
    }

}
