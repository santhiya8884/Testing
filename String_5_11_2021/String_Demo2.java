package string_5_11_2021;

public class String_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String santhiya="Tamilnadu";
		String ram="Tamilnadu";
		String sara="Tamilnadu";
		String ravvi="Tamilnadu";
		String mani="Tamilnadu";
		System.out.println(santhiya);
		System.out.println(santhiya.hashCode());
		System.out.println(sara);
		System.out.println(sara.hashCode());
		System.out.println(ravvi);
		System.out.println(ravvi.hashCode());
		System.out.println(ram);
		System.out.println(ram.hashCode());
		System.out.println(mani); 
		System.out.println(mani.hashCode());
		santhiya="kerala";
		System.out.println(santhiya);
		System.out.println(santhiya.hashCode());
		
		System.out.println(sara);
		System.out.println(sara.hashCode());
		System.out.println(ravvi);
		System.out.println(ravvi.hashCode());
		System.out.println(ram);
		System.out.println(ram.hashCode());
		System.out.println(mani); 
		System.out.println(mani.hashCode());
		
		
	}

}
/* output :
 Tamilnadu
1109386407
Tamilnadu
1109386407
Tamilnadu
1109386407
Tamilnadu
1109386407
Tamilnadu
1109386407
kerala
-1134879682
Tamilnadu
1109386407
Tamilnadu
1109386407
Tamilnadu
1109386407
Tamilnadu
1109386407
*/
