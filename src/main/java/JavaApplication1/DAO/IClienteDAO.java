/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package JavaApplication1.DAO;

import JavaApplication1.Domain.Cliente;

/**
 *
 * @author gmime
 */
public interface IClienteDAO {
   public Boolean cadastrar(Cliente cliente);
   
   public void excluir(Long cpf);
   
   public void alterar(Cliente cliente);
   
   public Cliente consultar(Long cpf);
    
}
