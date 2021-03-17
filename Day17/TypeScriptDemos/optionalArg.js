function add(a, b, c, d) {
    return a + b + c + d;
}
console.log(add(10, 20, 30, 40));
console.log(add(10, 20, 30));
function sum(a, b, c, d) {
    if (c === void 0) { c = 0; }
    if (d === void 0) { d = 0; }
    return a + b + c + d;
}
console.log(sum(10, 20, 30, 40));
console.log(sum(10, 20));
