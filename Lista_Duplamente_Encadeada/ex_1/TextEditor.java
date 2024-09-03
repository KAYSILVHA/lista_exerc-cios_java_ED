package Lista_Duplamente_Encadeada.ex_1;

import java.util.Scanner;

public class TextEditor {
    private static final Scanner scanner = new Scanner(System.in);
    private static ActionHistory actionHistory = new ActionHistory();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Editor de Texto");
            System.out.println("1. Adicionar Ação");
            System.out.println("2. Desfazer Última Ação");
            System.out.println("3. Refazer Última Ação");
            System.out.println("4. Listar Ações");
            System.out.println("5. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Digite a descrição da ação:");
                    String action = scanner.nextLine();
                    actionHistory.addAction(action);
                    break;
                case 2:
                    String undoneAction = actionHistory.undo();
                    System.out.println("Ação desfeita: " + undoneAction);
                    break;
                case 3:
                    String redoneAction = actionHistory.redo();
                    System.out.println("Ação refeita: " + redoneAction);
                    break;
                case 4:
                    System.out.println("Histórico de Ações:");
                    actionHistory.listActions();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
