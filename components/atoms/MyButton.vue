<template>
  <button
    class="text-white uppercase font-bold py-1 px-2 rounded"
    :class="[getColor]"
  >
    {{ label }}
  </button>
</template>

<script lang="ts">
import Vue, { PropOptions } from 'vue'
import Colors from '../../mixins/Colors'

type Color = 'default' | 'primary' | 'success' | 'warning' | 'danger'

export default Vue.extend({
  name: 'MyButton',
  props: {
    label: {
      type: String,
      required: true,
      default: '',
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
