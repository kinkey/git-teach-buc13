package enumRun;

import enumTeach.Months;

import java.util.Scanner;

public class EnumRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numeDeLuna = scanner.nextLine();

        Months lunaDeLaTastatura = Months.valueOf(numeDeLuna);

        System.out.println(numeDeLuna);

        if(lunaDeLaTastatura.equals(Months.IAN)){
            System.out.println("suntem in " + Months.IAN.getFullName());
        } else {
            System.out.println("orice alta luna");
        }

        Months[] values = Months.values();

        for(Months m: values){
            if(m.getPositionInYear()==2){
                System.out.println(m.getFullName());
            }
        }
    }
}
