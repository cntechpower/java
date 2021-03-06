package castle;

import java.util.HashMap;

public class Room {
	private String description;
	private HashMap<String, Room> exits = new HashMap<String, Room>();

	public Room(String description) {
		this.description = description;
	}

	public void setExit(String dir, Room room) {
		exits.put(dir, room);
	}


	@Override
	public String toString() {
		return description;
	}

	public String getExitDesc() {
		StringBuffer ret = new StringBuffer(); // String相加成本会很高,这里使用了StringBuffer
		for (String dir : exits.keySet()) {
			ret.append(dir);
			ret.append(",");
		}
		return ret.toString();
	}

	public Room getExit(String direction) {
		return exits.get(direction);

	}
}
