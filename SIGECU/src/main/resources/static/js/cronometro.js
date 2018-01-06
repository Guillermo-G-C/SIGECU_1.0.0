var cronometro;
	function detenerse()
	{
		clearInterval(cronometro);
	}

	function carga()
	{
		
		 
		tiempo=document.getElementById("tiempo").value;
		//alert(tiempo+"");
		fecha=tiempo.split(":");
		
		contador_s =fecha[2];
		contador_m =fecha[1];
		
		//contador_s =0;
		//contador_m =document.getElementById("tiempo").value;;
                
		s = document.getElementById("segundos");
		m = document.getElementById("minutos");
               
                if(contador_s<10){
                    s.innerHTML = "0"+contador_s;
                }else{
                    s.innerHTML = contador_s;
                }
                m.innerHTML = contador_m;
                
		cronometro = setInterval(
			function(){
				if(contador_s<=0)
				{
                                    contador_s=60;
                                    contador_m-=1;
                                    
				}
                               
                                contador_s--;
                                
                                if(contador_s<10){
                                    s.innerHTML = "0"+contador_s;
                                }else{
                                    s.innerHTML = contador_s;
                                }
                                m.innerHTML = contador_m;
                               
                                
                                 if (contador_s<=0 && contador_m==0) {
                                     alert("Se te a agotado el tiempo del Examen");
                                     detenerse();
                                }
			}
			,1000);
               

	}