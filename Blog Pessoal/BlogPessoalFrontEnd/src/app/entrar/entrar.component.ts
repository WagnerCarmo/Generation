import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment.prod';
import { UsuarioLogin } from '../model/UsuarioLogin';
import { AuthService } from '../service/auth.service';

@Component({
  selector: 'app-entrar',
  templateUrl: './entrar.component.html',
  styleUrls: ['./entrar.component.css']
})
export class EntrarComponent implements OnInit {
  usuarioLogin: UsuarioLogin = new UsuarioLogin

  constructor(private authService: AuthService,
    private router: Router

  ) { }

  ngOnInit () {
    window.scroll (0,0)
  }

  logarUsuario() {

      this.authService.Entrar(this.usuarioLogin).subscribe((resp: UsuarioLogin) => {
      this.usuarioLogin = resp
      environment.foto = this.usuarioLogin.foto
      environment.nome = this.usuarioLogin.nome
      environment.token = this.usuarioLogin.token
      environment.id = this.usuarioLogin.id
      this.router.navigate(['/home'])

    }, erro => {
      if (erro.status == 500) {
        alert('Usuário e senha incorretos')
      }
    })
  }
}