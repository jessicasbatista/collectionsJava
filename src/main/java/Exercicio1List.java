import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio1List {

    public static void main(String[] args) {

        List<TempMes> temperatura = new ArrayList<>();

        temperatura.add(new TempMes(" 1 - Janeiro", 27d));
        temperatura.add(new TempMes(" 2 - Fevereiro", 26.3));
        temperatura.add(new TempMes(" 3 - Março", 25.1));
        temperatura.add(new TempMes(" 4 - Abril", 28d));
        temperatura.add(new TempMes(" 5 - Maio", 29.5));
        temperatura.add(new TempMes(" 6 - Junho", 29d));

        //System.out.println(temperatura);

//        Double soma2 = temperatura.stream().mapToDouble(Double::doubleValue).sum();
//        System.out.println(soma2);

        double soma = 0d;
        double mediaTemp;

        for (int i = 0; i < temperatura.size(); i++) {
            soma = soma + temperatura.get(i).temp;
        }

        mediaTemp = soma / temperatura.size();
        System.out.printf("A temperatura média do semestre e de: %.2f graus\n", mediaTemp);



        for (int i = 0; i < temperatura.size(); i++) {
            if (temperatura.get(i).temp > mediaTemp){
                System.out.println("Mês com temperatura acima da média: " + temperatura.get(i).mes + "\t Temperatura: " + temperatura.get(i).temp);
            }

        }

    }

}


class TempMes {

    String mes;
    Double temp;

    public TempMes(String mes, Double temp) {
        this.mes = mes;
        this.temp = temp;
    }

    public String getMes() {
        return mes;
    }

    public Double getTemp() {
        return temp;
    }


    @Override
    public String toString() {
        return "{" +
                "mes = " + mes + '\'' +
                ", temp = " + temp +
                '}';
    }
}
