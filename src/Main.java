import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yourName = "";
        int amountOfTodayIceCreams=0;
        int amountIceCreamInEveryShop=0;
        int amountOfYesterdayIceCream=0;

        System.out.print("Моля въведете вашето име: ");
        yourName=scanner.nextLine();

        // Show your name
        System.out.println("Здравейте, "+ yourName);

        // insert amount ice creams for the day
        System.out.print("Въведи количество сладоледи за деня, като минималния брой е 10 : ");
        amountOfTodayIceCreams=scanner.nextInt();
        while(amountOfTodayIceCreams<10){
            System.out.println("Минималната бройка за деня е 10.");
            System.out.print("Моля въведете по голяма бройка: ");
            amountOfTodayIceCreams=scanner.nextInt();
        }

        // check the amount's ice cream in the every shop
        amountIceCreamInEveryShop=amountOfTodayIceCreams/10;
        System.out.println("Количество сладоледи за всеки магазин: "+ amountIceCreamInEveryShop);


        // check the amount of yesterday's ice creams
        System.out.println("За да разберем дали компанията се развива, нека да проверим прогреса й");
        System.out.print("Моля въведете количеството сладоледи от вчера: ");
        amountOfYesterdayIceCream=scanner.nextInt();

        if(amountOfYesterdayIceCream < amountOfTodayIceCreams){
            System.out.println("GOOD JOB, BOSS! :)");
        }else{
            System.out.println("Слаба работа. Следващия път повече!");
        }
    }
}
