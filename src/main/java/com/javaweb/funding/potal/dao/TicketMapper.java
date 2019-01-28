package com.javaweb.funding.potal.dao;


import java.util.List;
import java.util.Map;

import com.javaweb.funding.bean.Member;
import com.javaweb.funding.bean.Ticket;

public interface TicketMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ticket record);

    Ticket selectByPrimaryKey(Integer id);

    List<Ticket> selectAll();

    int updateByPrimaryKey(Ticket record);

	Ticket queryMebmerlogin(Map<String, Object> paramMap);

	Ticket getTicketByMemberId(Integer id);

	void saveTicket(Ticket ticket);

	void updatePstep(Ticket ticket);

	void updatePstepAndPiid(Ticket ticket);

	Member getMemberByPiid(String processInstanceId);

	

	
}