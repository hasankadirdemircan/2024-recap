package recap.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Excel Apache POI
public class IOExample02 {
    public static void main(String[] args) {

        List<String> cityList = new ArrayList<>();
        cityList.add("ankara");
        cityList.add("istanbul");
        cityList.add("izmir");

        String username = "kadir";

        cityList.forEach(city -> {
            try (FileWriter fw = new FileWriter(username + ".txt", true);
                 BufferedWriter bufferedWriter = new BufferedWriter(fw)) {

                bufferedWriter.write(city);
                bufferedWriter.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });


        String line;
        try(FileReader fileReader = new FileReader(username + ".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
