package thirdDayHomework;

public class Student extends User {
		private int successPercent;

		public int getSuccessPercent() {
			return successPercent;
		}
		
		//set b�yle yaz�lmaz normalde fakat ben tam dataya eri�im bilmedi�im i�in ellemedim.
		public void setSuccessPercent(int successPercent) {
			this.successPercent = successPercent;
		}
}
