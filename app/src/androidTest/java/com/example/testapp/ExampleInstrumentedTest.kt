package com.example.testapp

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.After
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import com.microsoft.appcenter.espresso.Factory;
import com.microsoft.appcenter.espresso.ReportHelper;


/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Rule
    var reportHelper: ReportHelper = Factory.getReportHelper()

    @After
    fun TearDown() {
        reportHelper.label("Stopping App")
    }

    @Test
    fun useAppContext() { // Context of the app under test.
        val appContext =
            InstrumentationRegistry.getInstrumentation()
                .targetContext
        Assert.assertEquals("com.example.testappXD", appContext.packageName)
    }
}
