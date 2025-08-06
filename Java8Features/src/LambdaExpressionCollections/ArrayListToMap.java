package LambdaExpressionCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListToMap {
	public static void main(String[] args) {

		List<ListItem> List = new ArrayList<ListItem>();
		List.add(new ListItem(1, "Tejas"));
		List.add(new ListItem(2, "RK"));
		List.add(new ListItem(3, "PK"));
		List.add(new ListItem(4, "SK"));

		Map<Integer, String> map = new HashMap<>();

		// for (ListItems n : list) { map.put(n.getkey(),
		// n.getvalue()); }
		// the below lambda performs the same task as the
		// above given for loop will do
		// put the list items in the Map
		List.forEach((n) -> {
			map.put(n.getKey(), n.getValue());
		});

		// Printing the given map
		System.out.println("Map : " + map);
	}
}

class ListItem {

	Integer Key;
	String Value;

	public ListItem(Integer key, String value) {
		super();
		Key = key;
		Value = value;
	}

	public Integer getKey() {
		return Key;
	}

	public void setKey(Integer key) {
		Key = key;
	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}

}
