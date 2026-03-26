# Sử dụng image Python chính thức làm nền
FROM python:3.9-slim

# Thiết lập thư mục làm việc trong container
WORKDIR /code

# Sao chép file requirements và cài đặt thư viện
COPY requirements.txt .
RUN pip install -r requirements.txt

# Sao chép toàn bộ mã nguồn vào container
COPY . .

# Lệnh để chạy ứng dụng
CMD ["flask", "run", "--host=0.0.0.0"]