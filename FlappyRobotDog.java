
import java.util.ArrayList;

public class FlappyRobotDog {

   public static void main(String[] args) {
      RobotBird dunstan = new RobotBird();

      Bird dunstanBird = (Bird)dunstan; // NOTE: actually a robot dog!!

      Ace ace = new Ace();

      ArrayList<Bird> list = new ArrayList<Bird>();

      list.add(dunstanBird);
      list.add(ace);

      for(Bird b: list) {
        b.fly();
      }

   }

}
