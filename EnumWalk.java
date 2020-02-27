package trueForce.rts;


// this enum describes both:
//   the traversal capabilities of a unit, and
//   which traversal capabilities are required to traverse a tile.
// A unit may walk, fly, or float(infantry, air force, or navy)
// Not all combinations are given here. Particularly:
//  WALK and FLOAT but not FLY,
//  STRIDE and FLOAT and FLY, and
//  NONE and anything else.
public enum EnumWalk {
	// This tile cannot be traversed at all.
	// This unit cannot move.
	NONE,
	
	// This tile can only be flown over.
	// This unit flies, and can traverse any tile except a NONE.
	FLY,
	
	// This tile can be flown over and floated through(by a boat, for example), but not walked.
	// This unit floats(like a boat), and can traverse FLOAT and ALL tiles only.
	FLOAT,
	
	// This tile can be walked on, and flown over, but not floated through.
	// This unit can traverse WALK and ANY tiles only.
	WALK,
	
	// This tile is steep terrain. Only striders(special walkers) and flyers may traverse this tile.
	// This unit is a strider, and may traverse STRIDE, WALK, and ALL tiles only.
	STRIDE,
	
	// This tile may be traversed by any method.
	// This unit may traverse any tile, except a NONE.
	ALL
}
