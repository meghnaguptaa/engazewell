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
@Given("the user is on the Profile section")
public void the_user_is_on_the_profile_section() {
uploadNewCandidateProfilePage.navigateToProfileSection();
}
// DUPLICATE: @When("the user clicks on the upload (cloud) icon")
public void the_user_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
// DUPLICATE: @When("the user browses and selects a valid candidate profile file {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file(String validCandidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(validCandidateProfileFile);
}
// DUPLICATE: @When("the user clicks on the Upload button")
public void the_user_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
// DUPLICATE: @When("the user waits for the upload process to complete")
public void the_user_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
}
@Then("the user should see a success confirmation message indicating the profile was uploaded successfully")
public void the_user_should_see_a_success_confirmation_message() {
uploadNewCandidateProfilePage.isUploadSuccessMessageDisplayed();
}
@When("the user browses and selects the {string}")
public void the_user_browses_and_selects_the_candidate_profile_file(String candidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidateProfileFile);
}
@Then("{string} uploads successfully with a confirmation message")
public void candidate_profile_uploads_successfully_with_a_confirmation_message(String candidateProfileFile) {
uploadNewCandidateProfilePage.isUploadSuccessMessageDisplayed();
}
@Then("both profiles are listed in the Profile section")
public void both_profiles_are_listed_in_the_profile_section() {
uploadNewCandidateProfilePage.areProfilesListed();
}
@When("the user browses and selects a candidate profile file in a supported format {string}")
public void the_user_browses_and_selects_a_candidate_profile_file_in_a_supported_format(String candidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidateProfileFile);
}
@When("the user browses and selects a candidate profile file with a long filename {string}")
public void the_user_browses_and_selects_a_candidate_profile_file_with_a_long_filename(String longFilename) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(longFilename);
}
@Then("the confirmation message should be displayed indicating the profile was uploaded successfully")
public void the_confirmation_message_should_be_displayed() {
uploadNewCandidateProfilePage.isUploadSuccessMessageDisplayed();
}
@When("the recruiter browses and selects a candidate profile file with metadata {string}")
public void the_recruiter_browses_and_selects_a_candidate_profile_file_with_metadata(String candidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidateProfileFile);
}
@Then("the metadata should be displayed correctly in the Profile section")
public void the_metadata_should_be_displayed_correctly() {
uploadNewCandidateProfilePage.isMetadataDisplayedCorrectly();
}
@When("the user browses and selects a candidate profile file with a valid extension {string}")
public void the_user_browses_and_selects_a_candidate_profile_file_with_a_valid_extension(String fileExtension) {
uploadNewCandidateProfilePage.selectCandidateProfileFileWithExtension(fileExtension);
}
@When("the user browses and selects multiple valid candidate profile files {string}")
public void the_user_browses_and_selects_multiple_valid_candidate_profile_files(String candidateProfileFiles) {
uploadNewCandidateProfilePage.selectMultipleCandidateProfileFiles(candidateProfileFiles);
}
@Then("the upload process should complete successfully for each file")
public void the_upload_process_should_complete_successfully_for_each_file() {
uploadNewCandidateProfilePage.isAllFilesUploadedSuccessfully();
}
@Then("all uploaded profiles should be listed in the Profile section")
public void all_uploaded_profiles_should_be_listed_in_the_profile_section() {
uploadNewCandidateProfilePage.areProfilesListed();
}

@Given("the hiring manager waits for the upload process to complete")
public void the_hiring_manager_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadProcessToComplete();
}
@When("the hiring manager clicks on the upload button")
public void the_hiring_manager_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@Then("the {string} uploads successfully with a confirmation message")
public void the_uploads_successfully_with_a_confirmation_message(String candidateProfile) {
uploadNewCandidateProfilePage.isUploadSuccessful(candidateProfile);
}
@When("the user browses selects a candidate profile file in a supported format")
public void the_user_browses_selects_a_candidate_profile_file_in_a_supported_format() {
uploadNewCandidateProfilePage.browseAndSelectCandidateProfileFile();
}
@When("the hiring manager browses selects a valid candidate profile file")
public void the_hiring_manager_browses_selects_a_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.browseAndSelectValidCandidateProfileFile();
}
@Given("the recruiter waits for the upload process to complete")
public void the_recruiter_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadProcessToComplete();
}
@When("the hiring manager clicks on the upload icon")
public void the_hiring_manager_clicks_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@Then("a success confirmation message should appear, indicating the profile was uploaded successfully")
public void a_success_confirmation_message_should_appear_indicating_the_profile_was_uploaded_successfully() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@When("the recruiter browses selects a candidate profile file with metadata")
public void the_recruiter_browses_selects_a_candidate_profile_file_with_metadata() {
uploadNewCandidateProfilePage.browseAndSelectCandidateProfileFileWithMetadata();
}
@Then("a success confirmation message appears, indicating the profile was uploaded successfully")
public void a_success_confirmation_message_appears_indicating_the_profile_was_uploaded_successfully() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@When("the recruiter clicks on the upload button")
public void the_recruiter_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the user browses selects a candidate profile file in {string} format")
public void the_user_browses_selects_a_candidate_profile_file_in_format(String format) {
uploadNewCandidateProfilePage.browseAndSelectCandidateProfileFileInFormat(format);
}
@When("the recruiter clicks on the upload (cloud) icon")
public void the_recruiter_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadCloudIcon();
}
// DUPLICATE: @When("the user clicks on the upload icon")
public void the_user_clicks_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the user browses selects multiple valid candidate profile files")
public void the_user_browses_selects_multiple_valid_candidate_profile_files() {
uploadNewCandidateProfilePage.browseAndSelectMultipleValidCandidateProfileFiles();
}
}