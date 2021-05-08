package eCommerceExample;

import eCommerceExample.business.concretes.AuthManager;
import eCommerceExample.business.concretes.UserManager;
import eCommerceExample.core.JGoogleManagerAdapter;
import eCommerceExample.dataAccess.concretes.InMemoryUserDao;
import eCommerceExample.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		
		InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
		AuthManager authManager = new AuthManager(new UserManager(inMemoryUserDao,new JGoogleManagerAdapter()));
		
		
		User meryem = new User(2,"Meryem","Þehitoðlu","meryemsehitoglu@gmail.com","123456",true);
		User serra = new User (2,"Serra","Kara","serra@gmail.com","456789",true);
		
		
		authManager.register(meryem);
		
	
		UserManager userManager=new UserManager(inMemoryUserDao,new JGoogleManagerAdapter());
		userManager.update(serra);
		//userManager.delete(1);
		userManager.getAll();
		

	}

}
