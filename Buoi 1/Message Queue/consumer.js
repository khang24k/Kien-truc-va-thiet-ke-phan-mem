const amqp = require('amqplib');

async function receiveEvent() {
    try {
        const connection = await amqp.connect('amqp://localhost');
        const channel = await connection.createChannel();

        const queueName = 'order_queue';

        await channel.assertQueue(queueName, { durable: false });

        console.log(" [*] Service 2: Đang chờ nhận tin nhắn từ %s...", queueName);

        // Lắng nghe và xử lý tin nhắn
        channel.consume(queueName, (msg) => {
            if (msg !== null) {
                const content = JSON.parse(msg.content.toString());
                console.log(" [v] Service 2: Đã nhận và đang xử lý Order:", content);
                
                // Giả lập xử lý logic (như gửi mail, trừ kho...)
                channel.ack(msg); // Xác nhận đã xử lý xong
            }
        });
    } catch (error) {
        console.error("Lỗi Service 2:", error);
    }
}

receiveEvent();