import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] firstKElementsSuite = firstKElementsGeomSuite(2, 8, 4);
        Arrays.stream(firstKElementsSuite)
              .forEach((e)-> System.out.println(e));
    }


    /**
     *
     * @return the first k elements of an arithmetic  suite
     */
    public static int [] firstKElementsArithSuite( int depart, int raison, int k){
        int [] firstKValues = new int[k];
        int counter=0;
        int currentValue = depart;
        while (counter < k){
            firstKValues[counter]=currentValue;
            currentValue += raison ;
            counter++;
        }
        return firstKValues;
    }
    /**
     *
     *
     * @return the first k elements of a geometric suite
     */
    public static int [] firstKElementsGeomSuite( int depart, int raison, int k){

        int [] firstKValues = new int[k];
        int counter=0;
        int currentValue = depart;
        while (counter < k){
            firstKValues[counter]=currentValue;
            currentValue *= raison ;
            counter++;
        }
        return firstKValues;
    }
}
