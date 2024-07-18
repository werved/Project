@Tambah_Produk
Feature: Tambah_Produk


  
  @Tp001 @Terbitkan @Positif
  Scenario: Memastikan produk dapat ditambahkan dari halaman Homapage
    When Klik tombol "Jual"
    Then Diarahkan ke halaman Terbitkan
    When Input data Field Nama Produk "Motor"
    And Input data Field Harga Produk "1000000"
    And Pilih Kategori "2"
    And Input data Field Deskripsi "Ini motor seken"
    And Pilih gambar dari penyimpanan pribadi
    And Klik tombol Terbitkan
    Then Produk berhasil diterbitkan
    And Diarahkan kehalaman detail produk


  @Djs @Tp002 @Terbitkan @Positif
  Scenario: Memastikan produk dapat ditambahkan dari halaman Daftar Jual Saya - Semua Produk
    When Klik navigation link "Products"
    And klik tombol "Semua Produk"
    And klik tombol "Tambah Produk"
    Then Diarahkan ke halaman "Terbitkan"
    When Input data Field Nama Produk "Motor"
    And Input data Field Harga Produk "1000000"
    And Pilih Kategori "Kendaraan"
    And Input data Field Deskripsi "Ini motor seken"
    And Pilih gambar dari penyimpanan pribadi
    And Klik tombol "Terbitkan"
    Then Produk berhasil diterbitkan
    And Diarahkan kehalaman detail produk


  @Djs @Tp003 @preview @Positif
  Scenario: Memastikan produk dapat di preview sebelum di terbitkan
    When Klik navigation link "Products"
    And klik tombol "Semua Produk"
    And klik tombol "Tambah Produk"
    Then Diarahkan ke halaman "Terbitkan"
    When Input data Field Nama Produk "Motor"
    And Input data Field Harga Produk "1000000"
    And Pilih Kategori "Kendaraan"
    And Input data Field Deskripsi "Ini motor seken"
    And Pilih gambar dari penyimpanan pribadi
    And Klik tombol "Preview"
    Then Berhasil memunculkan preview produk
    And Diarahkan kehalaman detail produk
    And Terdapat tombol "Terbitkan"
    And Terdapat tombol "Edit"
    And Terdapat tombol "Hapus"

  @Djs @Tp004 @Negatif
  Scenario Outline: Memastikan tidak dapat upload produk tanpa isi field
    When Klik navigation link "Products"
    And klik tombol "Semua Produk"
    And klik tombol "Tambah Produk"
    Then Diarahkan ke halaman "Terbitkan"
    When Input data Field Nama Produk "<nama_produk>"
    And Input data Field Harga Produk "<harga_produk>"
    And Pilih Kategori "<kategori_produk>"
    And Input data Field Deskripsi "<deskripsi_produk>"
    And Pilih gambar dari penyimpanan pribadi
    And Klik tombol "Terbitkan"
    Then Menampilkan alert "<alert>"

    Examples: 
      | nama_produk | harga_produk | kategori_produk | deskripsi_produk | alert                      |
      |             |     1000000  | Kendaraan       | Ini motor seken  | Name can't be blank        |
      | Motor       |              | Kendaraan       | Ini motor seken  | Price can't be blank       |
      | Motor       |     1000000  | Pilih Kategori  | Ini motor seken  | Category must exist        |
      | Motor       |     1000000  | Kendaraan       |                  | Description can't be blank |
