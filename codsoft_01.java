import java.util.Scanner;
class numbergame1{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int flag=0,count=0;
      //GENERATING RANDOM NUMBERS
        double rand_int1 = Math.random();
        int a= (int)(rand_int1*100);
       // System.out.println(a); this is to print the generated number but no need to print here
       //TAKING INPUT A GUESS FROM USER
       do{
        count++;
       System.out.println("Enter the guess number");
       int n=in.nextInt();

       // CHECKING FOR CORRECT GUESS
       if(a==n){
       System.out.println("Correct Guess");
       flag=100;}
       else if(n<a){
       System.out.println("Too Low");
       flag++;
       System.out.println("Try Again!");}
       else if(n>a){
       System.out.println("Too High");
       flag++;
       System.out.println("Try Again!");}
       }
       while(flag<100);
       System.out.println("Your total number of trials is = "+count);
    }
}