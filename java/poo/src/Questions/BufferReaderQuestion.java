package Questions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderQuestion {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("/home/andreza/Documentos/test.txt"));
        String data = br.readLine();
        System.out.println("First line: " + data);

    }
}

//https://www.youtube.com/watch?v=IMfMyd3M1Cw&ab_channel=ProgrammingForBeginners
