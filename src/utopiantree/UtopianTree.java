package utopiantree;
import java.util.Scanner;
public class UtopianTree{
       private static int UtopianHeight(int noOfCycles)
    {
/*We initialize the height of our tree to 1.*/
    int height=1;
/*If the number of cycles is not zero, we go through the calculations.*/
    if(noOfCycles<=0)
/*This won't change the height.*/
        return 1; 
/*This for loop goes through all the cycles to calculate the height.*/
    for(int i=1;i<=noOfCycles;i++)
        {
/*If th iteration is odd, the tree doubles in height.*/
        if(i%2!=0)
            height=2*height; 
/*If the iteration is even, the tree height increases by one.*/
        else
            height+=1; 
    }
/*After we've gone through all the cycles we return the height.*/
    return height;
}
       public static void main(String[] args) {            
        Scanner sc = new Scanner(System.in);
/*We read in the number of test cases.*/
        int noOfTestCases = sc.nextInt();
/*For each test case, we print out the height of the tree.*/ 
        for(int i=0;i<noOfTestCases;i++)
            {
              int noOfCycles = sc.nextInt();
            System.out.println(UtopianHeight(noOfCycles));
        }
        sc.close(); 
       }

}