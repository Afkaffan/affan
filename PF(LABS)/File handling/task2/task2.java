import java.io.BufferedReader;
import java.io.FileReader;

public class task2 {
    public static void main(String[] args)throws Exception{
        try (BufferedReader br=new BufferedReader(new FileReader("ProductnPrices.csv"))){
            String line;
            String split=",";

            int counter=0;
            float avg=0;


            while ((line=br.readLine()) != null) {


                    if (line.startsWith("Product")) {
                        continue;                        
                    }

                String[] item=line.split(split);
                counter++;

                float price=Float.parseFloat(item[1]);

                avg= price+avg;


            }
            System.out.println("average price=" + avg/counter);
            System.out.println("number of product="+counter);

        }
    }
    
}
