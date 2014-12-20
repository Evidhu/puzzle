import java.io.*;
public class Puzzle {
    public static void main(String[] args) {
        try {
            
            System.out.println("Enter limit");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int lim=Integer.parseInt(br.readLine());
            int i=0;
           while(!(lim/pow(2,i)<1)){
            i++;  
           }
           int x=lim-pow(2,i-1);
           int res=2*x+1;
            System.out.println("result :"+res);
            
            } catch (IOException ex) {
            System.out.println("error"+ex);
        }
    }
    
   static int pow(int a,int exp){
        int res=1;
        for(int i=1;i<=exp;i++){
            res*=a;
        }
        return res;
    }
}
