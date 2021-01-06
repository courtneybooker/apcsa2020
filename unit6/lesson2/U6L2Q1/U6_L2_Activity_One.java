public class U6_L2_Activity_One{

  // Write your allNegative method here
    public static boolean allNegative(double[] vals) {
      boolean negative = true;
      for(int i = 0; i < vals.length; i++) {
        if(vals[i]>=0) {
        negative = false;
        break;
        }
      }
      return negative;
    }
}
