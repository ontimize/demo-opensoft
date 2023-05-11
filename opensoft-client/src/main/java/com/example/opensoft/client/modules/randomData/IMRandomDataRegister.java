package com.example.opensoft.client.modules.randomData;

import com.ontimize.annotation.FormComponent;
import com.ontimize.gui.BasicInteractionManager;
import com.ontimize.gui.Form;
import com.ontimize.gui.field.IntegerDataField;
import com.ontimize.gui.manager.IFormManager;

public class IMRandomDataRegister extends BasicInteractionManager {

    @FormComponent(attr = "ID_RANDOM") protected IntegerDataField randomIndex;
    @FormComponent(attr = "ID_RANDOM_COL1") protected IntegerDataField randomValue1;
    @FormComponent(attr = "ID_RANDOM_COL2") protected IntegerDataField randomValue2;
    @FormComponent(attr = "ID_RANDOM_COL3") protected IntegerDataField randomValue3;
    @FormComponent(attr = "ID_RANDOM_COL4") protected IntegerDataField randomValue4;
    @FormComponent(attr = "ID_RANDOM_COL5") protected IntegerDataField randomValue5;

    @Override
    public void registerInteractionManager(Form form, IFormManager formManager) {
        super.registerInteractionManager(form, formManager);
        this.setStayInRecordAfterInsert(true);
    }

    @Override
    public void setUpdateMode() {
        super.setUpdateMode();
        this.randomValue1.requestFocus();
    }
}
