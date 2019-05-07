package com.example.test;

import com.qaguild.annotations.trail.*;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

@Epic("Login")
public class TestLogin {

    @Test
    @Jira(id = "Jira-1")
    @CaseId(10)
    public void userCanLoginWithValidCredentials() {
//     open(Login.page)
//         .enterUsername("demo")
//         .enterPassword("123")
//         .pressEnter()
//
//     assert(at(MainPage.class)).userName.shouldBe("demo");
    }

    @Test
    @Jira(id = "Jira-1", manual = {
            @Case(title = "Inputted password is masked by bullets"),
            @Case(title = "Masked password can not be copied")
    })
    @CaseId(11)
    public void userCanNotLoginWithInValidCredentials() {
//     open(Login.page)
//         .enterUsername("demo")
//         .enterPassword("123")
//         .pressEnter()
//
//     assert(at(MainPage.class)).userName.shouldBe("demo");
    }

    @Test
    @Jira(id = "Jira-1")
    public void userShouldSeeTimerAfter3WrongLoginAttempts() {
        fail("Expected: [BAD CREDENTIALS] \n Actual: [Wrong login]");
    }
}
