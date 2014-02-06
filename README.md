# poser

A very simple Clojure library designed to generate every valid postcode in the UK, or a random postcode

Postcodes are generated from the following regular expression:

`#"([A-Z]{1,2}[0-9R][0-9A-Z]?)\s*([0-9][A-Z]{2})$"

## Usage

In your project.clj



`(use [poser.core])
`(take 10 (all-postcodes))
`=>("AARZ 0AA" "AARZ 0AB" "AARZ 0AC" "AARZ 0AD" "AARZ 0AE" "AARZ 0AF" "AARZ 0AG" "AARZ 0AH" "AARZ 0AI" "AARZ 0AJ")

`(take 10 (repeatedly (random-postcode)))
`=>("XG9E 2AD" "FNRT 7AI" "UH47 2IZ" "PO1F 8JL" "GO39 3OR" "PE9U 0NL" "ZV93 3GV" "UD3W 1VT" "TB53 4RK" "ZN84 7KC")

`(valid-postcode?)

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
