package com.studyproject.board.controller;

import com.studyproject.board.entity.Board;
import com.studyproject.board.service.BoardService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BoardController {

    @Autowired //의존성 주입
    private BoardService boardService;
    @GetMapping("board/write") //localhost:8080/board/write
    public String boardWriteForm() {
        return "boardwrite";
    }

    @PostMapping("board/writepro")
    public String boardWritePro(Board board){
        boardService.write(board); //BoardController에서 불러옴(레포지토리에 데이터 저장)
        return "";
    }

    @GetMapping("board/list")
    public String boardList(Model model){ //모델은 HashMap 형태를 가진다.(key, value)
        // => addAttribute : 해당 모델에 원하는 속성과 그에 대한 값을 주어 전달할 뷰에 데이터를 전달
        model.addAttribute("list", boardService.boardList());
        return "boardlist";
    }
}
