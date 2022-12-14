package command;

public interface Command {
    int LOGOUT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHOR = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_ALL_AUTHOR = 7;

    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;


    static void printCommands() {
        System.out.println("please input" + LOGOUT + " for logout");
        System.out.println("please input" + ADD_BOOK + " Add Book");
        System.out.println("please input " + PRINT_ALL_BOOKS + " Print All Books");
        System.out.println("please input" + PRINT_BOOKS_BY_AUTHOR + " Print Books by Author");
        System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " Print Books by Genre");
        System.out.println("please input" + PRINT_BOOKS_BY_PRICE_RANGE + "  Print books by price range");
        System.out.println("please input " + ADD_AUTHOR + "add author ");
        System.out.println("please input " + PRINT_ALL_AUTHOR + "print all author");

    }

    static void printLoginCommand() {
        System.out.println("please input " + EXIT + "for exit ");
        System.out.println("please input " + LOGIN + "for login ");
        System.out.println("please input " + REGISTER + "for register ");

    }

    static void printUserCommands() {
        System.out.println("please input" + LOGOUT + " for logout");
        System.out.println("please input" + ADD_BOOK + " Add Book");
        System.out.println("please input " + PRINT_ALL_BOOKS + " Print All Books");
        System.out.println("please input" + PRINT_BOOKS_BY_AUTHOR + " Print Books by Author");
        System.out.println("please input " + ADD_AUTHOR + "add author ");
        System.out.println("please input " + PRINT_ALL_AUTHOR + "print all author");

    }
}