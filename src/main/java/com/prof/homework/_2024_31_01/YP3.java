package main.java.com.prof.homework._2024_31_01;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import main.java.com.prof.homework._2024_31_01.taski.UniversityContainer;

import java.io.FileReader;
import java.io.IOException;

public class YP3 {
    public static void main(String[] args) {

        try {
            ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
            FileReader reader = new FileReader("/Users/mrbolshov/Home/IT/BackEnd_Pro/teleranProf/src/resources/1.yaml");
            UniversityContainer testObject = objectMapper.readValue(reader, UniversityContainer.class);

            System.out.println(testObject.getUniversity());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/**
 * [2 3 2]
 *
 *
 */