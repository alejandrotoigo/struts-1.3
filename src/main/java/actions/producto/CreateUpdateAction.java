package actions.producto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import Services.ServProducto;
import Services.ServTipoProducto;
import forms.ProductoForm;
import models.Producto;

public class CreateUpdateAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			ServTipoProducto servTipoProducto = new ServTipoProducto();
			ServProducto servProducto = new ServProducto();

			ProductoForm pForm = (ProductoForm) form;
			if (pForm.getIdProducto() != null && pForm.getIdProducto() > 0) 
				servProducto.update(pForm);
			 else 
				servProducto.create(pForm);
			
			request.setAttribute("productos", servProducto.findAll());
			return mapping.findForward("success");
		} catch (Exception e) {
			e.printStackTrace();
			return mapping.findForward("failure");
		}
	}
}
