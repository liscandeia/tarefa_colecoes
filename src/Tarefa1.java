import java.util.*;

public class Tarefa1 {
    public static void main(String[] args) {
        nomesOrdenados();
    }

    private static void nomesOrdenados() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("** Digite os nomes separados por vírgigula**");
       String nome = scanner.nextLine();
       String[] lseparadas = nome.split(",");
       List<String> listaDeNomes = new LinkedList<>(Arrays.asList(lseparadas)) ;
       Collections.sort(listaDeNomes);
        for (String i : listaDeNomes){
            System.out.println(i);
        }
    }
}
