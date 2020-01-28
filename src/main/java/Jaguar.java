public class Jaguar extends Masina {
    public Jaguar(int vitezaJaguar) {
        super(vitezaJaguar);
    }
    public int getSpeed(){
        return viteza;
    }

    @Override
    public String toString() {
        return "Jaguar{" +
                "viteza=" + viteza +
                '}';
    }
}
