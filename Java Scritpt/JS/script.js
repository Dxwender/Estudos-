//var nome = "Wender";

//Funçao entrar

function entrar(){
	var area = document.getElementById('area');
	var texto = prompt ('Digite o seu nome?');

	if(texto=='' || texto == null){
		alert('Seu verme imundo')
		area.innerHTML= 'aaaaaaaaa';
	}else{
		area.innerHTML= 'fudeu'+texto;
	}

}
function entrar2(nome){
	var area = document.getElementById('area2');
	var texto = prompt ('Digite o seu sobrenome?');

	area.innerHTML= nome + " "+ texto;

}

function idade(){
	var idade = document.getElementById('idade');
	var texto = prompt ('Digite sua idade');

	idade.innerHTML=  texto ;

}