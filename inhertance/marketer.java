package inhertance;

public class marketer extends Employee {

    // this method is only for marketer

    public boolean insidemarket() {
        return true;
    }

    @Override
    public int getHours() {

        // make it instead of 40
        return super.getHours();
    }
}
