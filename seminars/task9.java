package seminars;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.
public class task9 {
    public static void main(String[] ars) throws IOException {
    repeat("TEST");
    }
    public static void repeat(String s) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(s);
        }
//        s = s.repeat(100);
        File file = new File("task9.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(sb.toString());
        fw.flush();
    }

}
