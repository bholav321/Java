//59) WAP to find out the sum of all integer between 100 and 200 which are divisible by 9


class Test{
  public static void main(String[] args){
	int i,sum=0;
	for(i=100; i<=200; i++){
	if(i%9==0)
	sum = sum+i;
	}
	System.out.println(sum);
	

  }

}