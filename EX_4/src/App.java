import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Fila<String> q = new Fila<>();
        Fila<String> a = new Fila<>();
        Fila<String> b = new Fila<>();

        String op = "";
        while (!op.equals("Sim")) {
            System.out.println("nome e operação:");
            q.enfileirar(in.nextLine());
            System.out.println("Que sair: (Sim/Não)");
            op = in.nextLine();
        }
        q.desenfileirar();
        in.close();
    }
}
