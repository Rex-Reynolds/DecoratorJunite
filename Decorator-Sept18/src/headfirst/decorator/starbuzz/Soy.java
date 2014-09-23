package headfirst.decorator.starbuzz;

public class Soy extends CondimentDecorator {

  public Soy(Beverage beverage) {
    super(beverage);
  }

  @Override
  public double cost() {
    return .15 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }
}
