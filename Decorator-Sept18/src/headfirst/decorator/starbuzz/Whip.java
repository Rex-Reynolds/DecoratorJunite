package headfirst.decorator.starbuzz;

public class Whip extends CondimentDecorator {

  public Whip(Beverage beverage) {
    super(beverage);
  }

  @Override
  public double cost() {
    return .10 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
}
