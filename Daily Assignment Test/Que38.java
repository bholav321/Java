import java.util.Scanner;

// class Occurance{
//     private int arr[];
//     public Occurance(int arr[]){
//         this.arr = arr;
//     }
//     public void occur(){
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr.length; j++){
//                 if(i!=j){
//                     if(arr[i]==arr[j]){
//                         System.out.print(arr[i]+" ");
//                         break;   
//                     }
//                 }
//             }
//         }
//     }
// }
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name ");
        String n = sc.nextLine();
        System.out.println("Enter Father Name : ");
        String fathername = sc.nextLine();
        String str1 = "Father Name    : ";
        int end1 = (115 - (str1.length()) - (fathername.length()));
        int end;
        String str = "Name           : ";
        end = (115 - (str.length()) - (n.length()));
        String name = "";
        for (int i = 0; i < end; i++) {
            if (i == 35)
                name = name + (str + n);
            else
                name = name + " ";
        }
        System.out.println("|" + name + "|");
        String na = "";
        for(int i=0; i<end; i++){
            if(i == 35){
                na = na + (str1 + fathername);
            }
            else{
                na = na + " ";
            }

        }
        System.out.println("|" + na + "|");
    }
}