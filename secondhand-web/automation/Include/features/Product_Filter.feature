@Product_Filter
Feature: Product_Filter


@Pf001 @Positif
Scenario Outline: Memastikan user dapat melihat list produk tampil sesuai pilihan filter kategori
    When Buka "https://secondhand.binaracademy.org/"
    And Klik "<kategori>"
    Then Berhasil menampilkan produk list sesuai "<kategori>"

    Examples:
        | kategori   |
        | Hobi       |
        | Kendaraan  |
        | Baju       |
        | Elektronik |
        | Kesehatan  |
        | Semua      |