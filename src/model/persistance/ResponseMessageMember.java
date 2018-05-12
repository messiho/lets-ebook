package model.persistance;

// Generated 29 juin 2010 01:06:24 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * ResponseMessageMember generated by hbm2java
 */
public class ResponseMessageMember implements java.io.Serializable {

	private Integer idMessage;
	private MessageMember messageMember;
	private Member member;
	private Date publishDate;
	private String body;

	public ResponseMessageMember() {
	}

	public ResponseMessageMember(Member member) {
		this.member = member;
	}

	public ResponseMessageMember(MessageMember messageMember, Member member,
			Date publishDate, String body) {
		this.messageMember = messageMember;
		this.member = member;
		this.publishDate = publishDate;
		this.body = body;
	}

	public Integer getIdMessage() {
		return this.idMessage;
	}

	public void setIdMessage(Integer idMessage) {
		this.idMessage = idMessage;
	}

	public MessageMember getMessageMember() {
		return this.messageMember;
	}

	public void setMessageMember(MessageMember messageMember) {
		this.messageMember = messageMember;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
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

}
