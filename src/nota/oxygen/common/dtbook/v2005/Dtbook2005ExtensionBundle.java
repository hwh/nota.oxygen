package nota.oxygen.common.dtbook.v2005;


import ro.sync.contentcompletion.xml.SchemaManagerFilter;
import ro.sync.ecss.extensions.api.AuthorExtensionStateListener;
import ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider;
import ro.sync.ecss.extensions.api.AuthorTableColumnWidthProvider;
import ro.sync.ecss.extensions.api.ExtensionsBundle;
import ro.sync.ecss.extensions.api.UniqueAttributesRecognizer;
import ro.sync.ecss.extensions.api.structure.AuthorOutlineCustomizer;
import ro.sync.ecss.extensions.commons.table.support.HTMLTableCellInfoProvider;

/**
 * Extension bundle for dtbook 2005
 * @author Ole Holst Andersen (oha@nota.nu)
 */
public class Dtbook2005ExtensionBundle extends ExtensionsBundle {

	/* (non-Javadoc)
	 * @see ro.sync.ecss.extensions.api.ExtensionsBundle#createSchemaManagerFilter()
	 */
	@Override
	public SchemaManagerFilter createSchemaManagerFilter() {
		return new Dtbook2005SchemaManagerFilter();
	}

	@Override
	public AuthorTableColumnWidthProvider createAuthorTableColumnWidthProvider() {
		return new HTMLTableCellInfoProvider();
	}

	@Override
	public String getDocumentTypeID() {
		return "dtbook2005";
	}

	@Override
	public String getDescription() {
		return "dtbook 2005 extension bundle";
	}
	
	private UniqueAttributesRecognizer uniqueRecognizer;
	

	@Override
	public AuthorExtensionStateListener createAuthorExtensionStateListener() {
		uniqueRecognizer = new Dtbook2005UniqueAttributesRecognizer();
		return uniqueRecognizer;
	}

	@Override
	public UniqueAttributesRecognizer getUniqueAttributesIdentifier() {
		return uniqueRecognizer;
	}

	@Override
	public AuthorOutlineCustomizer createAuthorOutlineCustomizer() {
		return new Dtbook2005AuthorOutlineCustomizer();
	}
	
	
	@Override
	public AuthorTableCellSpanProvider createAuthorTableCellSpanProvider() {
		return new HTMLTableCellInfoProvider();
	}
	

}
