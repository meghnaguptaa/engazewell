
@feature_upload_new_candidate_profile
Feature: UploadNewCandidateProfile

  Background: 
    Given the user is in the Profile section

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid candidate profile file
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

  Examples:
    | candidate_profile_file |
    | valid_profile.pdf      |
    | valid_profile.docx     |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects the "<profile_file>"
    And the user clicks the Upload button
    Then the user waits for the upload to complete and confirms success

    Examples:
      | profile_file            |
      | first_valid_profile.pdf  |
      | second_valid_profile.pdf  |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    Given the user clicks on the upload icon
    When the user browses and selects a valid candidate profile file of 2MB
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user should see a success confirmation message

    Examples:
      | file_size |
      | 2MB       |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects "<filename>"
    And the user clicks on the Upload button
    Then the upload process should complete
    And a success confirmation message should be displayed to the user

    Examples:
      | filename                                      |
      | Candidate_Profile_2023_John_Doe_Very_Long_Filename.pdf |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload icon
  And the user browses and selects a valid candidate profile file in <file_format> format
  And the user clicks on the Upload button
  And the user waits for the upload process to complete
  Then the user observes a success confirmation message

Examples:
  | file_format |
  | .txt        |

@valid-profile-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload icon
  And the user browses and selects a valid candidate profile file with UTF-8 encoding
  And the user clicks on the Upload button
  Then the upload process should complete
  And a success confirmation message should be displayed

Examples:
  | file_name                  |
  | valid_candidate_profile.txt |

  @upload-valid-profile
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a valid candidate profile file with a <profile_file_extension> extension
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message should be displayed to the user

  Examples:
    | profile_file_extension |
    | doc                    |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a valid candidate profile file with text in Spanish
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | file_name             |
      | Candidate_Spanish.txt |

  @unsupported-file-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects an unsupported file type <file_type>
    And the user clicks on the Upload button
    Then the system displays an error message indicating the file type is not supported
    And the upload process does not initiate

  Examples:
    | file_type |
    | .exe      |

@file_size_error
Scenario Outline: Upload New Candidate Profile
  Given the user clicks on the upload (cloud) icon
  When the user browses and selects a file that exceeds the size limit
  And the user clicks on the Upload button
  Then the system should display an error message indicating the file exceeds the maximum size limit
  And the upload process does not initiate

  Examples:
    | file          |
    | file_6MB.pdf  |

  @error_message_no_file_selected
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user does not select any file
    And the user clicks on the Upload button
    Then an error message is displayed indicating that no file was selected
    And the upload process does not initiate

    Examples:
      | title                          | description                                                                 |
      | Upload New Candidate Profile   | Validate that the system displays an error message when a recruiter attempts to upload without selecting a file. |

  @network_failure
  Scenario Outline: Upload New Candidate Profile
    Given the user clicks on the upload icon
    When the user browses and selects a valid candidate profile file
    And the user clicks on the Upload button
    And the network failure is simulated
    Then an error message should be displayed indicating a network failure occurred
    And the upload process should not complete successfully

    Examples:
      |  |
      |  |

@timeout-error
Scenario Outline: Upload New Candidate Profile
  Given the user clicks on the upload icon
  When the user browses and selects a valid candidate profile file
  And the user clicks the Upload button
  And the upload process times out
  Then the user should see an error message indicating the upload process timed out
  And the upload process does not complete successfully

  Examples:
    | <file> |
    | valid_candidate_profile.pdf |

@corrupted-file-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload (cloud) icon
  And the user browses and selects a corrupted candidate profile file
  And the user clicks on the Upload button
  Then an error message is displayed indicating the file is corrupted and cannot be uploaded
  And the upload process does not initiate

Examples:
  | corrupted_file          |
  | corrupted_file_example  |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When I click on the upload icon
  And I browse and select a valid candidate profile file with special characters in the filename
  And I click on the Upload button
  And I wait for the upload process to complete
  Then a success confirmation message is displayed to the user

Examples:
  | filename                |
  | John_Doe@2023.pdf      |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a valid candidate profile file with a very short filename
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

  Examples:
    | filename  |
    | A.pdf     |

@upload_candidate_profile
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload icon
  And the user browses and selects a valid candidate profile file with spaces in the filename
  And the user clicks on the Upload button
  Then the upload process completes successfully
  And a success confirmation message is displayed to the user

Examples:
  | filename                   |
  | John Doe Profile.pdf       |
