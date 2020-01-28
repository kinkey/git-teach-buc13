import javax.net.ssl.SSLSession;

public class GenericRunner {

    public static void main(String[] args) {
        Integer cinci = 5;

        Masina jaguarSuper = new
                Jaguar(105);

        Cutie<Masina> cutieCuMasini = new
                Cutie<>();

        cutieCuMasini.putInBox(jaguarSuper);

        System.out.println(cutieCuMasini.takeFromBox());
    }
}
