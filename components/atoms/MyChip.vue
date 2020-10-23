<template>
  <span
    class="text-white rounded-full uppercase px-2 py-1 text-xs font-bold mr-3"
    :class="[getColor]"
  >
    {{ label }}
  </span>
</template>

<script lang="ts">
import Vue, { PropOptions } from 'vue'
import Colors from '../../mixins/Colors'

type Color = 'default' | 'primary' | 'success' | 'warning' | 'danger'

export default Vue.extend({
  name: 'MyChip',
  props: {
    label: {
      type: String,
      required: false,
      default: 'info',
    },
    color: {
      type: String,
      required: false,
      default: 'default',
    } as PropOptions<Color>,
  },
  computed: {
    getColor(): String {
      const styles = []
      switch (this.color) {
        case 'primary':
          styles.push(Colors.bg.primary)
          styles.push(Colors.bgHover.primary)
          break
        case 'success':
          styles.push(Colors.bg.success)
          styles.push(Colors.bgHover.success)
          break
        case 'warning':
          styles.push(Colors.bg.warning)
          styles.push(Colors.bgHover.warning)
          break
        case 'danger':
          styles.push(Colors.bg.danger)
          styles.push(Colors.bgHover.danger)
          break
        default:
          styles.push(Colors.bg.default)
          styles.push(Colors.bgHover.default)
          break
      }
      return styles.join(' ')
    },
  },
})
</script>
