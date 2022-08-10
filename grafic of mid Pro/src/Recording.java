//orgimport org.omg.CORBA.DataInputStream;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FilterInputStream;
//
//public class FileRecord {
//    public  FileRecord() throws FileNotFoundException {
//        File file=new File("C:\\Users\\user\\Desktop\\grafic of mid Pro\\src\\myFile.dat");
//        FileInputStream di =new FileInputStream(file);
//
//    }
//
//}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Recording {
    int[] record_changes;//{ 1.InToPos , 2.InTOPre ,3.PosToPre , 4.PosToIn , 5.PreToIn , 6.PreToPos}
    String res_record;
    String [] names={"InToPos","InToPre","PosToPre","PosToIn","PreToIn","PreToPos"};
    public Recording() {
        record_changes=new int[6];
        for (int i = 0; i < 6; i++) {
            record_changes[i]=0;
        }

    }
    public  void add(int type){
        try {
            record_changes=Recording.read();

        }catch (Exception e){
            System.out.println("file is empty!!!(In Recording)");
        }
        record_changes=Recording.read();
        record_changes[type]++;
        Recording.write(record_changes);
    }

    public static int[] read() {
        String filename = "array.txt";
        String strArray = "";

        String line;
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            while ((line = in.readLine()) != null) {
                strArray += line + " ";

            }
            in.close();
        } catch (IOException e) {

            e. printStackTrace();
        }

        String[] temp = strArray.split(" ");

        int array[] = new int[temp.length];
        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(temp[i]);
            }
        }catch (NumberFormatException e){
            System.out.println("file is empty in Recording !!!");
        }
        return array;
    }

    public static void write(int[] x) {
        String filename = "array.txt";
        BufferedWriter outputWriter = null;
        try {
            outputWriter = new BufferedWriter(new FileWriter(filename));
            for (int i = 0; i < x.length; i++) {

                outputWriter.write(x[i] + "");

                outputWriter.newLine();
            }
            outputWriter.flush();
            outputWriter.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e. printStackTrace();
        }
    }

    public int[] getRecord_changes() {
        return record_changes;
    }

    public String sort_UpToDown(){
        int max_index=-2 ,max_value=-2;
        String type_record;
        record_changes=read();
        for (int i = 0; i < record_changes.length; i++) {
            System.out.println(record_changes[i]);

        }
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6; i++) {
                if (record_changes[i] > max_value) {
                    max_index = i;
                    max_value = record_changes[i];
                }
                else {
                    if (record_changes[i] == max_value) {
                        NewRecording rd = new NewRecording();
                        if (rd.compare_records(max_index, i) > 0) ;//i az maxindex zudtar anjam shode
                        {
                            max_index = i;
                            max_value = record_changes[i];
                        }
                    }
                }
            }
            record_changes[max_index] = -1;

            switch (max_index) {
                case 0:
                    type_record = "Infix to Postfix";
                    break;
                case 1:
                    type_record = "Infix to Prefix";
                    break;

                case 2:
                    type_record = "Postfix To Prefix";
                    break;
                case 3:
                    type_record = "Postfix to Infix";
                    break;
                case 4:
                    type_record = "Prefix to Infix ";
                    break;

                case 5:
                    type_record = "Prefix To Postfix";
                    break;
                default:
                    type_record = "unknown!!";
            }
//            for (int i = 0; i < max_value; i++) {
//
//                res_record += type_record + "\n";
//            }
            res_record+=type_record+" : "+ max_value+"\n";
            max_value=-2;
        }
        return res_record;


    }
    public String sort_DownToUP(){
        String up=sort_UpToDown();
        String[] downArr=up.split("\n");
        for (int i = 0; i < downArr.length; i++) {
            System.out.println(downArr[i]);

        }
        String res="";
        for (int i = downArr.length-1; i >= 0; i--) {
            res+=downArr[i]+"\n";
        }
        System.out.println("finally res : "+ res);
        return res;


    }
    //
//    public static void main(String[] args) {
//        int a[] = { 1, 5, 10, 123, 44, 88, 99, 147 };
//        // write an array to a file
//        write(a);
//
//        // Reading array in file
//        int b[] = read();
//        System.out. println(b[5]);
//        b[5] += 10;
//        b[2] = 6;
//        b[7] = 1000;
//
//        // write an array to a file
//        write(b);
//    }
}