@tambah_produk
Feature: Tambah Produk
Agar User dapat menambah produk

Background:
    Given Seller sudah login
    When Seller klik icon plus
    Then berhasil menampilkan halaman "Tambah Produk" 

@tam001
Scenario Outline: Tambahkan Produk
    When Seller input Nama Produk "Binar VBackground"
    And input Harga Produk "10000"
    And pilih Kategori "Hobi"
    And input Lokasi "Jakarta"
    And input Deskripsi "Lorem ipsum"
    And upload Foto
    And klik "Terbitkan"
    Then berhasil menambahkan produk

    Examples: 
      | <nama_produk>       | <harga_produk> | <kategori> | <lokasi> | <deskripsi> | <foto>  | <keterangan>               |
      |                     |                |            |          |             |         | Semua kolom dikosongkan    |
      | Binar VBackground   |                |            |          |             |         | Hanya sebagian kolom diisi |
      | Binar VBackground   | 10000          |            |          |             |         | Semua kolom diisi          |
      | Binar VBackground   | 10000          | Hobi       |          |             |         | Semua kolom diisi          |
      | Binar VBackground   | 10000          | Hobi       | Jakarta  |             |         | Semua kolom diisi          |
      | Binar VBackground   | 10000          | Hobi       | Jakarta  | Lorem ipsum |         | Semua kolom diisi          |
      | Binar VBackground   | 10000          | Hobi       | Jakarta  | Lorem ipsum | urlfile | Semua kolom diisi          |


@tam002 @positive
Scenario: Preview Produk
    When Seller klik "Tambah Produk"
    Then berhasil menampilkan halaman "Form"
    When Seller input Nama Produk "Binar VBackground"
    And input Harga Produk "10000"
    And pilih Kategori "Hobi"
    And input Deskripsi "Lorem ipsum"
    And upload Foto
    And klik "Preview"
    Then berhasil preview produk