package pratices;

import java.util.Arrays;

public class check_array_equals{

	public static void main(String[] args) {

	int  a1[]={1,2,5,4,5};
	int  a2[]={1,2,3,4,5};
//approach1		
		/*boolean status=Arrays.equals(a1, a2);
		if (status==true){
			System.out.println("Array is equals");
		}
		else{
			System.out.println("Arrays is NOT equals");
		}*/
//approach2 
		boolean status = true;
		if(a1.length == a2.length)
		{
			//compare rest of element
			 for(int i=0; i<a1.length;i++)
			 {
				 if(a1[i]!= a2[i])
				 {
					 status=false;
				 }
			 }
		}
		else
		{
			status = false;
		}
		if(status==true)
		{
			System.out.println("Arrays is equals");
		}
		else{
			System.out.println("Array is NOT equals");
		}
		
	}

	}
