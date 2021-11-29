import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Category {
	int code();
	String name();
}

abstract class StoreItem {

	private final String name; 
	
	private final String category; 
	
	public StoreItem(String name) {
		this.name = name;
		// this retrieves the category from the Category annotation 
		Category annot = this.getClass().getAnnotation(Category.class);
		if (annot != null)
			category = annot.name() + " - code " + annot.code();
		else 
			category = "unassigned";
	}
	
	@Override
	public String toString() {
		return name + " (in " + category + ")";
	}
}

@Category(code = 5, name = "food")
class Pasta extends StoreItem {
	public Pasta() {
		super("pasta");
	}
}

@Category(code = 7, name = "personal care")
class Toothbrush extends StoreItem {
	public Toothbrush() {
		super("toothbrush");
	}
}

@Category(code = 15, name = "wardrobe")
class Shoes extends StoreItem {
	public Shoes() {
		super("shoes");
	}
}