# Transcript: Unread counts follow messages and reset when read

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#unreadCountFollowsMessagesAndResetsOnRead` |
| Features | FEAT-CONV-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 441 | `qa-c0643546-955c-48a4-ace0-602c3217eb65` |
| 2 | `POST /v1/accounts` | 201 | 77 | `qa-ff32cb3f-fc7b-4160-b8c3-1d6971fc8fba` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-eecb8d85-a734-45dc-964a-81938e54c1df` |
| 4 | `POST /v1/conversations` | 201 | 65 | `qa-4c018e88-fb69-43c6-9356-b02917aff47d` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 27 | `qa-8530e585-091c-4bec-a9db-9150d7cda3a1` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-6d19460b-6641-4e29-9143-06c2e95b12b6` |
| 7 | `GET /v1/conversations/{id}` | 200 | 14 | `qa-f98575be-74b4-4c8c-89fb-f3a148166e57` |
| 8 | `POST /v1/conversations/{id}/read` | 200 | 19 | `qa-aba044b8-4fc5-4b67-b872-e473a62c5d39` |
| 9 | `GET /v1/conversations/{id}` | 200 | 21 | `qa-43cc44b4-e9f2-4a03-a5ec-e9db93e7801d` |
| 10 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-ec67184a-980f-4b33-998e-96b6dd917110` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-b8bea99b-4e39-4cbe-b27f-e3d8701c105f` |
| 12 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-0165e1a2-84f4-4c9f-894a-95873e8b7423` |
| 13 | `POST /v1/auth/token` | 401 | 7 | `qa-deea6f65-f63c-4869-801c-014443e778c3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c0643546-955c-48a4-ace0-602c3217eb65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0643546-955c-48a4-ace0-602c3217eb65
Content-Type: application/json

--- request body ---
{"handle":"qa-9bd6223a484f","displayName":"QA 9bd6223a484f","password":"****","region":"eu"}

--- response: 201 in 441 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0643546-955c-48a4-ace0-602c3217eb65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
Location: /v1/accounts/qa-9bd6223a484f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc59eeb5-bd04-4b8b-a51f-ca0f7ae9495c","handle":"qa-9bd6223a484f","displayName":"QA 9bd6223a484f","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.036484500Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ff32cb3f-fc7b-4160-b8c3-1d6971fc8fba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff32cb3f-fc7b-4160-b8c3-1d6971fc8fba
Content-Type: application/json

--- request body ---
{"handle":"qa-4aa931ccd6c0","displayName":"QA 4aa931ccd6c0","password":"****","region":"eu"}

--- response: 201 in 77 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff32cb3f-fc7b-4160-b8c3-1d6971fc8fba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-4aa931ccd6c0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_db032efe-d93d-4989-ab1b-7a1c66a205dc","handle":"qa-4aa931ccd6c0","displayName":"QA 4aa931ccd6c0","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.530965480Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-eecb8d85-a734-45dc-964a-81938e54c1df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eecb8d85-a734-45dc-964a-81938e54c1df
Content-Type: application/json

--- request body ---
{"handle":"qa-9bd6223a484f","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-eecb8d85-a734-45dc-964a-81938e54c1df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc59eeb5-bd04-4b8b-a51f-ca0f7ae9495c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4c018e88-fb69-43c6-9356-b02917aff47d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c018e88-fb69-43c6-9356-b02917aff47d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4aa931ccd6c0","subject":"Updates","message":"First"}

--- response: 201 in 65 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c018e88-fb69-43c6-9356-b02917aff47d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_13bb62a7-9d3f-4db9-b3af-9bf35f0e5c38
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_13bb62a7-9d3f-4db9-b3af-9bf35f0e5c38","subject":"Updates","status":"open","region":"eu","participants":["qa-9bd6223a484f","qa-4aa931ccd6c0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:32.682551581Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_13bb62a7-9d3f-4db9-b3af-9bf35f0e5c38/messages
correlation: qa-8530e585-091c-4bec-a9db-9150d7cda3a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8530e585-091c-4bec-a9db-9150d7cda3a1
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-8530e585-091c-4bec-a9db-9150d7cda3a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 197

{"id":"msg_43d6b1d0-a784-4440-bdd4-bccffe125177","conversationId":"cnv_13bb62a7-9d3f-4db9-b3af-9bf35f0e5c38","sender":"qa-9bd6223a484f","body":"Second","createdAt":"2026-11-06T09:30:32.830756662Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6d19460b-6641-4e29-9143-06c2e95b12b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d19460b-6641-4e29-9143-06c2e95b12b6
Content-Type: application/json

--- request body ---
{"handle":"qa-4aa931ccd6c0","password":"****"}

--- response: 200 in 26 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d19460b-6641-4e29-9143-06c2e95b12b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_db032efe-d93d-4989-ab1b-7a1c66a205dc"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_13bb62a7-9d3f-4db9-b3af-9bf35f0e5c38
correlation: qa-f98575be-74b4-4c8c-89fb-f3a148166e57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f98575be-74b4-4c8c-89fb-f3a148166e57
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f98575be-74b4-4c8c-89fb-f3a148166e57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_13bb62a7-9d3f-4db9-b3af-9bf35f0e5c38","subject":"Updates","status":"open","region":"eu","participants":["qa-9bd6223a484f","qa-4aa931ccd6c0"],"messageCount":2,"unreadCount":2,"createdAt":"2026-11-06T09:30:32.682551581Z"}
```

## 8. POST /v1/conversations/{id}/read

```text
#8 POST http://localhost:7070/v1/conversations/cnv_13bb62a7-9d3f-4db9-b3af-9bf35f0e5c38/read
correlation: qa-aba044b8-4fc5-4b67-b872-e473a62c5d39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aba044b8-4fc5-4b67-b872-e473a62c5d39
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-aba044b8-4fc5-4b67-b872-e473a62c5d39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 77

{"conversationId":"cnv_13bb62a7-9d3f-4db9-b3af-9bf35f0e5c38","unreadCount":0}
```

## 9. GET /v1/conversations/{id}

```text
#9 GET http://localhost:7070/v1/conversations/cnv_13bb62a7-9d3f-4db9-b3af-9bf35f0e5c38
correlation: qa-43cc44b4-e9f2-4a03-a5ec-e9db93e7801d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43cc44b4-e9f2-4a03-a5ec-e9db93e7801d
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-43cc44b4-e9f2-4a03-a5ec-e9db93e7801d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_13bb62a7-9d3f-4db9-b3af-9bf35f0e5c38","subject":"Updates","status":"open","region":"eu","participants":["qa-9bd6223a484f","qa-4aa931ccd6c0"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-06T09:30:32.682551581Z"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec67184a-980f-4b33-998e-96b6dd917110

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec67184a-980f-4b33-998e-96b6dd917110
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec67184a-980f-4b33-998e-96b6dd917110
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-b8bea99b-4e39-4cbe-b27f-e3d8701c105f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8bea99b-4e39-4cbe-b27f-e3d8701c105f
Content-Type: application/json

--- request body ---
{"handle":"qa-4aa931ccd6c0","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8bea99b-4e39-4cbe-b27f-e3d8701c105f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b8bea99b-4e39-4cbe-b27f-e3d8701c105f"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0165e1a2-84f4-4c9f-894a-95873e8b7423

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0165e1a2-84f4-4c9f-894a-95873e8b7423
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0165e1a2-84f4-4c9f-894a-95873e8b7423
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-deea6f65-f63c-4869-801c-014443e778c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-deea6f65-f63c-4869-801c-014443e778c3
Content-Type: application/json

--- request body ---
{"handle":"qa-9bd6223a484f","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-deea6f65-f63c-4869-801c-014443e778c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-deea6f65-f63c-4869-801c-014443e778c3"}
```
