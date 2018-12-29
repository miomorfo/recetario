# recetario

## aplicación proyecto de android para universidad inacap
### ramo: proyecto de infraestructura

![screenshot](images/captura.png)

### agregar modulo de recycle view 
-> Gradle Script -> build.gradle(Module.app) ->
```
dependencies {
    ...
    compile 'com.android.support:cardview-v7:25.1.1.+'
    compile 'com.android.support:recyclerview-v7:25.1.1.+'
    compile 'com.android.support:design:25.1.1'
}
```
deben ser iguales en versión a

```
dependencies {
    ...
    implementation 'com.android.support:appcompat-v7:25.1.0'
}
```

