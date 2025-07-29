function sumMul(n,m){
    let array= []
    for(let i=n;i<m;i++){ i%n===0 ?array.push(i):false}
    return array.length>0?array.reduce((a,b)=>a+b):"INVALID"
}