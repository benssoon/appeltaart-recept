public class Main {
    public static void main(String[] args) {
        ApplePieRecipe recipe = new ApplePieRecipe();
        recipe.printMeasurements();
        recipe.printSteps();

        PizzaRecipe pizza = new PizzaRecipe();
        pizza.printMeasurements();
        pizza.printSteps();
        pizza.credit();
    }
}
