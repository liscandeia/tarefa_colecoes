import java.util.*;

public class Tarefa2 {

    public static void main(String[] args) {
        nomesOrdenados();
    }
    private static void nomesOrdenados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** Digite nome - sexo de cada pessoa separados por vírgigula**");
        String nome = scanner.nextLine();
        String[] lseparadas = nome.split(",");
        List<String> listaDeNomesF = new ArrayList<>();
        List<String> listaDeNomesM = new ArrayList<>();
        for (String i : lseparadas){
            String[] nsseparadas = i.split("-");
            if (nsseparadas.length == 2) {
                String name = nsseparadas[0];
                String sexo = nsseparadas[1];
                if (sexo.equalsIgnoreCase("F")) {
                    listaDeNomesF.add(name);
                } else if (sexo.equalsIgnoreCase("M")){
                    listaDeNomesM.add(name);
                }
            }
        }

        Collections.sort(listaDeNomesF);
        Collections.sort(listaDeNomesM);
        System.out.println("Pessoas do sexo feminino:");
        for (String i : listaDeNomesF){
            System.out.println(i);
        }
        System.out.println("Pessoas do sexo Masculino:");
        for (String i : listaDeNomesM){
            System.out.println(i);
        }
    }
}
