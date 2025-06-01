import java.util.*;

public class ApplePieRecipe {

    private ArrayList<Ingredient> allIngredients = new ArrayList<>();


    private Ingredient butter = new Ingredient(200, "gram", "ongezouten roomboter");
    private Ingredient brownSugar = new Ingredient(200, "gram", "witte bastard suiker");
    private Ingredient flour = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    private Ingredient egg = new Ingredient(400, "stuk(s)", "ei");
    private Ingredient vanilla = new Ingredient(8, "gram", "vanillesuiker");
    private Ingredient salt = new Ingredient(1, "snuf", "zout");
    private Ingredient apple = new Ingredient(1.5, "kilo", "zoetzure appels");
    private Ingredient sugar = new Ingredient(75, "gram", "kristal suiker");
    private Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
    private Ingredient breadcrumbs = new Ingredient(15, "gram", "paneermeel");

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



//    Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)
//    Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.
//    Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.
//    Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.
//    Vet de springvorm in en bestrooi deze met bloem.
//    Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.
//    Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de andere helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.
//    Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.
//    Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken
//    Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.
    


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
        System.out.println("6. Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
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


    public ApplePieRecipe() {
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
