import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class main_exemplo5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha: " + System.lineSeparator()
        + "1- pesquisar usuário." + System.lineSeparator()
        + "2- Cadastrar usuário." + System.lineSeparator()
        + "3- Abrir pedido." + System.lineSeparator()
        + "4- Fechar pedido.");

        int opcao =leitor.nextInt();

        switch (opcao){
            case 1:
                System.out.println(opcao+"-Pesquisar usuário");
                break;
            case 2:
                System.out.println(opcao+"-Cadastrar usuário");
                break;
            case 3:
                System.out.println(opcao+"-Abrir pedido");
                break;
            case 4:
                System.out.println(opcao+"-Fechar pedido");
                break;
            default:
                System.out.println(opcao + "Opção inválida");
        }
    }
}
