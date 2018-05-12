package model.persistance;

// Generated 29 juin 2010 01:06:24 by Hibernate Tools 3.2.4.GA

/**
 * OrderBook generated by hbm2java
 */
public class OrderBook implements java.io.Serializable {

	private Integer idOrder;
	private Book book;
	private OrderCustomer orderCustomer;
	private double price;
	private Boolean isTreated;
	private String linkFileOrder;
	private String name;
	private String label;
	private String linkImageOrder;
	
	public OrderBook() {
	}

	public OrderBook(Book book) {
		this.book = book;
	}

	public OrderBook(Book book, OrderCustomer orderCustomer, double price,
			Boolean isTreated, String linkFileOrder, String name, String label) {
		this.book = book;
		this.orderCustomer = orderCustomer;
		this.price = price;
		this.isTreated = isTreated;
		this.linkFileOrder = linkFileOrder;
		this.name = name;
		this.label = label;
	}
	



	public Integer getIdOrder() {
		return this.idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public OrderCustomer getOrderCustomer() {
		return this.orderCustomer;
	}

	public void setOrderCustomer(OrderCustomer orderCustomer) {
		this.orderCustomer = orderCustomer;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Boolean getIsTreated() {
		return this.isTreated;
	}

	public void setIsTreated(Boolean isTreated) {
		this.isTreated = isTreated;
	}

	public String getLinkFileOrder() {
		return this.linkFileOrder;
	}

	public void setLinkFileOrder(String linkFileOrder) {
		this.linkFileOrder = linkFileOrder;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLinkImageOrder() {
		return linkImageOrder;
	}

	public void setLinkImageOrder(String linkImageOrder) {
		this.linkImageOrder = linkImageOrder;
	}
	
	

}
