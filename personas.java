import java.util.Random;
import java.util.Scanner;
public class personas extends persona {
	String[]nombres= {"Juncal","Mamely","Chilpa","Flower","Pacheco","Chini","Cocke","Elias","Monroy","Chuma"};
    String[]atributos1= {"pulseras","pulseras","collar","collar","anillos","anillos","short","short","audifonos","audifonos"};
	String[]atributos2= {"lentes","lentes","aretes","aretes","gorra", "gorra","chanclas","chanclas","sudadera","sudadera"};
	String[]actividad= {"practica taekwondo","practica taekwondo","practica basquetbol","practica basquetbol","baila","baila","dibuja","dibuja","cocina","cocina"};
	String[]nacionalidad= {"de Mexico","de Mexico","de Alemania","de Alemania","de Venezuela","de Venezuela","de Panama","de Panama","de Puertorrico","de Puertorrico"};
	int top=0;
	Random aleatorio= new Random();
	Scanner scan= new Scanner (System.in);
	public personas( ) {
		super();
		
	}
	public void ordenAleatorio(String arreglo[]) {
		for (int i=arreglo.length-1; i>0; i--) {
			int indiceAleatorio=aleatorio.nextInt(i+1);
			String temporal = arreglo[indiceAleatorio];
			arreglo[indiceAleatorio]=arreglo[i];
			arreglo[i]=temporal;
		}
	}

	public String pop(String[]stacks,int top) {
		this.top=top;
		
		if(top==0) {
			System.out.println("Stack is empty");
			return (stacks[top]);
		}else {
			String top2;
			top2=stacks[top-1];
			top--;
			return(top2);
		}}
	
	
	


		public void getInfo() {
			persona[] crearPersona=new persona[10];
			int top1=nombres.length;
			int indice=aleatorio.nextInt(10);
			
			ordenAleatorio(nombres);
			ordenAleatorio(atributos1);
			ordenAleatorio(atributos2);
			ordenAleatorio(actividad);
			ordenAleatorio(nacionalidad);
			for(int i=0;i<10;i++) {
			crearPersona [i]=new personas();
			crearPersona[i].setNombre(pop(nombres,top1));
			crearPersona[i].setAtributo1(pop(atributos1, top1));
			crearPersona[i].setAtributo2(pop(atributos2, top1));
			crearPersona[i].setAtributo3(pop(actividad, top1));
			crearPersona[i].setAtributo4(pop(nacionalidad, top1));
			top1--;}
            for (int j=0; j<10;j++) {
			    System.out.println(crearPersona[j].getsNombre()+": tiene "+crearPersona[j].getsAtributo1()+" y "+crearPersona[j].getsAtributo2()+", "+crearPersona[j].getsAtributo3()+" y es "+crearPersona[j].getsAtributo4());
            }
            int similar=1;
            
			do {
            System.out.println("¡¡¡Bienvenidos a Adivina Quien!!!");
            System.out.println("Responde las preguntas e ingresa el indice de la persona de la cual crees que se habla");
            System.out.println("¿Qué accesorio crees que esta usando?");
            System.out.println("1.Pulseras");
            System.out.println("2.Collar");
            System.out.println("3.Anillos");
            System.out.println("4.Short");
            System.out.println("5.Audifonos");
            System.out.println("6.Lentes");
            System.out.println("7.Aretes");
            System.out.println("8.Gorra");
            System.out.println("9.Chanclas");
            System.out.println("10.Sudadera");
            int valor1=scan.nextInt();
            switch(valor1) {
            case 1: 
            		if ("pulseras"==crearPersona[indice].getsAtributo1()) {
            			for(int i=0;i<10;i++) {
            			if(crearPersona[i].getsAtributo1()==crearPersona[indice].getsAtributo1()){
            			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
            	        similar=1;
            	        }else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");}}
            	    }else{System.out.println("El personaje no tiene ese accesorio, intente con otro"); similar=2;}
            	        break;
            case 2:
            	if ("collar"==crearPersona[indice].getsAtributo1()) {
        			for(int i=0;i<10;i++) {
        			if(crearPersona[i].getsAtributo1()==crearPersona[indice].getsAtributo1()){
        			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
        			similar=1;
        			}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");}}
        	    }else{System.out.println("El personaje no tiene ese accesorio, intente con otro"); similar=2;}
        	        break;
            case 3:
            	if ("anillos"==crearPersona[indice].getsAtributo1()) {
        			for(int i=0;i<10;i++) {
        			if(crearPersona[i].getsAtributo1()==crearPersona[indice].getsAtributo1()){
        			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
        			similar=1;
        			}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");}}
        	    }else{System.out.println("El personaje no tiene ese accesorio, intente con otro"); similar=2;}
        	        break;
            case 4:
            	if ("short"==crearPersona[indice].getsAtributo1()) {
        			for(int i=0;i<10;i++) {
        			if(crearPersona[i].getsAtributo1()==crearPersona[indice].getsAtributo1()){
        			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
        			similar=1;
        			}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");}}
        	    }else{System.out.println("El personaje no tiene ese accesorio, intente con otro"); similar=2;}
        	        break;
            case 5:
            	if ("audifonos"==crearPersona[indice].getsAtributo1()) {
        			for(int i=0;i<10;i++) {
        			if(crearPersona[i].getsAtributo1()==crearPersona[indice].getsAtributo1()){
        			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
        			similar=1;
        			}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");}}
        	    }else{System.out.println("El personaje no tiene ese accesorio, intente con otro"); similar=2;}
        	        break;
            case 6: 
            	if ("lentes"==crearPersona[indice].getsAtributo2()) {
        			for(int i=0;i<10;i++) {
        			if(crearPersona[i].getsAtributo2()==crearPersona[indice].getsAtributo2()){
        			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
        			similar=1;
        			}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");}}
        	    }else{System.out.println("El personaje no tiene ese accesorio, intente con otro"); similar=2;}
        	        break;
            case 7:
            	if ("aretes"==crearPersona[indice].getsAtributo2()) {
        			for(int i=0;i<10;i++) {
        			if(crearPersona[i].getsAtributo2()==crearPersona[indice].getsAtributo2()){
        			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
        			similar=1;
        			}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");}}
        	    }else{System.out.println("El personaje no tiene ese accesorio, intente con otro"); similar=2;}
        	        break;
            case 8:
            	if ("gorra"==crearPersona[indice].getsAtributo2()) {
        			for(int i=0;i<10;i++) {
        			if(crearPersona[i].getsAtributo2()==crearPersona[indice].getsAtributo2()){
        			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
        			similar=1;
        			}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");}}
        	    }else{System.out.println("El personaje no tiene ese accesorio, intente con otro"); similar=2;}
        	        break;
            case 9:
            	if ("chanclas"==crearPersona[indice].getsAtributo2()) {
        			for(int i=0;i<10;i++) {
        			if(crearPersona[i].getsAtributo2()==crearPersona[indice].getsAtributo2()){
        			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
        			similar=1;
        			}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");}}
        	    }else{System.out.println("El personaje no tiene ese accesorio, intente con otro"); similar=2;}
        	        break;
            case 10: 
            	if ("sudadera"==crearPersona[indice].getsAtributo2()) {
        			for(int i=0;i<10;i++) {
        			if(crearPersona[i].getsAtributo2()==crearPersona[indice].getsAtributo2()){
        			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
        			similar=1;
        			}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");}}
        	    }else{System.out.println("El personaje no tiene ese accesorio, intente con otro"); similar=2;}
        	        break;
			}}while(similar==2);
            System.out.println("¿Qué actividad crees que practica?");
            System.out.println("1.Taekwondo");
            System.out.println("2.Basquetbol");
            System.out.println("3.Baila");
            System.out.println("4.Dibuja");
            System.out.println("5.Cocina");
            int valor2=scan.nextInt();
            switch(valor2) {
            case 1: 
            	for(int i=0;i<10;i++) {
            		String actividad=crearPersona[i].getsAtributo3();
            		if (actividad=="practica taekwondo") {
            			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
            	}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");	
            	}}break;
            case 2:
            	for(int i=0;i<10;i++) {
            		String actividad=crearPersona[i].getsAtributo3();
            		if (actividad=="practica basquetbol") {
            			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
            	}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");	
            	}}break;
            case 3: 
            	for(int i=0;i<10;i++) {
            		String actividad=crearPersona[i].getsAtributo3();
            		if (actividad=="baila") {
            			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
            	}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");	
            	}}break;
            case 4:
            	for(int i=0;i<10;i++) {
            		String actividad=crearPersona[i].getsAtributo3();
            		if (actividad=="dibuja") {
            			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
            	}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");	
            	}}break;
            case 5:
            	for(int i=0;i<10;i++) {
            		String actividad=crearPersona[i].getsAtributo3();
            		if (actividad=="cocina") {
            			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
            	}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");	
            	}}break;
            }
            System.out.println("¿De donde crees que es?");
            System.out.println("1.Mexico");
            System.out.println("2.Alemania");
            System.out.println("3.Venezuela");
            System.out.println("4.Panama");
            System.out.println("5.Puertorrico");
            int valor3=scan.nextInt();
            switch(valor3) {
            case 1:
            	for(int i=0;i<10;i++) {
            		String nacionalidad=crearPersona[i].getsAtributo4();
            		if (nacionalidad=="de Mexico") {
            			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
            	}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");	
            	}}break;
            case 2:
            	for(int i=0;i<10;i++) {
            		String nacionalidad=crearPersona[i].getsAtributo4();
            		if (nacionalidad=="de Alemania") {
            			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
            	}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");	
            	}}break;
            case 3: 
            	for(int i=0;i<10;i++) {
            		String nacionalidad=crearPersona[i].getsAtributo4();
            		if (nacionalidad=="de Venezuela") {
            			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
            	}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");	
            	}}break;
            case 4: 
            	for(int i=0;i<10;i++) {
            		String nacionalidad=crearPersona[i].getsAtributo4();
            		if (nacionalidad=="de Panama") {
            			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
            	}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");	
            	}}break;
            case 5: 
            	for(int i=0;i<10;i++) {
            		String nacionalidad=crearPersona[i].getsAtributo4();
            		if (nacionalidad=="de Puertorrico") {
            			System.out.println(crearPersona[i].getsNombre()+": tiene "+crearPersona[i].getsAtributo1()+" y "+crearPersona[i].getsAtributo2()+", "+crearPersona[i].getsAtributo3()+" y es "+crearPersona[i].getsAtributo4());
            	}else {System.out.println(crearPersona[i].getsNombre()+"---,---- y --- ");	
            	}}break;
            }
            System.out.println("¿Cual es el indice de la persona de la que estabamos hablando?");
            int valor4=scan.nextInt();
            if(valor4==indice+1) {
            	System.out.println("¡¡¡Felicidadesssss, adivinaste al personaje, era "+crearPersona[indice].getsNombre());
            }else {
            	System.out.println("Lo sentimos, no adivinaste al personaje, era "+crearPersona[indice].getsNombre());
            }
		}}
			
            
            

		


	

			
			
	
