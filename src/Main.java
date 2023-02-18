import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int selectedOption = 0, insideArrayListOption, insideListItemOption;
    ArrayItem optionArrayList = new ArrayItem();
    ListItem optionListOfNumbers = new ListItem();
    insideArrayListOption = optionArrayList.getChosenOption();
    insideListItemOption = optionListOfNumbers.getChosenOption();

    Scanner optionReader = new Scanner(System.in);
    while (insideArrayListOption != 5) {
        if(insideArrayListOption == 0 || insideArrayListOption == 5 || insideListItemOption == 0 || insideListItemOption == 6) {
            System.out.println("-------------------------");
            System.out.println("|      1 - Vetor        |");
            System.out.println("|      2 - Lista        |");
            System.out.println("-------------------------");
            System.out.println("Selecione uma opção: ");
            selectedOption = optionReader.nextInt();

        }
        if (selectedOption == 1) {
            optionArrayList.execute();

        } else {
            optionListOfNumbers.execute();
        }
    }
    }

}