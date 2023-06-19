package com.studyproject.board.service;

import com.studyproject.board.entity.Board;
import com.studyproject.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //컨트롤러로부터 DTO 전달받고 DAO(레포지토리)로 entity 전달
public class BoardService {

    @Autowired //의존성 주입
    private BoardRepository boardRepository;
    public void write(Board board) {
        boardRepository.save(board);
    } //레포지토리에 데이터 저장

    public List<Board> boardList() {
        return boardRepository.findAll(); //레포지토리에 있는 데이터 불러온다.
    }
}
