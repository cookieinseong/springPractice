function check2(){
	
		var idKor = /^[가-힣]{1,}$/;
		var idCheck = /^[a-zA-Z0-9]{4,15}$/;
		var pwCheck;
		
		if(join.name.value == ""){
			alert('이름를 입력해주세요.');
			join.name.focus();
			
			return false;
		}
		if(!(idKor.test(join.name.value))){
			alert('이름은 한글만 입력해주세요.');
			join.name.value = "";
			join.name.focus();
			
			return false;
		}
		if(join.id.value == ""){
			alert('아이디를 입력해주세요.');
			join.id.focus();
			
			return false;
		}
		if(!(idCheck.test(join.id.value))){
			alert('아이디는 영문,숫자,특수기호만 4~15글자 입력해주세요.');
			join.id.value = "";
			join.id.focus();
			
			return false;
		}
		
		if(join.pw.value == ""){
			alert('비밀번호를 입력해주세요.');
			join.pw.value = "";
			join.pw.focus();
		}
		
		if()
		
		
		
		return join.submit();
	}