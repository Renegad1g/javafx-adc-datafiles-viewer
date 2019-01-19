/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itstep.mariupol.adce440datafilesgraph;

import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.itstep.mariupol.adce440datafilesgraph.view.RootLayoutController;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.loadui.testfx.GuiTest;
import static org.loadui.testfx.GuiTest.find;
import org.loadui.testfx.utils.FXTestUtils;

/**
 *
 * @author Юрий
 */
public class UITest
{
    private static GuiTest mMainController;
    private static Window mRootLayoutFileChooserWindow;

    @BeforeClass
    public static void setUpClass() {
        
        MainApp.onLoad(r -> {
            mMainController = new GuiTest() {
                @Override
                protected Parent getRootNode() {
                    return r;
                }
            };
            return null;
        });
        
        

        FXTestUtils.launchApp(MainApp.class);
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testSeriesShow() throws InterruptedException {
    
        for (Window w : GuiTest.getWindows()) {
            System.out.println(w.toString());
        }
        //mController.click("#mOpenMenuItem");
        Assert.assertNotNull(find("#mOpenMenu"));
        mMainController.click("#mOpenMenu");
        Thread.sleep(3000);
        
        /*RootLayoutController.onLoad(r -> {
            mRootLayoutFileChooserWindow = r;
            return r;
            
            //return null;
        });*/
        
        Assert.assertNotNull(find("#mOpenMenuItem"));
        mMainController.click("#mOpenMenuItem");
        Thread.sleep(3000);
        
        //Stage dialogStage = GuiTest.findStageByTitle("Open");
        //Stage dialogStage = GuiTest.findStageByTitle("Открыть");
        //Window dialogWindow = dialogStage.getOwner();
        //GuiTest.targetWindow(dialogWindow);        
        //System.out.println(dialogWindow);
        
        //Assert.assertNotNull(find("Открыть"));
        //mController.target(mController.);
        //mRootLayoutController.click("Открыть");
        //Thread.sleep(3000);
        //Assert.assertNotNull(find("#chb1"));
        //mMainController.click("#chb1");
    }
}
