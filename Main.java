import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int anoatual = 2026;
        final int diasano = 365;
        final int meses =12;
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o ano de nascimento: ");
        int anonascimento = sc.nextInt();
        int ano = anoatual - anonascimento;
        int diasvividos = ano * 365;
        int mesesvividos = ano * 12;
        System.out.println(nome + " tem " + ano + " ANOS " +  " de vida " + " e viveu " + mesesvividos + " MESES " + " de vidas " + " e " + diasvividos + " dias ");




    }
}