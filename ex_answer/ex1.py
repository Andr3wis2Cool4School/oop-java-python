class Address:
    def __init__(self, country, province, city, street, zip_code):
        self.country = country
        self.province = province
        self.city = city
        self.street = street
        self.zip_code = zip_code

    def returnAddress(self):
        return self.country + ' ' +  self.province + ' ' + self.city + ' ' +  self.street + ' '  + str(self.zip_code)



add = Address('China', 'Jiangxi', 'Nanchang', 'xxxRoad', 330000)
print(add.returnAddress())


