public class Change {
    protected int i;
    protected int j;
    protected int k;
    String t;
    String[] output;
    String []input;
    String res="";
    int size=0;
    String cop="-+*/^";
    String func="sin cos tan cot arcsin arccos arctan arccot  (";
    public Change(String in ){

        input=in.split(" ");
        output=new String[input.length];

    }
    protected   void print_res(String  type ,String[] arr,int size){
        String [] beuty_out=new String[size];
        for (int l = 0; l < size; l++) {
            beuty_out[l]=arr[l];
        }

        String m=String.join(" ",beuty_out);
        res=res.concat("\n"+type);
        res=res.concat(m);


    }
    protected    void reverse(String [] array , int arr_size){
        String temp;

        for (i = 0; i < arr_size / 2; i++) {
            temp = array[i];
            array[i] = array[arr_size - i - 1];
            array[arr_size - i - 1] = temp;
        }
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
    public String toString(String[]s,int count){
        String result="";
        for (int l = 0; l < count-1; l++) {
            result+=s[l]+" ";
        }
        result+=s[count-1];
        return result;
    }
}
