# LAB 2 – MÃ HÓA ĐỐI XỨNG HIỆN ĐẠI

**Học phần:** An toàn và Bảo mật Thông tin
**Họ và tên:** Nguyễn Lê Anh Trúc
**MSSV:** 1150080078

Bài thực hành xây dựng ứng dụng Java Swing (NetBeans + Maven) minh họa các thuật toán mã hóa
đối xứng hiện đại: **DES, TripleDES, AES-GCM, RC4, Twofish, AES-CTR**, kèm đăng ký/đăng nhập
(PBKDF2) và ghi lịch sử thao tác vào **Microsoft SQL Server**. Bài nâng cao 02 (AES-CBC) viết
bằng **Python (Tkinter)**.

---

## 1. Cấu trúc thư mục

```
LAB2_1150080078_NguyenLeAnhTruc/
├─ LAB2_MaHoaHienDai/            # Project Java NetBeans (Maven)
│  ├─ pom.xml
│  └─ src/main/java/week_02/
│     ├─ CipherUtil.java         # tiện ích: UTF-8, Base64, HEX, random, PBKDF2
│     ├─ FileTextIO.java         # mở/lưu tệp .txt (UTF-8)
│     ├─ DbConfig.java           # cấu hình & mở kết nối SQL Server
│     ├─ HistoryDao.java         # ghi/đọc bảng dbo.crypto_history
│     ├─ UserDao.java            # đăng ký/đăng nhập (PBKDF2 + salt)
│     ├─ DESCipher.java          # 2.1 DES  (DES/CBC/PKCS5)
│     ├─ TripleDESCipher.java    # 2.2 TripleDES (DESede/CBC/PKCS5)
│     ├─ AESCipher.java          # 2.3 AES-256/GCM (PBKDF2)
│     ├─ RC4Cipher.java          # 2.4 RC4 (mã dòng, HEX)
│     ├─ TwofishCipher.java      # 2.5 Twofish (BouncyCastle, CBC/PKCS7)
│     ├─ AESCTRCipher.java       # 2.6 nâng cao 01 - AES-256/CTR
│     └─ frm_*.java + frm_*.form # các JFrame Form (NetBeans GUI Builder)
├─ SQL/
│  ├─ 01_Tao_CSDL.sql            # tạo database + bảng
│  ├─ 02_Tao_Tai_Khoan_SQL.sql   # tạo login lab2_user / LabUser@2026
│  └─ 03_Kiem_Tra_Du_Lieu.sql    # kiểm tra dữ liệu
├─ Python/
│  └─ aes_cbc_gui.py             # 2.6 nâng cao 02 - AES-256-CBC (Tkinter)
├─ images/                       # ảnh kết quả các form
└─ BaoCao_LAB2.docx              # báo cáo Word
```

## 2. Phần mềm cần có

| Phần mềm | Ghi chú |
|---|---|
| JDK 17 hoặc 21 trở lên | biên dịch & chạy project |
| Apache NetBeans 20+ | mở project Maven, dùng GUI Builder |
| Maven (kèm trong NetBeans) | tự tải `mssql-jdbc` và `bcprov-jdk18on` |
| SQL Server Express + SSMS | cổng **14333**, mật khẩu lab `LabUser@2026` |
| Python 3.10+ với `cryptography` | chạy bài nâng cao 02 |

## 3. Hướng dẫn chạy chương trình Java

1. **Mở project:** NetBeans → *File → Open Project* → chọn thư mục `LAB2_MaHoaHienDai`
   (NetBeans nhận diện qua `pom.xml`). Lần đầu Maven sẽ tải thư viện từ Internet → *BUILD SUCCESS*.
2. **Chuẩn bị SQL Server** (chỉ cần cho bài 2.3 và chức năng Lịch sử):
   - Mở SSMS bằng *Windows Authentication*, chạy lần lượt `SQL/01_Tao_CSDL.sql` và
     `SQL/02_Tao_Tai_Khoan_SQL.sql`.
   - Bật TCP/IP, đặt **TCP Port = 14333**, bật *SQL Server and Windows Authentication mode*,
     khởi động lại dịch vụ.
3. **Chạy ứng dụng:** nhấp phải project → *Run* (F6) → mở cửa sổ **frm_Menu**.
   Hoặc chạy từng form bằng *Run File* (Shift+F6).
4. Trong `frm_Menu`:
   - **2.1 DES / 2.2 TripleDES / 2.4 RC4 / 2.5 Twofish / 2.6 AES-CTR**: nhập Plaintext → *Encrypt*
     → xóa Plaintext → *Decrypt* để kiểm tra `Decrypt(Encrypt(x)) = x`.
   - **Kết nối SQL Server**: nhập Password `LabUser@2026` → *Test Connection*.
   - **2.3 AES + Login**: *Kết nối SQL Server* → *Register* → *Login* (hiện Ticket) → *Encrypt/Decrypt*.
   - **Xem lịch sử**: hiển thị 50 dòng mới nhất của `dbo.crypto_history`.

> Nếu chưa kết nối SQL Server, các bài mã hóa vẫn chạy bình thường; chỉ không ghi được lịch sử
> (thanh trạng thái báo *"Chưa kết nối SQL Server - chưa lưu lịch sử"*).

## 4. Hướng dẫn chạy chương trình Python (bài nâng cao 02)

```bat
py -m pip install cryptography          :: cài một lần
cd Python
py aes_cbc_gui.py --self-test           :: tự kiểm thử -> in "SELF-TEST OK..."
py aes_cbc_gui.py                        :: mở giao diện Tkinter
```

## 5. Kết quả kiểm thử (Bảng 2.1)

| Bài | Dữ liệu thử | Kết quả |
|---|---|---|
| 2.1 DES | "Xin chào Lab 2 - Mã hóa hiện đại!", Key `12345678` | ✅ `Decrypt(Encrypt(x)) = x`, mỗi lần mã ra bản mã khác (IV ngẫu nhiên) |
| 2.2 TripleDES | Key 24 ký tự | ✅ giải mã đúng; Key 23 ký tự → báo lỗi |
| 2.3 AES-GCM | Register + Login | ✅ Login có Ticket; chống sửa bản mã (GCM) |
| 2.4 RC4 | Plaintext `Plaintext`, Key `Key` | ✅ bản mã HEX = **`BBF316E8D940AF0AD3`** |
| 2.5 Twofish | Key cố định, IV từ *Generate IV* | ✅ giải mã đúng; Save/Open khôi phục IV |
| 2.6 AES-CTR | Key + Nonce ngẫu nhiên | ✅ giải mã đúng; độ dài bản mã = độ dài bản rõ |
| 2.6 AES-CBC (Python) | Văn bản dài | ✅ `SELF-TEST OK` |

Ảnh kết quả các form nằm trong thư mục [`images/`](images/) và trong báo cáo `BaoCao_LAB2.docx`.
