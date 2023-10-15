package com.ezen.myproject.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ezen.myproject.domain.BoardVO;

public interface BoardDAO {

	int insert(BoardVO bvo);

	List<BoardVO> getList(BoardVO bvo);

	BoardVO getDeatil(int bno);

	int readcount(@Param("bno")int bno, @Param("cnt") int cnt);
	//이 부분은 MyBatis에서 파라미터를 SQL 쿼리에 매핑하기 위한 어노테이션입니다. 
	//@Param 어노테이션을 사용하여 메소드의 인자인 bno를 SQL 쿼리에서 bno 매개변수로 사용할 수 있도록 지정합니다. 
	//bno은 게시판 글의 고유 번호를 나타냅니다.
	//어노테이션을 사용하여 메소드의 인자인 cnt를 SQL 쿼리에서 cnt 매개변수로 사용할 수 있도록 지정합니다. cnt는 조회 수를 증가 또는 감소시키기 위한 값으로, 
	//위에서 설명한 것처럼 2나 -2와 같은 값을 가질 수 있습니다.
	
	int update(BoardVO bvo);
	
}
