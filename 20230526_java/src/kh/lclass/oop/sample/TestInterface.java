package kh.lclass.oop.sample;

import java.awt.im.spi.InputMethod;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface TestInterface extends /*InputMethod,*/ Serializable{
	//interface에서는 interface만 extends 할 수 있다, class는 할 수 없음
	//interface 뒤에는 interface명만 올 수 있다
	//class뒤에는 interface 올 수 있다
	int MAXCNT = 10;
	public static final int MAXCNT2 = 10; 
	public void method1(); // 능력단위별 평가보기
	public String method2(); // 평가안내
	public int method3(int a, int b); // 평가리뷰
//	public int method3();
	
	/*
	int insertBoard(Car vo);
	int deleteBoard(Car vo);
	int updateBoard(Car vo);
	Car selectOne(int boardNo);
	Car[] selectList();
	Car[] selectListArr(String searchWord);
	List<Car> selectList(String searchWord);
	Car[] searchSelectBoard(String word);
	*/
}
