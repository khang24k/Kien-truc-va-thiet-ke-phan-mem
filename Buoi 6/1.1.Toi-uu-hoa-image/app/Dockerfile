# # Sử dụng bản đầy đủ của Python (thường nặng khoảng 900MB - 1GB)
# FROM python:3.11

# # Thiết lập thư mục làm việc
# WORKDIR /usr/src/app

# # Copy TOÀN BỘ file trong thư mục máy tính vào Docker
# # (Bao gồm cả rác, file log, .git nếu bạn quên không loại trừ)
# COPY . .

# # Cài đặt thư viện (Mỗi lần sửa 1 dòng code, bước này sẽ phải chạy lại từ đầu)
# RUN pip install --no-cache-dir -r requirements.txt

# # Chạy chương trình
# CMD ["python", "app.py"]

# --- GIAI ĐOẠN 1: Builder (Xây dựng môi trường) ---
FROM python:3.11-slim AS builder

# Tránh tạo file .pyc và giúp log hiển thị ngay lập tức
ENV PYTHONDONTWRITEBYTECODE=1
ENV PYTHONUNBUFFERED=1

WORKDIR /app

# Chỉ cài các công cụ cần thiết để build thư viện C (như numpy)
RUN apt-get update && apt-get install -y --no-install-recommends \
    gcc \
    python3-dev \
    && rm -rf /var/lib/apt/lists/*

# Tạo môi trường ảo để cô lập các thư viện
RUN python -m venv /opt/venv
ENV PATH="/opt/venv/bin:$PATH"

# Tối ưu Cache: Copy file yêu cầu trước, cài đặt trước
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt


# --- GIAI ĐOẠN 2: Final (Image chạy thực tế) ---
FROM python:3.11-slim

WORKDIR /app

# Copy môi trường ảo (đã cài xong thư viện) từ stage builder sang
COPY --from=builder /opt/venv /opt/venv

# Thiết lập đường dẫn để hệ thống ưu tiên dùng thư viện trong venv
ENV PATH="/opt/venv/bin:$PATH"
ENV PYTHONDONTWRITEBYTECODE=1
ENV PYTHONUNBUFFERED=1

# Bảo mật: Không chạy app bằng quyền root
RUN adduser --disabled-password appuser
USER appuser

# Chỉ copy file code cần thiết (không copy rác)
COPY app.py .

CMD ["python", "app.py"]