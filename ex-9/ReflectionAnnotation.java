import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Clothing {
	String brand();
}

abstract class ClothingPiece {
    public ClothingPiece() {}
}

@Clothing(brand = "D&G")
class Scarf extends ClothingPiece {
    public Scarf() {}
}

@Clothing(brand = "Gucci")
class Skirt extends ClothingPiece {
    public Skirt() {}
}

@Clothing(brand = "Louis Vuitton")
class Trousers extends ClothingPiece {
    public Trousers() {}
}

@Clothing(brand = "Gucci")
class Jacket extends ClothingPiece {
    public Jacket() {}
}

class Hat extends ClothingPiece {
    public Hat() {}
}

class Wardrobe {
	public static void count(ClothingPiece[] pieces) {
		int dg = 0;
		int gucci = 0;
		int lv = 0;
		int unknown = 0;
		
		for (ClothingPiece piece : pieces) {
			Clothing annot = piece.getClass().getAnnotation(Clothing.class);
			if (annot == null)
				unknown++;
			else if (annot.brand().equals("D&G"))
				dg++;
			else if (annot.brand().equals("Gucci"))
				gucci++;
			else if (annot.brand().equals("Louis Vuitton"))
				lv++;
			else
				unknown++;
		}
		
		System.out.println("D&G: " + dg);
		System.out.println("Gucci: " + gucci);
		System.out.println("Louis Vuitton: " + lv);
		System.out.println("Unknown: " + unknown);
	}
}