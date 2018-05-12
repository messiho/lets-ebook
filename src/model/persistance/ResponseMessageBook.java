package model.persistance;

// Generated 29 juin 2010 01:06:24 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * ResponseMessageBook generated by hbm2java
 */
public class ResponseMessageBook implements java.io.Serializable {

	private Integer idMessage;
	private Member member;
	private MessageBook messageBook;
	private Date publishDate;
	private String body;

	public ResponseMessageBook() {
	}

	public ResponseMessageBook(Member member) {
		this.member = member;
	}

	public ResponseMessageBook(Member member, MessageBook messageBook,
			Date publishDate, String body) {
		this.member = member;
		this.messageBook = messageBook;
		this.publishDate = publishDate;
		this.body = body;
	}

	public Integer getIdMessage() {
		return this.idMessage;
	}

	public void setIdMessage(Integer idMessage) {
		this.idMessage = idMessage;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public MessageBook getMessageBook() {
		return this.messageBook;
	}

	public void setMessageBook(MessageBook messageBook) {
		this.messageBook = messageBook;
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
