package ch02_pjt_01;

public class CalAssembler {
	MyCalculator calculator;
	CalAdd calAdd;
	CalSub calSub;
	CalMul calMul;
	CalDiv calDiv;
	
	public CalAssembler() {
		calculator = new MyCalculator();
		calAdd = new CalAdd();
		calSub = new CalSub();
		calMul = new CalMul();
		calDiv = new CalDiv();
		
		assemble();
	}
	
	public void assemble() {
		calculator.calculate(10, 5, new CalAdd());
		calculator.calculate(10, 5, new CalSub());
		calculator.calculate(10, 5, new CalMul());
		calculator.calculate(10, 5, new CalDiv());
	}
}
