import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Fila<String> q = new Fila<>();
        Fila<String> a = new Fila<>();
        Fila<String> b = new Fila<>();

        String op = "";
        while (!op.equals("Sim")) {
            System.out.print("nome:");
            String nome = in.nextLine();
            System.out.print("\noperação:");
            String operacao = in.nextLine();
            q.enfileirar(nome + ":" + operacao);
            
            System.out.print("\nQue sair: (Sim/Não)\n");
            op = in.nextLine();
        }
        while (q.getTamanho() != 0) {
            String item = q.desenfileirar();
            String[] partes = item.split(":");
            String nome = partes[0];
            String operacao = partes[1];

            if (operacao.equals("A")) {
                a.enfileirar(nome);
            } else if (operacao.equals("B")) {
                b.enfileirar(nome);
            } else if (operacao.equals("X")) {
                
                if (a.getTamanho() < b.getTamanho()) {
                    a.enfileirar(nome);
                } else if (b.getTamanho() < a.getTamanho()) {
                    b.enfileirar(nome);
                } else {
                    System.out.println("Nome descartado: " + nome);
                }
            }
        }
        System.out.println("\nFila A");
        System.out.println("=====---------------------====");
        while(a.getTamanho() != 0){
            System.out.println("Nome : " + a.desenfileirar());
        }
        System.out.println("=====---------------------====");
        System.out.println("\nFila B");
        
        System.out.println("=====---------------------====");
        while(b.getTamanho() != 0){
            System.out.println("Nome : " + b.desenfileirar());
        }
        System.out.println("=====---------------------====");
        in.close();
    }
}
