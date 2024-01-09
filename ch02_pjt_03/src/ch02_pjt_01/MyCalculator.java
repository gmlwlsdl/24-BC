package ch02_pjt_01;

public class MyCalculator {

	public void calculate(int fNum, int sNum, ICalculator calculator) {
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
	
	public void calAdd(int i, int j, CalAdd calAdd) {
		// TODO Auto-generated method stub
		int value = calAdd.doOperation(i, j);
		System.out.println("result : " + value);
	}

	public void calSub(int i, int j, CalSub calSub) {
		// TODO Auto-generated method stub
		int value = calSub.doOperation(i, j);
		System.out.println("result : " + value);
	}

	public void calMul(int i, int j, CalMul calMul) {
		// TODO Auto-generated method stub
		int value = calMul.doOperation(i, j);
		System.out.println("result : " + value);
	}

	public void calDiv(int i, int j, CalDiv calDiv) {
		// TODO Auto-generated method stub
		int value = calDiv.doOperation(i, j);
		System.out.println("result : " + value);
	}

}
