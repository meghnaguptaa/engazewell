package com.engazewell.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.engazewell.pages.UploadNewCandidateProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class UploadNewCandidateProfile extends DriverFactory {
UploadNewCandidateProfilePage uploadNewCandidateProfilePage = new UploadNewCandidateProfilePage(driver);
@Given("the user is in the Profile section")
public void the_user_is_in_the_profile_section() {
uploadNewCandidateProfilePage.navigateToProfileSection();
}
@When("the user clicks on the upload (cloud) icon")
public void the_user_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the user browses and selects a valid candidate profile file {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file(String candidateProfileFile) {
uploadNewCandidateProfilePage.browseAndSelectFile(candidateProfileFile);
}
@When("the user clicks on the Upload button")
public void the_user_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the user waits for the upload process to complete")
public void the_user_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
}
@Then("a success confirmation message is displayed to the user")
public void a_success_confirmation_message_is_displayed_to_the_user() {
uploadNewCandidateProfilePage.isSuccessMessageDisplayed();
}
@Then("the system displays an error message indicating the file type is not supported")
public void the_system_displays_an_error_message_indicating_the_file_type_is_not_supported() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@Then("the system should display an error message indicating the file exceeds the maximum size limit")
public void the_system_should_display_an_error_message_indicating_the_file_exceeds_the_maximum_size_limit() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@Then("an error message is displayed indicating that no file was selected")
public void an_error_message_is_displayed_indicating_that_no_file_was_selected() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@Then("an error message should be displayed indicating a network failure occurred")
public void an_error_message_should_be_displayed_indicating_a_network_failure_occurred() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@Then("the user should see an error message indicating the upload process timed out")
public void the_user_should_see_an_error_message_indicating_the_upload_process_timed_out() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@Then("an error message is displayed indicating the file is corrupted and cannot be uploaded")
public void an_error_message_is_displayed_indicating_the_file_is_corrupted_and_cannot_be_uploaded() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@Then("the upload process should complete")
public void the_upload_process_should_complete() {
uploadNewCandidateProfilePage.isUploadProcessComplete();
}

@Given("the user browses selects a valid candidate profile file with utf-8 encoding")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_utf8_encoding() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileWithUTF8Encoding();
}
@Given("the user browses selects an unsupported file type {string}")
public void the_user_browses_selects_an_unsupported_file_type(String fileType) {
uploadNewCandidateProfilePage.selectUnsupportedFileType(fileType);
}
@Given("the user browses selects the {string}")
public void the_user_browses_selects_the(String fileName) {
uploadNewCandidateProfilePage.selectFile(fileName);
}
@Then("the user observes a success confirmation message")
public void the_user_observes_a_success_confirmation_message() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@Given("the user browses selects a valid candidate profile file with text in spanish")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_text_in_spanish() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileWithTextInSpanish();
}
@Given("the user waits for the upload to complete confirms success")
public void the_user_waits_for_the_upload_to_complete_confirms_success() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
uploadNewCandidateProfilePage.isUploadSuccessful();
}
@Then("the upload process does not complete successfully")
public void the_upload_process_does_not_complete_successfully() {
uploadNewCandidateProfilePage.isUploadSuccessful();
}
@Given("i wait for the upload process to complete")
public void i_wait_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadProcessToComplete();
}
@Given("the user does not select any file")
public void the_user_does_not_select_any_file() {
uploadNewCandidateProfilePage.doesNotSelectAnyFile();
}
@When("the user clicks on the upload icon")
public void the_user_clicks_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@Given("the user browses selects a valid candidate profile file")
public void the_user_browses_selects_a_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFile();
}
@Given("the user browses selects a valid candidate profile file with a very short filename")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_a_very_short_filename() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileWithShortFilename();
}
@Given("i browse select a valid candidate profile file with special characters in the filename")
public void i_browse_select_a_valid_candidate_profile_file_with_special_characters_in_the_filename() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileWithSpecialCharacters();
}
@Given("the user browses selects a file that exceeds the size limit")
public void the_user_browses_selects_a_file_that_exceeds_the_size_limit() {
uploadNewCandidateProfilePage.selectFileExceedingSizeLimit();
}
@Then("the upload process does not initiate")
public void the_upload_process_does_not_initiate() {
uploadNewCandidateProfilePage.isUploadInitiated();
}
@Given("the user browses selects a valid candidate profile file of 2mb")
public void the_user_browses_selects_a_valid_candidate_profile_file_of_2mb() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileOf2MB();
}
@Given("the user browses selects a valid candidate profile file with a {string} extension")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_a_extension(String extension) {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileWithExtension(extension);
}
@Given("the user browses selects {string}")
public void the_user_browses_selects(String fileName) {
uploadNewCandidateProfilePage.selectFile(fileName);
}
@Then("the user should see a success confirmation message")
public void the_user_should_see_a_success_confirmation_message() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@When("i clickElement on the upload icon")
public void i_click_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@Given("the user browses selects a corrupted candidate profile file")
public void the_user_browses_selects_a_corrupted_candidate_profile_file() {
uploadNewCandidateProfilePage.selectCorruptedCandidateProfileFile();
}
@Given("the user browses selects a valid candidate profile file in {string} format")
public void the_user_browses_selects_a_valid_candidate_profile_file_in_format(String format) {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileInFormat(format);
}
@Given("the user browses selects a valid candidate profile file with spaces in the filename")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_spaces_in_the_filename() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileWithSpacesInFilename();
}
@Then("a success confirmation message should be displayed")
public void a_success_confirmation_message_should_be_displayed() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@Then("the upload process times out")
public void the_upload_process_times_out() {
uploadNewCandidateProfilePage.isUploadTimedOut();
}
@When("the user clicks the upload button")
public void the_user_clicks_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@Then("the upload process should not complete successfully")
public void the_upload_process_should_not_complete_successfully() {
uploadNewCandidateProfilePage.isUploadSuccessful();
}
@When("i clickElement on the upload button")
public void i_click_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@Given("the network failure is simulated")
public void the_network_failure_is_simulated() {
uploadNewCandidateProfilePage.simulateNetworkFailure();
}
}