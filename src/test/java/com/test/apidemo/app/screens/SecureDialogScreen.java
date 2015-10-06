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
public class SecureDialogScreen extends AbstractScreen {

    @AndroidFindBy(accessibility = "Show secure dialog")
    private WebElement secureDialogElement;

    @Autowired
    public SecureDialogScreen(AndroidDriver<?> driver) {
        super(driver);
    }

    public void getSecureDialog() {
        secureDialogElement.click();

    }
}
