package model.persistance;

// Generated 29 juin 2010 01:06:24 by Hibernate Tools 3.2.4.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MessageMember generated by hbm2java
 */
public class MessageMember implements java.io.Serializable {

	private Integer idMessage;
	private Member memberByIdMemberSender;
	private Member memberByIdMember;
	private Date publishDate;
	private String body;
	private boolean deleted;
	private Set responseMessageMembers = new HashSet(0);

	public MessageMember() {
	}

	public MessageMember(Member memberByIdMemberSender, Member memberByIdMember) {
		this.memberByIdMemberSender = memberByIdMemberSender;
		this.memberByIdMember = memberByIdMember;
	}

	public MessageMember(Member memberByIdMemberSender,
			Member memberByIdMember, Date publishDate, String body,
			Set responseMessageMembers) {
		this.memberByIdMemberSender = memberByIdMemberSender;
		this.memberByIdMember = memberByIdMember;
		this.publishDate = publishDate;
		this.body = body;
		this.responseMessageMembers = responseMessageMembers;
	}

	public Integer getIdMessage() {
		return this.idMessage;
	}

	public void setIdMessage(Integer idMessage) {
		this.idMessage = idMessage;
	}

	public Member getMemberByIdMemberSender() {
		return this.memberByIdMemberSender;
	}

	public void setMemberByIdMemberSender(Member memberByIdMemberSender) {
		this.memberByIdMemberSender = memberByIdMemberSender;
	}

	public Member getMemberByIdMember() {
		return this.memberByIdMember;
	}

	public void setMemberByIdMember(Member memberByIdMember) {
		this.memberByIdMember = memberByIdMember;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Set getResponseMessageMembers() {
		return this.responseMessageMembers;
	}

	public void setResponseMessageMembers(Set responseMessageMembers) {
		this.responseMessageMembers = responseMessageMembers;
	}

}
