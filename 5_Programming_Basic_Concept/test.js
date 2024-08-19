let array=[1,2,3,4,5,5];
let freq={};
for (let index = 0; index < array.length; index++) {
   if(freq[array[index]]){
    freq[array[index]]+=1;
}else{
       freq[array[index]]=1;

   }
    
}

console.log(freq)