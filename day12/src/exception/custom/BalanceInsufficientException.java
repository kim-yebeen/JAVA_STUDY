package exception.custom;


//잔고 불충분 예외
//사용자 정의 예외 클래스를 만드려면 exception클래스나 runtimeexception 클래스를 상속한다.
public class BalanceInsufficientException extends RuntimeException {

	//일반적으로 사용자 정의 예외 클래스를 만들때는
	//기본 생성자와 예외원인 메세지를 받는 생성자를
	// 두 개 오버로딩해서 선언만 해준다.
	public BalanceInsufficientException() {};
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
