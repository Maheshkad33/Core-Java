package lambda3;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test4 {

	public static void main(String[] args) {
		String companies[] = { "Infosys", "TCS", "LTI", "Capgemini", "JPM", "ITC Infotech", "HDFC", "YesBank" };
		List<String> list = Arrays.asList(companies);
		
		List<Integer> list2 =	list.stream()
		 						.filter(s ->s.length() >= 1)
		 						.map(e -> e.length())
		 						.collect(Collectors.toList());
		
		Integer Min = list2.stream().min(Integer :: compare).get(); 
		
		System.out.println("Miniimum: " + Min);
		
		List<String> list3 =	list.stream()
				.filter(s ->s.length() <= Min)
				.collect(Collectors.toList());
		
	
		list3.forEach(e ->System.out.println("Company with contain min letters: " + e));
		
		Integer Max = list2.stream().max(Integer :: compare).get();
		
		System.out.println("Maximum: " + Max);
		
		List<String> list4 =	list.stream()
				.filter(s ->s.length() == Max )
				.collect(Collectors.toList());
		
		list4.forEach(e ->System.out.println("Company with contain Max letters: " + e));
		
		int [] avg  = list2.stream()
						.mapToInt(Integer::intValue)
						.toArray();		
						
	    IntStream intstream = IntStream.of(avg);
	    
	    OptionalDouble obj = intstream.average();
	    System.out.println("Average is : " + obj.getAsDouble());
	    
	    Integer sum = list2.stream().collect(Collectors.summingInt(Integer::intValue));
	    
	    System.out.println("Sum is : " + sum);
	    
	    int count = (int)list2.stream().count();
	    System.out.println("count of company in list : " + count);
	    
	    
	    
		
	

	}

}
