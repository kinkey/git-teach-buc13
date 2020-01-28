public class Marker {

    private String culoare;

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "culoare='" + culoare + '\'' +
                '}';
    }
}
