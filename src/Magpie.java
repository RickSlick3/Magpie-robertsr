/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
    // INSTANCE VARIABLES
    private boolean knowsAboutPets = false;
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
            statement = statement.trim().toLowerCase();
            if (statement.length() == 0) return "Sprechen sie englisch?";
		
                String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
                else if (statement.indexOf("dog") >= 0
                                || statement.indexOf("cat") >= 0){
                        response = "Tell me more about your pets.";
                // TODO: prevent repeat comment with a toggle
                }
                else if (statement.indexOf("adiletta") >= 0
                                || statement.indexOf("mr. adiletta") >= 0){
                        response = "Woah, mr. adiletta? I hear he is a really good programmer!";
                }
                else if (statement.indexOf("rick roll") >= 0
                                || statement.indexOf("roll me") >= 0){
                        response = "never gonna gove you up, never gonna let you down, never gonna run around and desert you, never gonna make you cry, never gonna say goodbye, never gonna tell a lie, and hurt you";
                }
                else if (statement.indexOf("joe") >= 0){
                        response = "Joe? Joe Mama???";
                }
                else if (statement.indexOf("goodbye") >= 0
                                || statement.indexOf("seeya") >= 0){
                        response = "Ha you're never allowed to leave... Please.";
                }
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES =6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "haha. whatever you say.";
		}
                else if (whichResponse == 5)
		{
			response = "somebody once told me the world was gonna roll me.";
		}
		return response;
	}
}
