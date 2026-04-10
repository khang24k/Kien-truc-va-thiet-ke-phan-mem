const { Sequelize } = require('sequelize');

const sequelize = new Sequelize(
    process.env.DB_NAME,
    process.env.DB_USER,
    process.env.DB_PASSWORD,
    {
        host: process.env.DB_HOST,
        dialect: 'mariadb',
        logging: false, // Tắt log các câu lệnh SQL trong console
    }
);

const connectDB = async () => {
    try {
        await sequelize.authenticate();
        console.log(' MariaDB connected successfully via Sequelize');
        // sync() giúp tự động tạo bảng nếu chưa tồn tại
        await sequelize.sync({ force: false }); 
    } catch (error) {
        console.error(' MariaDB connection failed:', error);
    }
};

module.exports = { sequelize, connectDB };