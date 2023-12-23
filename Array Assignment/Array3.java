public class Array3 {
    public static void main(String[] args){
        int[] arr = {1,3,5,2,7,9};
        int ele1 = 5;
        int ele2 = 3;
        boolean flag1 = false;
        boolean flag2 = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ele1){
                flag1 = true;
            }
            if(arr[i] == ele2){
                flag2 = true;
            }
            if(flag1 && flag2){
                break;
            }
            
        }
        if(flag1&&flag2){
            System.out.println("Both element are found ");
        }
        else if(flag1){
            System.out.println("First element found but not second");
        }
        else if(flag2){
            System.out.println("Second element found but not first");
        }
        else{
            System.out.println("Both element are not found ");
        }
    }    
}
