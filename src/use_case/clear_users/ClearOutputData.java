package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {

    private final ArrayList<String> deletedUsers;

    public ClearOutputData(ArrayList<String> deletedUsers) {
        this.deletedUsers = deletedUsers;
    }

    public ArrayList<String> getDeletedUsers() {
        return deletedUsers;
    }
}
