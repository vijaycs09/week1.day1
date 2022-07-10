package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int firstnum = 0;
      int secondnum= 1;
      int sum = 0;
      int count = 9;
      System.out.print(firstnum +" "+ secondnum);
      for(int i=0;i<count;i++)
      {
    	  sum = firstnum+secondnum;
    	  firstnum = secondnum;
    	  secondnum = sum;
    	System.out.print(" "+sum);		  
      }
 
	}

}
