package week2.DecoratorPattern;

public class DecoratorPattern {

    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        System.out.println("Simple Coffee");
        System.out.println("Cost : ₹" + coffee.getCost());
        System.out.println("Description : " + coffee.getDescription());

        System.out.println();

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println("Milk Coffee");
        System.out.println("Cost : ₹" + milkCoffee.getCost());
        System.out.println("Description : " + milkCoffee.getDescription());

        System.out.println();

        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println("Sugar Milk Coffee");
        System.out.println("Cost : ₹" + sugarMilkCoffee.getCost());
        System.out.println("Description : " + sugarMilkCoffee.getDescription());
    }
}

interface Coffee {
    int getCost();
    String getDescription();
}

class SimpleCoffee implements Coffee {

    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}

abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Milk";
    }
}

class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Sugar";
    }
}