import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class task1{
    public static void main(String[] args)throws Exception{

        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"));
             BufferedWriter bw= new BufferedWriter(new FileWriter("honour_student.csv"))){
            
            String line;
            String splitBy=",";


            //(without this header thingy the whole thing become a string and create a problem later as it can not convert word like "age" or "gpa" to int ig)
           
            String header= br.readLine();
            
            //too write the header in the other file (cant put it in the loop cus it print the multiple time)
            bw.write(header);
            bw.newLine();
            
            while ((line=br.readLine())!=null) {
            String[] student = line.split(splitBy);
                
                    double gpa=Double.parseDouble(student[3]);


                if (gpa>=3.5) {
                    bw.write(line);
                    bw.newLine();
                }
                         
                }

        }


    }
}
