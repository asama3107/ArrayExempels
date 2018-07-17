/**
 * Created by student on 17.07.2018.
 */
public class Main {

    public static void main(String[] args) {
        NullCounter nullCounter = new NullCounter();
        nullCounter.fillArr (7);

        //анонiмний клас
        new NullCounter().fillArr(11);

    }
}
