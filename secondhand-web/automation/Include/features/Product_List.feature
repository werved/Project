Feature: Product_List

@web @pl @pos
Scenario: Memastikan user dapat melihat produk list
    When Buka "https://secondhand.binaracademy.org/"
    Then Berhasil menampilkan section produk list

