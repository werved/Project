@Search_Produk
Feature: Search Produk
Agar produk dapat dicari

Background:
		When User buka aplikasi Secondhand
		Then User melihat halaman "Beranda"

@Sea001 @Positif
Scenario: User Search Produk
    When Input "test" pada search bar
    Then Berhasil menampilkan produk list dengan nama produk "test"