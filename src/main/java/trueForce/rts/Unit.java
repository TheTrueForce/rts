package trueForce.rts;

// This class describes a unit.
// A unit generally moves, and does something.
// This class isn't very useful on its own; in particular, it contains no maximums.
// It is intended that this class be instantiated in a holder class and given to the Unit upon construction,
//   and 'fielded' instances internally make reference to that instance for their maximums/base stats.

public class Unit {
	private int type;			// the type of the unit, as an ID number
	private EnumWalk walkType;	// the unit's traversal capabilities
	private int health;			// the unit's health
	private int shield;			// the unit's shields(less than 0 means they don't have shields)

	// no need to carry this around in every unit. This could be on a unit template only.
	private int armor;			// the unit's base armor

	private Unit template;		// This unit's template. If null, this unit _is_ a template.

	// Fielded constructor
	public Unit(Unit template) {
		this.template = template;
		this.type = template.getType();
		this.walkType = template.getWalkType();
		this.health = template.getHealth();
		this.shield = template.getShield();
		this.armor = template.getArmor();
	}

	// whole-cloth contructor, intended to construct a template unit
	public Unit(int health, int shield, int armor, EnumWalk walkType){
		this.type = IDController.getNewUnitID();
		this.template = null;
		this.health = health;
		this.shield = shield;
		this.armor = armor;
		this.walkType = walkType;
	}	
	
	public int getType() {
		return type;
	}

	public EnumWalk getWalkType() {
		return walkType;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getShield() {
		return shield;
	}
	
	public int getArmor() {
		return armor;
	}
	// applies the given amount of damage to this unit, accounting for armor.
	public void doDamage(int damage) {
		// Starcraft aparently reduces the damage by the amount of armor
		health = health - (damage - armor);
	}
	// heals this unit by the amount given. Not affected by armor.
	public void heal(int damage) {
		health += damage;
	}
	public boolean isDead() {
		return health <= 0;
	}
	
}
