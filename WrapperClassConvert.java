
public class WrapperClassConvert {

	public static void main(String[] args) {
	     int object = 10;
	     CovertToWrapper(object);

		}

		private static Integer CovertToWrapper(int object) {
			Integer l = Integer.valueOf(object);
			Float d = Float.valueOf(object);
			
				if (l instanceof Integer) {
					System.out.println(l);
				}else
				{
					System.out.println("Give proper primitive as input");
				}
		
			return l;
		}

}