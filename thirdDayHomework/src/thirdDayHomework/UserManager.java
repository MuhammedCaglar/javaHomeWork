package thirdDayHomework;

public class UserManager {
		
		public void add(User user) {
			System.out.println("Kullan�c� eklendi : " + user.getFirstName());
		}
		
		public void delete(User user) {
			System.out.println("Kullan�c� silindi : " + user.getFirstName());
		}
		
		public void update(User user) {
			System.out.println("Kullan�c� g�ncellendi : " + user.getFirstName());
		}
		
		
		
}
