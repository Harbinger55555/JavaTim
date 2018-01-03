import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass (int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return this.myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];
     
        ArrayList<String> strArrayList = new ArrayList<String> ();
        strArrayList.add("Kalesh");

        // Invalid code
        // ArrayList<int> intArrayList = new ArrayList<int> ();
        // Type argument cannot be of primitive type

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass> ();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);
 
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%2d --> %2d\n", i, intArrayList.get(i).intValue());
        }

        // Short ways
        Integer myIntValue = 56;		// Integer myIntValue = Integer.valueOf(56);
        int myInt = myIntValue; 	        // int myInt = myIntValue.intValue();
     
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for (double d = 0.0; d <= 10.0; d += 0.5) {
            myDoubleValues.add(Double.valueOf(d));
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.printf("%2d --> %5.2f\n", i, value);
        }

        
        

        

    }
}
   
           