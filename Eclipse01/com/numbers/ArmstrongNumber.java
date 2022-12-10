package com.numbers;



public class ArmstrongNumber {
	
	public static void main(String [] args){

        isAngstorm(153);


    }
	
	public static void isAngstorm(long a) {
		long sum=0;
        long b=0,c=0,digits=0;
        for(long i=a; i>0;i/=10){
            digits++;
            }

        for(long i=a; i>0;i/=10){
             b = i%10;
             c = i%10;
            for (int j=0;j<digits-1;j++){
                b*=c;
                

            }
            sum+=b;
            
        }
        if(sum==a)
        System.out.println("It is an angstorm number.");
        else
        System.out.println("It is not an angstorm number.");
	}
}
