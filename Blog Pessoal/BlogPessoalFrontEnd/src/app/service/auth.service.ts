import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.prod';

import { Usuario } from '../model/Usuario';
import { UsuarioLogin } from '../model/UsuarioLogin';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

    constructor(private http:HttpClient) {//permite metodos http
  }
   cadastrar (usuario: Usuario): Observable <Usuario> {//referencia model usuario
      return this.http.post<Usuario>('https://blogpessoalbruxinho.herokuapp.com/usuarios/cadastrar', usuario);
    } 

    entrar (usuarioLogin: UsuarioLogin): Observable <UsuarioLogin> {//referencia model usuario
      return this.http.post<UsuarioLogin>('https://blogpessoalbruxinho.herokuapp.com/usuarios/logar', usuarioLogin);
    }

    getByIdUser(id: number): Observable<Usuario>{
      return this.http.get<Usuario>(`https://blogpessoalbruxinho.herokuapp.com/usuarios/${id}`)

    }
    
    logado () {
      let ok: boolean = false

      if (environment.token != '') {
        ok = true 
      }
      return ok  
    }
}
