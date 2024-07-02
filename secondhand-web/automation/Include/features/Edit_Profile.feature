@Edit_Profile
Feature: Edit_Profile
    Sebagai User dapat merubah data diri 

Background:
 Given User buka "https://secondhand.binaracademy.org/"
 Given User login

@ep01 @pos
Scenario: User dapat mengupdate profile
When User klik ikon profile
And klik nama User
And User mengisi "romi rona" pada kolom Nama
And User pilih "Jakarta" pada kolom drop down menu Kota
And User mengisi "Gang Buntu" pada kolom Alamat
And User mengisi "08213222445" pada kolom No Handphone
And klik tombol simpan
Then data profile User berhasil diperbaharui redirect halaman utama


@ep02 @neg
Scenario Outline:User gagal mengupdate karena tidak mengisi field yang ada
When User klik ikon profile
And klik nama User
And User mengisi "<nama>" pada kolom Nama
And User memilih "<kota>" pada kolom drop down menu Kota
And User mengisi "<alamat>" pada kolom Alamat
And User mengisi "<nohp>" pada kolom No Handphone
And klik tombol simpan
Then tampil pesan error "<error>"
Examples:
    | nama | kota | alamat | nohp | error |
    | | | | | Please Fill Out This Field |
    | | Jakarta  | gang buntu  | 0812321 | Please Fill Out This Field |
    | Romi horas | | gang buntu  | 0812321 | Please Select An Item In The List |
    | Romi horas | Jakarta | | 0812321 | Please Select An Item In The List |
    | Romi rompies| Jakarta  | gang buntu  | asdadassdsad | Please Fill With Number |