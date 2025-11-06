package lab4;

import java.io.*;

public class File {
    public static void main(String[] args) {
        FileInputStream first = null;
        FileOutputStream second = null;

        try {
            try {
                first = new FileInputStream("lab4/exm.txt");
                System.out.println("Исходный файл открыт");

            } catch (FileNotFoundException e) {
                System.err.println("Ошибка открытия исходного файла: " + e.getMessage());
                return;
            }

            try {
                second = new FileOutputStream("lab4/copy.txt");
                System.out.println("Копируемый файл создан");
            } catch (FileNotFoundException e) {
                System.err.println("Ошибка открытия копируемого файла: " + e.getMessage());
                return;
            }

            int s;
            while (true) {
                try {
                    s = first.read();
                    if (s == -1) {
                        break;
                    }
                } catch (IOException e) {
                    System.err.println("Ошибка чтения из файла: " + e.getMessage());
                    break;
                }

                try {
                    second.write(s);

                } catch (IOException e) {
                    System.err.println("Ошибка записи в файл: " + e.getMessage());
                    break;
                }
            }
            System.out.println("Данные успешно скопированы");

        } finally {
            try {
                if (first != null) {
                    first.close();
                    // first.read();
                }
            } catch (IOException e) {
                System.err.println("Ошибка при закрытии исходного файла: " + e.getMessage());
            }
            try {
                if (second != null) {
                    second.close();
                }
            } catch (IOException e) {
                System.err.println("Ошибка при закрытии копируемого файла: " + e.getMessage());
            }
            System.out.println("Файлы закрыты");

        }
    }
}