import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Tyre {
	String brand();
	int width();
	int height();
	int radius();
	char category();
}

abstract class BaseTyre {
	
	public String getBrand() {
		return this.getClass().getAnnotation(Tyre.class).brand();
	}
	
	public int getWidth() {
		return this.getClass().getAnnotation(Tyre.class).width();
	}
	
	public int getHeight() {
		return this.getClass().getAnnotation(Tyre.class).height();
	}
	
	public int getRadius() {
		return this.getClass().getAnnotation(Tyre.class).radius();
	}
	
	public char getCategory() {
		return this.getClass().getAnnotation(Tyre.class).category();
	}
	
	@Override
	public String toString() {
		return getBrand() + " " + this.getClass().getSimpleName() + " (" + getWidth() + "/" + getHeight() + "/R" + getRadius() + ")";
	}
}

@Tyre(brand = "Goodyear", category = 'X', width = 140, height = 35, radius = 19)
class GY132 extends BaseTyre { }

@Tyre(brand = "Pirelli", category = 'H', width = 125, height = 40, radius = 16)
class P15D extends BaseTyre { }

@Tyre(brand = "Bridgestone", category = 'A', width = 125, height = 35, radius = 17)
class B78C2 extends BaseTyre { }

@Tyre(brand = "Pirelli", category = 'X', width = 130, height = 30, radius = 19)
class P7 extends BaseTyre { }

@Tyre(brand = "Pirelli", category = 'A', width = 95, height = 35, radius = 17)
class P0C extends BaseTyre { }

@Tyre(brand = "Bridgestone", category = 'F', width = 195, height = 45, radius = 19)
class B15C72 extends BaseTyre { }
