package geurime.api.service;

import geurime.database.entity.Board;
import geurime.database.enums.BoardType;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface BoardService {
    List<Board.BoardTitleResponse> readAllTitle(Integer page, Integer size);
    Board.BoardInfoResponse readBoardDetail(Long boardId);
    List<Board.BoardTitleResponse> readTitleByCategory(Integer page, Integer size, String stringBoardType);
    List<Board.BoardTitleResponse> readTitleBySearch(Integer page, Integer size, String stringBoardType, String keyword);
    Long createBoard(Board.BoardPostRequest request);
    Long updateBoard(Long userId, Board.BoardPutRequest request);
    Boolean deleteBoard(Long userId, Long boardId);
}
