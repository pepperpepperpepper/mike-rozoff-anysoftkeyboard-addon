# Mike Rozoff Keyboard Addon for AnySoftKeyboard

A SwiftKey-inspired keyboard layout addon for AnySoftKeyboard with 6 rows including arrow keys and extended symbols.

## Features

- **Main Layout**: 6-row QWERTY layout with arrow keys
- **Symbols Layout**: Numbers and common symbols (accessed via 123 key)
- **Extended Symbols**: Currency symbols, brackets, and special characters (accessed via long-press {=& key)
- **Open Box Spacebar**: Shows ␣ symbol in symbols modes
- **Proper Key Widths**: Optimized spacing for better usability

## Layout Structure

### Main Layout (mike_rozoff_layout.xml)
- Row 1: Numbers 1-0
- Row 2: QWERTY row with popup characters
- Row 3: ASDFGHJKL row (centered)
- Row 4: Shift row with Z-N-M and backspace
- Row 5: 123, emoji, comma, spacebar, period, enter
- Row 6: Arrow keys (up, down, left, right)

### Symbols Layout (mike_rozoff_symbols.xml)
- Row 1: Numbers 1-0
- Row 2: @ # $ & _ - ( ) = %
- Row 3: {=& " * ' : / ! ? + backspace
- Row 4: ABC, comma, spacebar (␣), period, enter
- Row 5: Arrow keys

### Extended Symbols Layout (mike_rozoff_symbols_extended.xml)
- Row 1: £ € ¥ ¢ © ® ™ ~ ¿
- Row 2: ⇥ [ ] { } < > ^ ¡
- Row 3: 123 ` ; ÷ \ | ¦ ⌝ ⌫
- Row 4: ABC, spacebar (␣), × § ¶ °, enter
- Row 5: Arrow keys

## Installation

1. Build the APK: `./gradlew assembleDebug`
2. Install on device: `adb install -r build/outputs/apk/debug/app-debug.apk`
3. Enable in AnySoftKeyboard settings:
   - Open AnySoftKeyboard
   - Go to "Keyboard layout" 
   - Select "Mike Rozoff Layout"

## Development

This is an AnySoftKeyboard addon that extends the keyboard's functionality through the modular addon system.

## License

Created by Mike Rozoff. Layout based on SwiftKey design principles.
