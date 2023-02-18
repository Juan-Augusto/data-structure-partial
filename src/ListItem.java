import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListItem {

    private static List<Integer> listOfNumbers = new ArrayList<Integer>();
    int chosenOption;

    public int getChosenOption() {
        return chosenOption;
    }
    @Override
    public String toString() {
        return "ListItem{" +
                "listOfNumbers=" + listOfNumbers +
                '}';
    }

    public void removeNumber(int index){
        try{
            listOfNumbers.remove(index);
            System.out.println("Elemento da posição " + index + "removido");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Posição inexistente");
        }
    }
    public void updateNumber(int index, int newNumber) {
        try{
            listOfNumbers.set(index, newNumber);
            System.out.println("Elemento da posição " + index + " alterado");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Posição inexistente");
        }
    }

    public int checkIfNumberExists(int number) {
        int existingElement;
        existingElement = listOfNumbers.indexOf(number);
        return existingElement;
    }
    public void addNumber(int number){
        listOfNumbers.add(number);
    }

    public void execute() {
        ListItem listOfNumbers = new ListItem();
        String menuOptions;
        int currentIndex;
        Scanner userNumber = new Scanner(System.in);
        Scanner optionReader = new Scanner(System.in);
        Scanner index = new Scanner(System.in);

        menuOptions = "------------------------------\n" +
                "|           Lista             |\n" +
                "------------------------------\n" +
                "|   1 -  Inserir dado        |\n"+
                "|   2 -  Alterar dado        |\n"+
                "|   3 -  Excluir dado        |\n"+
                "|   4 -  Pesquisar dado      |\n"+
                "|   5 -  Mostrar dados       |\n"+
                "|   6 -  Voltar              |\n"+
                "------------------------------\n"+
                "Selecione uma opção: ";
        System.out.println(menuOptions);
        chosenOption = optionReader.nextInt();
        while (chosenOption != 6){
            if(chosenOption == 1){
                System.out.println("Insira um dado: ");
                listOfNumbers.addNumber(userNumber.nextInt());
            }
            else if (chosenOption == 2) {
                System.out.println("Insira um índice: ");
                currentIndex = index.nextInt();
                System.out.println("Insira o novo número: ");
                listOfNumbers.updateNumber(currentIndex, userNumber.nextInt());

            } else if (chosenOption == 3) {
                int userIndex;
                System.out.println("Indique um índice que você quer remover da lista: ");
                userIndex = index.nextInt();
                listOfNumbers.removeNumber(userIndex);
            }else if(chosenOption == 4) {
                System.out.println("Insira o número que você quer buscar: ");
                int currentNumberPosition;
                currentNumberPosition = listOfNumbers.checkIfNumberExists(userNumber.nextInt());
                if(currentNumberPosition != -1){
                    System.out.println("Elemento encontrado na posição: " + currentNumberPosition);
                }else{
                    System.out.println("Número não encontrado: " +  currentNumberPosition);
                }
            }else {
                    System.out.println(" " + listOfNumbers);

                }
            System.out.println(menuOptions);
            chosenOption = optionReader.nextInt();
            }


        }

}
