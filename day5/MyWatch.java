package day5;

public class MyWatch {

	public static void main(String[] args) {
		
		int hour = 0;
		int min = 0;
		int sec = 0;
		
		while(hour<24)
		{
			min = 0;
			while(min<60)
			{
				sec = 0;
				while(sec<60)
				{
					try {
						System.out.println(hour+" : "+min+" : "+sec);
						Thread.sleep(1);
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e);
					}
					sec++;
				}
				min++;
			}
			hour++;
		}
		
	}
}
