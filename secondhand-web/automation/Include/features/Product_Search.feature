@Product_Search
Feature: Product_Search

@Ps001 @Positif
Scenario: Memastikan user dapat mencari produk
    When Buka "https://secondhand.binaracademy.org/"
    And Input data pada search "Motor"
    Then List produk berhasil ditampilkan "Motor" 