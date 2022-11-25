class stringReversal implements Interfaceconcepts{
    public String Reverse(String firstName){
        System.out.println("this is the last name for the user: " + firstName);
    String lastName ="";
        for(int i=firstName.length()-1; i>=0 ;i--)
        {
            lastName=lastName+firstName.charAt(i);
        }   
  
        return lastName;
}

public void runn(){
    System.out.println("Calling interface");
}
public int numReverse(int num){
    int digit=0;
    for(int i=0;i<=num;i++)
    {
         digit = digit + i;
    }
    return digit;
}
}
