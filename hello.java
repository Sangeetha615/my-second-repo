public class hello{
    public static void main(String args[]){
        String firstName = "Sangeetha";
        String lastName ="";
        for(int i=firstName.length()-1; i>=0 ;i--)
{

    lastName=lastName+firstName.charAt(i);
}
System.out.println("this is the last name for the user: " + lastName);
    }
}