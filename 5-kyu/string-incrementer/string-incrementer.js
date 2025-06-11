function incrementString (strng) {
    function replaceFunc(match){
    return ++ match;
}
    if (strng.includes("9")){
        return strng.replace(/[0]?9*$/, replaceFunc )
    }
    else{
        return strng.replace(/[0-8]?[]*$/, m => String(++m))
    }
}
​
console.log(incrementString('oobar0001')) 