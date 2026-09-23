import com.pi4j.Pi4J;
import com.pi4j.context.Context;
import com.pi4j.io.gpio.digital.DigitalOutput;
import com.pi4j.io.gpio.digital.Digital State;

import java.util.HashMap;
import java.util.Map;

public class Robot
  {
      private double Angle;
      private String Direction;
      private static final int[] PIN_ADDRESS = {4,27,22,23,24,25,5,6,26,13,12,21};

      public static void main(String[] args) throws Interupted Exception
    {
      Context pi4j = Pi4J.newAutoContext();

      Map<Integer, DigitalOutput> pins = new HashMap<>();

      for (int address : PIN_ADDRESS)
        {
          DigitalOutputConfigBuilder config = DigitalOutput.newConfigBuilder(pi4j)
            .id("pin-" + address)
            .name("GPIO Pin" + address)
            .address(address)
            .shutdown(DigitalState.LOW)
            .inital(DigitalState.LOW);

          DigitalOutput digitalOutput = pi4j.create(config);
          pins.put(address, digitalOutput);
        }
    }

    public Robot() {
      Angle = 0;
      Direction = "Resting";
    }
    public Robot (double Ag, String Dir)
    {
      Angle = Ag;
      Direction = Dir;
    }
    public void forward() 
    {
      pins.get(27).high(); //figure out movement later on ;)
      //Add Forward Code Later
    }
    public void backward()
    {
      //Add Backward Code Later
    }
    public void left()
    {
      //Add Left Code Later
    }
    public void right()
    {
      //Add Right Code Later
    }
    public void wake()
    {
      //Add Wake Code Later
    }
    public void rest()
    {
      //Add rest Code Later
    }
    public void stop()
    {
      //Add Stop Code Later
    }
  }
  
