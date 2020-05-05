# cordova-plugin-lock-font-size
Cordova Plugin for locking font size to normal on Android devices

## Installation

### Cordova project
- Add this to the 'package.json'
    - In the dependencies section:
    ```
    "cordova-plugin-lock-font-size": "https://github.com/okode/cordova-plugin-lock-font-size"
    ```

    - In the cordova plugins section:
    ```
      "cordova-plugin-lock-font-size": {}
    ```

### Capacitor project
- Add this dependency to the 'package.json':
    ```
    "cordova-plugin-lock-font-size": "https://github.com/okode/cordova-plugin-lock-font-size",
    ```

## API

### Usage
The plugin is available in the global scope so it can be invoked like that:

```
window.LockFontSize.init()
```