package info.company.Lec29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class MapUsingAl<K,V> {

    ArrayList<LinkedList<Entity>> entities = new ArrayList<>();

    public MapUsingAl() {

        for (int i = 0; i <10 ; i++) {

            entities.add(new LinkedList<>());
        }
    }

    public void put(K key, V value){

        int index = Math.abs(key.hashCode()%entities.size());

        LinkedList<Entity> list = entities.get(index);

        for (Entity entity: list) {

            if(entity.key.equals(key)){

                entity.value = value;
                return;
            }
        }

        list.add(new Entity(key,value));
    }

    public V get(K key){

        int index = Math.abs(key.hashCode()%entities.size());

        LinkedList<Entity> list = entities.get(index);

        for (Entity entity: list) {

            if(entity.key.equals(key)){

                return entity.value;
            }
        }

        return null;
    }


    public V remove(K key){


        int index = Math.abs(key.hashCode()%entities.size());

        LinkedList<Entity> list = entities.get(index);

        Entity target = null;

        for (Entity entity: list) {

            if(entity.key.equals(key)){

                target = entity;
                break;
            }
        }

        V temp = target.value;
        list.remove(target);

        return temp;
    }

    class Entity{

        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
