function solution (n) {
 let roman = 0;
  const obj = {
    M: 1000,
    D: 500,
    C: 100,
    L: 50,
    X: 10,
    V: 5,
    I: 1,
  };
  for(let i=0;i<n.length;i++){
    if(obj[n[i+1]]>obj[n[i]]){
        roman -=obj[n[i]]
    }
    else{roman +=obj[n[i]]}
  }
  return roman
}