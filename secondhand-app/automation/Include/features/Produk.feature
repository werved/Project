@Produk
Feature: Produk
    Sebagai User dapat melakukan edit dan hapus produk yang dijual

Background:
    Given User membuka aplikasi "Secondhand"
    Given User buka halaman "Masuk" ke dalam aplikasi
    Given User buka halaman "Akun Saya"

@Pdk001 @Positif
Scenario: Memastikan User dapat update produk
    When User klik menu "Daftar Jual Saya"
    And Klik tab "Produk"
    Then Ditampilkan list produk
    And Klik produk Item
    Then Diarahkan ke halaman "Ubah Produk"
    And Input "<nama_produk>" pada kolom Nama Produk
    And Input "<harga_produk>" pada kolom Harga Produk
    And Pilih "<kategori>" pada kolom Kategori
    And Input "<lokasi>" pada kolom Lokasi
    And Input "<deskripsi>" pada kolom Deskripsi 
    And Unggah "<photo>" pada kolom Foto Produk
    And Klik tombol "Perbarui Produk"
    Then Ditampilkan pesan "<pesan_gagal>"

@Pdk002 @Negatif
Scenario Outline: Memastikan User gagal update produk
 When Klik menu "Daftar Jual Saya"
    And Klik tab "Produk"
    Then Ditampilkan list produk
    And Klik produk Item
    Then Diarahkan ke halaman "Ubah Produk"
    And Input "<nama_produk>" pada kolom Nama Produk
    And Input "<harga>" pada kolom Harga Produk
    And Pilih "<kategori>" pada kolom Kategori
    And Input "<lokasi>" pada kolom Lokasi
    And Input "<deskripsi>" pada kolom Deskripsi 
    And Unggah "<photo>" pada kolom Foto Produk
    And Klik tombol "Perbarui Produk"
    Then Tampil pesan "<pesan_gagal>"

Examples:
| nama_produk | harga | kategori | lokasi | deskripsi | photo | pesan_gagal |
    | | 20000 | makanan dan minuman | Jakarta | enak bgt nih | photo01 | Nama produk tidak boleh kosong |
    | Kue asik | | makanan dan minuman  | Jakarta | enak bgt nih | photo01 | Harga tidak boleh kosong |
    | Kue asik | 20000 | | Jakarta | enak bgt nih | photo01 | Pilih minimal 1 kategori |
    | Kue asik | 20000 | makanan dan minuman | | enak bgt nih | photo01 | Lokasi tidak boleh kosong |
    | Kue asik | 20000 | makanan dan minuman | Jakarta | | photo01 | Deskripsi tidak boleh kosong |
    