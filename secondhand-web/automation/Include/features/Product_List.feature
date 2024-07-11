@Product_List
Feature: Product_List

@Pl001 @Positif
Scenario: Memastikan user dapat melihat produk list
    When Buka "https://secondhand.binaracademy.org/"
    Then Berhasil menampilkan section produk list

