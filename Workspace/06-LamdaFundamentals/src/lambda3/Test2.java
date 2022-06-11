package lambda3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {

	public static void main(String[] args) {
		String companies[] = { "Infosys", "TCS", "LTI", "Capgemini", "JPM", "ITC Infotech", "HDFC", "YesBank" };
		List<String> list = Arrays.asList(companies);
		
		System.out.println("Display List:");
		
		//list.stream().forEach((String str) -> System.out.println(str));
		//same as above expression
		list.stream().forEach(str -> System.out.println(str));
		
		System.out.println("---------------------------------------");
		Predicate<String> predicate = (String str) ->{
			boolean result = str.length() <= 4;
			return result;
		};
		
		list.stream()
			.filter(predicate)
			.forEach(str ->System.out.println(str));
		
		//above code can be wriiten as below code using lambda expression
		//list.stream().filter((element)->{return element<=4}).count();
	
		long count = list.stream().filter(element -> element.length() <=4).count();
		System.out.println("count: " + count);
	}
	

}
