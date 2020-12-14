## Collision Detection 

Dalam game ini terdapat clas sebagai berikut:

- <a href="#Sprite Class"> Sprite Class </a>
- <a href="#SpaceShip Class (extends Sprite)"> SpaceShip Class (extends Sprite) </a>
- <a href="#Alien Class"> Alien Class </a>
- <a href="#Missile Class"> Missile Class </a>
- <a href="#Board Class (extends JPanel implements ActionListener)"> Board Class (extends JPanel implements ActionListener) </a>
- <a href="#CollisionEx (extends JFrame)"> CollisionEx (extends JFrame) </a>

# 1. Sprite Class
	Kelas ini akan menjadi super class dari kelas space ship, alien dan missile
	method yang ada di kelas ini adalah:
		1. <Construstor> sprite 
			digunakan untuk menginisialisasi posisi dari space ship, alien dan missile <br>
		2. getImageDimension
			Digunakan untuk mengatur ukuran gambar spaceship, alien dan missile <br>
		3. loadImage
			Berfungsi untuk menampilkan atau memasukkan gambar <br>
		4. getImage 
			Mengembalikan nilai berupa gambar <br>
		5. getX dan getY
			Mendapatkan titik awal posisi gambar <br>
		6. setVisible
			Mengatur gambar untuk ditampilkan dilayar atau tidak <br>
		7. isVisible 
			Untuk mengetahui apakah gambar tersebut dalam mode visible atau tidak <br>
		8. getBound 
# 2. SpaceShip Class (extends Sprite)
	Kelas ini digunakan untuk membuat dan mengatur objek pesawat ruang angkasa yang akan kita kendalikan
	Objek dalam kelas ini:
		1. Missiles
			Peluru yang akan ditembakkan ke arah alien <br>
	Method yang dalam kelas ini:
		1. <Constructor> SpaceShip
			Menginisialisai titik awal dari space ship <br>
		2. initCraft
			Membuat daftar misil yang akan ditembakkan dalam bentuk array dan menampilkan gambar spaceship <br>
		3. getMissiles <br>
		4. keyPressed
			Untuk mengatur gerakan dan aksi setelah user memberi perintah <br>
		5. fire
			Digunakan untuk menambahkan satu misil ketika user memberikan perintah untuk menembak <br>
		6. keyRealeased
			Mengatur space ship agar diam saat tidak ada perintah dari user <br>
# 3. Alien Class (extends Sprite)
	Kelas ini digunakan membuat dan mengatur pergerakan objek alien
	Method:
		1. <Constructor> Alien
			Menginisialisasi titik awal alien <br>
		2. initAlien
			Menampilkan gambar alien <br>
		3. move
			Untuk mengatur gerakan setiap alien dan membuat alien kembali ke sisi kanan layar saat alien mencapai sisi kiri layar <br>
# 4. Missile Class (extends Sprite)
	Kelas ini digunakan untuk membuat 
	Method:
		1. <constructor> Missile
			menginisialisasi letak awal misil <br>
		2. initMissile
			Menampilkan gambar misil <br>
		3. move
			Menggerakkan misil sesuai dengan kecepatan yang telah ditentukan <br>
# 5. Board Class (extends JPanel implements ActionListener)
	Kelas ini berfungsi untuk mengatur dan menginisialisasi hal-hal yang ada pada tampilan permainan
	Method:
		1. pos
			Mengatur posisi awal alien-alien <br>
		2. Board dan initBoard
			Digunakan untuk menampilkan penampilan awal permainan
			seperti letak space ship dan sisa alien yang harus dikalahkan <br>
		3. initAlien
			Membuat objek alien dalam bentuk array <br>
		4. paintComponen
			Melakukan antara menampilkan permainan atau menampilkan pesan "game over" <br>
		5. drawObject
			Menampilkan gambar awal permainan seperti space shipnya <br>
		6. drawGameOver
			Menampilkan pesan "game over" <br>
		7. actionPerformed
			Memperbarui letak dan tampilan setiap objek setelah adanya aksi <br>
		8. inGame <br>
		9. updateShip
			Memperbarui letak space ship setiap adanya aksi <br>
		10. updateMissile
			Memperbarui letak dan tampilan misil, serta membuang misil yang sudah bertabrakan dengan alien <br>
		11. updateAlien
			Cek apakah terdapat alien yang tersisa, jika iya maka perbarui letak dan tampilannya
			jika tidak, maka keluarkan pesan game over <br>
		12. checkCollsion
			Untuk mengecek apakah terdapat tabrakan atau tidak <br>
# 6. CollisionEx (extends JFrame)
	Main Class yang digunakan untuk mengeksekusi jalannya program
	Method:
		1. <Constructor> CollisionEx dan initUI
			Membuat frame permainan, judul dan operasi pada frame permainan <br>
		2. main()
			Method untuk mengeksekusi permainan <br>
	
Class Diagram Image
![](img/Pogram.jpg)

Running Program Image

![](img/StarUML.jpg)
