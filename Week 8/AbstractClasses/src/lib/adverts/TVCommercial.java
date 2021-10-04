package lib.adverts;

public class TVCommercial extends Advert {

    private int noOfSec, ratePerSec;
    private boolean peakTime;

    public TVCommercial() {
        noOfSec = 0;
        ratePerSec = 0;
        peakTime = false;
    }

    public TVCommercial(int fee, int noOfSec, int ratePerSec, boolean peakTime) {
        super(fee);
        this.noOfSec = noOfSec;
        this.ratePerSec = ratePerSec;
        this.peakTime = peakTime;
    }

    @Override
    public int cost() {
        if(!peakTime) {
            return super.getFee() + noOfSec * ratePerSec;
        } else {
            return super.getFee() + (noOfSec * ratePerSec) * 2;
        }
    }
}
