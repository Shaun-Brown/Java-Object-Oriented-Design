package lib;

public class GameCharacter {

    private int lives, rewards, rewardsPerLife;

    public GameCharacter() {
        lives = 1;
        rewards = 1;
        rewardsPerLife = 1;
    }

    public GameCharacter(int lives, int rewards, int rewardsPerLife) {
        this.lives = lives;
        this.rewards = rewards;
        this.rewardsPerLife = rewardsPerLife;
    }

    public void addRewards(int rewards){
        this.rewards += rewards;
    }

    public void setRewardsPerLife(int rewardsPerLife) {
        this.rewardsPerLife = rewardsPerLife;
    }

    public int getLivesRemaining() {
        return lives;
    }

    public int getRewards() {
        return rewards;
    }

    public void loseLife(){
        this.lives -= lives;
    }

    public void buyLife(){
        this.lives += lives;
        this.rewards -= rewards;
    }

    public boolean isAlive(){
        if(lives > 0){
            return true;
        } else {
            return false;
        }
    }

}
