 import java.util.Scanner;
 public class Games {

    private Scanner input;

 public Games() {

  input = new Scanner(System.in);

 }

 public void textParser() {

 
  int intCount = 0;
  int dblCount = 0;
  int strCount = 0;

  while(input.hasNext()) {
   if(input.hasNextInt()) {
    int num = input.nextInt();
   // System.out.println(num);
    intCount++;
 }else if(input.hasNextDouble()) {
   double value = input.nextDouble();
  // System.out.println(value);
   dblCount++;
 }else {
   String oneWord = input.next();
  // System.out.println(oneWord);
   strCount++;
 }
}
System.out.println("string " + strCount);
System.out.println("integer " + intCount);
System.out.println("double " + dblCount);



}

  public static void main(String[] args) {
  Games demo = new Games();
  demo.textParser();
 }

}
