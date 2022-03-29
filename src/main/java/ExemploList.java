import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        List <Double> notas = new ArrayList<>();

        notas.add(7d);
        notas.add(5.3);
        notas.add(9d);
        notas.add(8.3);
        notas.add(7.9);
        notas.add(8d);
        notas.add(8.8);

        System.out.println(notas);

        System.out.println("\nExiba a posição da nota 8.3: " + notas.indexOf(8.3));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: " );
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 9.0 pela nota 6.0: ");
        notas.set(notas.indexOf(9d), 6d);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 8.3 está na lista: " + notas.contains(8.3));

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("\nExiba a soma dos valores: " + soma );

        System.out.println("\nExiba a média das notas: " + soma/notas.size());

        System.out.println("\nRemova a nota 8.0: ");
        notas.remove(6d);
        System.out.println(notas);

        System.out.println("\nRemova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println("\nRemova as notas menores que 7 e exiba a lista: " + notas);

        System.out.println("\nApague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());
    }
}
