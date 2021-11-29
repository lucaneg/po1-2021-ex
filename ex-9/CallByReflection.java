import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class First {
    public First() {}
    
	public void doFirst(int par) {
		System.out.println("Executing first on: " + par);
	}
}

class Second {
	public Second() {}
    
	public void doSecond(int par) {
		System.out.println("Executing second on: " + par);
	}
}

class Third {
	public Third() {}
    
	public void doThird(int par) {
		System.out.println("Executing third on: " + par);
	}
}


class ReflectionUtils {
	public static void exec(String className, int par) {
		Class<?> target;
		if (className.equals(First.class.getName())) 
			target = First.class;
		else if (className.equals(Second.class.getName())) 
			target = Second.class;
		else 
			target = Third.class;
		
		try {
			Constructor<?> constructor = target.getConstructor();
			Method method = target.getMethod("do" + target.getSimpleName(), int.class);
			Object newInstance = constructor.newInstance();
			method.invoke(newInstance, par);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
			System.out.println(e);
		}
	}
}

class CallByReflection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ReflectionUtils.exec(sc.next(), sc.nextInt());
		
		sc.close();
	}
}
