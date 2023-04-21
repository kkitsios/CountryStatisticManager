import numpy as np

def interpolate_missing(values, original_years):
    # Convert '..' values to None
    years = [year for year in range(1990, 2019)]      
    values = [float(v) if v != '..' else None for v in values]
    for i in years:
        if i not in original_years:
            index = years.index(i)
            values.insert(index, None)

    # Find indices of non-None values
    indices = [i for i in range(len(values)) if values[i] is not None]
    non_none_values = [values[i] for i in indices]
    non_none_years = [i for i in range(len(values)) if values[i] is not None]

    # Perform linear interpolation
    interp_func = np.interp(range(len(values)), non_none_years, non_none_values)

    return interp_func
