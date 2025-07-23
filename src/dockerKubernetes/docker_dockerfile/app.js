const express = require('express');
const app = express();


app.get('/api', (req, res) => {
res.send('Hello World!');
});


app.listen(3000, () => {
console.log('Listening on port 3000');
});

// explicação: https://g.co/gemini/share/77a1d2ac7115