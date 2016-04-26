import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  // @Test
  // public void tamagotchi_instantiatesCorrectly() {
  //   Tamagotchi myTamagotchi = new Tamagotchi("lil dragon");
  //   assertEquals(true, myTamagotchi instanceof Tamagotchi);
  // }

  @Test
  public void tamagotchi_instantiatesCorrectly() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    assertEquals("lil dragon", myPet.getName());
    assertEquals(10, myPet.getFoodLevel());
    assertEquals(10, myPet.getSleepLevel());
    assertEquals(10, myPet.getActivityLevel());
  }

  @Test
  public void clickFeed_SleepAndActivityDecrease() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    myPet.clickFeed();
    assertEquals(9, myPet.getSleepLevel());
    assertEquals(9, myPet.getActivityLevel());
  }

  @Test
  public void clickSleep_FoodAndActivityDecrease() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    myPet.clickSleep();
    assertEquals(9, myPet.getActivityLevel());
    assertEquals(9, myPet.getFoodLevel());
  }

  @Test
  public void clickActivityLevel_FoodAndSleepDecrease() {
    Tamagotchi myPet = new Tamagotchi("lil dragon");
    myPet.clickActivityLevel();
    assertEquals(9, myPet.getSleepLevel());
    assertEquals(9, myPet.getFoodLevel());
  }

  @Test
  public void isAlive_foodLevelAbove0_true() {
    Tamagotchi  myPet = new Tamagotchi("lil dragon");
    assertEquals(true, myPet.isAlive());
  }

  // @Test
  // public void isAlive_foodBelow1_false() {
  //   Tamagotchi myPet = new Tamagotchi("lil dragon");
  //   myPet.setFoodLevel()
  //   assertEquals(false, myPet.isAlive());
  // }

}
