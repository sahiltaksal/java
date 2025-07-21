public class stringpailndrome {
    public static void main(String[] args) {
    
    
   String str1="madam";
   String original=str1;
 str1 = str1.replaceAll("\\s", "");
   str1.toLowerCase();
   System.out.println(str1);

   String rev="";

   for(int i=str1.length()-1;i>=0;i--){

    rev=rev+str1.charAt(i);
   }
  System.out.println(rev);
   if(str1.equals(rev)){
     System.out.println("true");
   }
else{
    System.out.println("false");
}
     
   }
}

