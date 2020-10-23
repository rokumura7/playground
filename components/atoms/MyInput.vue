<template>
  <input
    class="my-4 mr-4 p-2 border rounded"
    :value="task"
    :class="[fullWidth]"
    @change="$emit('input', $event.target.value)"
  />
</template>

<script lang="ts">
import Vue from 'vue'

export default Vue.extend({
  name: 'MyInput',
  props: {
    task: {
      type: String,
      required: false,
      default: '',
    },
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
})
</script>
