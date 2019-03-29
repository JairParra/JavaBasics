# -*- coding: utf-8 -*-
"""
Created on Wed Dec 26 12:18:41 2018

@author: jairp
""" 

from __future__ import print_function

import pandas as pd
import numpy as np
#pd.__version__ # version 

## DataFrame: relational data table, rows and named columnw 
## Series: single column. 

# ex. 
pd.Series(['San Francisco', 'San Jose', 'Sacramento'])

city_names = pd.Series(['San Francisco', 'San Jose', 'Sacramento'])
population = pd.Series([852469, 1015785, 485199])

# create a data frame with two series
fr1 = pd.DataFrame({ 'City name': city_names, 'Population': population })

print(fr1) 
#print(city_names)
#print(population)
print("OVER")

# most of the time you will load a data frame
# imported from the internet
california_housing_dataframe = pd.read_csv("https://download.mlcc.google.com/mledu-datasets/california_housing_train.csv", sep=",")
california_housing_dataframe.describe()
#print(california_housing_dataframe)

# .head() only diplay the first data
california_housing_dataframe.head()
# draw a histogram
california_housing_dataframe.hist('housing_median_age')

## Accessing Data! 

# use familiar cidt/list operations: 

cities = pd.DataFrame({ 'City name': city_names, 'Population': population })
print(type(cities['City name'])) # get the type
print(cities['City name']) # extact the City Name column 

print(type(cities['City name'][1])) 
print(cities['City name'][1]) # access [column][row]

print(type(cities[0:2])) # select all the columns

## Manipulating Data

population / 1000 # arithmetic operations to series
print(np.log(population))
# the following indicates whether population is over 1000000
population.apply(lambda val: val > 1000000)

# the following code adds two Series to an existing DataFrame
cities['Area square miles'] = pd.Series([46.87, 176.53, 97.92])
cities['Population density'] = cities['Population'] / cities['Area square miles']
cities

# Exercise: modify the cities table by adding a new boolean column that is true iff: 
#   1. The city is named after a saint
#   2. The city has an area greater than 50 square miles

cities['Is wide and has saint name'] = (cities['Area square miles'] > 50) & cities['City name'].apply(lambda name: name.startswith('San'))
cities 

## Indexes 

city_names.index # returns the kind of indexes of the series
cities.index

cities.reindex([2,0,1])

cities.reindex(np.random.permutation(cities.index)) # shuffle the indexes
print(cities)





