public class Main {
    public static void main(String[] args) {
        ApplePieRecipe recipe = new ApplePieRecipe();
        recipe.printTitle();
        recipe.printMeasurements();
        recipe.printSteps();

        PizzaRecipe pizza = new PizzaRecipe();
        pizza.printTitle();
        pizza.printMeasurements();
        pizza.printSteps();
        pizza.credit();
    }
}
