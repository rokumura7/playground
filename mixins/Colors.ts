interface ColorSet {
  primary: string
  success: string
  warning: string
  danger: string
  default: string
}

export interface Colors {
  bg: ColorSet
  bgHover: ColorSet
}

export default {
  bg: {
    primary: 'bg-indigo-500',
    success: 'bg-green-500',
    warning: 'bg-yellow-500',
    danger: 'bg-red-500',
    default: 'bg-gray-500',
  },
  bgHover: {
    primary: 'hover:bg-indigo-600',
    success: 'hover:bg-green-600',
    warning: 'hover:bg-yellow-600',
    danger: 'hover:bg-red-600',
    default: 'hover:bg-gray-600',
  },
} as Colors
