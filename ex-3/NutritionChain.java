abstract class Food {
    protected final double proteins;
    protected final double fats;
    protected final double carbs;
    protected final int tastyScore;
    
    protected Food(double proteins, double fats, double carbs, int tastyScore) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
        this.tastyScore = tastyScore;
    }

    public abstract void getMacroNutrients();
}

class Egg extends Food {

    public final String type;
    
    public Egg(double proteins, double fats, double carbs) {
        super(proteins, fats, carbs, 7);
        type = "non-vegetarian";
    }

    @Override
    public void getMacroNutrients() {
        System.out.println("An egg has " + this.proteins + " gms of protein, " + this.fats + " gms of fats and "
                + this.carbs + " gms of carbohydrates.");
    }
}

class Bread extends Food {

    public final String type;

    public Bread(double proteins, double fats, double carbs) {
        super(proteins, fats, carbs, 8);
        type = "vegetarian";
    }

    @Override
    public void getMacroNutrients() {
        System.out.println("A slice of bread has " + this.proteins + " gms of protein, " + this.fats + " gms of fats and "
                + this.carbs + " gms of carbohydrates.");
    }
}