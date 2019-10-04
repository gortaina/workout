var xhr = new XMLHttpRequest();

var url = 'https://api.github.com/users/arquiteturajoel';

xhr.open('GET', url);
xhr.send(null);

xhr.onreadystatechange = function(){
    if( xhr.readyState === 4){
        console.log(JSON.parse(xhr.responseText));
    }
}
// olhar a aba aplication


