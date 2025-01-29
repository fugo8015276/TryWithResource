import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
//        SampleResource resource = new SampleResource();
//        SampleResource resource = null;
//        try(resource){
//            resource = new SampleResource();
            try (BufferedReader in =
                         new BufferedReader(new FileReader(
                                 new File("input.txt")));
                 BufferedWriter out =
                         new BufferedWriter(new FileWriter(new
                                 File("result.txt"))); ){

                String line = null;

                while((line = in.readLine()) != null) {
                    out.append(line);
                    out.newLine();
                }
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
//            resource = new SampleResource();
//        }catch (Exception e) {
//            throw new RuntimeException(e);
//        }

    }
}
