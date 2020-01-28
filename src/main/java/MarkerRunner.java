import sun.jvm.hotspot.oops.Mark;

public class MarkerRunner {

    public static void main(String[] args) throws InterruptedException {
        Marker markerVerde = new Marker();
        markerVerde.setCuloare("Verde");

        Marker markerMov = new Marker();
        markerMov.setCuloare("Mov");

        Marker markerNegru = new Marker();
        markerNegru.setCuloare("Negru");


        careECuloareMarkereului(markerVerde);
        careECuloareMarkereului(markerMov);
        careECuloareMarkereului(markerNegru);

        System.out.println("marker verde " + markerVerde);
        Marker markerAvandCuloareSchimbata =
                schimbaCuloareDinVerdeInRosuSiInvers(markerVerde);

        System.out.println("marker schimbat cu getterv" + markerAvandCuloareSchimbata.getCuloare());

        System.out.println("Marker schimbat " + markerAvandCuloareSchimbata);

        Marker markerSchimbatIar = schimbaCuloareDinVerdeInRosuSiInvers(markerAvandCuloareSchimbata);

        System.out.println("Marker schimbat iar: " + markerSchimbatIar);

       //printeazaSiCalculeazaSiGateste(3, 6);
        calculeazaSiPrinteaza(3);
        System.out.println("----");
        gatesteChec(2);
    }

    public static void careECuloareMarkereului(Marker marker) throws InterruptedException {
        //Thread.sleep(1500);
        System.out.println("Culoarea e: " + marker.getCuloare());
        System.out.println("Culoarea asta e foarte frumoasa");
        System.out.println("Imi place mult culoarea " + marker.getCuloare());
    }

    public static Marker schimbaCuloareDinVerdeInRosuSiInvers(Marker marker){
        if(marker.getCuloare().equals("Verde")){
            marker.setCuloare("Rosu");
        } else if (marker.getCuloare().equals("Rosu")){
            marker.setCuloare("Verde");
        }

        return marker;
    }

    public static int calculeazaSiPrinteaza(int numarDeCalculat){
        return numarDeCalculat * 5;
    }

    public static void gatesteChec(int numarOua){
        if(numarOua < 3){
            //System.out.println("nu pot sa fac chec");
            return;
        } else {
            System.out.println("iese un chec mega bun");
        }
        System.out.println("gatim acum checul");
    }
}
