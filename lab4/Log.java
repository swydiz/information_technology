package lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Log {
    public static void logEx(Exception e) {
        PrintWriter er = null;
        try {
            er = new PrintWriter(new FileWriter("lab4/log.txt", true));
            er.println("Ошибка: " + e.getMessage());
        } catch (IOException err) {
        System.err.println("Не удалось записать в лог: " + err.getMessage());
    } finally {
        if (er != null) {
            er.close();
        }
    }
}
}
