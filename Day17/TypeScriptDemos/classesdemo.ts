class Person{
    firstName:string;
    lastName:string;
    getFullName():string{
        return this.firstName+" "+this.lastName;
    }
}

var pOb=new Person();
pOb.firstName="Sujata";
pOb.lastName="Batra";
console.log(pOb.getFullName());
