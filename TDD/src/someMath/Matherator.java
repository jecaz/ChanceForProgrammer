package someMath;

public class Matherator implements Adder, Subtractor {

	
	/* Code which will first cause a failing test
	@Override
	public long subtract(long... operands) {
		
		return 0;
	}
	 */
	
	// This code present implementation that passes the test
	@Override
	public long subtract(long... operands) {
		long ret = operands[0];
		for(int i = 1; i < operands.length; i++){
			ret -= operands[i];
		}
		return ret;
	}
	
	@Override
	public long add(long... operands) {
		long ret = 0;
		for(long operand : operands){
			ret += operand;
		}
		return ret;
	}


}
