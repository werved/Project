@search_produk
Feature: Search Produk
Agar produk dapat dicari

Scenario: Search Produk
    When User input "test" pada search bar
    Then berhasil menampilkan produk list dengan nama produk "test"