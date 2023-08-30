const express = require('express');
const server = express();

const fs = require('fs');
const data = JSON.parse(fs.readFileSync('data.json', 'utf-8'));
const products = data.products;
const PORT = process.env.PORT || 8000;
const path = require('path');

server.use(express.json());

var count = 1;

const auth = (req, res, next)=>{
    if(req.query.password == '123'){
        next();
    }else{
         
        if(count >= 1 && count <= 3){
            res.json({
                'message' : 'Not-Allowed⛔'
            })
        }else if(count === 4){
            res.json({
                message : 'Enni sarlu ra reii tammudu Not-Allowed🚫 ani cheppam kada'
            })
            count = 0;
        }
        count ++;

        // if(count === 5){ 
        //     count = 1;
        // }
        
        console.log(count);
        
    }
}  
 

server.get('/products', (req, res)=>{
    res.json(products)
})



// CREATE
server.post('/products',(req, res)=>{
    console.log(req.body);
    products.push(req.body);
    res.status(201).json();
})

// READ GET /products
server.get('/',auth, (req, res)=>{
    res.status(201).json({message: 'Success'});
})

// READ  GET /products:/ID
server.get('/products/:id', (req, res)=>{
    const id = +req.params.id;
    const product = products.find((prd)=> prd.id === id);
    res.json(product);
})

 // UPDATE PUT /products:/ID
server.put('/products/:id', (req, res)=>{
    const id = Number(req.params.id);
    const productIndex = products.findIndex((prd)=> prd.id === id);
    products.splice(productIndex,1,{...req.body, id:id})
    res.status(201).json()
}) 

 // UPDATE PUT /products:/ID
server.patch('/products/:id', (req, res)=>{
    const id = Number(req.params.id);
    const productIndex = products.findIndex((prd)=> prd.id === id);
    const product = products[productIndex];
    products.splice(productIndex,1,{...product, ...req.body})
    res.status(201).json()
})

// DELETE DELETE /products:/ID
server.delete('/products/:id',(req, res)=>{
    const id = Number(req.params.id);
    const productIndex = products.findIndex((prd)=> prd.id === id);
    const product = products[productIndex];
    products.splice(productIndex, 1);
    res.status(201).json(product);
})



server.listen(PORT, ()=>{
    console.log(`listening on PORT:${PORT}`);
})



 