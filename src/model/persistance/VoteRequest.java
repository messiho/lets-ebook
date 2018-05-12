package model.persistance;

// Generated 29 juin 2010 01:06:24 by Hibernate Tools 3.2.4.GA

/**
 * VoteRequest generated by hbm2java
 */
public class VoteRequest implements java.io.Serializable {

	private Integer idVoteRequest;
	private Request request;
	private String ip;
	private Double rating;
	private Integer idMember;

	public VoteRequest() {
	}

	public VoteRequest(Request request) {
		this.request = request;
	}

	public VoteRequest(Request request, String ip, Double rating,
			Integer idMember) {
		this.request = request;
		this.ip = ip;
		this.rating = rating;
		this.idMember = idMember;
	}

	public Integer getIdVoteRequest() {
		return this.idVoteRequest;
	}

	public void setIdVoteRequest(Integer idVoteRequest) {
		this.idVoteRequest = idVoteRequest;
	}

	public Request getRequest() {
		return this.request;
	}

	public void setRequest(Request request) {
		this.request = request;
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

	public Integer getIdMember() {
		return this.idMember;
	}

	public void setIdMember(Integer idMember) {
		this.idMember = idMember;
	}

}
