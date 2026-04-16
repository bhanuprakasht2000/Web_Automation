<suite name="Suite">
    <test name="Test">
        <classes>
            	<class name="A.Demo">
            		<methods>
            			<include name="demotest1"></include>
           			 </methods>
           		 </class>
             <class name="A.AppTest">
            <methods>
            	<exclude name="apptest1"></exclude>
            </methods>
            </class>
        </classes>
    </test>
</suite>