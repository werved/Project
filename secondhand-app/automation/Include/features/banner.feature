@banner
Feature: Lihat banner
Memastikan banner dapat dilihat

@ban001 @positive
Scenario: Melihat banner
    Given User membuka aplikasi Secondhand
    When User melihat halaman "Beranda"
    Then banner berhasil tampil