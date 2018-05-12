package model.persistance;

// Generated 29 juin 2010 01:06:24 by Hibernate Tools 3.2.4.GA

/**
 * VoteMember generated by hbm2java
 */
public class VoteMember implements java.io.Serializable {

	private Integer idVoteRequest;
	private Member member;
	private String ip;
	private Double rating;

	public VoteMember() {
	}

	public VoteMember(Member member) {
		this.member = member;
	}

	public VoteMember(Member member, String ip, Double rating) {
		this.member = member;
		this.ip = ip;
		this.rating = rating;
	}

	public Integer getIdVoteRequest() {
		return this.idVoteRequest;
	}

	public void setIdVoteRequest(Integer idVoteRequest) {
		this.idVoteRequest = idVoteRequest;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Double getRating() {
		return this.rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

}
