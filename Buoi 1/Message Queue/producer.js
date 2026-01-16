const amqp = require('amqplib');

async function sendEvent() {
    try {
        // 1. Kết nối tới RabbitMQ Server
        const connection = await amqp.connect('amqp://localhost');
        const channel = await connection.createChannel();

        const queueName = 'order_queue';
        const msg = { orderId: 123, status: 'CREATED', timestamp: new Date() };

        // 2. Khởi tạo hàng đợi (nếu chưa có)
        await channel.assertQueue(queueName, { durable: false });

        // 3. Gửi tin nhắn lên Queue
        channel.sendToQueue(queueName, Buffer.from(JSON.stringify(msg)));
        
        console.log(" [x] Service 1: Đã gửi event đặt hàng:", msg);

        // Đóng kết nối sau khi gửi (trong thực tế có thể giữ connection mở)
        setTimeout(() => {
            connection.close();
            process.exit(0);
        }, 500);
    } catch (error) {
        console.error("Lỗi Service 1:", error);
    }
}

sendEvent();