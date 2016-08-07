package uk.co.badgersinfoil.metaas;

import junit.framework.TestCase;
import uk.co.badgersinfoil.metaas.dom.ASClassType;
import uk.co.badgersinfoil.metaas.dom.ASCompilationUnit;
import uk.co.badgersinfoil.metaas.dom.ASField;
import uk.co.badgersinfoil.metaas.dom.Visibility;


public class VectorTests extends TestCase {
	private ActionScriptFactory fact = new ActionScriptFactory();
	private ASCompilationUnit unit;
	private ASField field;

	protected void setUp() {
		unit = fact.newClass("Test");
		ASClassType clazz = (ASClassType)unit.getType();
		field = clazz.newField("test", Visibility.PUBLIC, "Vector.<int>");
	}

	public void testName() {
		assertEquals("test", field.getName());
		assertEquals("Vector", field.getType());
	}
}