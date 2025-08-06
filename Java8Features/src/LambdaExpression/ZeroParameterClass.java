package LambdaExpression;

public class ZeroParameterClass {

	public static void main(String[] args) {
		ZeroParameter zeroParameterLambda = () -> System.out.println("Zero Parameter");
		zeroParameterLambda.display();
	}

}

interface ZeroParameter {
	public void display();
}