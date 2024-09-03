@Search_Produk
Feature: Search Produk
Agar produk dapat dicari

Background:
		#When User buka aplikasi Secondhand
		Then User melihat halaman awal beranda "Telusuri Kategori"

@Sea001 @Positif
Scenario: User Search Produk
    When Input "------" pada search bar
    Then Berhasil menampilkan produk list dengan nama produk "test"