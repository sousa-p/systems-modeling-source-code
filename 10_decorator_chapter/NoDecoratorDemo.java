public class Coffee {
    private String description = "Coffee";
    private double cost = 5.0;

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}

public class CoffeeWithMilk {
    private String description = "Coffee with Milk";
    private double cost = 6.0;

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}

public class CoffeeWithSugar {
    private String description = "Coffee with Sugar";
    private double cost = 5.5;

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk();
        CoffeeWithSugar coffeeWithSugar = new CoffeeWithSugar();

        System.out.println(coffee.getDescription() + ": $" + coffee.getCost());
        System.out.println(coffeeWithMilk.getDescription() + ": $" + coffeeWithMilk.getCost());
        System.out.println(coffeeWithSugar.getDescription() + ": $" + coffeeWithSugar.getCost());
    }
}