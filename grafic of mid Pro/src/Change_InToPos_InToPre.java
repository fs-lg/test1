import java.util.Arrays;
import java.util.Collections;

public class Change_InToPos_InToPre extends Change {

    public Change_InToPos_InToPre(String text) {
        super(text);
    }


    public void in_To_pos_To_pre(int change_Type){
    //    int [] parantez_baz=new int[input.length];

      //  int p_order=0;
        String[] ope=new String[input.length];
 //       char[]amel=new char[input.length];

        String cur;
        int first , last ,hadeaghal;
        if(change_Type==2){

            reverse(input, input.length);
        }

        for ( i = 0 ,j=0,k=0; i < input.length ;i++ ) {
            cur = input[i];
            if(change_Type==2 && cur.compareTo(")")==0){
                cur="(";
            }else if(change_Type==2 && cur.compareTo("(")==0){
                cur=")";
            }
            //recognize thing that have to go to opeStack
            //amalgar yecani manfi
//            if(cur.compareTo("(")==0){
//                parantez_baz[p_order]=i;
//                p_order++;
//            }

            if (cur.compareTo(")") == 0) {
                while (true) {
                    if (ope[j - 1].compareTo("(") == 0){
                        j--;
                        break;
                    }
                    else {
                        output[k] = ope[j - 1];
                        j--;
                        k++;
                    }
                }
            } else {

                if (cur.compareTo("?") == 0) {
                    ope[j] = cur;
                    j++;
                    System.out.print("operator array:");
                    printArray(ope, j);
                    String temp = ope.toString();
                    res = new String(res.concat("operator array:" + temp + "\n"));


                    System.out.println("output array:");
                    printArray(output, k);
                    System.out.println("\nres:");
                }
                //amalgar dodoi

                if (cur.compareTo("+") == 0 || cur.compareTo("-") == 0 || cur.compareTo("*") == 0 || cur.compareTo("/") == 0 || cur.compareTo("^") == 0) {

                    if (j != 0) {//agar poshte amalgar khali nabud


                        boolean b = true;
                        while (b && j!=0) {//ta zamani ke oulaviate amalgar poshte bishtar ast edame midahad
                            //ozve poshte amalgar bashad na tabe
                            if (ope[j - 1].contains("+") || ope[j - 1].contains("-") || ope[j - 1].contains("*") || ope[j - 1].contains("/") || ope[j - 1].contains("^")) {
                                //hardo az nazare olaviat barabar bashand
                                if ((cur.compareTo(ope[j - 1]) == 0) || ((cur.compareTo("+") == 0 || cur.compareTo("-") == 0) && ((ope[j - 1].compareTo("+") == 0 || (ope[j - 1].compareTo("-") == 0)))) || ((cur.compareTo("*") == 0 || cur.compareTo("/") == 0) && ((ope[j - 1].compareTo("*") == 0 || (ope[j - 1].compareTo("/")) == 0)))) {//halate barabar
                                    if (cur.compareTo("^") == 0) {//hardo ^ hastand
                                        //calculate_RPN(ope[j-1]);
                                        //in ghesmat dobare barresi shavad
                                        output[k]=ope[j-1];
                                        //ope[j-1]=cur;
                                        j--;

                                        k++;
                                        print_res("\noperator stack:", ope,j);
                                        print_res("\noutput:", output,k);
//                                System.out.print("operator array:");
//                                printArray(ope,j);

                                        System.out.println("output array:");
                                        printArray(output, k);
                                        System.out.println(res);

                                    } else {
                                        output[k]=ope[j-1];
                                       // ope[j-1]=cur;
                                        j--;

                                        k++;
                                        print_res("\noperator stack:", ope,j);
                                        print_res("\noutput:", output,k);
//                                System.out.print("operator array:");
//                                printArray(ope,j);

                                        System.out.println("output array:");
                                        printArray(output, k);
                                        System.out.println(res);

                                        b = false;
                                    }

                                } else {//hardo az nazare olaviat motafavet bashand


                                    if (cop.indexOf(cur) < cop.indexOf(ope[j - 1])) {

                                        output[k] = ope[j - 1];

                                        k++;
                                        j--;

                                        print_res("\noperator stack:", ope,j);
                                        print_res("\noutput:", output,k);
                                        System.out.println("output array:");
                                        printArray(output, k);
                                    }else {
                                        if (cop.indexOf(cur) > cop.indexOf(ope[j - 1])) {
                                            b = false;
                                        }
                                    }
                                }
                            }
                            //ozve poshte amalgarha tabe ast va parantez nist
                            else {
                                if (ope[j - 1].compareTo("(") != 0) {
                                    //          calculate_RPN(ope[j-1]);
                                    output[k] = ope[j - 1];
                                    j--;
                                    k++;
                                    print_res("\noperator stack:", ope,j);
                                    print_res("\noutput:", output,k);

                                    System.out.println("output array:");
                                    printArray(output, k);
                                    System.out.println("\n res:" + res);

                                }
                                else {
                                    b=false;
                                }
                            }
                        }//payan halghe while @@
                    }
                    ope[j] = cur;
                    j++;
                    System.out.print("operator array:");
                    printArray(ope, j);
                    print_res("\noperator stack:", ope,j);


                    System.out.println("output array:");
                    printArray(output, k);
                } else {//tabe va "("
                    if (func.contains(cur)) {
                        ope[j] = cur;
                        j++;
                        System.out.print("operator array:");
                        printArray(ope, j);
                        print_res("\noperator stack:", ope,j);


                        System.out.println("output array:");
                        printArray(output, k);
                    } else {//adad ya moteghayer
                        output[k] = cur;
                        k++;


                        print_res("\noutput:", output,k);
                        System.out.println("output array:");
                        printArray(output, k);
                    }

                }


            }
//            if(change_Type==1){
//                i++;
//            }else {
//                i--;
//            }
        }

        j--;//baray dorost karkardane halghe baedi ezafe shode
        for (; 0 <= j; j--,k++) {
           // calculate_RPN(ope[j-1]);
           output[k]=ope[j];
            print_res("\noperator stack:",ope,j);
            print_res("\noutput:",output,k);

        }///!!!! ta  inja!!
        System.out.println("output array:");
        printArray(output,k);
        if(change_Type==2){
            reverse(output,k);
        }

        print_res("\nFinally output:",output,k);
    }
//    public  void calculate_RPN(String op){//tavabe ezafe nashode!!!
//        if(op.compareTo("^")==0){
//            output[k-2]=String.valueOf(Math.pow(Double.parseDouble(output[k-2]),Double.parseDouble(output[k-1])));
//            k--;
//
//        }
//        if(op.compareTo("*")==0){
//            output[k-2]=String.valueOf(Integer.parseInt(output[k-2])*Integer.parseInt(output[k-1]));
//            k--;
//
//        }
//        if(op.compareTo("/")==0){
//            output[k-2]=String.valueOf(Integer.parseInt(output[k-2])/Integer.parseInt(output[k-1]));
//            k--;
//
//
//        }
//        if(op.compareTo("+")==0){
//            output[k-2]=String.valueOf(Integer.parseInt(output[k-2])+Integer.parseInt(output[k-1]));
//            k--;
//
//
//        }
//        if(op.compareTo("-")==0){
//            output[k-2]=String.valueOf(Integer.parseInt(output[k-2])-Integer.parseInt(output[k-1]));
//            k--;
//        }
//        if(op.compareTo("sin")==0){
//            output[k-1]=String.valueOf(Math.sin(Double.parseDouble(output[k-1])));
//        }
//        if(op.compareTo("cos")==0){
//            output[k-1]=String.valueOf(Math.cos(Double.parseDouble(output[k-1])));
//        }
//        if(op.compareTo("tan")==0){
//            output[k-1]=String.valueOf(Math.tan(Double.parseDouble(output[k-1])));
//        }
//        if(op.compareTo("cot")==0){
//            output[k-1]=String.valueOf(1/Math.tan(Double.parseDouble(output[k-1])));
//        }
//        if(op.compareTo("arcsin")==0){
//            output[k-1]=String.valueOf(Math.asin(Double.parseDouble(output[k-1])));
//        }
//        if(op.compareTo("arcsin")==0){
//            output[k-1]=String.valueOf(Math.asin(Double.parseDouble(output[k-1])));
//        }
//        if(op.compareTo("arctan")==0){
//            output[k-1]=String.valueOf(Math.atan(Double.parseDouble(output[k-1])));
//        }
//        if(op.compareTo("arccot")==0){
//            output[k-1]=String.valueOf(Math.atan(Double.parseDouble(output[k-1])));
//        }
//
//
//
//
//
////
////        String[] RPN_res=new String[k];
////        RPN_res[0]=output[0];
////
////        for (int i = 1; i < k; i++) {
////
////
////
////        }
//
//    }

//    private boolean isOperator(char ch)
//    {
//        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^')
////returns true if either of the operator is found
//            return true;
////else returns false
//        return false;
//    }
    //    private boolean isFunc(char ch)
//    {
//        if (ch ==  || ch == '-' || ch == '*' || ch == '/' || ch == '^')
////returns true if either of the operator is found
//            return true;
////else returns false
//        return false;
//    }
    public static void printArray(String[]a,int s){
        for (int i = 0; i < s; i++) {

            System.out.print(a[i]+" ");
        }
        System.out.println();

//        System.out.println(a[0]==);
//        System.out.println(a[0].compareTo(b));


    }






}
class Control{
    String[] in;
    String s;
    String ope="+ - * / ^";
    String func="sin cos ";
    boolean res=true;
    public  Control(String s){
        in=s.split(" ");
        this.s=s;

    }
    public boolean isIn(){

        if(ope.contains(in[0])|| ope.contains(in[in.length-1])||func.contains(in[in.length-1]))res=false;
        else {

            for (int i = 0; i < in.length-1; i++) {
                if((func.contains(in[i])&& ope.contains(in[i+1]))||(ope.contains(in[i])&&ope.contains(in[i+1]))){
                    res=false;
                    break;
                }
                else {
                    if (in[i].compareTo("(") == 0) {
                        res = false;
                        for (int j = i + 1; j < in.length; j++) {
                            if (in[j].compareTo(")") == 0) {
                                in[j] = "null!";
                                if (ope.contains(in[j - 1]) || (j+1!= in.length &&(!ope.contains(in[j + 1]) && !")".contains(in[j + 1])))) {
                                    ///
                                } else {
                                    res = true;
                                }
                                break;
                            }
                        }
                        if (ope.contains(in[i + 1]) || (i!=0 &&(!ope.contains(in[i - 1]) && !"(".contains(in[i - 1])))) {
                            res = false;
                        }
                        if (!res) break;
                    }
                    else {
                        if (!func.contains(in[i]) && !ope.contains(in[i]) && !"( ) ".contains(in[i])) {
                            //ADAD  YA MOTEGHAYER
                            if (!func.contains(in[i + 1]) && !ope.contains(in[i + 1]) && !"( )  ".contains(in[i + 1] ) && in[i+1].compareTo("null!")!=0) {
                                res = false;
                                break;
                            }

                        }
                    }
                }


            }


        }

        return res;
    }

    public boolean isPos()
    {
        if(s.contains("(")||s.contains(")")){
            res=false;
        }
        else {
            if(func.contains(in[0])/*|| func.contains(in[1])||*/||ope.contains(in[0])||ope.contains(in[1])||!ope.contains(in[in.length-1])){
                res=false;
            }
            else {
                int counter=0;
                for (int i = 0; i <in.length ; i++) {

                    if(ope.contains(in[i])){
                        counter-=2;
                        counter++;
                    }else{
                        if(func.contains(in[i])){
                            counter--;
                            counter++;
                        }
                        else {//ADAD YA MOTEGHAYER
                            counter++;
                        }

                    }

                }
                if(counter<0)res=false;
            }


        }



        return res;
    }

    public boolean isPre(){

        if(s.contains("(")||s.contains(")")){
            res=false;
        }
        else{
            Change c= new Change(s);
            Collections.reverse(Arrays.asList(c.input));
            s=c.toString(c.input,c.input.length);
            in=s.split(" ");
            res=isPos();
        }
        return res;
    }

}