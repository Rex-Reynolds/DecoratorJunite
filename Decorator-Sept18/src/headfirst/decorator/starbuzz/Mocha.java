package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator {

  public Mocha(Beverage beverage) {
    super(beverage);
  }

  @Override
  public double cost() {
    return .20 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }
}
