package headfirst.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
  protected Beverage beverage;

  public CondimentDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  /**
   * First time I have ever seen a child class make a inherited non
   * abstract method into an abstract one.
   */
  @Override
  public abstract String getDescription();
}
