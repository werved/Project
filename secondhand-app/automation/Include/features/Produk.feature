@Produk
Feature: Produk
    Sebagai User dapat melakukan edit dan hapus produk yang dijual

Background:
    #Given User membuka aplikasi "Secondhand"
    #Given User buka halaman "Masuk" ke dalam aplikasi
    Given User tap navbar icon Akun

@Pdk001 @Positif
Scenario: Memastikan User dapat update produk
    When Klik menu Daftar Jual Saya
    And Klik tab "Produk"
    Then Ditampilkan list produk
    And Klik produk Item
    Then Diarahkan ke halaman Ubah Produk
    And Ubah Nama Produk "Kue asik"
    And Ubah Harga Produk "20000"
    #And Hapus Kategori
    #And Pilih Spinner Kategori
    And Ubah Lokasi "Tangerang"
    And Ubah Deskripsi "enak bgt nih"
    And Klik Upload Foto
    And Klik icon Galeri
    And Klik foto
    And Klik tombol Perbarui Produk
    Then Berhasil menambahkan produk dengan snackbar "Produk berhasil diperbarui"

@Pdk002 @Negatif
Scenario Outline: Memastikan User gagal update produk
 When Klik menu "Daftar Jual Saya"
    And Klik tab "Produk"
    Then Ditampilkan list produk
    And Klik produk Item
    Then Diarahkan ke halaman "Ubah Produk"
    And Ubah Nama Produk "<nama_produk>"
    And Ubah Harga Produk "<harga>"
    #And Hapus Kategori
    #And Pilih Spinner Kategori
    And Ubah Lokasi "<lokasi>"
    And Ubah Deskripsi "<deskripsi>"
    And Klik Upload Foto
    And Klik icon Galeri
    And Klik foto
    And Klik tombol Perbarui Produk
    Then Tampil pesan "<pesan_gagal>"

Examples:
    | nama_produk | harga | kategori 						| lokasi  | deskripsi 	 | photo   | pesan_gagal 										|
    |             | 20000 | makanan dan minuman | Jakarta | enak bgt nih | photo01 | Nama produk tidak boleh kosong |
    | Kue asik    |       | makanan dan minuman | Jakarta | enak bgt nih | photo01 | Harga tidak boleh kosong 			|
   #| Kue asik    | 20000 |                     | Jakarta | enak bgt nih | photo01 | Pilih minimal 1 kategori 			|
    | Kue asik    | 20000 | makanan dan minuman | 				| enak bgt nih | photo01 | Lokasi tidak boleh kosong 			|
    | Kue asik    | 20000 | makanan dan minuman | Jakarta | 						 | photo01 | Deskripsi tidak boleh kosong 	|
    