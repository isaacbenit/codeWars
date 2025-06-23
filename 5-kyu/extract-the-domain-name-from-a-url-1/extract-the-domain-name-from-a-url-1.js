function domainName(url){
  //your code here
  let newurl
  if(url.includes('//') && url.includes('www')){
      newurl= url.split('www').join('').split('.').slice(1,2).join('')
  }
  else if(url.includes('//')){ newurl = url.split('//').slice(1,2).join('').split('.').slice(0,1).join('')}
  else if(!url.includes('//') && !url.includes('www')){
      newurl = url.split('.').slice(0,1).join('')
  }
  else{ newurl = url.split('.').slice(1,2).join('')
  }
​
  return newurl
}
console.log(domainName("h-zarhf-ub3373c.io/img/"))