@Telusuri_Kategori
Feature: Telusuri Kategori
Agar produk dengan kategori tertentu dapat dilihat

Background:
		When User buka aplikasi Secondhand
		Then User melihat halaman "Beranda"

@tTel001 @Positif
Scenario Outline: Telusuri kategori
    When Klik tombol "<nama_kategori>"
    Then Berhasil menampilkan produk list dengan kategori "<hasil_kategori_1>" dan "<hasil_kategori_2>"
    
		Examples:
			| <nama_kategori> | <hasil_kategori_1> | <hasil_kategori_2> 		|
			| Elektronik      | Elektronik         |                    		|
			| Semua						| Elektronik				 | Komputer dan Aksesoris |
			
			