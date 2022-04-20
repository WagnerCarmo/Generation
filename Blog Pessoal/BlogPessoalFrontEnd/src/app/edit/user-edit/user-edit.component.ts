import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Usuario } from 'src/app/model/Usuario';
import { AuthService } from 'src/app/service/auth.service';
import { environment } from 'src/environments/environment.prod';

@Component({
  selector: 'app-user-edit',
  templateUrl: './user-edit.component.html',
  styleUrls: ['./user-edit.component.css']
})
export class UserEditComponent implements OnInit {

  usuario: Usuario = new Usuario()
  idUser: number
  ConfirmarSenha: string
  tipoUsuario: string

  constructor(
    private authService: AuthService,
    private route: ActivatedRoute,
    private router: Router

  ) { }

  ngOnInit() {
    window.scroll(0,0)

    if(environment.token== '') {
      this.router.navigate(['/entrar'])
    }

    this.idUser = this.route.snapshot.params['id']
      this.findByIdUser(this.idUser)

  }

  confirmeSenha(event: any){
    this.ConfirmarSenha = event.target.value
  }

  tipoUser(event: any){
    this.tipoUsuario = event.target.value
  }

  atualizar(){
    this.usuario.tipo = this.tipoUsuario

      if (this.usuario.senha != this.ConfirmarSenha) {
        alert ("As senhas precisam ser iguais!")
      }

      else {
        this.authService.cadastrar(this.usuario).subscribe((resp:Usuario) =>  {
          this.usuario = resp; 
          this.router.navigate (['/home'])
          alert("Usuário atualizado com sucesso! Faça o login novamente.")
          environment.token = ''
          environment.nome = ''
          environment.foto = ''
          environment.id = 0

          this.router.navigate(['/entrar'])
        })
      }  
  }

  findByIdUser(id: number){
    this.authService.getByIdUser(id).subscribe((resp: Usuario) =>{

    })
  }

}
