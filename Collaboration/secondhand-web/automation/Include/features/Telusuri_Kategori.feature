@Telusuri_Kategori
Feature: Telusuri Kategori
  Saya ingin dapat menelusuri berbagai kategori produk.

  Background: 
    Given User membuka "https://secondhand.binaracademy.org"
    #Given User membuka "https://secondhand.binaracademy.org/users/sign_in" 
    #When User memasukkan Email yang sudah register "tes1@example.com" 
    #And User memasukkan Password yang sudah register "123456" 
    #And User klik tombol "Masuk" 
    #Then User melihat halaman "Telusuri Kategori" 
    
  @Tk01 @Positif
  Scenario: Filter produk sesuai dengan jenis kategori hobi
    When Klik tombol kategori "kategori" untuk hobi
    Then Lihat produk yang sudah di filter "Hobi" 
    
  @Tk02 @Positif
  Scenario: Filter produk sesuai dengan jenis kategori kendaraan
    When Klik tombol kategori "kategori" untuk kendaraan
    Then Lihat produk yang sudah di filter "Kendaraan" 
    
  @Tk03 @Positif
  Scenario: Filter produk sesuai dengan jenis kategori baju
    When Klik tombol kategori "kategori" untuk baju
    Then Lihat produk yang sudah di filter "Baju"  
    
  @Tk04 @Positif
  Scenario: Filter produk sesuai dengan jenis kategori elektronik
    When Klik tombol kategori "kategori" untuk elektronik
    Then Lihat produk yang sudah di filter "Elektronik" 
    
  @Tk05 @Positif
  Scenario: Filter produk sesuai dengan jenis kategori kesehatan
    When Klik tombol kategori "kategori" untuk kesehatan
    Then Lihat produk yang sudah di filter "Kesehatan" 
    
  @Tk06 @Positif
  Scenario: Filter produk sesuai dengan jenis kategori semua
    When Klik tombol kategori "kategori" untuk semua
    Then Lihat produk yang sudah di filter "Semua" 

