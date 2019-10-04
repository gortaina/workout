var listElement = document.querySelector('#app ul');
var inputElement = document.querySelector('#app input');
var buttonElement = document.querySelector('#app button');
// olhar a aba application
//LocalStorage é do chrome!!!!
// o ou no final é para trazer um array vazio se o conteúdo do JSON.parse for null
var todos = JSON.parse(localStorage.getItem('list_todos')) || [];

// não precisa mais, era o todos
todos2 = [
    'Fazer café',
    'Estudar Javascript',
    'Acessar a comunidade da RocketSeat'
];
//{text: 'Fazer café', propriedade: 1}

function renderTodos(){
    // limpa os elementos de ul
    listElement.innerHTML = ''

    for(todo of todos){
        var todoElement = document.createElement('li');
        var todoText = document.createTextNode(todo);

        var linkElement = document.createElement('a');
        // O cerquilha aí é para não fazer nada mesmo! LOL
        
        linkElement.setAttribute('href', '#');

        var pos = todos.indexOf(todo);
        linkElement.setAttribute('onclick', 'deleteTodo('+pos+')');

        var linkText = document.createTextNode('excluir');
        
        linkElement.appendChild(linkText);

        todoElement.appendChild(todoText);

        todoElement.appendChild(linkElement);

        listElement.appendChild(todoElement);
    }
}

renderTodos();

function addTodo(){
    var todoText = inputElement.value;
    // push - adicona elemento todoText ao final do array - todos
    todos.push(todoText);
    inputElement.value = '';
    renderTodos();
    saveToStorage();
}

buttonElement.onclick = addTodo;

function deleteTodo(pos){
    //splice - remove uma quantidade de itens dada uma posição
    //remove 1 item após o valor de pos
    todos.splice(pos, 1);
    renderTodos();
    saveToStorage();
}

function saveToStorage(){
    // guarda chave-valor - tudo string
    //localStorage.setItem('list_todos',todos);
    //Para manter a estrura, salve como JSON
    localStorage.setItem('list_todos', JSON.stringify(todos));


}