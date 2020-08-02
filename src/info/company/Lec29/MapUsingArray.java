package info.company.Lec29;

public class MapUsingArray {

    Entity[] entities = new Entity[10];

    public void put(String key, String value){

        int index = Math.abs(key.hashCode() % entities.length);

        entities[index]= new Entity(key,value);
    }

    public String get(String key){

        int index = Math.abs(key.hashCode() % entities.length);

        if(entities[index]!=null && entities[index].key.equals(key)){
            return entities[index].value;
        }

        return null;
    }

    public String remove(String key){

        String temp = null;

        int index = Math.abs(key.hashCode() % entities.length);

        if(entities[index]!=null && entities[index].key.equals(key)){

           temp = entities[index].value;
            entities[index]=null;
        }

        return temp;
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
