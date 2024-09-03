package Lista_Duplamente_Encadeada.ex_2;

import java.util.Scanner;

public class CardGame {
    private static final Scanner scanner = new Scanner(System.in);
    private static Hand hand = new Hand();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Jogo de Cartas");
            System.out.println("1. Adicionar Carta");
            System.out.println("2. Remover Carta");
            System.out.println("3. Mover Carta para o Final");
            System.out.println("4. Listar Cartas");
            System.out.println("5. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Digite o nome da carta para adicionar:");
                    String addCard = scanner.nextLine();
                    hand.addCard(addCard);
                    break;
                case 2:
                    System.out.println("Digite o nome da carta para remover:");
                    String removeCard = scanner.nextLine();
                    boolean removed = hand.removeCard(removeCard);
                    if (removed) {
                        System.out.println("Carta removida com sucesso.");
                    } else {
                        System.out.println("Carta não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome da carta para mover para o final:");
                    String moveCard = scanner.nextLine();
                    boolean moved = hand.moveCardToEnd(moveCard);
                    if (moved) {
                        System.out.println("Carta movida para o final com sucesso.");
                    } else {
                        System.out.println("Carta não encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Cartas na mão:");
                    hand.listCards();
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
