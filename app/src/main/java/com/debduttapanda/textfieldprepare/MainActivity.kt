package com.debduttapanda.textfieldprepare

import android.os.Bundle
import android.service.autofill.DateTransformation
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.debduttapanda.textfieldprepare.ui.theme.TextFieldPrepareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFieldPrepareTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val textField = remember { mutableStateOf("") }
                    Box {
                        LazyColumn{
                            item{
                                Text("Bare TextField, will not work")
                            }
                            item{
                                TextField(
                                    value = "",
                                    onValueChange = {}
                                )
                            }
                            item{
                                Text("TextField, with mutableState")
                            }
                            item{
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    }
                                )
                            }
                            item{
                                Text("TextField, introduce label")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    }
                                )
                            }
                            item{
                                Text("TextField, introduce placeholder")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    }
                                )
                            }
                            item{
                                Text("TextField, label and placeholder")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    }
                                )
                            }
                            item{
                                Text("TextField, keyboard options, capitalization characters")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        capitalization = KeyboardCapitalization.Characters
                                    )
                                )
                            }
                            item{
                                Text("TextField, keyboard options, capitalization words")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        capitalization = KeyboardCapitalization.Words
                                    )
                                )
                            }
                            item{
                                Text("TextField, keyboard options, capitalization sentences")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        capitalization = KeyboardCapitalization.Sentences
                                    )
                                )
                            }
                            item{
                                Text("TextField, keyboard options, keyboard type email")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        keyboardType = KeyboardType.Email
                                    )
                                )
                            }
                            item{
                                Text("TextField, keyboard options, keyboard type uri")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        keyboardType = KeyboardType.Uri
                                    )
                                )
                            }
                            item{
                                Text("TextField, keyboard options, keyboard type phone")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        keyboardType = KeyboardType.Phone
                                    )
                                )
                            }
                            item{
                                Text("TextField, keyboard options, keyboard type number")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        keyboardType = KeyboardType.Number
                                    )
                                )
                            }
                            item{
                                Text("TextField, keyboard options, keyboard type number password")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        keyboardType = KeyboardType.NumberPassword
                                    )
                                )
                            }
                            item{
                                Text("TextField, keyboard options, keyboard type password")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        keyboardType = KeyboardType.Password
                                    )
                                )
                            }
                            item{
                                Text("TextField, keyboard options, keyboard type email with autocorrect")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        keyboardType = KeyboardType.Email,
                                        autoCorrect = true
                                    )
                                )
                            }
                            item{
                                Text("TextField, keyboard options, imeaction done")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        imeAction = ImeAction.Done
                                    )
                                )
                            }
                            item{
                                Text("TextField, keyboard options, imeaction search")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        imeAction = ImeAction.Search
                                    )
                                )
                            }
                            item{
                                Text("TextField, keyboard options, imeaction next")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        imeAction = ImeAction.Next
                                    )
                                )
                            }
                            item{
                                Text("TextField, keyboard options, imeaction done with keyboard action")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    keyboardOptions = KeyboardOptions(
                                        imeAction = ImeAction.Done
                                    ),
                                    keyboardActions = KeyboardActions(
                                        onDone = {
                                            Toast.makeText(
                                                this@MainActivity,
                                                "OnDone clicked",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                        }
                                    )
                                )
                            }
                            item{
                                Text("TextField, colors")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    colors = TextFieldDefaults.textFieldColors(
                                        textColor = Color.Blue,
                                        backgroundColor = Color.Yellow,
                                        focusedIndicatorColor = Color.Green,
                                        focusedLabelColor = Color.Magenta,
                                        cursorColor = Color.Red
                                    )
                                )
                            }
                            item{
                                Text("TextField, shape: circle shape")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    shape = CircleShape
                                )
                            }
                            item{
                                Text("TextField, shape: rectangle shape")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    shape = RectangleShape
                                )
                            }
                            item{
                                Text("TextField, shape: rounded corner shape")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    shape = RoundedCornerShape(12.dp)
                                )
                            }
                            item{
                                Text("TextField, shape: cut corner shape")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    shape = CutCornerShape(12.dp)
                                )
                            }
                            item{
                                Text("TextField, max lines")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    maxLines = 3
                                )
                            }
                            item{
                                Text("TextField, single line")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    singleLine = true
                                )
                            }
                            item{
                                Text("TextField, isError")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    isError = true
                                )
                            }
                            item{
                                Text("TextField, enabled = false(aka disabled)")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    enabled = false
                                )
                            }
                            item{
                                Text("TextField, read only = true")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    readOnly = true
                                )
                            }
                            item{
                                Text("TextField, visual transformation password")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    visualTransformation = PasswordVisualTransformation()
                                )
                            }
                            item{
                                Text("TextField, visual transformation: custom for date")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    visualTransformation = DateTransformation()
                                )
                            }
                            item{
                                Text("TextField, leading and trailing icon")
                            }
                            item{
                                val textField = remember { mutableStateOf("") }
                                TextField(
                                    value = textField.value,
                                    onValueChange = {
                                        textField.value = it
                                    },
                                    label = {
                                        Text("Label")
                                    },
                                    placeholder = {
                                        Text("Placeholder")
                                    },
                                    leadingIcon = {
                                        Icon(
                                            imageVector = Icons.Default.Email,
                                            contentDescription = ""
                                        )
                                    },
                                    trailingIcon = {
                                        IconButton(onClick = {
                                            textField.value = ""
                                        }) {
                                            Icon(
                                                imageVector = Icons.Default.Close,
                                                contentDescription = ""
                                            )
                                        }
                                    }
                                )
                            }
                        }
                    }
                }
            }
        }
    }
    class DateTransformation() : VisualTransformation {
        override fun filter(text: AnnotatedString): TransformedText {
            return dateFilter(text)
        }

        fun dateFilter(text: AnnotatedString): TransformedText {

            val trimmed = if (text.text.length >= 8) text.text.substring(0..7) else text.text
            var out = ""
            for (i in trimmed.indices) {
                out += trimmed[i]
                if (i % 2 == 1 && i < 4) out += "/"
            }

            val numberOffsetTranslator = object : OffsetMapping {
                override fun originalToTransformed(offset: Int): Int {
                    if (offset <= 1) return offset
                    if (offset <= 3) return offset +1
                    if (offset <= 8) return offset +2
                    return 10
                }

                override fun transformedToOriginal(offset: Int): Int {
                    if (offset <=2) return offset
                    if (offset <=5) return offset -1
                    if (offset <=10) return offset -2
                    return 8
                }
            }

            return TransformedText(AnnotatedString(out), numberOffsetTranslator)
        }
    }
}