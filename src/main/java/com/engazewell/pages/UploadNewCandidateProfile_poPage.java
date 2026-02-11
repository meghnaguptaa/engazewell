package com.backend.pages;

import com.utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadNewCandidateProfile_poPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "uploadIcon")
    private WebElement uploadIcon;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    @FindBy(id = "profileSection")
    private WebElement profileSection;

    @FindBy(id = "metadataSection")
    private WebElement metadataSection;

    @FindBy(id = "fileInputId")
    private WebElement fileInput;

    @FindBy(id = "uploadStatusId")
    private WebElement uploadStatus;

    @FindBy(id = "cloudIconId")
    private WebElement cloudIcon;

    public UploadNewCandidateProfile_poPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickUploadIcon() {
        try {
            elementUtils.clickElement(uploadIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadButton() {
        try {
            elementUtils.clickElement(uploadButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isUploadSuccessMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(successMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    ublic void verifyProfilesListed() {
        try {
            Assert.assertTrue("Profiles are not listed", elementUtils.isElementDisplayed(profileSection));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ublic void verifyMetadataDisplayedCorrectly() {
        try {
            Assert.assertTrue("Metadata is not displayed correctly", elementUtils.isElementDisplayed(metadataSection));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ublic void validateUploadSuccess(String candidateProfile) {
        try {
            String actualMessage = elementUtils.getElementText(successMessage);
            String expectedMessage = candidateProfile + " uploads successfully.";
            Assert.assertEquals(expectedMessage, actualMessage, "Upload confirmation message does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForUploadProcessToComplete() {
        try {
            // Implement waiting logic here if necessary
            // For example, using WebDriverWait to wait for uploadStatus to be displayed
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void browseAndSelectCandidateProfileFile(String filePath) {
        try {
            elementUtils.clearAndSendKeys(fileInput, filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadCloudIcon() {
        try {
            elementUtils.clickElement(cloudIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isAllFilesUploadedSuccessfully() {
        try {
            // Logic to check if all files have been uploaded successfully
            return true; // Placeholder for actual logic
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areProfilesListed() {
        try {
            return elementUtils.isElementDisplayed(profileSection);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isSuccessConfirmationMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(successMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}