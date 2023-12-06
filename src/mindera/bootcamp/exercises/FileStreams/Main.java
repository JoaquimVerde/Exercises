package mindera.bootcamp.exercises.FileStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        FileInputStream file = new FileInputStream("/Users/mindera/IdeaProjects/Exercise The Engine/src/mindera/bootcamp/exercises/FileStreams/Input");

        FileOutputStream fileOut = new FileOutputStream("/Users/mindera/IdeaProjects/Exercise The Engine/src/mindera/bootcamp/exercises/FileStreams/outPut");

        byte[] buffer = new byte[1024];
        int num = file.read(buffer);
        System.out.println(num);


        fileOut.write(buffer);

    }
}
