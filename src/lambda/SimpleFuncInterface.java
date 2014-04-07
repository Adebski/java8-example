package lambda;

import java.lang.FunctionalInterface;

@FunctionalInterface
public interface SimpleFuncInterface {
  public void doWork();

  default public void implemented() {
  	System.out.println(this);
  }
}
