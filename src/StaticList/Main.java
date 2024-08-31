package StaticList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho da lista: ");
        int size = scanner.nextInt();
        StaticList list = new StaticList(size);

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Adicionar elemento");
            System.out.println("2. Adicionar elemento em posição específica");
            System.out.println("3. Remover elemento por índice");
            System.out.println("4. Limpar lista");
            System.out.println("5. Mostrar tamanho da lista");
            System.out.println("6. Mostrar elemento por índice");
            System.out.println("7. Mostrar lista");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Digite o elemento a ser adicionado: ");
                    int element = scanner.nextInt();
                    list.add(element);
                    break;
                case 2:
                    System.out.print("Digite o elemento a ser adicionado: ");
                    element = scanner.nextInt();
                    System.out.print("Digite a posição: ");
                    int position = scanner.nextInt();
                    list.add(element, position);
                    break;
                case 3:
                    System.out.print("Digite o índice do elemento a ser removido: ");
                    int indexToRemove = scanner.nextInt();
                    int removedElement = list.remove(indexToRemove);
                    if (removedElement != -1) {
                        System.out.println("Elemento removido: " + removedElement);
                    }
                    break;
                case 4:
                    list.clear();
                    System.out.println("Lista limpa.");
                    break;
                case 5:
                    System.out.println("Tamanho atual da lista: " + list.getSize());
                    break;
                case 6:
                    System.out.print("Digite o índice do elemento: ");
                    int indexToGet = scanner.nextInt();
                    int dataAtIndex = list.getData(indexToGet);
                    if (dataAtIndex != -1) {
                        System.out.println("Elemento na posição " + indexToGet + ": " + dataAtIndex);
                    }
                    break;
                case 7:
                    System.out.print("Elementos na lista: ");
                    list.printList();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
