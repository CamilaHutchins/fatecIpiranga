package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {
static Empresa empresa;
static EmpresaDAO empresaDAO;

/*
 *  estabelece as pr�-condi��es de teste
 *  @throws Exception
 */

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndere�o("rua taquari");
		empresa.setTelefone("2222");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC01FBCadastrarEmpresa_com_sucesso(){
		assertEquals(1, empresaDAO.adiciona(empresa)); //se ele inserir no banco de dados tem que retornar 1
		

	}

}
