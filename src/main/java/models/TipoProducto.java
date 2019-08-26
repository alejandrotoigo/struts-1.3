package models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoProducto")
public class TipoProducto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoProducto")
	private int idTipoProducto;
	@Column(name = "descripcion")
	private String descripcion;

	public TipoProducto() {
		super();
	}

	public TipoProducto(int idTipoProducto, String descripcion) {
		super();
		this.idTipoProducto = idTipoProducto;
		this.descripcion = descripcion;
	}

	public int getIdtipoProducto() {
		return idTipoProducto;
	}

	public void setIdtipoProducto(int idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
