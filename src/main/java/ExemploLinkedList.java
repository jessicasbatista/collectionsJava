import java.util.LinkedList;

public class ExemploLinkedList {

    public static void main(String[] args) {

        LinkedList<Double> notas2 = new LinkedList<>();

        notas2.add(5d);
        notas2.add(4.5);
        notas2.add(3d);
        notas2.add(8.8);
        notas2.add(9d);

        System.out.println("Crie uma lista chamada notas2: " + notas2);

        System.out.println("\nMostre a primeira nota da nota lista: " + notas2.get(0));

        System.out.println("\nMostre a primeira nota da nota lista e remova: ");
        notas2.remove(0);
        System.out.println(notas2);
    }
}
