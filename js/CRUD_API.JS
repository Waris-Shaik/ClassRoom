const express = require("express");
const server = express();
const fs = require("fs");
const data = JSON.parse(fs.readFileSync("data.json", "utf-8"));
const products = data.products;
const PORT = process.env.PORT || 8000;

server.use(express.json());
var count = 1;
const auth = (req, res, next) => {
  if (req.query.password == "123") {
    next();
  } else {
    if (count >= 1 && count <= 3) {
      res.json({
        message: "Not-Allowed⛔",
      });
    } else if (count === 4) {
      res.json({
        message: "Enni sarlu ra reii tammudu Not-Allowed🚫 ani cheppam kada",
      });
      count = 0;
    }
    count++;

    console.log(count);
  }
};

// CREATE Product
const createProduct = (req, res) => {
  console.log(req.body);
  products.push(req.body);
  res.status(201).json();
};

// GET Products
const getAllProducts = (req, res) => {
  res.json(products);
};

// READ GET /products
server.get("/", auth, (req, res) => {
  res.status(201).json({ message: "Success" });
});

// READ  GET /products:/ID
const getProductById = (req, res) => {
  const id = +req.params.id;
  const product = products.find((prd) => prd.id === id);
  res.json(product);
};

// UPDATE PUT /products:/ID
const updateProduct = (req, res) => {
  const id = Number(req.params.id);
  const productIndex = products.findIndex((prd) => prd.id === id);
  const product = products[productIndex];
  products.splice(productIndex, 1, { ...product, ...req.body });
  res.status(201).json();
};

// Replace PUT /products:/ID
const replaceProduct = (req, res) => {
  const id = Number(req.params.id);
  const productIndex = products.findIndex((prd) => prd.id === id);
  products.splice(productIndex, 1, { ...req.body, id: id });
  res.status(201).json();
};

// DELETE DELETE /products:/ID
const deleteProduct = (req, res) => {
  const id = Number(req.params.id);
  const productIndex = products.findIndex((prd) => prd.id === id);
  const product = products[productIndex];
  products.splice(productIndex, 1);
  res.status(201).json(product);
};

server.get("/products", getAllProducts);
server.post("/products", createProduct);
server.get("/products/:id", getProductById);
server.patch("/products/:id", updateProduct);
server.put("/products/:id", replaceProduct);
server.delete("/products/:id", deleteProduct);

server.listen(PORT, () => {
  console.log(`listening on PORT:${PORT}`);
});
