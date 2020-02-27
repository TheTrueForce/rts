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
	private int armor;			// the unit's base armor

	private Unit template;		// This unit's template

	// Fielded constructor
	public Unit(Unit template) {
		this.template = template;
		this.walkType = template.getWalkType();
		this.health = template.getHealth();
		this.shield = template.getShield();
		this.armor = template.getArmor();
	}
	
	// applies the given amount of damage to this unit, accounting for armor.
	public doDamage(int damage) {
		// TODO: Need to work out how armor's damage reduction is going to work.
		health = health - (damage);
	}
	// heals this unit by the amount given. Not affected by armor.
	public heal(int damage) {
		health += damage;
	}
	public isDead() {
		return health <= 0;
	}
	
}
