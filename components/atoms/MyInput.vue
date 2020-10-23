<template>
  <input
    type="type"
    class="my-4 mr-4 p-2 border rounded"
    :value="task"
    :class="[fullWidth]"
    @change="onInput"
  />
</template>

<script lang="ts">
import Vue, { PropOptions } from 'vue'

type InputType = 'text' | 'password' | 'number'

export default Vue.extend({
  name: 'MyInput',
  props: {
    task: {
      type: String,
      required: false,
      default: '',
    },
    type: {
      type: String,
      required: true,
    } as PropOptions<InputType>,
    isFullWidth: {
      type: Boolean,
      required: false,
      default: false,
    },
  },
  computed: {
    fullWidth(): String {
      return this.isFullWidth ? 'w-full' : ''
    },
  },
  methods: {
    onInput($event: Event) {
      this.$emit('input', ($event.target as HTMLInputElement).value)
    },
    commitChange(val: string) {
      this.$emit('input', val)
    },
  },
})
</script>
