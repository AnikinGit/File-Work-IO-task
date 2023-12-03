package app;


import java.util.Scanner;

public class Main {

    static String fileName;
    static String fileNameSearch;
    static String text;

    public static void main(String[] args) {
        getData();
    }

    private static void getData() {
        System.out.println("Если Вы хотите создать файл и сделать в нем записть, нажмите 1, если хотите прочитать из файла нажмите 2");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        try {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1 || choice == 2) {
            } else {
                System.out.println("Введите 1 или 2");
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода, Введите 1 или 2");
        }


        if (choice == 1) {
            System.out.println("Введите название файла без расширения");
            fileName = scanner.nextLine();
            System.out.println("Введите текст файла");
            text = scanner.nextLine();
            System.out.println(handleData());

        }
        if (choice == 2) {
            System.out.println("Введите название файла без расширения");
            try {
                fileNameSearch = scanner.nextLine();
                getOutput(new FileReadService().readFile(FolderUrl.folderPath + fileNameSearch + ".txt"));
            } catch (Exception e) {
                System.out.println("Нет такого файла, попробуйте еще раз");
            }
        }
    }

    private static String handleData() {
        return new FileWriteService().handleFile(text, fileName);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}