package BCodes.java_8_features;

import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App
{
		
    public static void main( String[] args )
    {
    	//Streams API
//    	List<String> techStacks = Arrays.asList("Angular","Vue","React","Svelte","JAVA","PHP","NODE","ANDROID");
//    	techStacks.stream().filter(nameOfTheStack -> nameOfTheStack.startsWith("A")).forEach(System.out::println);
//    	techStacks.stream().map(String::toUpperCase).forEach(System.out::println);
//    	techStacks.stream().filter(nameOfTheStack -> nameOfTheStack.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
//    	List<String> orderedTechStacks = techStacks.stream().sorted().collect(Collectors.toList());
//    	orderedTechStacks.forEach(System.out::println);
//    	List<Integer> numbers = Arrays.asList(140,160,300,400,300);
//    	numbers.stream().sorted().forEach(System.out::println);
//    	int totalOfNumbers = numbers.stream().distinct().reduce(0, Integer::sum);
//    	System.out.println(totalOfNumbers);
//    	List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//    	int result = numbers.stream().reduce(1, (a,b) -> a*b);
//    	System.out.println(result);
//    	List<String> techStacks = Arrays.asList("Angular","Vue","React","Svelte","JAVA","PHP","NODE","ANDROID");
//    	String[] techStackArray = techStacks.stream().toArray(String[]::new);
//    	System.out.println(Arrays.toString(techStackArray));
//    	boolean isStartingWithA = techStacks.stream().anyMatch((ele) -> ele.startsWith("A"));
//    	String withOrWithout = isStartingWithA? "with" : "without";
//    	System.out.printf("Some Tech-Stack starts %s A",withOrWithout);
//    	Predicate<String> filterList = ele -> ele.startsWith("A");
//    	techStacks.stream().filter(filterList).forEach(System.out::println);
//    	boolean isAllMacthed = techStacks.stream().allMatch(ele -> ele.startsWith("A"));
//    	String isAll = isAllMacthed? "all" : "not all";
//    	System.out.printf("In TechStacks %s elemenst name starts with A",isAll);
//    	boolean noneMatched = techStacks.stream().noneMatch(ele -> ele.startsWith("A"));
//    	String isNoneMatched = noneMatched? "any": "some";
//    	System.out.printf("In Tech-Stack %s of the elements' name with A",isNoneMatched);
//    	Optional<String> firstEle = techStacks.stream().findAny();
//    	Consumer<String> firstElementConsumer = ele -> System.out.println("First element name is starting with A is "+ele);
//    	firstEle.ifPresent(firstElementConsumer);
//    	Optional<String> findAny = techStacks.parallelStream().findAny();
//    	findAny.ifPresent(System.out::println);
//    	long count = techStacks.stream().filter(ele -> ele.startsWith("A")).count();
//    	System.out.printf("%d tech names are starting with A",count);
//    	Optional<String> maxEle = techStacks.stream().max((a,b) -> a.length() - b.length());
//    	maxEle.ifPresent(System.out::println);
//    	Optional<String> minEle = techStacks.stream().min((a,b) -> a.length() - b.length());
//    	minEle.ifPresent(System.out::println);
    	
//    	List<Integer> numbers = Arrays.asList(2,3,5,3,4,5,6,7,7,8,9);
//    	numbers.stream().filter(number -> number%2 ==0).forEach(System.out::println);
//    	numbers.stream().map(number -> number *10).forEach(System.out::println);
//    	List<Integer> altNumbers = Arrays.asList(4,3,2,1);
//    	List<List<Integer>> listOfNumbers = Arrays.asList(numbers,altNumbers);
//    	listOfNumbers.stream().flatMap(list -> list.stream().filter(number -> number%2 ==1)).forEach(System.out::println);
//    	numbers.stream().distinct().forEach(System.out::println);
//    	numbers.stream().sorted().forEach(System.out::println);
//    	numbers.stream().sorted((a,b) -> b-a).forEach(System.out::println);
//    	numbers.stream().limit(3).forEach(System.out::println);
//    	numbers.stream().skip(3).forEach(System.out::println);
//    	numbers.stream().peek(number -> System.out.println("Processing: "+number)).filter(number -> number%2 == 0)
//    	.forEach(System.out::println);
    	
//    	Function<String,Integer> convertToInt = Integer::parseInt;
//    	System.out.println("converted string "+convertToInt.apply("7"));
    	
//    	String greetBCoder = "Hello! BCoders";
//    	Consumer<String> bCodersGreeting = System.out::println;
//    	bCodersGreeting.accept(greetBCoder);
    	
//    	List<String> techStacks = Arrays.asList("Angular", "Vue", "React");
//    	techStacks.stream().map(String::toUpperCase).forEach(ele -> System.out.println(ele));
//    	Supplier<StringBuilder> constructStringBuilder = StringBuilder::new;
//    	StringBuilder sb = constructStringBuilder.get();
//    	sb.append("Sample text");
//    	System.out.println("StringBuilder output "+sb);
    	
    }
    
    
}
