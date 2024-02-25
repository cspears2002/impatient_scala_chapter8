package cars:
    class Car(manufacturer: String,
              model: String, 
              var year: Double = -1, 
              var license: String = ""):
        
        def description = 
            s"${manufacturer} ${model} ${year} license plate: ${license}"
