package removearry;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class removearray {

	public static void main(String[] args) {
	List a =new ArrayList();


	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	
	System.out.println("list of elements:"+a);
	System.out.println("removes second array:"+a.remove(1));
	System.out.println("modified array:"+a);
	
	

	}

}
