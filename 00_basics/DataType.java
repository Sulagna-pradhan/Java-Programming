public class DataType {
  public static void main (String[] args){
    // Group - Integer Data Type
    byte a = -34;
    short b = 67;
    long c = -362532;
    int d = 23;

    System.out.println (a);
    System.out.println (b);

    /* all though \n is a excape sequnence and used for new line 
    but we can't use directly like this 
    System.out.println (b \n); 
    Because - \n must be enclosed in a string literal (i.e., within double quotes " "). 
    Using \n directly without quotes is invalid syntax and will cause a compilation error.
    */

    System.out.println (c);
    System.out.println (d);



    // Group Floating Point Number
    float temparature = 23.57f;
    /* In Java, a numeric literal with a decimal point (e.g., 23.57) is treated as a double by default. 
    To assign it to a float variable, 
    you need to explicitly indicate that the value is a float by appending an f or F suffix to the literal.
    Without this suffix, the code will result in a compilation error like:
    error: incompatible types: possible lossy conversion from double to float
     */
    double salary = 23456.67;

    System.out.println ("Today's temparature is "+ temparature);
    System.out.println ("My salary is "+ salary);



  }
}
