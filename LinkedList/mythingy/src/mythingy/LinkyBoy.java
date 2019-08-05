package mythingy;

public class LinkyBoy<pointy> {

	private pointy thing;
	private LinkyBoy<pointy> nextPointy;
	
	LinkyBoy(pointy newThing, LinkyBoy<pointy> newPointy){
		thing = newThing;
		nextPointy=newPointy;
		}
	
	LinkyBoy(LinkyBoy<pointy> newPointy){
		nextPointy=newPointy;
	}
	
	LinkyBoy<pointy> nextBoy(){
		return nextPointy;
	}
	
	void setNextBoy(LinkyBoy<pointy> newPointy) {
		nextPointy=newPointy;
		
	}
	pointy getThing() {
		return thing;
	}
	void setThing(pointy newThing) {
		thing=newThing;
	}
	
}
