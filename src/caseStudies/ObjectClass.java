package caseStudies;
class Object	//if you define or not(by default every class must have Object class as Parent class)
{
	/*Some of the Object class Methods are
	 * hashCode()
	 * toString()
	 * public String toString()
		{
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
		}
	 * equals()
	 * Above Methods will be use in every class
	 */
}
public class ObjectClass extends Object
{
	public static void main(String[] args) 
	{
		ObjectClass os = new ObjectClass();
		System.out.println(os);
		System.out.println(os.toString());
		//if you print the object then automatically toString() will be called
		//Above Two print statements are same.
		System.out.println(os.hashCode());	
	}
}
