interface Weapon {
	void loadAmmo(int n);
	
	void unloadAmmo(int n);
	
	int ammoCount();
	
	public default void fire() {
		unloadAmmo(1);
	}
}

abstract class BasicWeapon implements Weapon {
	private int ammos;

	protected BasicWeapon() {
		this.ammos = 0;
	}

	@Override
	public void loadAmmo(int n) {
		ammos += n;
	}

	@Override
	public void unloadAmmo(int n) {
		ammos -= n;
	}

	@Override
	public int ammoCount() {
		return ammos;
	}
}

class Pistol extends BasicWeapon {
	
}

class DoubleBarrelShotgun extends BasicWeapon {
	@Override
	public void fire() {
		unloadAmmo(2);
	}
}

class Machinegun extends BasicWeapon {
	@Override
	public void fire() {
		unloadAmmo(ammoCount());
	}
}
