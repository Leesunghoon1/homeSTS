package com.ezen.myproject.service;

import java.util.List;

import com.ezen.myproject.domain.BoardVO;

public interface BoardService{

	int register(BoardVO bvo);

	List<BoardVO> getPageList(BoardVO bvo);

	BoardVO getDetail(int bno);

	int modify(BoardVO bvo);

}
