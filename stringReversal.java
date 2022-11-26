public class stringReversal {
    public String Reverse(String firstName){
        System.out.println("this is the last name for the user: " + firstName);
    String lastName ="";
        for(int i=firstName.length()-1; i>=0 ;i--)
        {
            lastName=lastName+firstName.charAt(i);
        }   
  
        return lastName;
}
public int numReverse(int num){
    int digit=0;
    for(int i=0;i<=num;i++)
    {
         digit = digit + i;
    }
    return digit;
}
public int numReverse2(int num){
    int digit=0;
    for(int i=0;i<=num;i++)
    {
         digit = digit + i;
    }
    return digit;
}
}
