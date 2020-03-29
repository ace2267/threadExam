package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamTest1 {

	public static void main(String[] args) {
		
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> stream = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3); // 1~2 요소 [b, c]
		
		System.out.println(stream.toString());
		

		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> stream2 = list.stream();
		Stream<String> parallelStream2 = list.parallelStream(); // 병렬 처리 스트림
		
		List<String> names = Arrays.asList("jeong", "pro", "jdk", "java");
		names.parallelStream().map((x) ->{return x.concat("s");}).forEach(x -> System.out.println(x));

		List<Integer> ages = Arrays.asList(1,2,3,4,5,6,7,8,9);
		ages.stream().filter(x -> x>3).limit(3).forEach(x -> System.out.println(x));

		
	}

}
