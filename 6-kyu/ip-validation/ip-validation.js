function isValidIP(str) {
  console.log(str)
    if(str=== "0.0.0.0"){
        return true
    }
    if(str.includes("\n")){
        return false
    }
    if(str.includes(" ")){
        return false
    }
    if(str.includes("e")){
        return false
    }
 str = str.split('.')
    let array=[]
    for(index of str){
        if(index[0]=== "0" && Number(index) > 0) return false
        if(index === '' || index === '00') return false
        index= Number (index)
        if(index>=0 && index<256 && str.length===4){
          array.push(true)
        }
        else{
            array.push(false)
        }
    }
    return array.includes(false)? false: true
}
console.log(isValidIP('abc.def.ghi.jkl'))