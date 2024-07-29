@Status_Offer
Feature: Status_Offer

  @So001 @Positif
  Scenario: Memastikan penjual dapat konfirmasi penjualan berhasil
    When Klik tombol Status
    Then Diarahkan Ke Modal "Perbarui status penjualan produkmu"
    When Klik form check Berhasil Terjual
    And Klik tombol Kirim
    Then Diarahkan ke halaman "Info Penawar"
    And Status produk menjadi Berhasil terjual

  @So002 @Positif
  Scenario: Memastikan penjual dapat membatalkan transaksi yang sedang berjalan
    When Klik tombol Status
    Then Diarahkan Ke Modal "Perbarui status penjualan produkmu"
    When Klik form check Batalkan Transaksi
    And Klik tombol Kirim
    Then Diarahkan ke halaman "Info Penawar"
    And Status produk menjadi Penjualan dibatalkan
