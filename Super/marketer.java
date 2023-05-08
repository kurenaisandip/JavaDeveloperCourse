package Super;

public class marketer extends Employee {

    // this method is only for marketer

    public boolean insidemarket() {
        return true;
    }

    // changing the working hour of marketer from 40 to 50
    @Override
    public int getHours() {

        // make it instead of 40
        // return super.getHours();
        return 50;
    }
}
