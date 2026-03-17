let express = require('express');
let app = express();
let path = require('path');

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

// Serve static files (for images)
app.use(express.static(path.join(__dirname, 'public')));

let Products = [
    {
        Pname: "Speakers",
        P_id: 111,
        P_price: 100000,
        url: "speakers.jpg"
    },
    {
        Pname: "headphones", 
        P_id: 112,
        P_price: 9999,
        url: "headphones.jpg"
    },
    {
        Pname: "gaming",
        P_id: 113,
        P_price: 8990,
        url: "gaming.jpg"
    }
];

// Use lowercase route (recommended)
app.get('/products', (req, res) => {
    res.render('index', { Products });
});

app.listen(4001, () => {
    console.log("app is running on port 4001");
    console.log("Try: http://localhost:4001/products");
});