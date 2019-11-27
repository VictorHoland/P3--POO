import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Main
{
  static Scanner input = new Scanner (System.in).useDelimiter ("\n");

  public static void main (String[]args)
  {
    String nome;
    String senha;
    int cpf;
    int nconta = 0;
    int contador = 0;
    ArrayList < Conta > contas = new ArrayList ();
    Conta c1;
    Passagem p;
    boolean e1 = true;
    boolean on;
    boolean adm;

    while (true)
      {

	on = false;

	System.out.println ("1- Castrar-se\n2- Entrar\n3- Recuperar n de conta\n4- recuperar senha da conta");
	int escolha= 0;
	e1 = true;
	while(e1){
        try{
	        escolha = Integer.parseInt(input.next ());
            break;
        }catch(NumberFormatException e){
                System.out.println("Digite apenas números");
        }
	}
	switch(escolha){
        case 1:
	        System.out.println ("Digite seu nome:");
	            nome = input.next();
    	    while(e1){    
    	        if(nome.equals(" ") || nome.equals("\n")){
    	            System.out.println("tente usar letras");
    	            nome = input.next();
    	        }else
    	            break;
    	    }
	        System.out.println ("Digite sua senha:");
	        senha = input.next ();
	        System.out.println ("Digite seu cpf:");
	        cpf = 0;
	        while(e1){
	            try{
	                   cpf = Integer.parseInt(input.next());  
	                   break;
	            }catch(NumberFormatException e){
	                   System.out.println("Digite apenas números");
	            }
	    }
	        
	        c1 = new Conta(nome, senha, cpf);
	        
	        contas.add (c1);
	        contador++;
	        
	        System.out.println("Seu numero de conta é "+ contador);
	        for (Conta c:contas)
	        {
		        System.out.println (c.getNome ());
	        }
	        
	        break;
        case 2:
	   
	        boolean ex = false;
	    int i = 0;
	    while (i < 3)
	      {
		System.out.println ("Digite seu cpf:");
		cpf = 0;
		e1 = true;
		
		while(e1){
		    try{
		        cpf = Integer.parseInt(input.next());
		        break;
		    }catch(NumberFormatException e){
		        System.out.println("Caracter invalido digite apenas numenos por favor!");
		    }
		}
		System.out.println("Digite seu Numero de conta");
		
		while(e1){
		    try{
		        nconta = Integer.parseInt(input.next());
		        break;
		    }catch(NumberFormatException e){
		        System.out.println("Caracter invalido digite apenas numenos por favor!");
		    }
		}
		 if(cpf == 777){
		     ex = true;
		 }
		 
		 c1 = contas.get(nconta - 1);
		 //c1.status();
	    
	    if (cpf == c1.getCpf ())
	    {
		    ex = true;
	    }
	    
		if (ex != true)
		  System.out.println ("Usuario não encontrado!");
		else
		  {
		    System.out.println ("Digite sua senha:");
		    senha = input.next ();
			if (senha.equals (c1.getSenha ()))
			  {
			    System.out.println ("Existe!");
			    on = true;
			    i = 3;
			  }
		  if(on != true)
		    System.out.println("senha incorreta!");
		  }
		i++;
	      }
	   
	        break;
        case 3:
	        
	        System.out.println("Digite seu nome");
	        
	        String nomee = input.next();
	        
	        for(int j = 0; j < contas.size(); j++){
                if(contas.get(j).nome.equals(nomee)){
                    System.out.println(j + 1);
            }
	        }
            break;
            
        default:
            
            System.out.println("Digite seu N conta");
            
            int nrecupera = 0;
            
            while(e1){
		        try{
		         nrecupera = Integer.parseInt(input.next());
		            break;
		        }catch(NumberFormatException e){
		            System.out.println("Caracter invalido digite apenas numenos por favor!");
		        }
		    }
            
          if(nrecupera <= contador && nrecupera > 0)
            c1 = contas.get(nrecupera - 1);
          else{
              System.out.println("N de conta não existe");
              break;
          }
            
            
            System.out.println("Digite seu cpf");
            
            int cpff = 0;
            
            while(e1){
		        try{
		            cpff = Integer.parseInt(input.next());
		            break;
		        }catch(NumberFormatException e){
		            System.out.println("Caracter invalido digite apenas numenos por favor!");
		        }
		    }
            
            if (cpff == c1.getCpf ()){
                System.out.println("Senhor(a) "+ c1.getNome());
                System.out.println("Sua senha é :"+ c1.getSenha());
	        }else{
	            System.out.println("Cpf não condiz com o Numero da conta");
	        }
	        
	}   
	if (on == true)
	  {
	    System.out.println ("Voce logou\nPor segurança digite seu Numero de conta");
	    
	    while(e1){
		    try{
		        nconta = Integer.parseInt(input.next());
		        break;
		    }catch(NumberFormatException e){
		        System.out.println("Caracter invalido digite apenas numenos por favor!");
		    }
		}
		c1 = contas.get(nconta - 1);
	    
	    c1.status();
	   
	    while(on){
	        System.out.println("1- Passagem\n2- Pacotes\n3- Hospedagem\n4- estatos atuais\n>=5 - Deslogar");
	    int selecao = 0;
	    
	    while(e1){   
	        try{
	                selecao = Integer.parseInt(input.next ());
	                break;
	        }catch(NumberFormatException e){
	                System.out.println("Digite somente a os numeros apresentados no menu");
	        }
	    }
	    if(selecao == 1){
	            System.out.println("Destinos disponiveis");
	            System.out.println("1-Dubai\n2- Japão\n3- Inglaterra\n4- EUA\n5- Brasil");
	            
	            int pais = 0;
	            
	            while(e1){
	                try{
	                    pais = Integer.parseInt(input.next());
	                    break;
	                }catch(NumberFormatException e){
	                    System.out.println("Digite apenas os numeros apresentados no menu");
	                }
	            }
	            String local = "none";
	            String destino = "none";
	            int npassageiros = 0;
	            String classe = "none";
	            
	            if(pais == 1){
	                destino = "Dubai";
	            }else if (pais == 2){
	                destino = "Japão";
	            }else if (pais == 3){
	                destino = "Inglaterra";
	            }else if (pais == 4){
	                destino = "EUA";
	            }else if (pais == 5){
	                destino = "Brasil";
	            } 
	            
	            System.out.println("Qual país você esta agora");
	            System.out.println("1-Dubai\n2- Japão\n3- Inglaterra\n4- EUA\n5- Brasil");
	            
	            int pais2 = 0;
	            
	            while(e1){
	                try{
	                    pais2 = Integer.parseInt(input.next());
	                    break;
	                }catch(NumberFormatException e){
	                    System.out.println("Digite apenas os numeros apresentados no menu");
	                }
	            }
	            
	            if(pais2 == 1){
	                local = "Dubai";
	            }else if (pais2 == 2){
	                local = "Japão";
	            }else if (pais2 == 3){
	                local = "Inglaterra";
	            }else if (pais2 == 4){
	                local = "EUA";
	            }else if (pais2 == 5){
	                local = "Brasil";
	            }
	            
	            System.out.println("Escolha a quantidade maxima de passageiros que viajará com você\n1- 3\n2- 5\n3- 10");
	            npassageiros = 0;
	            while(e1){
    	            try{
    	                npassageiros = Integer.parseInt(input.next());
    	                break;
    	            }catch(NumberFormatException e){
    	                System.out.println("Digite apenas numeos inteiros");
    	            }
	            }
	            
	            if(npassageiros == 1){
	                npassageiros = 3;
	            }else if (npassageiros == 2){
	                npassageiros = 5;
	            }else if (npassageiros == 3){
	                npassageiros = 10;
	            } 
	            
	            System.out.println("Escolha a classe de voo que você desejar\n1- simples\n2- simples veloz\n3- luxo");
	            int classse = 0;

	            while(e1){
    	            try{
    	                classse = Integer.parseInt(input.next());
    	                break;
    	            }catch(NumberFormatException e){
    	                System.out.println("Digite apenas numeos inteiros");
    	            }
	            }
	            
	            if(classse == 1){
	                classe = "simples";
	            }else if (classse == 2){
	                classe = "simples veloz";
	            }else if(classse == 3){
	                classe = "luxo";
	            }
	           
	           p = new Passagem (local, destino, npassageiros, classe);
	           
	           if(destino.equals("Dubai")){
	               if(local.equals("Japão"))
	                    c1.getPassagem().custo(200);
	               else if(local.equals("Inglaterra"))
	                    c1.getPassagem().custo(100);
	               else if(local.equals("EUA"))
	                    c1.getPassagem().custo(150);
	               else 
	                    c1.getPassagem().custo(200);
	                    
	           }
	           
	           c1.setPassagem(p);
	           
	           System.out.println("O custo será de :"+c1.getPassagem().getPreco()+"$");
	            
	    }else if(selecao == 4){
	        if (c1.getPassagem() != null){
	            
                System.out.println("De :"+c1.getPassagem().getLocal());
	            System.out.println("Para :"+c1.getPassagem().getDestino());
	            System.out.println("Tipo de voo:"+c1.getPassagem().getClasse());
	            System.out.println("Quantidade maxima de passageiros:"+c1.getPassagem().getNpassageiros());
	        }else System.out.println("Nenhuma passagem no momento!");
	    }else{
	        on = false;
	    } 
	    }
	    
	  }
      }
  }
}
