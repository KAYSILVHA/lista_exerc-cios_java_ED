package Lista_Simplesmente_encadeada.ex_3;

import java.util.Scanner;

public class TextEditor {
    private static final Scanner scanner = new Scanner(System.in);
    private static UndoHistory undoHistory = new UndoHistory();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Editor de Texto");
            System.out.println("1. Adicionar Ação");
            System.out.println("2. Desfazer Última Ação");
            System.out.println("3. Listar Ações");
            System.out.println("4. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Digite a descrição da ação:");
                    String action = scanner.nextLine();
                    undoHistory.addAction(action);
                    break;
                case 2:
                    String undoneAction = undoHistory.undo();
                    System.out.println("Ação desfeita: " + undoneAction);
                    break;
                case 3:
                    System.out.println("Histórico de Ações:");
                    undoHistory.listActions();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
