1. Message Queue (MQ) là gì?
Hãy tưởng tượng bạn đi ăn tại một nhà hàng:

Không có MQ: Bạn gọi món, nhân viên phục vụ phải đứng chờ đầu bếp làm xong rồi mới mang ra cho bạn. Trong lúc đó, nhân viên này không thể phục vụ ai khác. (Đây là Synchronous - Đồng bộ).

Có MQ: Bạn gọi món, nhân viên ghi order vào một tờ phiếu và dán lên bảng (đây là Message Queue). Nhân viên đi phục vụ bàn khác ngay lập tức. Đầu bếp nhìn vào bảng, thấy có order mới thì lấy xuống làm. (Đây là Asynchronous - Bất đồng bộ).

Message Queue là một hàng đợi trung gian giúp các dịch vụ (Services) giao tiếp với nhau mà không cần phải chờ đợi nhau xong việc.
2. RabbitMQ và Mô hình Event-driven
RabbitMQ là một trong những Message Broker phổ biến nhất. Trong mô hình Event-driven:

Producer (Service 1): Gửi một thông báo (Event) khi có điều gì đó xảy ra (VD: Khách hàng vừa đặt hàng).

Exchange: Bộ định tuyến của RabbitMQ, quyết định tin nhắn sẽ đi vào hàng đợi nào.

Queue: Nơi lưu trữ tin nhắn tạm thời.

Consumer (Service 2): Lấy tin nhắn từ Queue về và xử lý (VD: Gửi email xác nhận).

3. Hướng dẫn thực hành với JavaScript (Node.js)
Chúng ta sẽ sử dụng thư viện amqplib.

Chuẩn bị
Cài đặt Node.js.

Cài đặt RabbitMQ (dùng Docker: 
Bước 1: Cài đặt Docker Desktop.

Bước 2: Mở Terminal (hoặc CMD) và chạy lệnh sau:
docker run -d --name rabbit -p 5672:5672 -p 15672:15672 rabbitmq:3-management).

Tạo + mở thư mục dự án và cài đặt thư viện:
npm init -y
npm install amqplib
4. Cách chạy thử nghiệm
Mở một Terminal, chạy Service 2 trước để nó đợi sẵn:
node consumer.js

Mở một Terminal khác, chạy Service 1 để gửi tin nhắn:
node producer.js