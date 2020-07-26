package businesslogic;


class  RegistrationValidation{
	public boolean checkUserDetails(String email, String password, String confirmPassword) {
		validPassword(password,confirmPassword);
		validEmail(email);
		if(validPassword(password,confirmPassword) && validEmail(email) )
		{
			return true;	
		}
		else
		{
			return false;
		}
		
		
	}
	private boolean validPassword(String password, String confirmPassword) {
		String regex="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,20}";
		if(password.matches(regex))
	       {
	         return true;
	       }
	       else
	         {
	         return false;
	       }
		
	}
	private boolean validEmail(String email) {
		String regex="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@_-])(?=\\S+$)";
		if(email.matches(regex))
	       {
	         return true;
	       }
	       else
	         {
	         return false;
	       }
		
		
		
		
	}

}

//Email should pass the following validations*
//7.*Email can contain alphanumeric value*
//8.*Allowed special characters - _, @, .[at, underscore, dot]*
//9.*Email should not be empty.*
//10.*Password should pass the following constraints*
//11.*Password field should not be empty.*
//12.*Password and confirm password should match.*
//13.*Must contain atleast 8 characters and atmost 20 characters.*
//14.*Must have atleast one uppercase letter, 1 lowercase letter and 1 number.*


