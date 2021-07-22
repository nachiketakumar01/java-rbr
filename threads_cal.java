import java.io.*;
import java.io.File;

class Squares extends Thread {
    public void run() {
        try {
            FileWriter sqWriter = new FileWriter("squared.txt");
            long a;
            for (long i = 0; i <= 8000; i++) {
                a = i * i;

                // System.out.println(a);

                long temp = a;
                String s = String.valueOf(temp);

                 sqWriter.write(s);
                 sqWriter.write("\n");
                

            }
             sqWriter.close();
             
        } catch (IOException e) {
            System.out.println("An error occurred.");
          //  e.printStackTrace();
        }
       
    }}

    class Cubes extends Thread {
        public void run() {
            try {
                FileWriter cubeWriter = new FileWriter("cubed.txt");
                long a;
                for (long i =500; i >=0; i--) {
                    a = i * i * i;
                    long temp = a;
                    String s = String.valueOf(temp);

                    cubeWriter.write(s);
                    cubeWriter.write("\n");
                    //
                }
                cubeWriter.close();
                

            } catch (IOException e) {
                System.out.println("An error occurred.");
              //  e.printStackTrace();

            }
           
        }
    }

class threads_cal {

    public static void main(String args[])  throws IOException{
        Squares s1 = new Squares();
        s1.start();
        Cubes c1 = new Cubes();
        c1.start();

    }
}
    

