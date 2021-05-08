package eCommerceExample.core;


import eCommerceExample.jGoogle.JGoogleManager;

public class JGoogleManagerAdapter implements EmailService{

	private JGoogleManager jGoogleManager;
	

	
	public JGoogleManagerAdapter() {
		super();
		this.jGoogleManager = new JGoogleManager();
	}



	@Override
	public void send(String email, String message) {
		
		jGoogleManager.send(email, message);
		
	}

	
}
