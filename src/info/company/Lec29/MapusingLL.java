package info.company.Lec29;

import java.util.LinkedList;

public class MapusingLL {

    LinkedList<Entity> list = new LinkedList<>();

    public void put(String key, String value){

        for (Entity entity: list) {

            if(entity.key.equals(key)){

                entity.value = value;
                return;
            }
        }

        list.add(new Entity(key,value));
    }

    public String get(String key){

        for (Entity entity: list) {

            if(entity.key.equals(key)){

                return entity.value;
            }
        }

        return null;
    }


    public String remove(String key){

        Entity target = null;

        for (Entity entity: list) {

            if(entity.key.equals(key)){

                target = entity;
                break;
            }
        }

        String temp = target.value;
        list.remove(target);

        return temp;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (Entity entity: list) {

            s.append(entity.key).append(" => ").append(entity.value).append(", ");
        }

        s.append("]");

        return s.toString();
    }

    class Entity{

        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
