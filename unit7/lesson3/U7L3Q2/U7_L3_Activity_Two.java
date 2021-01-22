import java.util.ArrayList;

public class U7_L3_Activity_Two
{

  // Write the printStatistics method as described in the assignment

public static void printStatistics(ArrayList<Integer> list) {
  
  int sum = 0;
  double avg = 0;
  int mode = 0;
  double maxValue = Double.NaN;
  int counter = 0;
  int maxCount = 0;
  boolean infinite = false;
  ArrayList<Integer> hold = new ArrayList<Integer>();
  
  
  for (int i = 0; i < list.size(); i++) {
  sum += list.get(i); 
  counter++;
  avg += list.get(i);
} 
  avg = avg / counter;
  
  for (int i = 0; i < list.size(); i++) {
    int count = 0;
    for (int j = i; j < list.size(); j++) {
      if (list.get(j) == list.get(i)) 
        count++;
    }
        if (count == maxCount) {
            maxValue = Double.NaN;
            infinite = true;
        }
        else if (count > maxCount) {
            maxCount = count;            
            maxValue = list.get(i);;
          }
      }
  
  
  System.out.println("Sum: " + sum);
  System.out.println("Average: " + avg);
  if(infinite == true)
  System.out.println("Mode: no single mode");
  else if(maxCount > 1){
  mode = (int) maxValue;
  System.out.println("Mode: " + mode);
}
  else 
  System.out.println("Mode: no single mode");
}

}
