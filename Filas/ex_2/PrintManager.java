package Filas.ex_2;

import java.util.Scanner;

public class PrintManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static PrintQueue printQueue = new PrintQueue();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Gerenciador de Impressão");
            System.out.println("1. Adicionar Trabalho de Impressão");
            System.out.println("2. Processar Próximo Trabalho");
            System.out.println("3. Listar Trabalhos de Impressão");
            System.out.println("4. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Digite o nome do documento:");
                    String documentName = scanner.nextLine();
                    PrintJob printJob = new PrintJob(documentName);
                    printQueue.addPrintJob(printJob);
                    break;
                case 2:
                    printQueue.processNextJob();
                    break;
                case 3:
                    printQueue.listPrintJobs();
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
