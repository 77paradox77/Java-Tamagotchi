import org.junit.*;
import static org.junit.Assert.*;

public class TamagotchiTest {

  @Test
  public void tamagotchi_instantiatesCorrectly() {
    Tamagotchi myTamagotchi = new Tamagotchi("lil dragon");
    assertEquals(false, myTamagotchi instanceof Tamagotchi);
/*
    Tamagotchi myPet = newTamagotchi("lil dragon");
    assertEquals("lil dragon", myPet.getName());
    assertEquals(10, myPet.getFoodLevel());
    assertEquals(10, myPet.getSleepLevel());
    assertEquals(10, myPet.getActivityLevel());
    */
  }

}
