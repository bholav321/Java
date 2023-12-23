//     1
//    212
//   32121
//  4321234
// 543212345

class Test{
    public static void main(String[] args){
        int i,j,sp;
        for(i=1; i<=5; i++){
            for(sp=4; sp>=i; sp--){
                System.out.print(" ");
            }
            for(j=i; j>=1; j--){
                System.out.print(j);
            }
            for(j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }


}
