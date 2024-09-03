package Filas.ex_1;

import java.util.Scanner;

public class BankSimulator {
    private static final Scanner scanner = new Scanner(System.in);
    private static QueueSystem queueSystem = new QueueSystem();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Simulador de Atendimento Bancário");
            System.out.println("1. Adicionar Cliente à Fila");
            System.out.println("2. Atender Próximo Cliente");
            System.out.println("3. Listar Clientes na Fila");
            System.out.println("4. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Digite o nome do cliente:");
                    String name = scanner.nextLine();
                    Client client = new Client(name);
                    queueSystem.enqueue(client);
                    break;
                case 2:
                    queueSystem.dequeue();
                    break;
                case 3:
                    queueSystem.listQueue();
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
