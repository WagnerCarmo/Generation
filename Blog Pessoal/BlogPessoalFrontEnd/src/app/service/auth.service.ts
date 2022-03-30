import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuario } from '../model/Usuario';
import { UsuarioLogin } from '../model/UsuarioLogin';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

    constructor(private html:HttpClient) { //permite metodos http
  }
    Cadastrar(usuario: Usuario): Observable <Usuario> { //referencia model usuario
      return this.html.post<Usuario>('http://localhost:8080/usuarios/cadastrar', usuario);
    } 

    Entrar(usuarioLogin: UsuarioLogin): Observable <UsuarioLogin> { //referencia model usuario
      return this.html.post<UsuarioLogin>('http://localhost:8080/usuarios/logar', usuarioLogin);
    } 
}
