import java.util.*;

public class ApplePieRecipe {

    /*--------- Properties ---------*/
    private final ArrayList<Ingredient> allIngredients;

    private final Ingredient butter = new Ingredient(200, "gram", "ongezouten roomboter");
    private final Ingredient brownSugar = new Ingredient(200, "gram", "witte bastard suiker");
    private final Ingredient flour = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    private final Ingredient egg = new Ingredient(400, "stuk(s)", "ei");
    private final Ingredient vanilla = new Ingredient(8, "gram", "vanillesuiker");
    private final Ingredient salt = new Ingredient(1, "snuf", "zout");
    private final Ingredient apple = new Ingredient(1.5, "kilo", "zoetzure appels");
    private final Ingredient sugar = new Ingredient(75, "gram", "kristal suiker");
    private final Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
    private final Ingredient breadcrumbs = new Ingredient(15, "gram", "paneermeel");

    //200 gram ongezouten roomboter
    //200 gram witte bastard suiker
    //400 gram zelfrijzend bakmeel
    //1 stuk(s) ei
    //8 gram vanillesuiker
    //1 snuf zout
    //1.5 kilo zoetzure appels
    //75 gram kristal suiker
    //3 theelepels kaneel
    //15 gram paneermeel



    //1. Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)
    //2. Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.
    //3. Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.
    //4. Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.
    //5. Vet de springvorm in en bestrooi deze met bloem.
    //6. Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.
    //7. Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de andere helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.
    //8. Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.
    //9. Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken
    //10. Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.

    /*--------- Constructor ---------*/
    public ApplePieRecipe() {
        allIngredients = new ArrayList<Ingredient>();
        allIngredients.add(butter);
        allIngredients.add(brownSugar);
        allIngredients.add(flour);
        allIngredients.add(egg);
        allIngredients.add(vanilla);
        allIngredients.add(salt);
        allIngredients.add(apple);
        allIngredients.add(sugar);
        allIngredients.add(cinnamon);
        allIngredients.add(breadcrumbs);
    }




    /*--------- Methods ---------*/


    public void warmOven() {
        System.out.println("1. Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void separateEgg() {
        System.out.printf("2. Klop het %s los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.\n", egg.getName());
    }

    public void mixDough() {
        System.out.printf("3. Meng de %s, %s, %s, een helft van het %s, %s en een snufje %s tot een stevig deeg en verdeel deze in 3 gelijke delen.\n", butter.getName(), brownSugar.getName(),flour.getName(), egg.getName(), vanilla.getName(), salt.getName() );
    }
    public void prepApples() {
        System.out.printf("4. Schil nu de %s en snij deze in plakjes. Vermeng in een kopje de %s en %s.\n", apple.getName(), sugar.getName(), cinnamon.getName());
    }
    public void prepSpringform() {
        System.out.println("5. Vet de springvorm in en bestrooi deze met bloem.");
    }


    public void placeDough() {
        System.out.printf("6. Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het %s op de bodem van de beklede vorm. Het %s neemt het vocht van de appels op.\n", this.breadcrumbs.getName(), this.breadcrumbs.getName());
    }
    public void fillPie() {
      System.out.println("7. Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de andere helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }
    public void prepCrustTop() {
        System.out.println("8. Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }
    public void coverPie() {
        System.out.println("9. Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
    }
    public void bakePie() {
        System.out.println("10. Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
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
        this.warmOven();
        this.separateEgg();
        this.mixDough();
        this.prepApples();
        this.prepSpringform();
        this.placeDough();
        this.fillPie();
        this.prepCrustTop();
        this.coverPie();
        this.bakePie();
    }

}
