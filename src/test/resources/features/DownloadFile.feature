Feature: Download file given the url
  Scenario: Download a file with valid url
    When  When I send a valid download request to "http://localhost:8881/api?file=https://file-examples.com/storage/fe885c01e964c79a49e30f7/2017/10/file-sample_150kB.pdf"
    Then I should receive byteArray data
  Scenario: Download file with invalid url
    When When I send an invalid download request to "http://localhost:8881/api?file=https://file-examples.com/storage/fe885c01e964c79a49e30f7/2017/10/file-samle_150kB.pdf" with invalid data
    Then  I should receive an a string value of the file url "https://file-examples.com/storage/fe885c01e964c79a49e30f7/2017/10/file-samle_150kB.pdf"
