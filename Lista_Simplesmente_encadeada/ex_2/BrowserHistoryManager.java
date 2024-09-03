package Lista_Simplesmente_encadeada.ex_2;

import java.util.Scanner;

public class BrowserHistoryManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static UrlHistoryList urlHistoryList;

    public static void main(String[] args) {
        System.out.println("Digite o tamanho máximo do histórico:");
        int maxSize = scanner.nextInt();
        scanner.nextLine();

        urlHistoryList = new UrlHistoryList(maxSize);

        while (true) {
            System.out.println("Gerenciador de Histórico de Navegação");
            System.out.println("1. Adicionar URL");
            System.out.println("2. Listar URLs");
            System.out.println("3. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Digite a URL:");
                    String url = scanner.nextLine();
                    urlHistoryList.addUrl(url);
                    break;
                case 2:
                    System.out.println("Histórico de Navegação:");
                    urlHistoryList.listUrls();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
