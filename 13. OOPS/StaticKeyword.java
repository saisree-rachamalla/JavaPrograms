

public class StaticKeyword 
{
	 public static void main(String  args[])             //static keyword
	    {
	        StudentO s1 = new StudentO();
	        s1.schoolName = "JVM";


	        StudentO s2 = new StudentO();
	       

	        StudentO s3 = new StudentO();
	        s3.schoolName = "ABC";
	        
	        System.out.println(s3.schoolName);
	        System.out.println(s1.schoolName);
	        System.out.println(s2.schoolName);

	    }
	}

	class StudentO
	{
	    static int returnPercentage(int math, int phy, int chem)     //Making function as static
	    {
	        return (math + phy + chem) / 3;

	    }

	    String name;
	    int roll;

	    static String schoolName;             //Making schoolName property or variable as static.

	    void setName(String name)
	    {
	        this.name = name;
	    }

	    String getName()
	    {
	        return this.name;

	    }
    }
