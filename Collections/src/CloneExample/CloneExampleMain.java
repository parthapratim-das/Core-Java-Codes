package CloneExample;

public class CloneExampleMain {

	public static void main(String[] args) {
		
		BookStore myBookStore = new BookStore();
		System.out.println(myBookStore);
		myBookStore.setStoreName("Star Mark");
		myBookStore.loadBooks();
		System.out.println(myBookStore);

	}

}
