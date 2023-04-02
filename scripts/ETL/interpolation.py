import numpy as np

def interpolate(years, values, new_years):
    # Find indices of years in ascending order
    indices = np.argsort(years)
    years = years[indices]
    values = values[indices]

    # Perform linear interpolation
    interp_func = np.interp(new_years, years, values)

    return interp_func
