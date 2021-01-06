public class U6_L2_Activity_Three{

  // Write your hasDuplicates method here
public static boolean hasDuplicates(int[] vals) {
  int count =0;
  boolean Duplicate = false;
  for(int i = 0; i < vals.length; i++) {
    
    for(int a = 0; a < vals.length; a++) {
      if(vals[i]==vals[a])
      count++;
    }
    if(count>=2){
      Duplicate = true;
      break;
    }
    count = 0;
  }
  return Duplicate;
}
}
