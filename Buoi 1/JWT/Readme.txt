1. JWT (JSON Web Token) là gì?
JWT là một phương thức truyền tin an toàn giữa các bên dưới dạng một chuỗi JSON. 
Đặc điểm quan trọng nhất là nó có thể được "xác minh" mà không cần truy vấn Database nhờ vào chữ ký số.

Một JWT gồm 3 phần (ngăn cách bởi dấu chấm .):

Header: Chứa kiểu token (JWT) và thuật toán mã hóa (VD: RS256).

Payload: Chứa thông tin (Claims) như userId, role, thời gian hết hạn (exp).

Signature: Chữ ký để đảm bảo dữ liệu không bị thay đổi.

2. Ý nghĩa của Access Token & Refresh Token
Trong hệ thống thực tế, chúng ta không dùng một token duy nhất mãi mãi để đảm bảo bảo mật.

Loại Token	Thời hạn	Công dụng
Access Token	Ngắn (15-30p)	Dùng để gửi kèm vào Header mỗi khi gọi API. Nếu bị lộ, hacker cũng chỉ có thời gian ngắn để lợi dụng.
Refresh Token	Dài (vài ngày/tuần)	Dùng duy nhất 1 việc: Đổi lấy Access Token mới khi cái cũ hết hạn. Thường được lưu an toàn hơn (HttpOnly Cookie).

3. Cách tạo và Kiểm tra Token (Logic chung)
Tạo: Server dùng một Private Key (khóa bí mật) để ký vào nội dung JSON.

Kiểm tra: Server dùng Public Key (khóa công khai) hoặc Private Key để giải mã và kiểm tra chữ ký. Nếu nội dung bị sửa dù chỉ 1 ký tự, chữ ký sẽ không khớp.

4. Tạo dự án Spring Boot
