package castle;

public class Room {
    public String description;
    public Room northExit;
    public Room southExit;
    public Room eastExit;
    public Room westExit;

    public Room(String description) 
    {
        this.description = description;
    }

    public void setExits(Room north, Room east, Room south, Room west) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
    }

    @Override
    public String toString()
    {
        return description;
    }
    public String getExitDesc() {
    	StringBuffer ret=new StringBuffer(); //String相加成本会很高,这里使用了StringBuffer
    	if( northExit!=null) {
    		ret.append("north,");
    	}
    	if( southExit!=null) {
    		ret.append("south,");
    	}
    	if (eastExit!=null) {
    		ret.append("east,");
    	}
    	if ( westExit!=null) {
    		ret.append("west,");
    	}
    	return ret.toString();
    }
}
