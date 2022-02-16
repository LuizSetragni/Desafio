import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String senha;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        senha = sc.nextLine();
        System.out.printf("Falta %d Caracteres para uma senha forte.\n", validaSenha(senha));
        sc.close();
    }
    public static int validaSenha(String senha){
        int faltaCaracter = 6;
        boolean digito = false, minusculo = false, maiuscula = false, caracterEspecial = false;
        char[] especial = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'};
        if(senha.length() == 0) faltaCaracter = 6;

        for(int i = 0; i < senha.length(); i++){
            if(senha.charAt(i) >= 48 && senha.charAt(i) <= 57) digito = true; //Validação de digitos
            if(senha.charAt(i) >= 97 && senha.charAt(i) <= 122) minusculo = true; //Validação minuscula
            if(senha.charAt(i) >= 65 && senha.charAt(i) <= 90) maiuscula = true; //validação maiuscula
            for(int j = 0; j < especial.length; j++){
                if(especial[j] == senha.charAt(i)) caracterEspecial = true;//validação especial
            }
        }

        if(digito == true) faltaCaracter--;
        if(minusculo == true) faltaCaracter--;
        if(maiuscula == true) faltaCaracter--;
        if(caracterEspecial == true) faltaCaracter--;
        if(senha.length() > 5) faltaCaracter = faltaCaracter - 2;

        return faltaCaracter;
    }
}
