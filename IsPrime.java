package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n =21;
       int i;
       boolean prime = true;
       for(i=2;i<n;i++) 
       {
    	   if(n%i ==0)
    	   {
    		   prime = false;
    		   break;
    	   }
       }
       System.out.println(prime);
	}
	

}
