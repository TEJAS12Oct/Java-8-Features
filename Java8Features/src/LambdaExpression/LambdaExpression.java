package LambdaExpression;

import java.util.Iterator;

public class LambdaExpression {

	public static void main(String[] args) {

		FuncInterface Fobj = (int y) -> System.out.println(2 * y);
		Fobj.abstractFun(5);
	}

}

interface FuncInterface {

	void abstractFun(int y);

}
