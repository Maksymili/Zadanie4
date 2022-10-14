package Zadanie4;

public class Zadanie {

    public static void main(String[] args) {

        int Klocki = 73;
        int MiejscePojemniki = 8;

        float ilocPojemnikow = (Klocki/MiejscePojemniki);

        System.out.println("Ilosc wypelnionych pojemnikow wynosi: ");

        System.out.format("%.0f%n", ilocPojemnikow+1);

        System.out.println("Ilosc klockow w ostatnim pojemniku: ");

        System.out.println(Klocki % MiejscePojemniki);



    }
}
