package Filas.ex_3;

import java.util.Scanner;

public class ProcessManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static ProcessQueue processQueue = new ProcessQueue();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Gerenciador de Processos");
            System.out.println("1. Adicionar Processo à Fila");
            System.out.println("2. Executar Próximo Processo");
            System.out.println("3. Listar Processos na Fila");
            System.out.println("4. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Digite o ID do processo:");
                    String processId = scanner.nextLine();
                    Process process = new Process(processId);
                    processQueue.addProcess(process);
                    break;
                case 2:
                    processQueue.removeProcess();
                    break;
                case 3:
                    processQueue.listProcesses();
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
