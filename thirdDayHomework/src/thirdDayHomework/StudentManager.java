package thirdDayHomework;

public class StudentManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println("��renci eklendi : " + user.getFirstName());
	}
	
	@Override
	public void delete(User user) {
		System.out.println("��renci silindi : " + user.getFirstName());
	}
	
	@Override
	public void update(User user) {
		System.out.println("��renci g�ncellendi : " + user.getFirstName());
	}
}
