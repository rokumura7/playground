export type Color = 'default' | 'primary' | 'success' | 'warning' | 'danger'
export const getColorSet = (color: Color): ColorSet => colors[color]

interface ColorSet {
  bg: string
  bgHover: string
}

interface Colors {
  primary: ColorSet
  success: ColorSet
  warning: ColorSet
  danger: ColorSet
  default: ColorSet
}

const colors = {
  primary: {
    bg: 'bg-indigo-500',
    bgHover: 'hover:bg-indigo-600',
  },
  success: {
    bg: 'bg-green-500',
    bgHover: 'hover:bg-green-600',
  },
  warning: {
    bg: 'bg-yellow-500',
    bgHover: 'hover:bg-yellow-600',
  },
  danger: {
    bg: 'bg-red-500',
    bgHover: 'hover:bg-red-600',
  },
  default: {
    bg: 'bg-gray-500',
    bgHover: 'hover:bg-gray-600',
  },
} as Colors
