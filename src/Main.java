import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //how to write a file
        //fileWrite = for small & medium-sized text files
        //BufferedWrite = better performance for large amounts of text
        //PrintWrite = for structured data , like reports or logs
        //FileOutputStream = for binary files (images, audio files ...)

        String path = "C:\\Users\\PC MGOUNA\\Desktop\\java\\POO\\test.txt";
        String txtContent  = """
                I like coffee ☕!!!!
                I drink a cup every morning !
                It gives me the energy needed for the day.
                """;
        try(FileWriter writer = new FileWriter(path)) {
            writer.write(txtContent);
            System.out.println("File has been written ");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        }

        catch (IOException e) {
            System.out.println("Could not write file !");
        }

    }
}
