package LambdaCollection;

import java.util.function.Function;

public class MinusTwo implements Function<Integer, Integer>{
	
	@Override
	public Integer apply(Integer n) {
		return n - 2;
	}
}
