package com.javaweb.funding.potal.service;


import com.javaweb.funding.bean.Member;
import com.javaweb.funding.bean.Ticket;



public interface TicketService {

	Ticket getTicketByMemberId(Integer id);

	void saveTicket(Ticket ticket);

	void updatePstep(Ticket ticket);

	void updatePstepAndPiid(Ticket ticket);

	Member getMemberByPiid(String processInstanceId);


}
