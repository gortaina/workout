// não influenciam na linha do tempo de execução da app
// é assíncrono
var minhaPromise = function(){
    return new Promise(function(resolve, reject){
        var xhr = new XMLHttpRequest();
        //diego3g
        var url = 'https://api.github.com/users/arquiteturajoel';

        xhr.open('GET', url);
        xhr.send(null);

        xhr.onreadystatechange = function(){
            if( xhr.readyState === 4){
                if(xhr.status === 200){
                    resolve(JSON.parse(xhr.responseText));
                } else {
                    reject('Erro na requisição');
                }
            }
        }
        
    });
}

// do jeito que esta na duas linha abaixo, a promise não vai experar a execução 
// da função minhaPromise() e no console.log vai sair vazio pq o 'resultado' não existe
// está pendente
// Promise {<pending>} -- no log console
//var resultado = minhaPromise();
//console.log(resultado);
// na aba network

// jeito certo
// then -  chamado no resolve na promise - função minhaPromise
// catch - chamado no reject na promiese - função minhaPromise
minhaPromise()
    .then(function(response){
        console.log(response);
    })
    .catch(function(error){
        // o .warn avisa do erro
        console.warn(error);
    })

// código assíncrono para acessar outras API´s
