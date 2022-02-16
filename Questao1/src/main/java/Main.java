import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da escada: ");
        int tamanho = sc.nextInt();
        System.out.println(escada(tamanho));
        sc.close();
    }
    public static String escada(int tamanho){
        var escada = new StringBuilder();
        for (int i = 1; i <= tamanho; i++){
            for (int j = 1; j <= tamanho - i; j++){
                escada.append(" ");
            }
            for (int j = 1; j <= i; j++){
                escada.append("*");
            }
            if (i < tamanho)
                escada.append("\n");
        }
        return escada.toString();
    }
}
