# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 432 | `qa-606e9766-9797-4bcd-8b58-b36ec6c97b27` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-64db1ec6-5d79-4e07-b6cf-b1f6190c385c` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-844c9869-0d36-4823-bff5-41472de2fdcc` |
| 4 | `POST /v1/conversations` | 201 | 91 | `qa-9065aae0-6ee1-49fe-ac4c-ae8b951cf6fb` |
| 5 | `GET /v1/conversations` | 200 | 40 | `qa-5a5ac0d9-eeca-4eaa-bfbc-402600c0ec11` |
| 6 | `GET /v1/conversations/{id}` | 200 | 10 | `qa-d34a5ea4-f4c4-41d7-b86e-ec42ab79eb90` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 19 | `qa-b63a4368-8d22-4344-9b34-f0e18cfe97cc` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-4dccf94e-e816-470b-9692-d6b015bb7730` |
| 9 | `POST /v1/auth/token` | 200 | 28 | `qa-a039722a-5495-479c-a015-c2356c832669` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 10 | `qa-fd61b722-7359-4cc5-87b0-75e1ef6636ec` |
| 11 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-ad5c024d-0e81-41d4-a06e-1606d5b611db` |
| 12 | `POST /v1/auth/token` | 401 | 6 | `qa-c7f4dabb-caf7-46e3-b2bb-bfe22df62da7` |
| 13 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-feb01146-9cb8-4e44-8257-4f7f3336f561` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-32945dbf-6f6a-4413-bc10-baccf9642721` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-606e9766-9797-4bcd-8b58-b36ec6c97b27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-606e9766-9797-4bcd-8b58-b36ec6c97b27
Content-Type: application/json

--- request body ---
{"handle":"qa-531e1f0693c2","displayName":"QA 531e1f0693c2","password":"****","region":"eu"}

--- response: 201 in 432 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-606e9766-9797-4bcd-8b58-b36ec6c97b27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-531e1f0693c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f5fad13a-3020-4a45-8977-7a80cf0d528f","handle":"qa-531e1f0693c2","displayName":"QA 531e1f0693c2","region":"eu","role":"user","createdAt":"2026-11-11T09:34:34.936721622Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-64db1ec6-5d79-4e07-b6cf-b1f6190c385c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64db1ec6-5d79-4e07-b6cf-b1f6190c385c
Content-Type: application/json

--- request body ---
{"handle":"qa-b11a01735a62","displayName":"QA b11a01735a62","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-64db1ec6-5d79-4e07-b6cf-b1f6190c385c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-b11a01735a62
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ee0e5f90-6bf9-400b-bc1c-9d4f5fa3382e","handle":"qa-b11a01735a62","displayName":"QA b11a01735a62","region":"eu","role":"user","createdAt":"2026-11-11T09:34:35.327593967Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-844c9869-0d36-4823-bff5-41472de2fdcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-844c9869-0d36-4823-bff5-41472de2fdcc
Content-Type: application/json

--- request body ---
{"handle":"qa-531e1f0693c2","password":"****"}

--- response: 200 in 29 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-844c9869-0d36-4823-bff5-41472de2fdcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f5fad13a-3020-4a45-8977-7a80cf0d528f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9065aae0-6ee1-49fe-ac4c-ae8b951cf6fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9065aae0-6ee1-49fe-ac4c-ae8b951cf6fb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b11a01735a62","subject":"Contract check","message":"Hello"}

--- response: 201 in 91 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9065aae0-6ee1-49fe-ac4c-ae8b951cf6fb
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
Location: /v1/conversations/cnv_6516e0bd-32fd-4757-a340-2fd156edd8e3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6516e0bd-32fd-4757-a340-2fd156edd8e3","subject":"Contract check","status":"open","region":"eu","participants":["qa-531e1f0693c2","qa-b11a01735a62"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:35.517551708Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-5a5ac0d9-eeca-4eaa-bfbc-402600c0ec11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a5ac0d9-eeca-4eaa-bfbc-402600c0ec11
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a5ac0d9-eeca-4eaa-bfbc-402600c0ec11
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
Content-Length: 259

{"items":[{"id":"cnv_6516e0bd-32fd-4757-a340-2fd156edd8e3","subject":"Contract check","status":"open","region":"eu","participants":["qa-531e1f0693c2","qa-b11a01735a62"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:35.517551708Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_6516e0bd-32fd-4757-a340-2fd156edd8e3
correlation: qa-d34a5ea4-f4c4-41d7-b86e-ec42ab79eb90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d34a5ea4-f4c4-41d7-b86e-ec42ab79eb90
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d34a5ea4-f4c4-41d7-b86e-ec42ab79eb90
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
Content-Length: 237

{"id":"cnv_6516e0bd-32fd-4757-a340-2fd156edd8e3","subject":"Contract check","status":"open","region":"eu","participants":["qa-531e1f0693c2","qa-b11a01735a62"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:35.517551708Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_6516e0bd-32fd-4757-a340-2fd156edd8e3/messages
correlation: qa-b63a4368-8d22-4344-9b34-f0e18cfe97cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b63a4368-8d22-4344-9b34-f0e18cfe97cc
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b63a4368-8d22-4344-9b34-f0e18cfe97cc
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
Content-Length: 197

{"id":"msg_29ca511e-8271-4a35-a434-70d770092af3","conversationId":"cnv_6516e0bd-32fd-4757-a340-2fd156edd8e3","sender":"qa-531e1f0693c2","body":"Second","createdAt":"2026-11-11T09:34:35.708819293Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_6516e0bd-32fd-4757-a340-2fd156edd8e3/messages
correlation: qa-4dccf94e-e816-470b-9692-d6b015bb7730

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dccf94e-e816-470b-9692-d6b015bb7730
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dccf94e-e816-470b-9692-d6b015bb7730
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 416

{"items":[{"id":"msg_0764fa0a-bffe-4dce-af4f-3e89ed3b60b6","conversationId":"cnv_6516e0bd-32fd-4757-a340-2fd156edd8e3","sender":"qa-531e1f0693c2","body":"Hello","createdAt":"2026-11-11T09:34:35.517811893Z"},{"id":"msg_29ca511e-8271-4a35-a434-70d770092af3","conversationId":"cnv_6516e0bd-32fd-4757-a340-2fd156edd8e3","sender":"qa-531e1f0693c2","body":"Second","createdAt":"2026-11-11T09:34:35.708819293Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-a039722a-5495-479c-a015-c2356c832669

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a039722a-5495-479c-a015-c2356c832669
Content-Type: application/json

--- request body ---
{"handle":"qa-b11a01735a62","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a039722a-5495-479c-a015-c2356c832669
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ee0e5f90-6bf9-400b-bc1c-9d4f5fa3382e"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_6516e0bd-32fd-4757-a340-2fd156edd8e3/read
correlation: qa-fd61b722-7359-4cc5-87b0-75e1ef6636ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd61b722-7359-4cc5-87b0-75e1ef6636ec
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd61b722-7359-4cc5-87b0-75e1ef6636ec
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
Content-Length: 77

{"conversationId":"cnv_6516e0bd-32fd-4757-a340-2fd156edd8e3","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ad5c024d-0e81-41d4-a06e-1606d5b611db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad5c024d-0e81-41d4-a06e-1606d5b611db
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ad5c024d-0e81-41d4-a06e-1606d5b611db
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
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-c7f4dabb-caf7-46e3-b2bb-bfe22df62da7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7f4dabb-caf7-46e3-b2bb-bfe22df62da7
Content-Type: application/json

--- request body ---
{"handle":"qa-b11a01735a62","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7f4dabb-caf7-46e3-b2bb-bfe22df62da7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c7f4dabb-caf7-46e3-b2bb-bfe22df62da7"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-feb01146-9cb8-4e44-8257-4f7f3336f561

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feb01146-9cb8-4e44-8257-4f7f3336f561
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-feb01146-9cb8-4e44-8257-4f7f3336f561
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-32945dbf-6f6a-4413-bc10-baccf9642721

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32945dbf-6f6a-4413-bc10-baccf9642721
Content-Type: application/json

--- request body ---
{"handle":"qa-531e1f0693c2","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32945dbf-6f6a-4413-bc10-baccf9642721
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-32945dbf-6f6a-4413-bc10-baccf9642721"}
```
