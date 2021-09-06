package javaCodes;
import java.io.*;
import java.util.Scanner;
public class FileClass {
    public static void main(String[] args) {
        File file=new File("helloworld.txt");
        if(!file.exists()){
            file.mkdir();
        }try{
        FileWriter writer=new FileWriter("helloworld.txt");
        writer.write("Hello guys this was made using the java code");
        writer.append("Hello world");
        writer.close();
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            System.out.println(str);
        }
        sc.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
