package com.ezen.myproject.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ezen.myproject.domain.BoardVO;
import com.ezen.myproject.repository.BoardDAO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO bdao;

	@Override
	public int register(BoardVO bvo) {
		log.info("register chaeak 2");
		return bdao.insert(bvo);
	}

	@Override
	public List<BoardVO> getPageList(BoardVO bvo) {
		log.info("list chaeak 2");
		return bdao.getList(bvo);
	}

	@Override
	public BoardVO getDetail(int bno) {
		log.info("detail cheak 2");
		return bdao.getDeatil(bno);
	}

	@Override
	public int modify(BoardVO bvo) {
		log.info("register chaeak 2");
		//수정할 때 들어가는 부당 2개 빼주기
		//read_count - 2
		int cnt = -2;
		//이 코드는 cnt라는 이름의 정수형 변수를 선언하고, -2 값을 할당하는 부분입니다.
		//이 변수는 조회 수를 감소시킬 값으로 사용됩니다.
		bdao.readcount(bvo.getBno(), cnt);
		//이 코드는 bdao라는 BoardDAO 객체의 readcount 메서드를 호출하여,
		//bno에 해당하는 게시판 글의 조회 수를 cnt만큼 감소시킵니다. 즉, 해당 글의 조회 수를 2 감소시키는 것입니다.
		return bdao.update(bvo);
		//이 코드는 bdao 객체의 update 메서드를 호출하여, bvo 객체에 저장된 정보를 사용하여 데이터베이스의 해당 게시판 글을 업데이트합니다. 
		//이는 해당 글을 수정하는 과정을 나타내며, 업데이트된 결과를 반환합니다.
	}
	
	
	
}
