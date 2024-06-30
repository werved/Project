@telusuri_kategori
Feature: Telusuri Kategori
Agar produk dengan kategori tertentu dapat dilihat

Background:
		When User membuka aplikasi
		Then muncul halaman "Beranda"

@tel001 @positive
Scenario Outline: Telusuri kategori
    When User klik pada kategori "<nama_kategori>"
    Then berhasil menampilkan produk list dengan kategori "<hasil_kategori_1>" dan "<hasil_kategori_2>"
    
		Examples:
			| <nama_kategori> | <hasil_kategori_1> | <hasil_kategori_2> 		|
			| Elektronik      | Elektronik         |                    		|
			| Semua						| Elektronik				 | Komputer dan Aksesoris |
			
			