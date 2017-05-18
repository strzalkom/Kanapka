package pl.sdacademy.lambda;

public class MainWithLambda {
	public static void main(String[] args) {
		ISumInt object = (n) -> SumInt.calculateSum(n);
			int sum = object.sum(5); 
			System.out.println("sum=" + sum);
		}
	}


