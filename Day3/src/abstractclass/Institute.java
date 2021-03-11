package abstractclass;

public class Institute {
	static boolean a1;
		public static void main(String[] args) {
			Student s = new HighSchool();
			s.admit();
			s.study();
			Student q = new MidSchool();
			q.admit();
			q.study();
			System.out.println(a1);
		}
}
