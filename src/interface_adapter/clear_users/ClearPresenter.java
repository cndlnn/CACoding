package interface_adapter.clear_users;

// TODO Complete me

import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    public StringBuilder prepareSuccessView(ClearOutputData clearOutputData) {
        StringBuilder deletedUsers = new StringBuilder();
        for (String user : clearOutputData.getDeletedUsers()) {
            deletedUsers.append(user + "\n");
        }
        return deletedUsers;
    }
}
