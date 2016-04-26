public class Tamagotchi {
  private String mMyPet;
  private int mFoodLevel = 10;
  private int mSleepLevel = 10;
  private int mActivityLevel = 10;

  public Tamagotchi(String myPet) {
    mMyPet = myPet;
  }

  public String getName() {

    return mMyPet;
  }

  public int getFoodLevel() {
    return mFoodLevel;
  }

  public int getSleepLevel() {
    return mSleepLevel;
  }

  public int getActivityLevel() {
    return mActivityLevel;
  }

  public void clickFeed() {
    mFoodLevel++;
    mSleepLevel--;
    mActivityLevel--;
  }

  public void clickSleep() {
    mFoodLevel--;
    mSleepLevel++;
    mActivityLevel--;
  }

  public void clickActivityLevel() {
    mFoodLevel--;
    mSleepLevel--;
    mActivityLevel++;
  }

  public boolean isAlive() {
    if (mFoodLevel > 0) {
      return true;
    } else {
      return false;
    }
  }






}
