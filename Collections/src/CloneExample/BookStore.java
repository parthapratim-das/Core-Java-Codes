package CloneExample;

import java.util.*;

public class BookStore {
	
	private String storeName;
	private List<Book> books = new ArrayList<>();
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadBooks(){
		
		for(int i=1;i<=10;i++){
			Book b = new Book();
			b.setBid(i);
			b.setBname("Book"+i);
			this.getBooks().add(b);
		}
		//return bk;
	}
}
