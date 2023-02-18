import java.util.ArrayList;
import java.util.Scanner;

public class ArrayItem {
    private ArrayList<Integer> allNumbers = new ArrayList<>();
    int chosenOption;

    public int getChosenOption() {
        return chosenOption;
    }

    public void setChosenOption(int chosenOption) {
        this.chosenOption = chosenOption;
    }


    public int checkIfNumberExists(int number) {
        int existingElement;
        existingElement = allNumbers.indexOf(number);
        return existingElement;
    }

    @Override
    public String toString() {
        return "ArrayItem{" +
                "allNumbers=" + allNumbers +
                '}';
    }

    public void updateAllNumbers(int index, int newNumber) {
        try{
            allNumbers.set(index, newNumber);
            System.out.println("Elemento da posição " + index + " alterado");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Posição inexistente");
        }
    }

    public ArrayItem() {
        this.allNumbers = allNumbers;
    }

    public void addNumber(int number){
        allNumbers.add(number);
    }


    public void execute(){
        ArrayItem listNumbers = new ArrayItem();
        int currentIndex;
        String menuOptions;
        Scanner optionReader = new Scanner(System.in);
        Scanner userNumber = new Scanner(System.in);
        Scanner index = new Scanner(System.in);

        menuOptions = "------------------------------\n" +
                      "|           Vetor            |\n" +
                      "------------------------------\n" +
                      "|   1 -  Inserir dado        |\n"+
                      "|   2 -  Alterar dado        |\n"+
                      "|   3 -  Pesquisar dado      |\n"+
                      "|   4 -  Mostrar dados       |\n"+
                      "|   5 -  Voltar              |\n"+
                      "------------------------------\n"+
                      "Selecione uma opção: ";

        System.out.println(menuOptions);
        chosenOption = optionReader.nextInt();
        while (chosenOption != 5){
            if(chosenOption == 1){
                System.out.println("Insira um dado: ");
                listNumbers.addNumber(userNumber.nextInt());
            }
            else if (chosenOption == 2) {
               System.out.println("Insira um índice: ");
               currentIndex = index.nextInt();
               System.out.println("Insira o novo número: ");
               listNumbers.updateAllNumbers(currentIndex, userNumber.nextInt());

           } else if (chosenOption == 3) {
              System.out.println("Insira o número que você quer buscar: ");
              int currentNumberPosition;
              currentNumberPosition = listNumbers.checkIfNumberExists(userNumber.nextInt());
              if(currentNumberPosition != -1){
                  System.out.println(currentNumberPosition);
              }else{
                  System.out.println("Número não encontrado: " +  currentNumberPosition);
              }


           } else {
                System.out.println("Mostrando os dados:[ ");
                for (int currentUserNumber: listNumbers.allNumbers){
                    System.out.println(" " + currentUserNumber);

                }
                System.out.println(" ]");
           }
           System.out.println(menuOptions);
            chosenOption = optionReader.nextInt();

        }
    }


}
