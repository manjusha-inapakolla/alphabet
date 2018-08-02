import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner s=new Scanner(System.in); 
	   System.out.println("enter character"); 
	   char c = s.next().charAt(0); 
	   if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) 
	     System.out.println(c + "ALPHABET"); 
	   else 
	     System.out.println(c + " NO");
	}
}
