require('dotenv').config();
const express = require('express');
const mongoose = require('mongoose');
const cors = require('cors');
const movieRoutes = require('./routes/movieRoutes');

const app = express();
const PORT = process.env.PORT || 8082;

// Middleware
app.use(cors());
app.use(express.json()); // Để parse JSON từ req.body

// Routes
app.use('/movies', movieRoutes);

// Connect to MongoDB & Start Server
mongoose.connect(process.env.MONGO_URI)
    .then(() => {
        console.log("✅ Đã kết nối tới MongoDB thành công!");
        app.listen(PORT, () => {
            console.log(`🚀 Movie Service đang chạy tại http://localhost:${PORT}`);
        });
    })
    .catch((err) => {
        console.error("❌ Lỗi kết nối MongoDB: ", err.message);
    });