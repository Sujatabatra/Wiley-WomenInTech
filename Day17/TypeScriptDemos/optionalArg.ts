function add(a:number,b:number,c?:number,d?:number):number{
    return a+b+c+d;
}

console.log(add(10,20,30,40));
console.log(add(10,20,30));

function sum(a:number,b:number,c:number=0,d:number=0):number{
    return a+b+c+d;
}

console.log(sum(10,20,30,40));
console.log(sum(10,20));