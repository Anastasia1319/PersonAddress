import java.io.*;

public class Recursion {
    public static void OpenDirectory(File dir) {
        File[] files = dir.listFiles();
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("files.txt", true)));
            for (File file : files) {
                if (file.isFile()) {
                    out.println(file.getName());
                    System.out.println("File " + file.getName());
                } else {
                    System.out.println("Directory " + file.getName());
                    Recursion.OpenDirectory(file);
                }
            }
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
