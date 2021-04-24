import java.util.Scanner;
import java.util.ArrayList; 
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

System.out.print("Input number : ");
 int n = in.nextInt();    

ArrayList<Integer> data = new ArrayList<>();
for (int m=0; m <n;m++){
  System.out.print("Input number : ");
 int num = in.nextInt(); 
data.add(num);
}
System.out.print(data);
int mode = data.get(0);

  int maxCount = 0;

  for (int i = 0; i < data.size(); i++) {

    int value = data.get(i);

    int count = 1;

    for (int j = 0; j < data.size(); j++) {

        if (data.get(j) == value) count++;

        if (count > maxCount) {

            mode = value;

            maxCount = count;

        }
  
  }
  }
  System.out.println();
  System.out.print("The mode is: "+mode);
  }

     

  }
  

