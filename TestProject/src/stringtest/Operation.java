package stringtest;

public class Operation {

	private String message;

	  public Operation(String message) {
	    this.message=message;
	  }

	  public char getFirst(){
	    return message.charAt(0);
	  }

	  public char getLast(){
	    int len=message.length();
	    return message.charAt(len-1);
	  }

	  public static void main(String[] args) {
	    Operation fl=new Operation("Here you go");
	    System.out.println("First Char is "+fl.getFirst());
	    System.out.println("First Char is "+fl.getLast());
	  }
	
}
