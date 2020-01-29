import java.util.HashMap;
import java.util.Map;

public class MapRunner {

    public static void main(String[] args) {
        Map<String, Bomboana> punga = new HashMap<>();

        Bomboana kinder = new Bomboana("kinder");
        Bomboana raffaelo = new Bomboana("raffaelo");

        punga.put(kinder.getName(), kinder);
        punga.put(raffaelo.getName(), raffaelo);

        System.out.println(punga);

        Bomboana crocobazurururur = punga.get("crocobazurururur");
        System.out.println(crocobazurururur);
        boolean kinder1 = punga.containsKey("Kinder");
        System.out.println("case sensitive :" + kinder1);


    }
}
