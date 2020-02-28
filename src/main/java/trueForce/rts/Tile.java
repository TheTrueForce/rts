package trueForce.rts;

// This class describes a single square of a map.
// Position is given by the tile's position in the array, not held here
public class Tile {
	EnumWalk walkType;		// what can traverse this tile (flyers, floaters, walkers, striders)
	boolean buildable;		// whether or not a Structure can be built on this tile(does not prevent the map from specifying a structure on top of this)
	int texture;			// ID of the texture to use for this tile
	EnumResource resType;	// which resource this tile contains(if any)
}
