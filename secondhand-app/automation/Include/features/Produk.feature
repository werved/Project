@Produk
Feature: Produk
    Sebagai User dapat melakukan edit dan hapus produk yang dijual

Background:
    Given Membuka aplikasi "Secondhand"
    Given Buka halaman "Masuk" ke dalam aplikasi
    Given Buka halaman "Akun Saya"

@Pdk01 @Positif
Scenario: Memastikan User dapat update produk
    When Klik menu "Daftar Jual Saya"
    And Klik menu "Produk"
    Then Ditampilkan list produk
    And Klik produk Item
    Then Diarahkan ke halaman "Ubah Produk"
    And Input "<namaproduk>" pada kolom Nama Produk
    And Input "<harga>" pada kolom Harga Produk
    And Pilih "<kategori>" pada kolom Kategori
    And Input "<lokasi>" pada kolom Lokasi
    And Input "<deskripsi>" pada kolom Deskripsi 
    And Unggah "<photo>" pada kolom Foto Produk
    And Klik tombol "Perbarui Produk"
    Then Ditampilkan pesan "<error>"

@Pdk02 @Negatif
Scenario Outline: Memastikan User gagal update produk
 When Klik menu "Daftar Jual Saya"
    And Klik menu "Produk"
    Then Ditampilkan list produk
    And Klik produk Item
    Then Diarahkan ke halaman "Ubah Produk"
    And Input "<namaproduk>" pada kolom Nama Produk
    And Input "<harga>" pada kolom Harga Produk
    And Pilih "<kategori>" pada kolom Kategori
    And Input "<lokasi>" pada kolom Lokasi
    And Input "<deskripsi>" pada kolom Deskripsi 
    And Unggah "<photo>" pada kolom Foto Produk
    And Klik tombol "Perbarui Produk"
    Then Tampil pesan "<error>"

Examples:
| namaproduk | harga | kategori | lokasi | deskripsi | photo | error |
    | | 20000 | makanan dan minuman | Jakarta | enak bgt nih | photo01 | Nama produk tidak boleh kosong |
    | Kue asik | | makanan dan minuman  | Jakarta | enak bgt nih | photo01 | Harga tidak boleh kosong |
    | Kue asik | 20000 | | Jakarta | enak bgt nih | photo01 | Pilih minimal 1 kategori |
    | Kue asik | 20000 | makanan dan minuman | | enak bgt nih | photo01 | Lokasi tidak boleh kosong |
    | Kue asik | 20000 | makanan dan minuman | Jakarta | | photo01 | Deskripsi tidak boleh kosong |
    