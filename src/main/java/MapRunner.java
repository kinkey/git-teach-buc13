import java.util.*;
import java.util.Map.Entry;

public class MapRunner {

    public static void main(String[] args) {
        Map<String, Bomboana> punga = new HashMap<>();

        Bomboana kinder = new Bomboana("kinder");
        Bomboana raffaelo = new Bomboana("raffaelo");

        punga.put(kinder.getName(), kinder);
        punga.put(raffaelo.getName(), raffaelo);

       // List<List<Bomboana>> bobobo = new ArrayList<>();

        /*for (Entry<String, Bomboana> entry: entries) {
            System.out.println("key :" + entry.getKey());
            System.out.println("value :" + entry.getValue());
            if(entry.getKey().equals("kinder")){
                punga.remove(entry.getKey());
            }
        }
        System.out.println(punga);*/

        Set<Entry<String, Bomboana>> entries = punga.entrySet();

        Iterator<Entry<String, Bomboana>> iterator = entries.iterator();

        while(iterator.hasNext()){
            Entry<String, Bomboana> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
            if(next.getKey().equals("kinder")){
                iterator.remove();
            }
        }
        System.out.println(entries);

    }
}
