package Lista_Simplesmente_encadeada.ex_1;

import java.util.Scanner;

public class TaskManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static final TaskList taskList = new TaskList();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Gerenciador de Tarefas");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Listar Tarefas");
            System.out.println("5. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Digite a descrição da tarefa:");
                    String addDescription = scanner.nextLine();
                    taskList.addTask(addDescription);
                    break;
                case 2:
                    System.out.println("Digite a descrição da tarefa a ser removida:");
                    String removeDescription = scanner.nextLine();
                    taskList.removeTask(removeDescription);
                    break;
                case 3:
                    System.out.println("Digite a descrição da tarefa a ser marcada como concluída:");
                    String completeDescription = scanner.nextLine();
                    taskList.markTaskAsCompleted(completeDescription);
                    break;
                case 4:
                    System.out.println("Lista de Tarefas:");
                    taskList.listTasks();
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
