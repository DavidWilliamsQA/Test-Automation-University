package dropdown;

import base.BaseTests;
import org.junit.Test;

import static org.junit.Assert.*;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();

        String option = "Option 1";
        dropDownPage.selectFromDropdown(option);
        var selectedOptions = dropDownPage.getSelectOptions();

        assertEquals(1,selectedOptions.size());
        assertTrue(selectedOptions.contains(option));

    }

}
