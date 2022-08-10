import java.util.Arrays;
import java.util.Collections;

public class Change_PosToPre extends Change{

    public Change_PosToPre(String in) {
        super(in);
    }
    public void posToPre(int type){//1 --> PosToPre  2-->PreToPos
        String ope1,ope2;
        String[] ope=new String[input.length];
        String cur,h;
        String[] bsr;
//        if(type==2){
//            Collections.reverse(Arrays.asList(input));
//
//        }
        for ( i = 0 ,j=0,k=0; i < input.length; i++) {
            cur=input[i];
            if(cop.contains(cur)){//amalvand bashad
                k--;
                ope1=output[k];
                k--;
                ope2=output[k];
                h=cur+" "+ope2+" "+ope1;
                output[k]=h;
                k++;
            }else
                {
                    if(func.contains(cur)){
                        k--;
                        ope1=output[k];
                        h=cur+" "+ope1;
                        output[k]=h;
                        k++;

                    }else {
                        output[k]=cur;
                        k++;
                    }
                }
//            if(type==2){
//                 bsr=new String[k];
//                for (int l = 0; l < k; l++) {
//                    bsr[l]=output[l];
//                }
//                Collections.reverse(Arrays.asList(bsr));
//                for (int l = 0; l < k; l++) {
//                    output[l]=bsr[l];
//                }
//            }
            print_res("output: ",output,k);

            }

        print_res("Finally output: ",output,k);
    }
}
