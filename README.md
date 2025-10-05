# Mike Rozoff Keyboard Addon for AnySoftKeyboard

A custom keyboard addon for AnySoftKeyboard featuring three layouts with direct switching functionality, inspired by SwiftKey design.

## Features

### Three Complete Layouts
1. **Main Layout** (`mike_rozoff_layout.xml`) - 6-row QWERTY with arrow keys
2. **Symbols Layout** (`mike_rozoff_symbols.xml`) - Numbers and symbols
3. **Extended Symbols Layout** (`mike_rozoff_symbols_extended.xml`) - Currency symbols and special characters

### Direct Switching System
- **Custom Key Codes**: Uses safe extended key codes for direct layout switching
- **Smart Navigation**: Switch directly between any two layouts without cycling
- **Visual Indicators**: Clear icons and labels for switching keys

## Layout Details

### Main Layout Features
- **6 rows**: Top number row + 5 rows of keys
- **Arrow keys**: Dedicated up, down, left, right arrows
- **Full-width spacebar**: 30% width for comfortable typing
- **Functional keys**: Tab, Caps Lock, Shift, Ctrl, Alt, Enter, Backspace
- **Switching key**: `{=&` key to access extended symbols

### Symbols Layout Features
- **Number row**: Easy access to numbers 0-9
- **Common symbols**: Frequently used punctuation and symbols
- **Direct switching**: `{=&` key for extended symbols, `ABC` key for main layout
- **Spacebar**: 30% width with language switching

### Extended Symbols Layout Features
- **Currency symbols**: Major world currencies ($, €, £, ¥, etc.)
- **Special characters**: Mathematical symbols, brackets, and special punctuation
- **Direct switching**: `ABC` key for main layout, `123` key for symbols layout
- **Spacebar**: 30% width with language switching

## Custom Key Codes

The addon uses these safe extended key codes for direct switching:

| Key Code | Value | Target Layout |
|----------|-------|---------------|
| KEYCODE_SWITCH_TO_MAIN | -787 | Main QWERTY layout |
| KEYCODE_SWITCH_TO_SYMBOLS | -713 | Symbols layout |
| KEYCODE_SWITCH_TO_EXTENDED | -743 | Extended symbols layout |

## Installation

1. **Build the addon**:
   ```bash
   cd /home/pepper/mike-rozoff-keyboard-addon
   ./gradlew assembleDebug
   ```

2. **Install the APK**:
   ```bash
   adb install build/outputs/apk/debug/mike-rozoff-keyboard-addon-debug.apk
   ```

3. **Enable in AnySoftKeyboard**:
   - Open AnySoftKeyboard Settings
   - Go to "Keyboards" or "Keyboard Layouts"
   - Select "Mike Rozoff Keyboard"
   - Choose your preferred layout

## Usage

### Direct Layout Switching
- **From any layout**: Press the layout switching keys to jump directly
- **Main → Symbols**: Look for the `123` key
- **Main → Extended**: Press the `{=&` key
- **Symbols → Main**: Press the `ABC` key
- **Symbols → Extended**: Press the `{=&` key
- **Extended → Main**: Press the `ABC` key
- **Extended → Symbols**: Press the `123` key

### Arrow Keys
- **Navigation**: Use the dedicated arrow keys in the main layout
- **Precise control**: Move cursor left, right, up, down
- **Text editing**: Combine with Shift for selection

### Functional Keys
- **Tab**: Tabulation and navigation
- **Caps Lock**: Toggle capital letters
- **Shift**: Temporary capitalization and symbol access
- **Ctrl/Alt**: Modifier keys for shortcuts
- **Enter**: New line and form submission
- **Backspace**: Delete characters

## Technical Implementation

### Custom Classes
- **`MikeRozoffKeyboard`**: Main keyboard class with layout switching logic
- **`MikeRozoffKeyboardFactory`**: Factory for creating keyboard instances
- **`MikeRozoffKeyHandler`**: Key event handler for custom key codes
- **`MikeRozoffKeyboardAddon`**: Addon integration class

### Architecture
- **Extends AnySoftKeyboard**: Uses proper base classes for compatibility
- **Safe Key Codes**: Uses extended range to avoid conflicts
- **Resource Integration**: Proper XML layout loading
- **Event Handling**: Custom key code interception and processing

### File Structure
```
src/main/
├── java/com/mikerozoff/keyboard/
│   ├── MikeRozoffKeyboard.java
│   ├── MikeRozoffKeyboardFactory.java
│   ├── MikeRozoffKeyHandler.java
│   └── MikeRozoffKeyboardAddon.java
└── res/
    ├── xml/
    │   ├── mike_rozoff_layout.xml
    │   ├── mike_rozoff_symbols.xml
    │   └── mike_rozoff_symbols_extended.xml
    └── values/
        └── strings.xml
```

## Development

### Building from Source
1. Clone the addon project
2. Ensure Android SDK and build tools are installed
3. Run `./gradlew assembleDebug` to build
4. Install the resulting APK

### Customization
- **Layout XML**: Modify the XML files to change key positions
- **Key Codes**: Update constants in `MikeRozoffKeyboard.java`
- **Styling**: Add themes and visual customizations
- **Functionality**: Extend the key handler for new features

## Compatibility

- **AnySoftKeyboard**: Compatible with recent versions
- **Android**: Works on Android 5.0+ (API level 21+)
- **Screen Sizes**: Responsive design for phones and tablets
- **Languages**: Supports multiple languages via AnySoftKeyboard

## Troubleshooting

### Layout Not Appearing
1. Ensure the addon is properly installed
2. Check AnySoftKeyboard keyboard settings
3. Verify the addon is enabled
4. Restart AnySoftKeyboard if needed

### Switching Not Working
1. Check if custom key codes are properly handled
2. Verify the key handler is registered
3. Test with different AnySoftKeyboard versions
4. Check for conflicts with other addons

### Build Issues
1. Verify Android SDK installation
2. Check Gradle wrapper version
3. Ensure all dependencies are available
4. Clean and rebuild the project

## License

This addon is based on the Mike Rozoff keyboard layout design and is provided as a custom implementation for AnySoftKeyboard.

## Support

For issues and feature requests, please refer to the AnySoftKeyboard community and documentation.
