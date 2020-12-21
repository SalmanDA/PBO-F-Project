# Collision Detection with Mouse

### Perubahan pada Kelas SpaceShip

1. initCraft
   Terjadi modifikasi pada kelas inirCraft, terdapat tambahan perintah untuk membatasi gerak space ship di sisi kanan dan bawah layar.
2. move
   Pada awalnya fungsi move dilakukan untuk merubah posisi space ship berdasarkan input keyboard. Fungsi ini dimodifikasi supaya posisi space ship sama dengan
   posisi mouse saat itu.
3. mouseClick dan mouseDragged
   Method keyPressed dan keyReleased pada project sebelumnya digantikan dengan method mouseClick dan mouseDragged yang digunakan untuk memanggil method fire()
   jika terdapat tombol mouse yang ditekan.
4. mouseMoved
   Method ini digunakan untuk menghentikan pergerakan space ship saat mencapai batas kanan dan bawah.
   
### Perubahan pada Kelas Sprite

1. getWidth dan getHeight
   Method getWidth dan getHeight ditambahkan pada kelas Sprite untuk mengakses panjang dan lebar dari gambar space ship, alien dan missile.

### Perubahan pada Kelas Board

1. Dilakukan penyesuaian pada class TAdapter. Jika sebelumnya terdapat method-method untuk melakukan event pada keyboard, diubah menjadi method untuk malakukan
   event mouse dari method yang ditambahkan pada kelas space ship

### Link Video Demonstrasi
   https://youtu.be/EDqlBb-ptfo
