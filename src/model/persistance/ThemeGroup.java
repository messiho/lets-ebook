package model.persistance;

// Generated 29 juin 2010 01:06:24 by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;

/**
 * ThemeGroup generated by hbm2java
 */
public class ThemeGroup implements java.io.Serializable {

	private Integer idGroup;
	private Member member;
	private String name;
	private String description;
	private Boolean allowUploadBook;
	private String status;
	private String imageUrl;
	private boolean deleted;
	private Set books = new HashSet(0);
	private Set members = new HashSet(0);
	private Set messageGroups = new HashSet(0);
	private Set themes = new HashSet(0);
	private Set requests = new HashSet(0);

	public ThemeGroup() {
	}

	public ThemeGroup(Member member) {
		this.member = member;
	}

	public ThemeGroup(Member member, String name, String description,
			Boolean allowUploadBook, String status, String imageUrl, Set books,
			Set members, Set messageGroups, Set themes, Set requests) {
		this.member = member;
		this.name = name;
		this.description = description;
		this.allowUploadBook = allowUploadBook;
		this.status = status;
		this.imageUrl = imageUrl;
		this.books = books;
		this.members = members;
		this.messageGroups = messageGroups;
		this.themes = themes;
		this.requests = requests;
	}

	public Integer getIdGroup() {
		return this.idGroup;
	}

	public void setIdGroup(Integer idGroup) {
		this.idGroup = idGroup;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getAllowUploadBook() {
		return this.allowUploadBook;
	}

	public void setAllowUploadBook(Boolean allowUploadBook) {
		this.allowUploadBook = allowUploadBook;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
	public Set getBooks() {
		return this.books;
	}

	public void setBooks(Set books) {
		this.books = books;
	}

	public Set getMembers() {
		return this.members;
	}

	public void setMembers(Set members) {
		this.members = members;
	}

	public Set getMessageGroups() {
		return this.messageGroups;
	}

	public void setMessageGroups(Set messageGroups) {
		this.messageGroups = messageGroups;
	}

	public Set getThemes() {
		return this.themes;
	}

	public void setThemes(Set themes) {
		this.themes = themes;
	}

	public Set getRequests() {
		return this.requests;
	}

	public void setRequests(Set requests) {
		this.requests = requests;
	}

}