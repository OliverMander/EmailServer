public class SearchAndSort {
    public static String getNameFromAccounts(String id) {
        boolean found = false;
        int i = 0;
        for (i = 0; i < Globals.accounts.length && !found; i++) {
            found = id.equals(Globals.accounts[i].substring(0, Globals.CLIENT_ID_LEN));
        }
        if (found)
            return Globals.accounts[i - 1].substring(Globals.CLIENT_ID_LEN);
        else
            return "Unknown account name";
    }
}
