package cars:
    class Car(manufacturer: String,
            model: String, 
            year: Double, 
            license: String):
        
        def description = 
            s"${manufacturer} ${model} ${year} license plate: ${license}"
