let express = require('express');
let app = express();
let bcrypt = require('bcrypt');
let mongoose = require('mongoose');
let path = require('path');
let emp = require('./model/employee');

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));
app.use(express.urlencoded({ extended: true }));

app.get('/register', (req, res) => {
    res.render('register');
});

app.post("/register", async (req, res) => {
    try {
        let { Uname, Upass } = req.body;
        let hash = await bcrypt.hash(Upass, 10);
        
        let e = new emp({
            empName: Uname,
            empPass: hash
        });
        
        await e.save();
        console.log("Employee registered successfully!!");
        res.send("Registered successfully");
    } catch (err) {
        console.log(err);
        res.status(500).send("Error registering employee");
    }
});

mongoose.connect("mongodb://127.0.0.1:27017/3Q")
    .then(() => {
        console.log("Connected to db");
    })
    .catch((err) => {
        console.log(err);
    });

app.listen(4000, () => {
    console.log("App is running at port 4000");
});