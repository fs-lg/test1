import java.io.*;
import java.util.Scanner;

public class NewRecording {
    String res;
    String [] names={"InToPos","InToPre","PosToPre","PosToIn","PreToIn","PreToPos"};
    public  void add(String type){
        res=read();
        res.concat(type+"\n");
        write(res);

    }
    public  int  compare_records(int first , int second ){
        res=read();
        int f= res.indexOf(names[first]);
        int sc=res.indexOf(names[second]);

            return 0;
    }
    public  void add(int type){
        res=NewRecording.read();
        res+=names[type]+"\n";

        NewRecording.write(res);
    }

    public static String read() {
        String filename = "NewRecording.txt";
        String str="";

        String line;
        Scanner in = new Scanner(filename);
        while (in.hasNext()){
            str+=in.next();
            System.out.println(str);
        }


        in.close();

        return str;
    }

    public static void write(String x) {
        String filename = "NewRecording.txt";
        PrintWriter outputWriter = null;
        try {
            outputWriter = new PrintWriter(filename);
            outputWriter.print(x);
            outputWriter.flush();
            outputWriter.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e. printStackTrace();
        }
    }
}
