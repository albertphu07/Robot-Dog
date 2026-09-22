import java.util.concurrent.TimeUnit;

public class robot_runner
  {
    public static void main(String[] agrs) throws InterruptedException
    {
      System.out.println("Runner");
      Robot robot = new Robot();
      
      robot.forward();
      TimeUnit.SECONDS.sleep(5);
      robot.stop();
      robot.backward();
      TimeUnit.SECONDS.sleep(2);
      robot.stop();
      
    }
  }
