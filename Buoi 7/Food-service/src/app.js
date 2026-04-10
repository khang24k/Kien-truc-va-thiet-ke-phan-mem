require('dotenv').config();
const express = require('express');
const { connectDB } = require('./config/db');
const foodRoutes = require('./routes/foodRoutes');

const app = express();

// Middleware
app.use(express.json());

// Kết nối DB và Sync Table
connectDB();

// Routes
app.use('/food', foodRoutes);

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
    console.log(` Food Service is running on port ${PORT}`);
});