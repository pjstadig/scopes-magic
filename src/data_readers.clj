{pjstadig.scopes/literal
 #=(eval (do (require 'pjstadig.scopes)
             (alter-meta! (def with-resource-scope
                            #'pjstadig.scopes/with-resource-scope)
                          (constantly
                           (meta #'pjstadig.scopes/with-resource-scope)))
             (alter-meta! (def scoped! #'pjstadig.scopes/scoped!)
                          (constantly (meta #'pjstadig.scopes/scoped!)))
             (alter-meta! (def scoped-thunk! #'pjstadig.scopes/scoped-thunk!)
                          (constantly (meta #'pjstadig.scopes/scoped-thunk!)))
             (alter-meta! (def closeable? #'pjstadig.scopes/closeable?)
                          (constantly (meta #'pjstadig.scopes/closeable?)))
             'clojure.core/identity))}
