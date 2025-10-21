import java.io.*;
import java.nio.BufferOverflowException;

public class Main {
    public static void main(String[] args) throws IOException {

        File read = new File("read.txt");
        File write = new File("write.txt");


        try(BufferedReader reader = new BufferedReader(new FileReader(read));
        BufferedWriter writer = new BufferedWriter(new FileWriter(write))){
            String line = reader.readLine();

            int count=0;
            while(line != null){
                count++;
                line=reader.readLine();
            }
             String[] lines = new String[count];

            try(BufferedReader bufferedReader = new BufferedReader(new FileReader(read))){
                String newLine = bufferedReader.readLine();
                int i=0;
                while(newLine != null){
                    lines[i++] = newLine;
                    newLine = bufferedReader.readLine();
                }
            }

            for(int i = lines.length-1;i>=0;i--) {
                writer.write(lines[i]+"\n");
            }
        }

    }

}
