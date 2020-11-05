package extendsExam;

public class ExtendsExam {

	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		
		ctv.power(); // false -> true, 상속받은 메서드 사용
		System.out.println(ctv.power);
		
		ctv.channerUp();
		System.out.println(ctv.channel); // 1, 상속받는 메서드 사용

	}

}

// 상속 관계, captionTv는 tv다. (상속 받는 > 상속 하는)
class Tv{
	
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channerUp() {++channel;}
	
}

class CaptionTv extends Tv{
	
	boolean caption;
	void disCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

// 포함 관계, 원은 점을 가지고 있다.
class Circle{
	
	Point p = new Point();
	int r;
	
}

class Point{
	int x;
	int y;
	
	
}

