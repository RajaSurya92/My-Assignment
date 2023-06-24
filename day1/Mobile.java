package week1.day1;

public class Mobile { 
	
  public void sendSms() {
	System.out.println("Hello"); 

}
 protected void allowVoicecall() {
	System.out.println("access to voice call");

} 
 private void Video() {
	System.out.println("Allow to take video");

}
	public static void main(String[] args) {
		Mobile obj= new Mobile();
		obj.sendSms();
		obj.allowVoicecall();
		obj.Video();

	}

}
