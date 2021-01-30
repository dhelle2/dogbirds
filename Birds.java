

  public class Birds {
   
    public static void main(String[] args) {
      Ace ace = new Ace();
      RobotBird dunstan = new RobotBird();

      Bird birds[] = { ace, dunstan };

      for( Bird b: birds) {
         b.fly();
      }

    }

  }
