@Banner
Feature: Lihat banner
Memastikan banner dapat dilihat

@Ban001 @Positif
Scenario: User melihat banner
    Given Buka aplikasi Secondhand
    When Lihat halaman "Beranda"
    Then Banner berhasil tampil