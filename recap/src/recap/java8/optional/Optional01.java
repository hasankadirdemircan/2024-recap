package recap.java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Optional01 {
    public static void main(String[] args) {
        String name = null;
        List<String> list = new ArrayList<>();

        if(name != null) {
            System.out.println("name: "+ name);
        }

       String newName = Optional.ofNullable(name).orElseGet(()-> "defaultName");
        System.out.println(newName);

        Optional.ofNullable(name).orElseThrow(()-> new RuntimeException("error"));
    }
}
