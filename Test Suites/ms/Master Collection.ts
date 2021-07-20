<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>Master Collection</name>
   <tag></tag>
   <executionMode>PARALLEL</executionMode>
   <maxConcurrentInstances>5</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <runConfigurationId>Chrome</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Home/Change Profile name</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <runConfigurationId>Firefox</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity></testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <runConfigurationId>Firefox (headless)</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/rd/rd</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <runConfigurationId>Chrome (headless)</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/API/rr/rr</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Mobile</groupName>
            <profileName>default</profileName>
            <runConfigurationData>
               <entry>
                  <key>kobitonDevice</key>
                  <value>{
  &quot;id&quot;: 11448,
  &quot;udid&quot;: &quot;85754647484f5547&quot;,
  &quot;isBooked&quot;: false,
  &quot;capabilities&quot;: {
    &quot;sdk&quot;: &quot;23&quot;,
    &quot;udid&quot;: &quot;85754647484f5547&quot;,
    &quot;brandName&quot;: &quot;Samsung&quot;,
    &quot;modelName&quot;: &quot;SM-G925I&quot;,
    &quot;deviceName&quot;: &quot;Galaxy S6 Edge&quot;,
    &quot;isEmulator&quot;: false,
    &quot;resolution&quot;: {
      &quot;width&quot;: 1440,
      &quot;height&quot;: 2560
    },
    &quot;platformName&quot;: &quot;Android&quot;,
    &quot;serialNumber&quot;: &quot;85754647484f5547&quot;,
    &quot;cpuArchitecture&quot;: &quot;arm64-v8a&quot;,
    &quot;platformVersion&quot;: &quot;6.0.1&quot;,
    &quot;installedBrowsers&quot;: [
      {
        &quot;name&quot;: &quot;chrome&quot;,
        &quot;version&quot;: &quot;87.0.4280.101&quot;
      }
    ]
  },
  &quot;orientation&quot;: &quot;PORTRAIT&quot;,
  &quot;captureScreenShots&quot;: true,
  &quot;isHidden&quot;: false,
  &quot;isOnline&quot;: true,
  &quot;isFavorite&quot;: true,
  &quot;isCloud&quot;: true
}</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>Kobiton Device</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity></testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
