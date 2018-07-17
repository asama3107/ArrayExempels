/**
 * Created by student on 17.07.2018.
 */
public class NullCounter {

    public int [] fillArr (int size){
        int[] resultArr = new int [size];


        for (int i = 0; i < resultArr.length; i++){

            resultArr[i] = (int) (Math.random() * 7);
            System.out.print (resultArr[i] + " ");
        }


        return resultArr;
    }

}
