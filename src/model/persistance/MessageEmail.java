package model.persistance;

// Generated 29 juin 2010 01:06:24 by Hibernate Tools 3.2.4.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * MessageEmail generated by hbm2java
 */
public class MessageEmail implements java.io.Serializable {

	private Integer idMessage;
	private MessageEmail messageEmailByIdMessageRoots;
	private MessageEmail messageEmailByIdMessageFollow;
	private Member memberByIdMember;
	private Member memberByIdMemberSender;
	private FolderEmail folderEmail;
	private Date publishDate;
	private String body;
	private String subject;
	private Boolean isRead;
	
	private Set memberDeleted = new HashSet(0);
	private Set messageEmailsForIdMessageRoots = new HashSet(0);
	private Set messageEmailsForIdMessageFollow = new HashSet(0);

	public MessageEmail() {
	}

	public MessageEmail(Member memberByIdMember, Member memberByIdMemberSender) {
		this.memberByIdMember = memberByIdMember;
		this.memberByIdMemberSender = memberByIdMemberSender;
	}

	public MessageEmail(MessageEmail messageEmailByIdMessageRoots,
			MessageEmail messageEmailByIdMessageFollow,
			Member memberByIdMember, Member memberByIdMemberSender,
			FolderEmail folderEmail, Date publishDate, String body,
			String subject, Boolean isRead, Set messageEmailsForIdMessageRoots,
			Set messageEmailsForIdMessageFollow) {
		this.messageEmailByIdMessageRoots = messageEmailByIdMessageRoots;
		this.messageEmailByIdMessageFollow = messageEmailByIdMessageFollow;
		this.memberByIdMember = memberByIdMember;
		this.memberByIdMemberSender = memberByIdMemberSender;
		this.folderEmail = folderEmail;
		this.publishDate = publishDate;
		this.body = body;
		this.subject = subject;
		this.isRead = isRead;
		this.messageEmailsForIdMessageRoots = messageEmailsForIdMessageRoots;
		this.messageEmailsForIdMessageFollow = messageEmailsForIdMessageFollow;
	}

	public Integer getIdMessage() {
		return this.idMessage;
	}

	public void setIdMessage(Integer idMessage) {
		this.idMessage = idMessage;
	}

	public MessageEmail getMessageEmailByIdMessageRoots() {
		return this.messageEmailByIdMessageRoots;
	}

	public void setMessageEmailByIdMessageRoots(
			MessageEmail messageEmailByIdMessageRoots) {
		this.messageEmailByIdMessageRoots = messageEmailByIdMessageRoots;
	}

	public MessageEmail getMessageEmailByIdMessageFollow() {
		return this.messageEmailByIdMessageFollow;
	}

	public void setMessageEmailByIdMessageFollow(
			MessageEmail messageEmailByIdMessageFollow) {
		this.messageEmailByIdMessageFollow = messageEmailByIdMessageFollow;
	}

	public Member getMemberByIdMember() {
		return this.memberByIdMember;
	}

	public void setMemberByIdMember(Member memberByIdMember) {
		this.memberByIdMember = memberByIdMember;
	}

	public Member getMemberByIdMemberSender() {
		return this.memberByIdMemberSender;
	}
	
	

	public Set getMemberDeleted() {
		return memberDeleted;
	}

	public void setMemberDeleted(Set memberDeleted) {
		this.memberDeleted = memberDeleted;
	}

	public void setMemberByIdMemberSender(Member memberByIdMemberSender) {
		this.memberByIdMemberSender = memberByIdMemberSender;
	}

	public FolderEmail getFolderEmail() {
		return this.folderEmail;
	}

	public void setFolderEmail(FolderEmail folderEmail) {
		this.folderEmail = folderEmail;
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

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Boolean getIsRead() {
		return this.isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	public Set getMessageEmailsForIdMessageRoots() {
		return this.messageEmailsForIdMessageRoots;
	}

	public void setMessageEmailsForIdMessageRoots(
			Set messageEmailsForIdMessageRoots) {
		this.messageEmailsForIdMessageRoots = messageEmailsForIdMessageRoots;
	}

	public Set getMessageEmailsForIdMessageFollow() {
		return this.messageEmailsForIdMessageFollow;
	}

	public void setMessageEmailsForIdMessageFollow(
			Set messageEmailsForIdMessageFollow) {
		this.messageEmailsForIdMessageFollow = messageEmailsForIdMessageFollow;
	}

}
