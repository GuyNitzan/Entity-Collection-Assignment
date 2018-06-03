/**
 * Created by Guy on 18/04/2018.
 * This is a class that implements the Entity interface, for the creation of entity objects for the entity collection.
 */
public class EntityClass implements Entity, Comparable<EntityClass> {

    private int value;

    public EntityClass(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public int compareTo(EntityClass other) {
        return Integer.compare(other.getValue() , this.value);
    }

}
