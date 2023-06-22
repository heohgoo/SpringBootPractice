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
    } //레포지토리에 데이터 저장, 글 작성 처리

    public List<Board> boardList() {
        return boardRepository.findAll();
    } //게시글 리스트 처리

    public Board boardView(Integer id) {
        return boardRepository.findById(id).get();
    } // 특정 게시글 불러오기

    public void boardDelete(Integer id) {
        boardRepository.deleteById(id);
    } // 특정 게시글 삭제
}
