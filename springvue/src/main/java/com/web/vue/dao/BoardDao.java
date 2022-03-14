package com.web.vue.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.vue.vo.Board;
import com.web.vue.vo.BoardSch;

// com.web.vue.dao.BoardDao
@Mapper
public interface BoardDao {
	public int getTot(BoardSch sch);
	public List<Board> getList(BoardSch sch);
}
