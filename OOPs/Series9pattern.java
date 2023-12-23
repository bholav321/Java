//30) 1+11+111+1111+11111+…. 

public class Series9pattern {
        public void patternsum2(){
            int n=6;
            int sum =0;
            int sum2=0;
            System.out.print("Series Pattern : ");
            for(int i=1; i<=n; i++){
                sum = sum*10+1;
                sum2 = sum2+sum;
                
            }
            System.out.print(" "+sum2);
        }  
    }
    class Testmain{
        public static void main(String[] args){
            Series9pattern obj = new Series9pattern();
            obj.patternsum2();
        }
    }
    

