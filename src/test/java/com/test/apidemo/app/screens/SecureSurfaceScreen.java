package com.test.apidemo.app.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by priyankp.shah on 15/9/15.
 */
@Component
@Scope("cucumber-glue")
public class SecureSurfaceScreen extends AbstractScreen {
    @Autowired
    private SecureDialogScreen secureDialogScreen;

    @AndroidFindBy(accessibility = "Secure Dialog")
    private WebElement secureDialogElement;

    @Autowired
    public SecureSurfaceScreen(AndroidDriver<?> driver) {
        super(driver);
    }

    public SecureDialogScreen getSecureDialogScreen() {
        secureDialogElement.click();
        return secureDialogScreen;
    }
}
