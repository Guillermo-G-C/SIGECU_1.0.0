var cronometro;
	function detenerse(){
		clearInterval(cronometro);
	}

	function carga(){
		tiempo=document.getElementById("tiempo").value;
		fecha=tiempo.split(":");
		
		contador_s =fecha[2];
		contador_m =fecha[1];
		contador_h =fecha[0];
                
		s = document.getElementById("segundos");
		m = document.getElementById("minutos");
		h = document.getElementById("horas");
        
        if(h.length<2){
            h.innerHTML = "0"+contador_h;
        }else{
            h.innerHTML = contador_h;
        }

        if(m.length<2){
            m.innerHTML = "0"+contador_m;
        }else{
            m.innerHTML = contador_m;
        }

        if(s.length<2){
            s.innerHTML = "0"+contador_s;
        }else{
            s.innerHTML = contador_s;
        }
                
		cronometro = setInterval(
			function(){
				if (contador_s<=0 && contador_m==0) {
	                contador_m=60;
	                contador_h-=1;
	                if(contador_h<10){
	                    h.innerHTML = "0"+contador_h;
	                }else{
	                    h.innerHTML = contador_h;
	                }
	            }
				if(contador_s<=0){
	                contador_s=60;
	                contador_m-=1;
		            if(contador_m<10){
	                    m.innerHTML = "0"+contador_m;
	                }else{
	                    m.innerHTML = contador_m;
	                }
				}
				
	                           
                contador_s--;

                if(contador_s<10){
                    s.innerHTML = "0"+contador_s;
                }else{
                    s.innerHTML = contador_s;
                }

                if (contador_s<=0 && contador_m==0 && contador_h==0) {
                     alert("Se te a agotado el tiempo del Examen");
                     detenerse();
                }
			},1000);
	}