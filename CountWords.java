public class CountWords
{
  public static void main(String[] args)
  {
     String str;
     
     char ch;
     int x;
     int count = 0;
     int length;
     boolean previousCharWasPunc = false;
     
     str = "besides skills, responsibility is equally important";
     length = str.length();
     for(x = 0; x < length; x++)
     {
        ch = str.charAt(x);
        if(ch == ' ' || ch == '.' || ch == ';' || ch == ',' ||
           ch == '!' || ch == '-')
        {
           ++count;
           if(previousCharWasPunc)
              --count;
           previousCharWasPunc = true;
        }
        else
           previousCharWasPunc = false;
     }
     if(!previousCharWasPunc)
        ++count;
        
     System.out.println("There are " + count + " words in the string");
  }
}