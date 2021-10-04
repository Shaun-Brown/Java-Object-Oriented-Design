package lib;
/**
 * A remote for a sound system have many different Volume controls.
 * Volume can be increased to make the system louder.
 * There will be a maximum volume to save the users' ears.
 * There will be a mute function to stop sound at one button press.
 *
 *
 * @author Shaun
 */
public class VolumeModel {

    /** Fields include volume and maxVolume which use INT values.
     * The field for muted is of time boolean.
     */
    private int volume, maxVolume;
    private boolean muted;

    /** Default constructor that creates a max volume of 10, a normal volume of 5 and sets mute to false.
     * The die is rolled to give a random initial score.
     */
    public VolumeModel() {
        volume = 5;
        maxVolume = 10;
        muted = false;
    }

    /** Creates a volume model with the given maxVolume.
     * The volume is set to half of the maxVolume.
     * The muted variable is set to false
     *
     * @param maxVolume will set the max volume which can't be lower than 0.
     */
    public VolumeModel(int maxVolume) {
        if(maxVolume < 0) {
            maxVolume = 0 ;
        }
        this.maxVolume = maxVolume;
        this.volume = maxVolume/2;
        this.muted = false;
    }
    /** Creates volume model with a set volume, max volume and muted.
     * If the app is muted then the volume is set to 0.
     *
     * @param volume need to be less than or equal to max volume and cannot be lower than 0.
     * @param maxVolume cannot be lower than 0.
     * @param muted can only be true of false.
     */
    public VolumeModel(int volume, int maxVolume, boolean muted) {
        if(muted){
            this.volume = 0;
        } else {
            this.volume = Math.min(volume, maxVolume);
        }
        this.maxVolume = Math.max(maxVolume, 0);
        this.muted = muted;
    }
    /** Set the current volume of the volume controller.
     *
     * @param volume can only be set up to the maximum volume defined.
     * This cannot be lower than 0.
     */
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= maxVolume && !muted) {
            this.volume = volume;
        } else {
            this.volume = 0;
        }
    }

    /** Set the state of the muted function for the volume controller.
     *  @param muted can only be true of false.
     */
    public void setMuted(boolean muted) {
        this.muted = muted;
    }

    /** Increase the current volume of the volume controller
     *  Can only be increased up to the maximum volume
     */
    public void turnUp(){
        while (volume > maxVolume && !muted){
            this.volume += 1;
        }
    }

    /** Increase the current volume of the volume controller by a set amount
     *  @param vol can only increase the volume up to the maximum volume value.
     */
    public void turnUpBy(int vol){
        while (maxVolume - volume >=vol && !muted) {
            volume += vol;
        }
    }

    /** Decrease the current volume of the volume controller.
     *  Can only be decreased down to 0 as the lowest value.
     */
    public void turnDown(){
        while (volume > 0){
            this.volume -= 1;
        }
    }

    /** Decrease the current volume of the volume controller by a set amount
     *  @param vol can only decrease the volume down to 0 as the lowest value.
     */
    public void turnDownBy(int vol){
        while (volume - vol >= 0){
            this.volume -= vol;
        }
    }
    /** Returns the current volume of the Volume Controller.
     *
     * @return the current volume of the Volume Controller.
     */
    public int getVolume() {
        return volume;
    }
    /** Returns the maximum volume of the Volume Controller.
     *
     * @return the maximum volume of the Volume Controller.
     */
    public int getMaxVolume() {
        return maxVolume;
    }
    /** Returns the true if the Volume Controller is muted.
     * Returns the false if the Volume Controller is not muted.
     *
     * @return the the current state of the muted function of the Volume Controller as a boolean (True/False).
     */
    public boolean isMuted() {
        return muted;
    }
    /** Returns a textual representation of the volume controller.
     *
     * @return a textual representation of the volume controller.
     */
    public String toString(){
        return "Volume Model:[volume=" + volume + ", maxVolume=" + maxVolume + ", muted=" + muted + "]";
    }
}
