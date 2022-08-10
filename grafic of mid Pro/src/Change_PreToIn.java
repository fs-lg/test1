public class Change_PreToIn extends Change{
    public Change_PreToIn(String in) {
        super(in);
    }
    public void preToIn(){
        String ope1,ope2;
        String[] ope=new String[input.length];
        String cur,h;
        for(i=input.length-1;i>=0;i--) {
            cur = input[i];
            if(cop.contains(cur)){//amalvand bashad
                k--;
                ope1=output[k];
                k--;
                ope2=output[k];
                h=" ( "+ope1+" "+cur+" "+ope2+" ) ";
                output[k]=h;
                k++;
            }else
            {
                if(func.contains(cur)){//tabe bashad
                    k--;
                    ope1=output[k];
                    h=cur+" "+ope1;
                    output[k]=h;
                    k++;
                }
                else {//adad bashad
                    output[k]=cur;
                    k++;
                }

            }
            print_res("output: ",output,k);
        }
        print_res("Finally output: ",output,k);



    }


}
