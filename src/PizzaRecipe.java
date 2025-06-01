import java.util.ArrayList;

public class PizzaRecipe {
    /*--------- Properties ---------*/
    private final ArrayList<Ingredient> allIngredients;

    private final Ingredient water = new Ingredient(355, "gram", "warm water (105-115°F");
    private final Ingredient yeast = new Ingredient(1, "package", "active dry yeast");
    private final Ingredient flour = new Ingredient(490, "gram", "bread flour");
    private final Ingredient oliveOil = new Ingredient(2, "tablespoons", "extra virgin olive oil (omit if cooking pizza in a wood-fired pizza oven");
    private final Ingredient salt = new Ingredient(2, "teaspoons", "kosher salt");
    private final Ingredient sugar = new Ingredient(1, "teaspoon", "sugar");


//    1 1/2 cups (355 ml) warm water (105°F-115°F)
//    1 package (2 1/4 teaspoons) active dry yeast
//    3 3/4 cups (490g) bread flour
//    2 tablespoons extra virgin olive oil (omit if cooking pizza in a wood-fired pizza oven)
//    2 teaspoons kosher salt
//    1 teaspoon sugar

    /*--------- Constructor ---------*/
    public PizzaRecipe() {
        allIngredients = new ArrayList<Ingredient>();
        allIngredients.add(water);
        allIngredients.add(yeast);
        allIngredients.add(flour);
        allIngredients.add(oliveOil);
        allIngredients.add(salt);
        allIngredients.add(sugar);
    }

    public void oneProofYeast() {
        System.out.println("1. Proof the yeast.");
    }

    public void twoMakeDough() {
        System.out.println("2. Make and knead the pizza dough.");
    }

    public void threeRise() {
        System.out.println("3. Let the dough rise.");
    }

    public void fourPreheatStone() {
        System.out.println("4. Preheat the pizza stone (or pizza pan or baking sheet).");
    }

    public void fiveDivide() {
        System.out.println("5. Divide the dough into 2 balls.");
    }

    public void sixPrepToppings() {
        System.out.println("6. Prep the toppings.");
    }

    public void sevenShape() {
        System.out.println("7. Flatten the dough ball, and stretch out into a round.");
    }

    public void eightOilDough() {
        System.out.println("8. Brush the dough top with olive oil.");
    }

    public void nineAddRollerskates() {
        System.out.println("9. Sprinkle the pizza peel with cornmeal, put flattened dough on top.");
    }

    public void tenTop() {
        System.out.println("10. Spread with tomato sauce and sprinkle with toppings.");
    }

    public void elevenInOven() {
        System.out.println("11. Slide pizza into the oven.");
    }

    public void twelveBake() {
        System.out.println("12. Bake.");
    }

    public void printTitle() {
        System.out.println();
        System.out.println("Pizza Pie Recipe");
        System.out.println();
    }

    public void printMeasurements() {
        this.allIngredients.forEach(i -> {
            if (i.getAmount() % 1 == 0) {
                System.out.printf("%.0f %s ", i.getAmount(), i.getUnit());
            } else {
                System.out.printf("%.1f %s ", i.getAmount(), i.getUnit());
            }
            System.out.println(i.getName());
        });
        System.out.println();
    }

    public void printSteps() {
        this.oneProofYeast();
        this.twoMakeDough();
        this.threeRise();
        this.fourPreheatStone();
        this.fiveDivide();
        this.sixPrepToppings();
        this.sevenShape();
        this.eightOilDough();
        this.nineAddRollerskates();
        this.tenTop();
        this.elevenInOven();
        this.twelveBake();
    }

    public void credit() {
        System.out.println("Credit: Elise Bauer - https://www.simplyrecipes.com/recipes/homemade_pizza/");
    }

}
