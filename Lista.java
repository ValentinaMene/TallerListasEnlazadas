
public class Lista {
    protected Nodo CAB;
    protected Nodo FIN;
    
    public Lista(){
        CAB=null;
        FIN=null;
    }
    
    private boolean esVacia(){
        return CAB==null;
    }

    public Lista InsertarComienzo(String dato){
        Nodo nuevo=new Nodo(dato);
        if(esVacia()){
            CAB=nuevo;
            nuevo.sig=null;
        }else{
            nuevo.sig=CAB;
            CAB=nuevo;
        }
        System.out.println("Se agrego un nuevo nodo a la lista");
        System.out.println("");
        return this;
    }
    
    public Lista InsertarFinal(String dato){
        Nodo nuevo=new Nodo(dato);
        if(esVacia()){
            CAB=nuevo;
            nuevo.sig=null;
        }else{
            Nodo t=CAB; 
            while(t.sig != null){
                t = t.sig; 
            }
            t.sig=nuevo;
            nuevo.sig=null;
        }
        System.out.println("Se agrego un nuevo nodo a la lista");
        System.out.println("");
        return this;
    }
    
    public void MostrarLista(){
        Nodo t=CAB;
        while(t!=null){
            System.out.print(t.info + "->");
            t=t.sig;
        }
        System.out.println("");
    }
    
    public void ListaBuscarX(){
        if(esVacia()){
            System.out.println("La lista esta vacia, por lo tanto no se puede encontrar la letra X");
        }else{
            Nodo t=CAB; 
            boolean x = false;
            int con = 1;
            while(t.sig != null){
                if(t.info.equalsIgnoreCase("x")){
                    System.out.println("Se encontro la letra X en el nodo #"+ con);
                    System.out.println("");
                    x = true;
                }
                con = con +1;
                t = t.sig; 
            }
            if(x ==false){
                System.out.println("La letra X no se encuentra dentro de ningun nodo de la lista");
                System.out.println("");
            }
        }
    }
    
    public Lista InsertarComienzoD(){
        Nodo nuevo=new Nodo("d");
        if(esVacia()){
            CAB=nuevo;
            nuevo.sig=null;
        }else{
            nuevo.sig=CAB;
            CAB=nuevo;
        }
        System.out.println("Se agrego un nuevo nodo a la lista con la letra D");
        System.out.println("");
        return this;
    }
    
    public void MostrarUltimo(){
        Nodo t=CAB;
        while(t!=null){
            if(t.sig==null){
                System.out.println("El dato del ultimo nodo es: " + t.info);
            }
            t=t.sig;
        }
        System.out.println("");
    }
    
    public Lista InsertarFinalD(){
        Nodo nuevo=new Nodo("d");
        if(esVacia()){
            CAB=nuevo;
            nuevo.sig=null;
        }else{
            Nodo t=CAB; 
            while(t.sig != null){
                t = t.sig; 
            }
            t.sig=nuevo;
            nuevo.sig=null;
        }
        System.out.println("Se agrego un nuevo nodo a la lista con la letra D");
        System.out.println("");
        return this;
    }
    
    public Lista InsertarPosD(int pos){
        Nodo nuevo=new Nodo("d");
        boolean y = false;
        if(esVacia()){
            CAB=nuevo;
            nuevo.sig=null;
            System.out.println("La lista estaba vacia, se creo un nuevo nodo");
            System.out.println("");
            y=true;
        }else{
            if(CAB.sig==null && pos==1){
                Nodo x = CAB;
                CAB=nuevo;
                CAB.sig=x;
                System.out.println("Se agrego el nodo en la posicion 1 con la letra D");
                System.out.println("");
                y=true;
            }   if(pos==1){
                Nodo x = CAB;
                CAB=nuevo;
                CAB.sig=x;
                System.out.println("Se agrego el nodo en la posicion 1 con la letra D");
                System.out.println("");
                y=true;
            }else{
            int can = 0;
            Nodo t=CAB; 
            while(t!= null){
                t = t.sig; 
                can = can +1;
            }
            if((pos - can)==1){
                t=CAB;
                Nodo x = CAB.sig;
                while(t!=null){
                    if(x==null){
                        t.sig=nuevo;
                        nuevo.sig=null;
                        System.out.println("Se agrego el nuevo nodo en la posicion " + pos + " con la letra D");
                        System.out.println("");
                        y=true;
                    }
                t = x;
                if(y==false){
                 x=x.sig;   
                }
                }
            }else if(can>=pos){
                t=CAB.sig;
                Nodo x = CAB;
                int can2 = 2;
                while(t!=null){
                    if(can2==pos){
                        x.sig=nuevo;
                        nuevo.sig=t;
                        System.out.println("Se agrego el nuevo nodo en la posicion " + pos + " con la letra D");
                        System.out.println("");
                        y=true;
                    }
                    x=t;
                    t=t.sig;
                    can2 = can2 +1;
                }
            }
            }
        }
        if(y==false){
            System.out.println("El valor de la posicion ingresado es superior a el numero de nodos en la lista con una diferencia mayor a 1, no es posible agregar este nodo");
            System.out.println("");
        } 
        return this;
    }
    
    public Lista SuprimirCAB(){
        
        if(esVacia()){
            System.out.println("La lista esta vacia, por lo tanto no hay nada que suprimir");
        }else{
            CAB=CAB.sig;
            System.out.println("Se ha suprimido el primer dato");
        }
        return this;
    }
    
    public Lista ListaSuprimirFinal(){
        if(esVacia()){
        System.out.println("La lista esta vacia, por lo tanto no hay nada que suprimir");
        }else{
            Nodo t=CAB, x=CAB; 
            
            while(t!=null){
                if(t.sig == null){
                    x.sig=null;
                }
                x =t;
                t = t.sig; 
            }
            System.out.println("Se elimino el ultimo nodo de la lista");
        }
         return this;
    }
    
    public Lista ListaSuprimirPos(int pos){
        boolean y = false;
        if(esVacia()){
            System.out.println("La lista esta vacia");
            System.out.println("");
            y = true;
        }
        if(pos<2){
            System.out.println("No puedes ingresar valores menores a 2, por favor ingresa un numero correcto");
            System.out.println("");
        }else {
                int can = 2;
                Nodo t = CAB.sig;
                Nodo x = CAB;
                while(t!=null){
                if(can==pos){
                    x.sig=t.sig;
                    System.out.println("Se elimino el nodo de la posicion " + pos);
                    System.out.println("");
                    t=null;
                    y=true;
                }
                if(y = false){
                    x=t;
                    t= t.sig;
                    can = can +1;
                }
                }
                }
        if(y=false){
            System.out.println("El valor de la posicion ingresado es superior a el numero de nodos en la lista con una diferencia mayor a 1, no es posible agregar este nodo");
            System.out.println("");
        }
             return this;
            }
           }

