//diego3g
var url = 'https://api.github.com/users/arquiteturajoel';

// o retorno da url acima está em 'data'
// o Axios traz mais objetos comos: XMLHttpRequest, config, headers
// O Axios é um wrapper!
// Já faz o parse dos dados JSON
// axios.get, .put, .delete, .list
// aceixa mais parametros tb!
axios.get(url)
    .then(function(response){
        console.log(response);
        //pega a foto
        console.log(response.data.avatar_url);
    })
    .catch(function(error){
        // o .warn avisa do erro
        console.warn(error);
    })

// código assíncrono para acessar outras API´s
