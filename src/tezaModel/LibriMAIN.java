package tezaModel;

import java.util.ArrayList;
import java.util.Scanner;

public class LibriMAIN {
    public static void main(String[] args) {
        ArrayList<Libri> librat = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            if (librat.size() > 0) {
                char choice;

                while (true) {
                    System.out.format("? > Shto nje liber tjt (p/j) > ");
                    choice = sc.nextLine().charAt(0);
                    if (choice == 'p' || choice == 'j')
                        break;
                }

                if (choice == 'j') {
                    System.out.format("\n");
                    sc.close();
                    break;
                }

                System.out.format("\n");
            }

            String title, author;

            System.out.format("Libri %d\n", librat.size() + 1);
            System.out.format("----------------------------\n");

            System.out.format("Titulli: ");
            title = sc.nextLine();

            System.out.format("Autori: ");
            author = sc.nextLine();

            librat.add(new Libri(title, author));

            System.out.format("\n! > Libri u shtua\n\n");
        }

        System.out.format("Librat\n");
        System.out.format("----------------------------\n");

        for (Libri l : librat) {
            System.out.format("%s", l.toString());
            System.out.format("\n----------------------------\n");
        }

        System.out.format("\n");

        if (librat.get(0).equals(librat.get(librat.size() - 1)))
            System.out.format("Libri i pare dhe i fundit jane te njejte\n");
        else
            System.out.format("Libri i pare dhe i fundit nuk jane te njejte\n");

        System.out.format("Incialet e autorit te librit te fundit: %s", librat.get(librat.size() - 1).getIniciale());
    }
}