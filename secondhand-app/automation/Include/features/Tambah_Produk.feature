@Tambah_Produk
Feature: Tambah Produk
Agar Seller dapat menambah produk

Background:
#    Given Seller sudah login #menunggu testscript login
    When Seller klik icon plus
    Then Berhasil menampilkan halaman "Tambah Produk" 

@Tam001 @Negatif
Scenario Outline: User Gagal Tambahkan Produk
    When Ubah Nama Produk "<nama_produk>"
    And Ubah Harga Produk "<harga_produk>"
    And Klik Kategori
    And Pilih Kategori "<kategori>"
    And Ubah Lokasi "<lokasi>"
    And Ubah Deskripsi "<deskripsi>"
    And Klik Upload Foto
    And Klik icon Galeri
    And Klik foto
    And Klik tombol "Terbitkan"
    Then Gagal menambahkan produk dengan snackbar "<pesan_gagal>"

    Examples: 
      | nama_produk         | harga_produk   | kategori   | lokasi   | deskripsi   | foto    | pesan_gagal              									  	|
      |                     |                |            |          |             |         | Pilih minimal 1 kategori    										|
      | Binar VBackground   |                |            |          |             |         | Pilih minimal 1 kategori   									  |
      | Binar VBackground   | 10000          |            |          |             |         | Pilih minimal 1 kategori    										|
      | Binar VBackground   | 10000          | Elektronik |          |             |         | Silahkan masukkan foto produk terlebih dahulu. |
      | Binar VBackground   | 10000          | Elektronik | Jakarta  |             |         | Silahkan masukkan foto produk terlebih dahulu. |
      | Binar VBackground   | 10000          | Elektronik | Jakarta  | Lorem ipsum |         | Silahkan masukkan foto produk terlebih dahulu. |

@Tam002 @Positif
Scenario: User Berhasil Tambahkan Produk
    When Ubah Nama Produk "Binar VBackground"
    And Ubah Harga Produk "10000"
    And Klik Kategori
    And Pilih Kategori "Elektronik"
    And Ubah Lokasi "Jakarta"
    And Ubah Deskripsi "Lorem ipsum"
    And Klik Upload Foto
    And Klik icon Galeri
    And Klik foto
    And Klik tombol Terbitkan
    Then Berhasil menambahkan produk dengan snackbar "Produk berhasil diterbitkan"

@Tam003 @Positif
Scenario: Preview Produk
    When Ubah Nama Produk "Binar VBackground"
    And Ubah Harga Produk "10000"
    And Klik Kategori
    And Pilih Kategori "Hobi"
    And Ubah Lokasi "Jakarta"
    And Ubah Deskripsi "Lorem ipsum"
    And Klik Upload Foto
    And Klik icon Galeri
    And Klik foto
    And Klik tombol Preview
    Then Berhasil menampilkan halaman "Tinjau Produk"