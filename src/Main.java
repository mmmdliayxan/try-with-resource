import java.io.*;
import java.nio.BufferOverflowException;

public class Main {
    public static void main(String[] args) throws IOException {

        File read = new File("read.txt");
        File write = new File("write.txt");
        //hello

int lineCount=0;
int wordCount=0;
int characterCount=0;
        try(BufferedReader reader = new BufferedReader(new FileReader(read))){
            String line = reader.readLine();
            while(line != null){
                lineCount++;//ne qeder setir var

                if(!line.trim().isEmpty()){
                    String[] array = line.trim().split(" ");
                    wordCount +=array.length;
                }
                characterCount += line.length();

                line = reader.readLine();
            }

        }
        System.out.println(lineCount);
        System.out.println(wordCount);
        System.out.println(characterCount);

    }

}
