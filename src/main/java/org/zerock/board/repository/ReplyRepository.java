package org.zerock.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.zerock.board.entity.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

    //특정 게시물 번호(bno)로 댓글을 삭제하는 기능
    @Modifying
    @Query("delete from Reply r where  r.board.bno =:bno")
    void deleteByBno(@Param("bno") Long bno);
}
