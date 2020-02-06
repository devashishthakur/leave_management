import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class UserClient {
	public static void main(String[] args) {
		Map<Integer,User> setU = new HashMap<Integer,User>();
		
		User u1 = new User(12,"Devashish",556767.21);
		User u2 = new User(22,"dd",324.21);
		User u3 = new User(33,"sa",65656.21);

		setU.put(1,u1);
		setU.put(2,u2);
		setU.put(3,u3);
		
		Set<Map.Entry<Integer, User>> entrySet= setU.entrySet();
		
		Iterator<Map.Entry<Integer, User>> it = entrySet.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<Integer, User> es = it.next();
			System.out.println(es.getKey()+"   " +es.getValue());
		}
	}
}
