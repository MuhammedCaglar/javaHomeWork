package thirdDayHomework;

public class InstructorManager extends UserManager {
	
		@Override
		public void add(User user) {
			System.out.println("Kullan�c� eklendi : " + user.getFirstName());
		}
		
		@Override
		public void delete(User user) {
			System.out.println("Kullan�c� silindi : " + user.getFirstName());
		}
		
		@Override
		public void update(User user) {
			System.out.println("Kullan�c� g�ncellendi : " + user.getFirstName());
		}
		
		
}
