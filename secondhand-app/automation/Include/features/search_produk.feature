@search_produk
Feature: Search Produk
Agar produk dapat dicari

Background:
		When User membuka aplikasi
		Then muncul halaman "Beranda"

@sea001 @positive
Scenario: Search Produk
    When User input "test" pada search bar
    Then berhasil menampilkan produk list dengan nama produk "test"