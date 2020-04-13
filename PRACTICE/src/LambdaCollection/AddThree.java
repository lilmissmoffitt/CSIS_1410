package LambdaCollection;

import java.util.function.Function;

public class AddThree implements Function<Integer, Integer>{

	@Override
	public Integer apply(Integer n) {
		return n + 3;
	}
	
	

}
