/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Button,
  View
} from 'react-native';
import { PackageIntentAndroid } from 'react-native-launch-intent-package';


export default class react_native_launch_intent_package extends Component {
  render() {
    return (
      <View style={styles.container}>
        <Button
          title="Start Settings"
          onPress={() => PackageIntentAndroid.startIntent('com.android.settings')} />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  }
});

AppRegistry.registerComponent('example', () => react_native_launch_intent_package);
