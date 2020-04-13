import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

public class Main extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Main(Composite parent, int style) {
		super(parent, style);
		
		Label lblOr = new Label(this, SWT.NONE);
		lblOr.setBounds(217, 103, 14, 20);
		lblOr.setText("o");
		
		Button btnCargarPlantilla = new Button(this, SWT.NONE);
		btnCargarPlantilla.setBounds(155, 52, 132, 30);
		btnCargarPlantilla.setText("Cargar Plantilla");
		
		Button btnAgregarDocumento = new Button(this, SWT.NONE);
		btnAgregarDocumento.setBounds(144, 129, 158, 30);
		btnAgregarDocumento.setText("Agregar Documento");
		
		Button btnConfirmar = new Button(this, SWT.NONE);
		btnConfirmar.setBounds(180, 243, 90, 30);
		btnConfirmar.setText("Confirmar");
		
		Label lblnombreDelDocumento = new Label(this, SWT.NONE);
		lblnombreDelDocumento.setBounds(135, 200, 178, 20);
		lblnombreDelDocumento.setText("[Nombre del Documento]");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
