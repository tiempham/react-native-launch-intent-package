
# react-native-react-native-launch-intent-package

## Getting started

`$ npm install react-native-launch-intent-package --save`

### Mostly automatic installation

`$ react-native link react-native-launch-intent-package`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativeLaunchIntentPackagePackage;` to the imports at the top of the file
  - Add `new RNReactNativeLaunchIntentPackagePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-react-native-launch-intent-package'
  	project(':react-native-react-native-launch-intent-package').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-react-native-launch-intent-package/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-react-native-launch-intent-package')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNReactNativeLaunchIntentPackage.sln` in `node_modules/react-native-react-native-launch-intent-package/windows/RNReactNativeLaunchIntentPackage.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Com.Reactlibrary.RNReactNativeLaunchIntentPackage;` to the usings at the top of the file
  - Add `new RNReactNativeLaunchIntentPackagePackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNReactNativeLaunchIntentPackage from 'react-native-react-native-launch-intent-package';

// TODO: What to do with the module?
RNReactNativeLaunchIntentPackage;
```
