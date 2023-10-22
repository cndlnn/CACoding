package use_case.clear_users;

// TODO Complete me

import entity.UserFactory;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;
    final UserFactory userFactory;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary, UserFactory userFactory) {
        this.userDataAccessObject = clearUserDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
        this.userFactory = userFactory;
    }

    public StringBuilder execute(ClearInputData clearInputData){
        ArrayList<String> deletedUsers = userDataAccessObject.clearAll();

        ClearOutputData clearOutputData = new ClearOutputData(deletedUsers);
        return userPresenter.prepareSuccessView(clearOutputData);
    }
}
