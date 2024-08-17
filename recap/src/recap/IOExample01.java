package recap;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Excel Apache POI
public class IOExample01 {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("test.txt")) {
          fileWriter.write("hello there!");
          fileWriter.write("\n");
          fileWriter.write("me");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileReader fileReader = new FileReader("test.txt")) {
            int i;
            while((i=fileReader.read())!=-1) {
                System.out.print((char)i);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
