import java.util.Comparator;

public class UserAssComparator implements Comparator<User> {

	@Override
	public int compare(User u1, User u2) {
		return (int)(u1.getSalary() - u2.getSalary());
	}
}
