public class EmailClient {
    public static void main(String[] args) {
	// initialize boxMessages list

	for (int i = 0; i < Globals.boxMessages.length; i++) {
	    Globals.boxMessages[i] = Globals.EMPTY_CLIENT_MESSAGE;
	}
		
	int error = MailTransfers.EmailClientRequestAllMail(Globals.RECEIVER_ID);
	//System.out.println("Done");
	if (error == Globals.PROCESS_OK) {
	    EmailClientGUI gui = new EmailClientGUI();
	}
    }
}
